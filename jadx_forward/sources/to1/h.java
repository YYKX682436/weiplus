package to1;

/* loaded from: classes15.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f502445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f502446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ro1.d f502447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.net.Uri uri, android.net.Uri uri2, ro1.d dVar) {
        super(0);
        this.f502445d = uri;
        this.f502446e = uri2;
        this.f502447f = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        java.lang.Throwable th6;
        android.net.Uri uri = this.f502446e;
        android.net.Uri uri2 = this.f502445d;
        try {
            to1.i iVar = to1.i.f502448a;
            java.io.InputStream c17 = iVar.c(uri2);
            if (c17 != null) {
                ro1.d dVar = this.f502447f;
                try {
                    java.io.OutputStream d17 = iVar.d(uri);
                    if (d17 != null) {
                        try {
                            to1.i.a(iVar, c17, d17, dVar, 0, 8, null);
                            ro1.f fVar = ro1.f.f479512e;
                            try {
                                vz5.b.a(d17, null);
                                vz5.b.a(c17, null);
                                return fVar;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                inputStream2 = c17;
                                th6 = th;
                                try {
                                    throw th6;
                                } catch (java.lang.Throwable th8) {
                                    vz5.b.a(inputStream2, th6);
                                    throw th8;
                                }
                            }
                        } catch (java.lang.Throwable th9) {
                            inputStream2 = c17;
                            try {
                                throw th9;
                            } catch (java.lang.Throwable th10) {
                                try {
                                    vz5.b.a(d17, th9);
                                    throw th10;
                                } catch (java.lang.Throwable th11) {
                                    th = th11;
                                    th6 = th;
                                    throw th6;
                                }
                            }
                        }
                    }
                    inputStream = c17;
                    vz5.b.a(inputStream, null);
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    inputStream2 = c17;
                }
            } else {
                inputStream = c17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SAFUtils", "inputStream = " + inputStream + ", outputStream = null");
            return ro1.f.f479516i;
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SAFUtils", e17, "Fail to copy(e.msg=" + e17.getMessage() + "). srcUri=" + uri2 + ", destUri=" + uri, new java.lang.Object[0]);
            return ro1.f.f479514g;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SAFUtils", e18, "Fail to copy(e.msg=" + e18.getMessage() + "). srcUri=" + uri2 + ", destUri=" + uri, new java.lang.Object[0]);
            return ro1.f.f479513f;
        }
    }
}
