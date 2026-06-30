package rc;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final rc.e f475443a = new rc.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f475444b = new java.util.LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f475445c = new java.lang.Object();

    public final void a(byte[] cert) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cert, "cert");
        byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(cert);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
        java.lang.String a07 = kz5.z.a0(digest, "", null, null, 0, null, rc.d.f475442d, 30, null);
        synchronized (f475445c) {
            java.util.Set set = f475444b;
            if (set.contains(a07)) {
                return;
            }
            set.add(a07);
            try {
                org.p3343x72743996.net.C29565xfe45eec8.m153693x520b0602(cert);
            } catch (java.security.KeyStoreException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CronetUserCertInjector", "KeyStoreException while adding certificate: " + e17.getMessage());
            } catch (java.security.NoSuchAlgorithmException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CronetUserCertInjector", "NoSuchAlgorithmException while adding certificate: " + e18.getMessage());
            } catch (java.security.cert.CertificateException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CronetUserCertInjector", "Failed to add certificate: " + e19.getMessage());
            }
        }
    }

    public final void b() {
        byte[][] m153701xb846fdd2 = org.p3343x72743996.net.C29565xfe45eec8.m153701xb846fdd2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m153701xb846fdd2, "getUserAddedRoots(...)");
        for (byte[] bArr : m153701xb846fdd2) {
            a(bArr);
        }
    }
}
