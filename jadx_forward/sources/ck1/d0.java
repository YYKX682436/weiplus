package ck1;

/* loaded from: classes4.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.o f123847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f123848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ck1.o oVar, ck1.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123847e = oVar;
        this.f123848f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ck1.d0(this.f123847e, this.f123848f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck1.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123846d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean C = com.p314xaae8f345.mm.ui.bk.C();
            ck1.o oVar = this.f123847e;
            java.lang.String str = C ? ((ck1.n) oVar).f123886a.f123916c.f460516h : ((ck1.n) oVar).f123886a.f123916c.f460515g;
            if (str == null) {
                str = ((ck1.n) oVar).f123886a.f123916c.f460515g;
            }
            if (str != null) {
                android.widget.ImageView imageView = ((ck1.x0) this.f123848f).f123928d;
                this.f123846d = 1;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v2.a(str, imageView, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
