package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tt extends com.tencent.mapsdk.internal.lu {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f52241a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f52243c;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f52245e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f52246f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.mapsdk.vector.VectorMap f52247g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mapsdk.internal.hg f52248h;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.lz f52242b = new com.tencent.mapsdk.internal.lz();

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f52244d = "";

    public tt(com.tencent.mapsdk.internal.tz tzVar) {
        this.f52243c = "UNKNOW";
        android.content.Context I = tzVar.I();
        this.f52241a = I;
        this.f52243c = I.getClass().getSimpleName();
        this.f52241a = this.f52241a.getApplicationContext();
        this.f52247g = (com.tencent.mapsdk.vector.VectorMap) tzVar.e_;
        this.f52248h = tzVar.f52273as.f49000c;
    }

    private java.lang.String a(java.lang.String str) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.dp dpVar = (com.tencent.mapsdk.internal.dp) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dp.class);
        com.tencent.mapsdk.internal.dm dmVar = (com.tencent.mapsdk.internal.dm) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dm.class);
        java.lang.String indoorMapUrl = ((com.tencent.mapsdk.internal.da) dpVar.i()).getIndoorMapUrl();
        java.lang.String indoorMapUrl2 = ((com.tencent.mapsdk.internal.cy) dmVar.i()).getIndoorMapUrl();
        android.net.Uri parse = android.net.Uri.parse(str);
        android.net.Uri parse2 = android.net.Uri.parse(indoorMapUrl);
        android.net.Uri parse3 = android.net.Uri.parse(indoorMapUrl2);
        java.lang.String c17 = com.tencent.mapsdk.internal.hr.c(parse.getAuthority());
        java.lang.String c18 = com.tencent.mapsdk.internal.hr.c(parse.getPath());
        java.lang.String c19 = com.tencent.mapsdk.internal.hr.c(parse2.getPath());
        java.lang.String c27 = com.tencent.mapsdk.internal.hr.c(parse3.getPath());
        if (c17.equals(parse2.getAuthority()) && (c18.startsWith(c19) || c18.startsWith(c27))) {
            str = parse3.buildUpon().scheme(dmVar.f49202b ? "https" : parse.getScheme()).encodedPath(c18.replace(c19, c27)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        com.tencent.mapsdk.internal.dw dwVar = (com.tencent.mapsdk.internal.dw) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dw.class);
        if (dwVar == null || str.endsWith(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG) || str.startsWith(dwVar.j())) {
            return str;
        }
        com.tencent.mapsdk.vector.VectorMap vectorMap = this.f52247g;
        if (vectorMap != null && (neVar = vectorMap.f52512o) != null) {
            neVar.F();
            this.f52245e = this.f52247g.f52512o.F().f49011c;
            this.f52246f = this.f52247g.f52512o.F().f49012d;
        }
        return str + this.f52244d + com.tencent.mapsdk.internal.hn.a(this.f52243c, this.f52245e, this.f52246f);
    }

    @Override // com.tencent.mapsdk.internal.lu
    public final byte[] f(java.lang.String str) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.B, "download url : ".concat(java.lang.String.valueOf(str)));
        if (this.f52241a == null || com.tencent.mapsdk.internal.hr.a(str) || !this.f52242b.a(str)) {
            return null;
        }
        if (this.f52247g != null && com.tencent.mapsdk.internal.hr.a(this.f52244d) && !com.tencent.mapsdk.internal.hr.a(this.f52247g.z())) {
            this.f52244d = "&eng_ver=" + this.f52247g.z();
        }
        com.tencent.mapsdk.internal.dp dpVar = (com.tencent.mapsdk.internal.dp) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dp.class);
        com.tencent.mapsdk.internal.dm dmVar = (com.tencent.mapsdk.internal.dm) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dm.class);
        java.lang.String indoorMapUrl = ((com.tencent.mapsdk.internal.da) dpVar.i()).getIndoorMapUrl();
        java.lang.String indoorMapUrl2 = ((com.tencent.mapsdk.internal.cy) dmVar.i()).getIndoorMapUrl();
        android.net.Uri parse = android.net.Uri.parse(str);
        android.net.Uri parse2 = android.net.Uri.parse(indoorMapUrl);
        android.net.Uri parse3 = android.net.Uri.parse(indoorMapUrl2);
        java.lang.String c17 = com.tencent.mapsdk.internal.hr.c(parse.getAuthority());
        java.lang.String c18 = com.tencent.mapsdk.internal.hr.c(parse.getPath());
        java.lang.String c19 = com.tencent.mapsdk.internal.hr.c(parse2.getPath());
        java.lang.String c27 = com.tencent.mapsdk.internal.hr.c(parse3.getPath());
        if (c17.equals(parse2.getAuthority()) && (c18.startsWith(c19) || c18.startsWith(c27))) {
            str = parse3.buildUpon().scheme(dmVar.f49202b ? "https" : parse.getScheme()).encodedPath(c18.replace(c19, c27)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        com.tencent.mapsdk.internal.dw dwVar = (com.tencent.mapsdk.internal.dw) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dw.class);
        if (dwVar != null && !str.endsWith(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG) && !str.startsWith(dwVar.j())) {
            com.tencent.mapsdk.vector.VectorMap vectorMap = this.f52247g;
            if (vectorMap != null && (neVar = vectorMap.f52512o) != null) {
                neVar.F();
                this.f52245e = this.f52247g.f52512o.F().f49011c;
                this.f52246f = this.f52247g.f52512o.F().f49012d;
            }
            str = str + this.f52244d + com.tencent.mapsdk.internal.hn.a(this.f52243c, this.f52245e, this.f52246f);
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.B, "rectify url : ".concat(java.lang.String.valueOf(str)));
        try {
            com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(com.tencent.map.tools.net.NetUtil.STR_UserAgent).doGet();
            if (doGet == null) {
                return null;
            }
            if (!str.contains("qt=rtt")) {
                this.f52242b.b(str);
            }
            return doGet.data;
        } catch (java.lang.Exception e17) {
            if (str.contains("/mvd_map")) {
                int i17 = e17 instanceof com.tencent.map.tools.net.exception.NetUnavailableException ? ((com.tencent.map.tools.net.exception.NetUnavailableException) e17).errorCode : e17 instanceof com.tencent.map.tools.net.exception.NetErrorException ? ((com.tencent.map.tools.net.exception.NetErrorException) e17).statusCode : -1;
                com.tencent.mapsdk.internal.hg hgVar = this.f52248h;
                if (hgVar != null) {
                    hgVar.a().a(java.lang.System.currentTimeMillis(), str.substring(str.indexOf(63) + 1), i17);
                }
            }
            return null;
        }
    }
}
