package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f163430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f163431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f163432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f163433i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f163434m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5 f163435n;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5 j5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, int i19, java.lang.ref.WeakReference weakReference, int i27) {
        this.f163435n = j5Var;
        this.f163428d = str;
        this.f163429e = lVar;
        this.f163430f = i17;
        this.f163431g = i18;
        this.f163432h = i19;
        this.f163433i = weakReference;
        this.f163434m = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f163428d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5 a17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.startsWith("wxfile://")) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o5(null) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m5(null)).a(this.f163429e, this.f163428d, this.f163430f, this.f163431g, this.f163432h);
        java.lang.ref.WeakReference weakReference = this.f163433i;
        if (weakReference.get() == null || !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) weakReference.get()).mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "worker:component is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) weakReference.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5 j5Var = this.f163435n;
        int i17 = this.f163434m;
        if (a17 != null) {
            boolean z17 = a17.f163452a;
            java.lang.String str2 = a17.f163453b;
            if (z17 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                if (!a17.f163452a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail, message:%s", str2);
                    lVar.a(i17, j5Var.r(str2, a17.f163454c, null));
                    return;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempFilePath", str2);
                j5Var.getClass();
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap.put("errno", 0);
                lVar.a(i17, j5Var.t("ok", hashMap));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail");
        lVar.a(i17, j5Var.r("fail:compress image fail", a17.f163454c, null));
    }
}
