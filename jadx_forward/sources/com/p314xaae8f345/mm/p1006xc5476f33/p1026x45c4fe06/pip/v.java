package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f169089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f169090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y f169091f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar, boolean z17, float f17) {
        this.f169091f = yVar;
        this.f169089d = z17;
        this.f169090e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f169089d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar = this.f169091f;
        if (z17) {
            yVar.f169100a.f169056f.q(this.f169090e);
        } else {
            yVar.f169100a.f169056f.l();
        }
    }
}
