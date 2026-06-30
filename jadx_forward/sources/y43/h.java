package y43;

/* loaded from: classes8.dex */
public final class h extends l75.n0 implements y43.f {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f540881f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f540882d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f540883e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.m145250x3fdc6f77(y43.e.B, "LocalLiteAppConf"));
        java.lang.String[] INDEX_CREATE = dm.r7.f321187p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f540881f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 storage) {
        super(storage, y43.e.B, "LocalLiteAppConf", dm.r7.f321187p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        this.f540882d = storage;
        this.f540883e = new y43.g(storage);
    }

    @Override // y43.f
    public void d(java.lang.String hostPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostPath, "hostPath");
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameLocalLiteAppConfDaoImpl", "delete hostPath = " + hostPath + "  result = " + this.f540882d.mo70514xb06685ab("LocalLiteAppConf", "url = ?", new java.lang.String[]{hostPath}));
    }

    @Override // y43.f
    public y43.e e(java.lang.String hostPath) {
        y43.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostPath, "hostPath");
        android.database.Cursor f17 = this.f540882d.f("SELECT * FROM LocalLiteAppConf WHERE url = " + d95.b0.O(hostPath), null, 2);
        if (f17 == null) {
            return null;
        }
        try {
            if (f17.moveToFirst()) {
                eVar = new y43.e();
                eVar.mo9015xbf5d97fd(f17);
            } else {
                eVar = null;
            }
            vz5.b.a(f17, null);
            return eVar;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(f17, th6);
                throw th7;
            }
        }
    }

    @Override // y43.f
    public void i5(y43.e eVar) {
        if (eVar == null) {
            return;
        }
        l75.k0 k0Var = this.f540882d;
        long b17 = k0Var.b();
        try {
            this.f540883e.d(eVar);
            k0Var.w(java.lang.Long.valueOf(b17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdate liteAppConf =");
            sb6.append("url: " + eVar.f68184x4b6e88aa + "; appId: " + eVar.f68178x28d46377 + "path: " + eVar.f68181x2260084a + "; wepkg_id: " + eVar.f68185xb772261 + "; expire_duration: " + eVar.f68179x61c4976f + "; refresh_duration: " + eVar.f68182x7654871d);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameLocalLiteAppConfDaoImpl", sb6.toString());
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }
}
