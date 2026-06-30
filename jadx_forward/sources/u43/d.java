package u43;

/* loaded from: classes8.dex */
public final class d extends l75.n0 implements u43.a {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f506180f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f506181d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f506182e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.m145250x3fdc6f77(u43.b.L, "ApkChannelPatchInfo"));
        java.lang.String[] INDEX_CREATE = dm.q.f320839u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f506180f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 storage) {
        super(storage, u43.b.L, "ApkChannelPatchInfo", dm.q.f320839u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        this.f506181d = storage;
        this.f506182e = new u43.c(storage);
    }

    @Override // u43.a
    public void d(java.lang.String pkgName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgName, "pkgName");
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ApkChannelPatchInfoDaoImpl", "delete pkgName = " + pkgName + "  result = " + this.f506181d.mo70514xb06685ab("ApkChannelPatchInfo", "pkgName = ?", new java.lang.String[]{pkgName}));
    }

    @Override // u43.a
    public u43.b e(java.lang.String pkgName) {
        u43.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgName, "pkgName");
        android.database.Cursor f17 = this.f506181d.f("SELECT * FROM ApkChannelPatchInfo WHERE pkgName = " + d95.b0.O(pkgName), null, 2);
        if (f17 == null) {
            return null;
        }
        try {
            if (f17.moveToFirst()) {
                bVar = new u43.b();
                bVar.mo9015xbf5d97fd(f17);
            } else {
                bVar = null;
            }
            vz5.b.a(f17, null);
            return bVar;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(f17, th6);
                throw th7;
            }
        }
    }

    @Override // u43.a
    public void ya(u43.b bVar) {
        if (bVar == null) {
            return;
        }
        l75.k0 k0Var = this.f506181d;
        long b17 = k0Var.b();
        try {
            this.f506182e.d(bVar);
            k0Var.w(java.lang.Long.valueOf(b17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdate patchInfo =");
            sb6.append("pkgName: " + bVar.f67993x55b38832 + "; patchPath: " + bVar.f67992x7c02bf88 + "newChannelApkPath: " + bVar.f67990x867b0399 + "; isServerPatch: " + bVar.f67989xf72be4b6 + "; taskStatus: " + bVar.f67997xf2f12e3c);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ApkChannelPatchInfoDaoImpl", sb6.toString());
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }
}
