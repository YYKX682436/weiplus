package cw4;

@j95.b
/* loaded from: classes8.dex */
public class v0 extends i95.w implements qk.j9 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f305819d;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f305819d = hashSet;
        hashSet.add("preVerifyJSAPI");
        hashSet.add("openUrlWithExtraWebview");
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.f33725x24728b);
        hashSet.add("launchApplication");
        hashSet.add("getBrandWCPayRequest");
        hashSet.add("geoLocation");
        hashSet.add(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33741x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33727x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q.f33745x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33753x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pc.f34669x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33739x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.x.f33757x24728b);
        hashSet.add("addContact");
        hashSet.add("quicklyAddBrandContact");
        hashSet.add("requestBindPhoneNumber");
        hashSet.add("openWeApp");
        hashSet.add("checkJsApi");
        hashSet.add(be1.z.f4243x24728b);
        hashSet.add("launchAppByScheme");
        hashSet.add("jumpToBizProfile");
        hashSet.add("openCustomerServiceChat");
        hashSet.add("showOpenIMContactProfile");
    }

    public java.lang.String wi(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(parse.getHost(), a17)) {
            return null;
        }
        java.lang.String queryParameter = parse.getQueryParameter("__biz");
        if (queryParameter == null) {
            queryParameter = "";
        }
        java.lang.String queryParameter2 = parse.getQueryParameter("mid");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        java.lang.String queryParameter3 = parse.getQueryParameter("idx");
        java.lang.String str2 = queryParameter3 != null ? queryParameter3 : "";
        if (queryParameter.length() <= 0 || queryParameter2.length() <= 0 || str2.length() <= 0) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("id://local/i.html?__biz=%s&mid=%s&idx=%s", queryParameter, queryParameter2, str2);
    }
}
