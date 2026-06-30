package gx0;

/* loaded from: classes5.dex */
public final class ic extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.kc f358070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f358071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f358072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f358073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(gx0.kc kcVar, boolean z17, boolean z18, boolean z19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358070e = kcVar;
        this.f358071f = z17;
        this.f358072g = z18;
        this.f358073h = z19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ic(this.f358070e, this.f358071f, this.f358072g, this.f358073h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ic) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358069d;
        gx0.kc kcVar = this.f358070e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf k76 = kcVar.k7();
            this.f358069d = 1;
            if (gx0.bf.d7(k76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (this.f358071f && this.f358072g) {
            ((gx0.x4) ((jz5.n) kcVar.f358165n).mo141623x754a37bb()).U6(this.f358073h);
        }
        return jz5.f0.f384359a;
    }
}
