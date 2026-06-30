package bg2;

/* loaded from: classes2.dex */
public final class g8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20119d;

    /* renamed from: e, reason: collision with root package name */
    public int f20120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f20121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20123h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20124i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(java.util.LinkedList linkedList, bg2.l8 l8Var, int i17, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20121f = linkedList;
        this.f20122g = l8Var;
        this.f20123h = i17;
        this.f20124i = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.g8(this.f20121f, this.f20122g, this.f20123h, this.f20124i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.g8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20120e;
        int i18 = this.f20123h;
        bg2.l8 l8Var = this.f20122g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedList<r45.rw4> linkedList2 = this.f20121f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            for (r45.rw4 rw4Var : linkedList2) {
                r45.qw4 qw4Var = new r45.qw4();
                qw4Var.set(0, java.lang.Integer.valueOf(rw4Var.getInteger(0)));
                qw4Var.set(1, rw4Var.getString(2));
                arrayList.add(qw4Var);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList(arrayList);
            this.f20119d = linkedList3;
            this.f20120e = 1;
            if (bg2.l8.b7(l8Var, i18, linkedList3, this) == aVar) {
                return aVar;
            }
            linkedList = linkedList3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedList = (java.util.LinkedList) this.f20119d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.content.Context context = this.f20124i;
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.lop);
        l8Var.getClass();
        com.tencent.mars.xlog.Log.i(l8Var.f20274e, "[notifyRemoveFeed] scene:LiveQuestBottomSheet-confirm");
        pm0.v.X(new bg2.z7(string, context, l8Var, true));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb6.append(((r45.qw4) it.next()).getInteger(0));
            sb6.append("#");
        }
        java.lang.CharSequence Y = r26.n0.Y(sb6, "#");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.O2, kz5.c1.l(new jz5.l("liveId", bg2.l8.Z6(l8Var)), new jz5.l("feedId", bg2.l8.Y6(l8Var)), new jz5.l("panel_sence", "1"), new jz5.l("unlike_reason_type_list", Y.toString()), new jz5.l("survey_select", java.lang.String.valueOf(i18))), null, null, null, null, false, 124, null);
        return jz5.f0.f302826a;
    }
}
