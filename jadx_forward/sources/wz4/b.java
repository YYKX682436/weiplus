package wz4;

/* loaded from: classes8.dex */
public class b extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static wz4.b f532327f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f532329d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f532326e = {l75.n0.m145250x3fdc6f77(wz4.a.B, "WePkgDiffPackage")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f532328g = new java.lang.Object();

    public b(l75.k0 k0Var) {
        super(k0Var, wz4.a.B, "WePkgDiffPackage", dm.jc.f319444p);
        this.f532329d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if ((r1.f532329d != null) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wz4.b z0() {
        /*
            wz4.b r0 = wz4.b.f532327f
            if (r0 != 0) goto L26
            java.lang.Object r0 = wz4.b.f532328g
            monitor-enter(r0)
            wz4.b r1 = wz4.b.f532327f     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            l75.k0 r1 = r1.f532329d     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L21
        L14:
            wz4.b r1 = new wz4.b     // Catch: java.lang.Throwable -> L23
            gm0.b0 r2 = gm0.j1.u()     // Catch: java.lang.Throwable -> L23
            l75.k0 r2 = r2.f354686f     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            wz4.b.f532327f = r1     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
        L26:
            wz4.b r0 = wz4.b.f532327f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wz4.b.z0():wz4.b");
    }

    public boolean d(java.lang.String str) {
        if (!(this.f532329d != null) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return m145253xb158737d("WePkgDiffPackage", java.lang.String.format("delete from %s where %s=%s", "WePkgDiffPackage", "pkgId", "'" + str + "'"));
    }

    public wz4.a y0(java.lang.String str) {
        if (!(this.f532329d != null) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(java.lang.String.format("select * from %s where %s=%s", "WePkgDiffPackage", "pkgId", "'" + str + "'"), new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        if (!m145256x1d3f4980.moveToFirst()) {
            m145256x1d3f4980.close();
            return null;
        }
        wz4.a aVar = new wz4.a();
        aVar.mo9015xbf5d97fd(m145256x1d3f4980);
        m145256x1d3f4980.close();
        return aVar;
    }
}
