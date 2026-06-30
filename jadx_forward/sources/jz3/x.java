package jz3;

/* loaded from: classes12.dex */
public class x implements e04.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 f384339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f384340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 f384341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f384343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f384344g;

    public x(jz3.y yVar, java.lang.String str, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039, long j17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 c5973x2e8f3b26, java.lang.String str2, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        this.f384338a = str;
        this.f384339b = c6797x4bb2039;
        this.f384340c = j17;
        this.f384341d = c5973x2e8f3b26;
        this.f384342e = str2;
        this.f384343f = hashMap;
        this.f384344g = hashMap2;
    }

    @Override // e04.q2
    public void a(java.lang.String str, e04.r2 r2Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.f384338a)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f384340c;
        long j18 = currentTimeMillis - j17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = this.f384339b;
        c6797x4bb2039.f141281g = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "upload img cost %d", java.lang.Long.valueOf(j18));
        c6797x4bb2039.f141287m = c6797x4bb2039.b("FileID", r2Var.f327613b, true);
        c6797x4bb2039.f141288n = c6797x4bb2039.b("AesKey", r2Var.f327614c, true);
        int i17 = r2Var.f327612a;
        java.util.HashMap hashMap = this.f384344g;
        java.util.HashMap hashMap2 = this.f384343f;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 c5973x2e8f3b26 = this.f384341d;
        if (i17 != 0) {
            c6797x4bb2039.f141280f = 3L;
            c6797x4bb2039.f141283i = java.lang.System.currentTimeMillis() - j17;
            c6797x4bb2039.k();
            hashMap2.remove(java.lang.Integer.valueOf(c5973x2e8f3b26.f136271g.f87816b));
            am.bt btVar = c5973x2e8f3b26.f136271g;
            hashMap.remove(java.lang.Integer.valueOf(btVar.f87816b));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "translationReports size %d, translationUpload size %d, errCode: %s", java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap.size()), java.lang.Integer.valueOf(r2Var.f327612a));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).fj(btVar.f87816b);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(r2Var.f327613b, r2Var.f327614c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "upload img success, fileId %s", r2Var.f327613b);
            am.bt btVar2 = c5973x2e8f3b26.f136271g;
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0(btVar2.f87815a, btVar2.f87816b, (int) com.p314xaae8f345.mm.vfs.w6.k(this.f384342e), r2Var.f327613b, r2Var.f327614c, 1, 2));
            return;
        }
        c6797x4bb2039.f141280f = 3L;
        c6797x4bb2039.f141283i = java.lang.System.currentTimeMillis() - j17;
        c6797x4bb2039.k();
        hashMap2.remove(java.lang.Integer.valueOf(c5973x2e8f3b26.f136271g.f87816b));
        am.bt btVar3 = c5973x2e8f3b26.f136271g;
        hashMap.remove(java.lang.Integer.valueOf(btVar3.f87816b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap.size()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).fj(btVar3.f87816b);
    }
}
