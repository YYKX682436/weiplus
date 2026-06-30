package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f158295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af f158296e;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f158296e = c11527x5889d9af;
        this.f158295d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "dl: removeImpl, cleanupOut.run(), appId[%s]", this.f158295d.f156336n);
        this.f158295d.B1(this.f158296e.f156380z);
        int size = this.f158295d.f156330f.size();
        this.f158295d.A1(this.f158296e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.EnumC11543xdf703d62.f33370xd430480e);
        if (size == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f158295d;
            if (c11510xdd90c2f2.f156329e == this.f158296e) {
                c11510xdd90c2f2.d0();
            }
        }
        this.f158296e.f156371q.removeView(this.f158295d.f156343s);
        this.f158296e.f156373s.remove(this.f158295d.f156336n);
        this.f158296e.f156372r.remove(this.f158295d);
    }
}
