package hs3;

/* loaded from: classes8.dex */
public class i extends hs3.q {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f366107f;

    /* renamed from: a, reason: collision with root package name */
    public org.apache.http.client.HttpClient f366108a = null;

    /* renamed from: b, reason: collision with root package name */
    public org.apache.http.client.methods.HttpRequestBase f366109b = null;

    /* renamed from: c, reason: collision with root package name */
    public org.apache.http.HttpResponse f366110c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f366111d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f366112e = false;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("weixin/");
        int i17 = o45.wf.f424556a;
        sb6.append(wo.q.f529313a);
        sb6.append("/0x");
        sb6.append(java.lang.Integer.toHexString(o45.wf.f424562g));
        f366107f = sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0236 A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011f A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133 A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0147 A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c6 A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025c A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TRY_LEAVE, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026f A[Catch: all -> 0x00dc, OutOfMemoryError -> 0x02d6, Exception -> 0x02d8, FileNotFoundException -> 0x0335, IllegalStateException -> 0x034b, ClientProtocolException -> 0x0361, UnknownHostException -> 0x0377, UnsupportedEncodingException -> 0x038e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x02d8, blocks: (B:16:0x00f6, B:18:0x00fe, B:19:0x0103, B:21:0x011f, B:22:0x012b, B:24:0x0133, B:25:0x013f, B:27:0x0147, B:29:0x0155, B:31:0x015d, B:35:0x016a, B:37:0x0172, B:38:0x017e, B:40:0x0184, B:42:0x0191, B:49:0x01a7, B:51:0x01b6, B:53:0x01be, B:55:0x01c6, B:57:0x01d5, B:58:0x01e4, B:60:0x01f7, B:61:0x0210, B:62:0x023b, B:63:0x023f, B:65:0x0243, B:67:0x0249, B:69:0x0258, B:71:0x025c, B:77:0x026f, B:96:0x02a8, B:97:0x02b4, B:99:0x02c2, B:100:0x02c5, B:118:0x01de, B:119:0x0236), top: B:15:0x00f6 }] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.Map, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.Map, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hs3.o b(java.lang.String r25, java.lang.String r26, hs3.n r27, hs3.m r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hs3.i.b(java.lang.String, java.lang.String, hs3.n, hs3.m):hs3.o");
    }

    public final void c(hs3.n nVar, org.apache.http.client.methods.HttpRequestBase httpRequestBase) {
        if (nVar.f366124b == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = nVar.f366124b;
        for (java.lang.String str : map.keySet()) {
            arrayList.add(new org.apache.http.message.BasicNameValuePair(str, (java.lang.String) map.get(str)));
        }
        ((org.apache.http.client.methods.HttpPost) httpRequestBase).setEntity(new org.apache.http.client.entity.UrlEncodedFormEntity(arrayList, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
    }
}
