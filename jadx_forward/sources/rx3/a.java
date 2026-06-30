package rx3;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f482533d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f482534e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f482535f;

    /* renamed from: g, reason: collision with root package name */
    public int f482536g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ox3.a f482537h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vx3.i f482538i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f482539m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ox3.a aVar, vx3.i iVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f482537h = aVar;
        this.f482538i = iVar;
        this.f482539m = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rx3.a(this.f482537h, this.f482538i, this.f482539m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vx3.i iVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f482536g;
        ox3.a aVar2 = this.f482537h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qx3.b bVar = qx3.b.f448874a;
            long mo2128x1ed62e84 = aVar2.mo2128x1ed62e84();
            this.f482536g = 1;
            obj = bVar.b(mo2128x1ed62e84, this.f482538i, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (vx3.i) this.f482535f;
                aVar2 = (ox3.a) this.f482534e;
                str = (java.lang.String) this.f482533d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                mx3.i0.l(str, iVar, aVar2.f431254d.f497124g);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        vx3.i iVar2 = (vx3.i) obj;
        if (iVar2 != null) {
            mx3.i0 i0Var = mx3.i0.f414110a;
            java.lang.String str2 = this.f482539m;
            this.f482533d = str2;
            this.f482534e = aVar2;
            this.f482535f = iVar2;
            this.f482536g = 2;
            if (i0Var.a(str2, iVar2, true, this) == aVar) {
                return aVar;
            }
            iVar = iVar2;
            str = str2;
            mx3.i0.l(str, iVar, aVar2.f431254d.f497124g);
        }
        return jz5.f0.f384359a;
    }
}
