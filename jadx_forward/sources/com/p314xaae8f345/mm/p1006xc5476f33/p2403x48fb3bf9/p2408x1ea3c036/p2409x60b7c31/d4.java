package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263831e;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.e4 e4Var, sd.b bVar, int i17) {
        this.f263830d = bVar;
        this.f263831e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.d dVar;
        sd.b bVar = this.f263830d;
        if (bVar == null || (dVar = bVar.f488129a) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar).z(this.f263831e);
    }
}
