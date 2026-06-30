package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes5.dex */
public class m3 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f157201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f157202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f157203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f157204g;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q3 q3Var, int i17, long j17, long j18, java.util.Set set, java.util.Set set2) {
        this.f157201d = i17;
        this.f157202e = j17;
        this.f157203f = set;
        this.f157204g = set2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
        if (android.text.TextUtils.isEmpty(c11661x55afe3eb.f156912f) && (i18 = c11661x55afe3eb.f156910d) < (i17 = this.f157201d)) {
            long j17 = this.f157202e;
            long j18 = c11661x55afe3eb.f156916m;
            if (j17 - j18 > 86400) {
                boolean contains = this.f157203f.contains(java.lang.Integer.valueOf(i18));
                java.util.Set set = this.f157204g;
                boolean contains2 = set != null ? set.contains(java.lang.Integer.valueOf(i18)) : false;
                if (!contains && !contains2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDownloadFailCommLibFiles, version=%d, createTime=%d, maxVersion=%d", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
                    return java.lang.Boolean.TRUE;
                }
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
