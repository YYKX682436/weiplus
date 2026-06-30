package ku3;

/* loaded from: classes10.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f393819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku3.l5 f393820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f393821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(boolean z17, ku3.l5 l5Var, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393819d = z17;
        this.f393820e = l5Var;
        this.f393821f = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.j5(this.f393819d, this.f393820e, this.f393821f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ku3.j5 j5Var = (ku3.j5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ku3.l5 l5Var = this.f393820e;
        boolean z17 = this.f393819d;
        if (!z17) {
            boolean z18 = l5Var.f393841e;
            boolean z19 = this.f393821f;
            if (z18 && !z19 && l5Var.f393842f == 1) {
                l5Var.f393840d.f557110e.mo9386xf597288(false);
            }
            if (l5Var.f393841e && z19) {
                l5Var.f393840d.f557110e.mo9386xf597288(false);
            }
        } else if (l5Var.f393842f == 2) {
            l5Var.f393840d.f557110e.mo9386xf597288(z17);
        }
        return jz5.f0.f384359a;
    }
}
