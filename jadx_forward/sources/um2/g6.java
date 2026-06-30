package um2;

/* loaded from: classes3.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f510344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f510346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f510347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(um2.x5 x5Var, android.app.Activity activity, android.view.ViewGroup viewGroup, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510345e = x5Var;
        this.f510346f = activity;
        this.f510347g = viewGroup;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new um2.g6(this.f510345e, this.f510346f, this.f510347g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((um2.g6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510344d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            um2.x5 x5Var = this.f510345e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.f6) x5Var.c(mm2.f6.class)).f410567h;
            um2.f6 f6Var = new um2.f6(x5Var, this.f510346f, this.f510347g);
            this.f510344d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(f6Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
