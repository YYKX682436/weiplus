package yw4;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final int f548481b;

    /* renamed from: c, reason: collision with root package name */
    public final yw4.a f548482c;

    public b(int i17, yw4.a aVar) {
        this.f548481b = i17;
        this.f548482c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x02de, code lost:
    
        if (r2 != 338) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 r23, com.p314xaae8f345.p3210x3857dc.x0 r24) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.b.f(com.tencent.xweb.WebView, com.tencent.xweb.x0):com.tencent.xweb.y0");
    }

    public final java.lang.String v(android.net.Uri uri, java.lang.String str) {
        if (uri == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebImgPreloadInterceptor", "getQueryParameterSafely uri or key null");
            return "";
        }
        try {
            if (!uri.isHierarchical()) {
                return "";
            }
            java.lang.String queryParameter = uri.getQueryParameter(str);
            return queryParameter == null ? "" : queryParameter;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebImgPreloadInterceptor", "getQueryParameterSafely failed " + e17);
            return "";
        }
    }
}
