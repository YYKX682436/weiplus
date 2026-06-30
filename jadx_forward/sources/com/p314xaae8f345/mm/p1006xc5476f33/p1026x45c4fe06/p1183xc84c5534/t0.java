package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class t0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r {

    /* renamed from: h, reason: collision with root package name */
    public volatile long f169938h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f169939i;

    /* renamed from: j, reason: collision with root package name */
    public volatile java.lang.String f169940j;

    /* renamed from: k, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169941k;

    public t0(int i17) {
        super(i17);
        this.f169938h = 0L;
        this.f169939i = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h
    public void d() {
        super.d();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.m48815xb9a3283c(this.f169941k)) {
            java.lang.String t07 = this.f169941k.f156339p0 ? this.f169941k.t0() : this.f169941k.x0().m52170xad58292c();
            this.f169938h = 0L;
            if (t07.startsWith("__wx__")) {
                this.f169939i = false;
                this.f169940j = null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f169516c = c11510xdd90c2f2.f156336n;
        this.f169517d = c11510xdd90c2f2;
        this.f169941k = c11510xdd90c2f2;
    }
}
