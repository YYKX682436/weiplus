package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89 f164962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f164963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f164965g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f164966h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s f164967i;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89 c12244xe6b9ea89, java.lang.ref.WeakReference weakReference, int i17, long j17, k91.z0 z0Var) {
        this.f164967i = sVar;
        this.f164962d = c12244xe6b9ea89;
        this.f164963e = weakReference;
        this.f164964f = i17;
        this.f164965g = j17;
        this.f164966h = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89 c12244xe6b9ea89 = this.f164962d;
        c12244xe6b9ea89.x();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f164963e.get();
        if (lVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s.C(this.f164967i, c12244xe6b9ea89.f164880h, c12244xe6b9ea89.f164881i, c12244xe6b9ea89.f164882m, lVar, this.f164964f);
        java.util.ArrayList arrayList = c12244xe6b9ea89.f164880h;
        int i17 = c12244xe6b9ea89.f164881i * 1000;
        k91.z0 z0Var = this.f164966h;
        this.f164967i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y1.a(1, 3, i17, arrayList == null ? 0 : arrayList.size(), java.lang.System.currentTimeMillis() - this.f164965g, z0Var);
        c12244xe6b9ea89.x();
    }
}
