package cb;

/* loaded from: classes13.dex */
public final class c0 implements cb.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final xa.b f40110a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.iid.FirebaseInstanceId f40111b;

    /* renamed from: c, reason: collision with root package name */
    public final cb.f f40112c;

    /* renamed from: d, reason: collision with root package name */
    public final cb.m f40113d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f40114e;

    public c0(xa.b bVar, com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, cb.f fVar) {
        this.f40110a = bVar;
        this.f40111b = firebaseInstanceId;
        this.f40112c = fVar;
        bVar.d();
        this.f40113d = new cb.m(bVar.f452752a, fVar);
        this.f40114e = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
    }

    public final java.lang.String a(android.os.Bundle bundle) {
        if (bundle == null) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        }
        java.lang.String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        java.lang.String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        java.lang.String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            this.f40111b.n();
            throw new java.io.IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new java.io.IOException(string3);
        }
        new java.lang.StringBuilder(java.lang.String.valueOf(bundle).length() + 21);
        new java.lang.Throwable();
        throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
    }

    public final android.os.Bundle b(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        int i17;
        java.lang.String str3;
        android.content.pm.PackageInfo c17;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("appid", com.google.firebase.iid.FirebaseInstanceId.j());
        xa.b bVar = this.f40110a;
        bVar.d();
        bundle.putString("gmp_app_id", bVar.f452754c.f452760b);
        cb.f fVar = this.f40112c;
        synchronized (fVar) {
            if (fVar.f40123d == 0 && (c17 = fVar.c("com.google.android.gms")) != null) {
                fVar.f40123d = c17.versionCode;
            }
            i17 = fVar.f40123d;
        }
        bundle.putString("gmsv", java.lang.Integer.toString(i17));
        bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f40112c.e());
        cb.f fVar2 = this.f40112c;
        synchronized (fVar2) {
            if (fVar2.f40122c == null) {
                fVar2.b();
            }
            str3 = fVar2.f40122c;
        }
        bundle.putString("app_ver_name", str3);
        bundle.putString("cliv", "fiid-12451000");
        return bundle;
    }
}
