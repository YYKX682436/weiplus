package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes5.dex */
public class m3 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f75669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f75670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f75671g;

    public m3(com.tencent.mm.plugin.appbrand.appcache.q3 q3Var, int i17, long j17, long j18, java.util.Set set, java.util.Set set2) {
        this.f75668d = i17;
        this.f75669e = j17;
        this.f75670f = set;
        this.f75671g = set2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        int i18;
        com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord wxaCommonLibRecord = (com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord) obj;
        if (android.text.TextUtils.isEmpty(wxaCommonLibRecord.f75379f) && (i18 = wxaCommonLibRecord.f75377d) < (i17 = this.f75668d)) {
            long j17 = this.f75669e;
            long j18 = wxaCommonLibRecord.f75383m;
            if (j17 - j18 > 86400) {
                boolean contains = this.f75670f.contains(java.lang.Integer.valueOf(i18));
                java.util.Set set = this.f75671g;
                boolean contains2 = set != null ? set.contains(java.lang.Integer.valueOf(i18)) : false;
                if (!contains && !contains2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processDownloadFailCommLibFiles, version=%d, createTime=%d, maxVersion=%d", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
                    return java.lang.Boolean.TRUE;
                }
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
