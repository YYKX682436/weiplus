package bg2;

/* loaded from: classes2.dex */
public final class k8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(bg2.l8 l8Var, android.content.Context context, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20252d = l8Var;
        this.f20253e = context;
        this.f20254f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.k8(this.f20252d, this.f20253e, this.f20254f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.k8 k8Var = (bg2.k8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.l8 l8Var = this.f20252d;
        bg2.a5 a5Var = (bg2.a5) l8Var.N6(bg2.a5.class);
        if (a5Var != null) {
            a5Var.d7();
        }
        if (l8Var.f20276g == null) {
            android.content.Context context = this.f20253e;
            dg2.m mVar = new dg2.m(context);
            l8Var.f20276g = mVar;
            java.lang.String string = context.getString(com.tencent.mm.R.string.loe);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            mVar.f232309d = string;
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.lof);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            mVar.f232308c = string2;
            r45.vw0 vw0Var = l8Var.f20277h;
            java.util.LinkedList list2 = vw0Var != null ? vw0Var.getList(2) : null;
            java.util.LinkedList linkedList = mVar.f232307b;
            linkedList.clear();
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            mVar.f232311f = new bg2.h8(l8Var, this.f20254f, context);
            mVar.f232310e = new bg2.i8(l8Var);
            mVar.f232312g = bg2.j8.f20220d;
            mVar.c();
        } else {
            r45.vw0 vw0Var2 = l8Var.f20277h;
            if (vw0Var2 != null && (list = vw0Var2.getList(2)) != null) {
                dg2.m mVar2 = l8Var.f20276g;
                if (mVar2 != null) {
                    mVar2.b(list);
                }
                dg2.m mVar3 = l8Var.f20276g;
                if (mVar3 != null) {
                    mVar3.c();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
