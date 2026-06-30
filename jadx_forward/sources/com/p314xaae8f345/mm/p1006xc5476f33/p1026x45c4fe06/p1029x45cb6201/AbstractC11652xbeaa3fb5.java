package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.AbsReader */
/* loaded from: classes7.dex */
public abstract class AbstractC11652xbeaa3fb5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f156897d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.String f156898e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.String f156899f;

    /* renamed from: g, reason: collision with root package name */
    public volatile cl0.g f156900g;

    /* renamed from: h, reason: collision with root package name */
    public volatile pe.e f156901h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33
    public final java.lang.String B7() {
        W0();
        return this.f156898e;
    }

    public final synchronized pe.e K1() {
        if (this.f156901h == null) {
            this.f156901h = pe.d.a(qe("expt"), qe("exptNeedParams"));
            if (this.f156901h == null) {
                this.f156901h = new pe.e(null);
            }
        }
        return this.f156901h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public final java.lang.String M(java.lang.String str) {
        java.io.InputStream a17 = a(str);
        if (a17 == null) {
            return null;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        java.lang.String d17 = ik1.f.d(a17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(a17);
        android.os.SystemClock.elapsedRealtime();
        return d17;
    }

    public final cl0.g M1() {
        if (this.f156900g == null) {
            synchronized (this) {
                if (this.f156900g == null) {
                    java.lang.String M = M("WAVersion.json");
                    if (android.text.TextUtils.isEmpty(M)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AbsReader", "getVersionMetaJson EMPTY WAVersion.json, info=%s", getF172191d());
                    }
                    try {
                        this.f156900g = android.text.TextUtils.isEmpty(M) ? new cl0.g() : new cl0.g(M);
                    } catch (cl0.f e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.AbsReader", e17, "parse WAVersion.json[%s] ", M);
                        return new cl0.g();
                    }
                }
            }
        }
        return this.f156900g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String W0() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.AppBrand.AbsReader"
            java.lang.String r1 = ""
            java.lang.String r2 = r9.f156897d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L61
            r2 = 0
            cl0.g r3 = r9.M1()     // Catch: java.lang.Exception -> L3d
            java.lang.String r4 = "version"
            java.lang.String r4 = r3.mo15074x2fec8307(r4)     // Catch: java.lang.Exception -> L3d
            java.lang.String r5 = "updateTime"
            java.lang.String r3 = r3.mo15074x2fec8307(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = "AbsReader version parsed wx.version[%s | %s] intVersion[%d]"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L38
            r6[r2] = r4     // Catch: java.lang.Exception -> L38
            r7 = 1
            r6[r7] = r3     // Catch: java.lang.Exception -> L38
            int r7 = r9.i()     // Catch: java.lang.Exception -> L38
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L38
            r8 = 2
            r6[r8] = r7     // Catch: java.lang.Exception -> L38
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5, r6)     // Catch: java.lang.Exception -> L38
            goto L47
        L38:
            r5 = move-exception
            goto L40
        L3a:
            r5 = move-exception
            r3 = r1
            goto L40
        L3d:
            r5 = move-exception
            r3 = r1
            r4 = r3
        L40:
            java.lang.String r6 = "get WAVersion.json failed."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r5, r6, r2)
        L47:
            if (r4 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r4
        L4b:
            r9.f156897d = r1
            r9.f156898e = r3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r9.f156897d
            java.lang.String r2 = r9.f156898e
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "%s (%s)"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r9.f156899f = r0
        L61:
            java.lang.String r0 = r9.f156897d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.AbstractC11652xbeaa3fb5.W0():java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public final java.lang.String Y0() {
        W0();
        java.lang.String str = this.f156899f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        if (interfaceC11702x4ae7c33 == null) {
            return -1;
        }
        if (interfaceC11702x4ae7c33.getClass() == getClass() && interfaceC11702x4ae7c33.i() > 0 && interfaceC11702x4ae7c33.i() == i()) {
            return 0;
        }
        return Y0().compareTo(interfaceC11702x4ae7c33.Y0());
    }

    /* renamed from: equals */
    public boolean m49184xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && compareTo((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) obj) == 0;
    }

    /* renamed from: hashCode */
    public int m49185x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(i()), Y0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3
    public final int i() {
        return getF172191d().mo49191x1c82a56c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33
    public final java.lang.String qe(java.lang.String str) {
        cl0.g b17;
        if (android.text.TextUtils.isEmpty(str) || (b17 = M1().b("features")) == null) {
            return null;
        }
        return b17.mo15083x48bce8a4(str, null);
    }
}
