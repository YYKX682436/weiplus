package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sq extends com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.sx f51520a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.hg f51521b;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.Language f51522c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource f51523d;

    /* renamed from: com.tencent.mapsdk.internal.sq$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51524a;

        static {
            int[] iArr = new int[com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.values().length];
            f51524a = iArr;
            try {
                iArr[com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f51524a[com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.SPARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public sq(com.tencent.mapsdk.internal.sx sxVar, com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource, com.tencent.mapsdk.internal.hg hgVar) {
        super(sxVar.f51558a, sxVar.f51561d);
        this.f51522c = com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
        this.f51521b = hgVar;
        this.f51523d = overSeaSource;
        this.f51520a = sxVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider
    public final android.graphics.Bitmap getLogo(boolean z17) {
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
    public final java.net.URL getTileUrl(int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.sx sxVar = this.f51520a;
        java.lang.String name = this.f51522c.name();
        java.lang.String str = sxVar.f51562e;
        int[] iArr = sxVar.f51563f;
        java.lang.String replaceFirst = (iArr.length == 0 ? str.replaceFirst("\\{range\\}", "") : str.replaceFirst("\\{range\\}", java.lang.Integer.toString(com.tencent.mapsdk.internal.sx.a(i17 + i18, iArr.length)))).replaceFirst("\\{z\\}", java.lang.Integer.toString(i19)).replaceFirst("\\{x\\}", java.lang.Integer.toString(i17)).replaceFirst("\\{y\\}", java.lang.Integer.toString(i18)).replaceFirst("\\{style\\}", java.lang.Integer.toString(sxVar.f51559b)).replaceFirst("\\{scene\\}", java.lang.Integer.toString(sxVar.f51560c)).replaceFirst("\\{version\\}", java.lang.Integer.toString(sxVar.f51561d)).replaceFirst("\\{ch\\}", name);
        if (replaceFirst != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "请求海外图瓦片：".concat(replaceFirst));
            try {
                return new java.net.URL(replaceFirst);
            } catch (java.net.MalformedURLException e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(android.util.Log.getStackTraceString(e17));
            }
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider
    public final boolean onLanguageChange(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        this.f51522c = language;
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
    public final com.tencent.map.tools.net.NetResponse requestTileData(java.lang.String str) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
        byte[] bArr = doGet != null ? doGet.data : null;
        if (bArr != null && bArr.length != 0 && this.f51521b != null) {
            int i17 = com.tencent.mapsdk.internal.sq.AnonymousClass1.f51524a[this.f51523d.ordinal()];
            if (i17 == 1) {
                this.f51521b.b().f49737a++;
            } else if (i17 == 2) {
                this.f51521b.b().f49738b++;
            }
        }
        return doGet;
    }
}
