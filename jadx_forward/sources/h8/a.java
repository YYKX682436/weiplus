package h8;

/* loaded from: classes7.dex */
public class a implements h8.c {

    /* renamed from: a, reason: collision with root package name */
    public int f361042a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    /* renamed from: b, reason: collision with root package name */
    public int f361043b = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    @Override // h8.c
    public java.lang.String a() {
        return "http";
    }

    @Override // h8.c
    /* renamed from: accept */
    public boolean mo127722xab27b508(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        java.lang.String str = (java.lang.String) obj;
        return str.startsWith("http://") || str.startsWith("https://");
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        h8.b bVar = new h8.b();
        try {
            java.net.URLConnection openConnection = new java.net.URL((java.lang.String) obj).openConnection();
            openConnection.setReadTimeout(this.f361043b);
            openConnection.setConnectTimeout(this.f361042a);
            bVar.f361044a = new java.io.BufferedInputStream(openConnection.getInputStream());
        } catch (java.net.SocketTimeoutException e17) {
            bVar.f361045b = "http请求超时";
            g8.g.a("NativeImageHttpFetcher", "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]", obj, java.lang.Integer.valueOf(this.f361042a), java.lang.Integer.valueOf(this.f361043b), e17.toString());
        } catch (java.lang.Exception e18) {
            bVar.f361045b = "http请求出现错误";
            g8.g.a("NativeImageHttpFetcher", "fetch error. path = [%s], error = [%s]", obj, e18.toString());
        }
        return bVar;
    }
}
