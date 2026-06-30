package n3;

/* loaded from: classes14.dex */
public final class v1 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f415956e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f415957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f415958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f415958g = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        n3.v1 v1Var = new n3.v1(this.f415958g, interfaceC29045xdcb5ca57);
        v1Var.f415957f = obj;
        return v1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((n3.v1) mo148xaf65a0fc((q26.p) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3 = pz5.a.f440719d;
        int i17 = this.f415956e;
        android.view.View view = this.f415958g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            q26.p pVar = (q26.p) this.f415957f;
            this.f415957f = pVar;
            this.f415956e = 1;
            pVar.b(view, this);
            return obj3;
        }
        java.lang.Object obj4 = jz5.f0.f384359a;
        if (i17 == 1) {
            q26.p pVar2 = (q26.p) this.f415957f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (view instanceof android.view.ViewGroup) {
                n3.s1 s1Var = new n3.s1((android.view.ViewGroup) view, null);
                this.f415957f = null;
                this.f415956e = 2;
                pVar2.getClass();
                q26.o oVar = new q26.o();
                oVar.f441414g = pz5.f.a(s1Var, oVar, oVar);
                q26.o oVar2 = (q26.o) pVar2;
                if (oVar.hasNext()) {
                    oVar2.f441413f = oVar;
                    oVar2.f441411d = 2;
                    oVar2.f441414g = this;
                    obj2 = pz5.a.f440719d;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != pz5.a.f440719d) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj4;
    }
}
