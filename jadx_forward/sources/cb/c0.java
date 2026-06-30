package cb;

/* loaded from: classes13.dex */
public final class c0 implements cb.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final xa.b f121643a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 f121644b;

    /* renamed from: c, reason: collision with root package name */
    public final cb.f f121645c;

    /* renamed from: d, reason: collision with root package name */
    public final cb.m f121646d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f121647e;

    public c0(xa.b bVar, com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 c2743x723fba17, cb.f fVar) {
        this.f121643a = bVar;
        this.f121644b = c2743x723fba17;
        this.f121645c = fVar;
        bVar.d();
        this.f121646d = new cb.m(bVar.f534285a, fVar);
        this.f121647e = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
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
            this.f121644b.n();
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
        bundle.putString("appid", com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.j());
        xa.b bVar = this.f121643a;
        bVar.d();
        bundle.putString("gmp_app_id", bVar.f534287c.f534293b);
        cb.f fVar = this.f121645c;
        synchronized (fVar) {
            if (fVar.f121656d == 0 && (c17 = fVar.c("com.google.android.gms")) != null) {
                fVar.f121656d = c17.versionCode;
            }
            i17 = fVar.f121656d;
        }
        bundle.putString("gmsv", java.lang.Integer.toString(i17));
        bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f121645c.e());
        cb.f fVar2 = this.f121645c;
        synchronized (fVar2) {
            if (fVar2.f121655c == null) {
                fVar2.b();
            }
            str3 = fVar2.f121655c;
        }
        bundle.putString("app_ver_name", str3);
        bundle.putString("cliv", "fiid-12451000");
        return bundle;
    }
}
