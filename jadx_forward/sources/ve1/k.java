package ve1;

/* loaded from: classes13.dex */
public class k implements javax.net.ssl.HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        ve1.g.p(3, "SSLUtil", "verifying " + str, null);
        return true;
    }
}
