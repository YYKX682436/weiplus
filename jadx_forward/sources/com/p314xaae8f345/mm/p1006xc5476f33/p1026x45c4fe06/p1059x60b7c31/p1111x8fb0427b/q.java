package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f164954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f164958h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f164959i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f164960m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s f164961n;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s sVar, java.lang.ref.WeakReference weakReference, int i17, java.lang.String str, int i18, int i19, long j17, k91.z0 z0Var) {
        this.f164961n = sVar;
        this.f164954d = weakReference;
        this.f164955e = i17;
        this.f164956f = str;
        this.f164957g = i18;
        this.f164958h = i19;
        this.f164959i = j17;
        this.f164960m = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f164954d.get();
        if (lVar == null) {
            return;
        }
        oe.a aVar = (oe.a) nd.f.a(oe.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s sVar = this.f164961n;
        java.lang.Object[] t17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) aVar).b(sVar.D(lVar), this.f164955e, this.f164956f).t(this.f164957g, sVar.D(lVar));
        java.util.List list = (java.util.List) t17[0];
        int ceil = (int) java.lang.Math.ceil(((java.lang.Integer) t17[1]).doubleValue() / 1000.0d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s.C(this.f164961n, list, ceil, (int) java.lang.Math.ceil(((java.lang.Integer) t17[2]).doubleValue() / 1000.0d), lVar, this.f164958h);
        int i17 = ceil * 1000;
        k91.z0 z0Var = this.f164960m;
        sVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y1.a(2, 3, i17, list != null ? list.size() : 0, java.lang.System.currentTimeMillis() - this.f164959i, z0Var);
    }
}
