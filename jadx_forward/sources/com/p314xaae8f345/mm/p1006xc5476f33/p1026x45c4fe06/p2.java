package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class p2 extends l01.l {

    /* renamed from: d, reason: collision with root package name */
    public final im5.a f167842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi1.g f167843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xi1.d f167844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q2 f167845g;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q2 q2Var, xi1.g gVar, xi1.d dVar) {
        this.f167845g = q2Var;
        this.f167843e = gVar;
        this.f167844f = dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = q2Var.f169260d;
        im5.a aVar = new im5.a() { // from class: com.tencent.mm.plugin.appbrand.p2$$b
            @Override // im5.a
            /* renamed from: dead */
            public final void mo10668x2efc64() {
                l01.d0.f396294a.e(l01.u.this);
            }
        };
        this.f167842d = aVar;
        c11510xdd90c2f2.mo46316x322b85(aVar);
    }

    @Override // l01.l, l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(final android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q2 q2Var = this.f167845g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = q2Var.f169260d;
        final xi1.g gVar = this.f167843e;
        final xi1.d dVar = this.f167844f;
        c11510xdd90c2f2.o(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.p2$$a
            @Override // java.lang.Runnable
            public final void run() {
                xi1.d dVar2 = dVar;
                xi1.g.this.mo48810x4820daa(new xi1.d(dVar2.f536231a, bitmap, dVar2.f536233c));
            }
        });
        q2Var.f169260d.n2(this.f167842d);
    }
}
