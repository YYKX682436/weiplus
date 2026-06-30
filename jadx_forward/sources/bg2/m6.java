package bg2;

/* loaded from: classes2.dex */
public final class m6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101841d;

    /* renamed from: e, reason: collision with root package name */
    public int f101842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f101843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f101844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101845h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(java.util.LinkedList linkedList, bg2.q6 q6Var, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101843f = linkedList;
        this.f101844g = q6Var;
        this.f101845h = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.m6(this.f101843f, this.f101844g, this.f101845h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.m6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101842e;
        bg2.q6 q6Var = this.f101844g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.LinkedList<r45.rw4> linkedList2 = this.f101843f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            for (r45.rw4 rw4Var : linkedList2) {
                r45.qw4 qw4Var = new r45.qw4();
                qw4Var.set(0, java.lang.Integer.valueOf(rw4Var.m75939xb282bd08(0)));
                qw4Var.set(1, rw4Var.m75945x2fec8307(2));
                arrayList.add(qw4Var);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList(arrayList);
            this.f101841d = linkedList3;
            this.f101842e = 1;
            if (bg2.q6.b7(q6Var, linkedList3, this) == aVar) {
                return aVar;
            }
            linkedList = linkedList3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedList = (java.util.LinkedList) this.f101841d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.content.Context context = this.f101845h;
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lop);
        q6Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q6Var.f101946e, "[notifyRemoveFeed] scene:showReasonsList-confirm-click");
        pm0.v.X(new bg2.f6(string, context, q6Var, true));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb6.append(((r45.qw4) it.next()).m75939xb282bd08(0));
            sb6.append("#");
        }
        java.lang.CharSequence Y = r26.n0.Y(sb6, "#");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.N2, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var)), new jz5.l("feedId", bg2.q6.Y6(q6Var)), new jz5.l("panel_sence", "1"), new jz5.l("unlike_reason_type_list", Y.toString())), null, null, null, null, false, 124, null);
        return jz5.f0.f384359a;
    }
}
