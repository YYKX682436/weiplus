package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.o.class)
/* loaded from: classes9.dex */
public class s2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.o {

    /* renamed from: e, reason: collision with root package name */
    public long f281429e;

    /* renamed from: f, reason: collision with root package name */
    public long f281430f;

    /* renamed from: g, reason: collision with root package name */
    public int f281431g;

    /* renamed from: h, reason: collision with root package name */
    public int f281432h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f281433i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f281434m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281435n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21658x69ae0a35(this, com.p314xaae8f345.mm.app.a0.f134821d);

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (n0()) {
            long elapsedRealtime = this.f281430f + ((android.os.SystemClock.elapsedRealtime() - this.f281429e) / 1000);
            this.f281430f = elapsedRealtime;
            java.util.HashSet hashSet = (java.util.HashSet) this.f281434m;
            int size = hashSet.size();
            java.lang.String str = tt0.a.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5("appbrand_notify_message").j()).f503308a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            m0(8, elapsedRealtime, size, str.replaceAll("[_a-zA-Z0-9]", "*"), this.f281431g, 0, android.os.SystemClock.elapsedRealtime(), 0, null, null, null);
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f281432h + java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            android.database.Cursor b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b1("appbrand_notify_message", 0, this.f281431g);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAppBrandNotifyReportComponent", "[buildShowReportParams] cursor is null!");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                boolean z18 = false;
                int i17 = 0;
                while (b17.moveToNext()) {
                    try {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(b17);
                        tt0.a a18 = tt0.a.a(f9Var.j());
                        if (f9Var.A0() != 2) {
                            i17++;
                            sb6.append(java.lang.String.format(java.util.Locale.US, "[%s:%s:%d];", a18.f503312e, a18.f503310c, java.lang.Integer.valueOf(i17)));
                            if (sb6.length() > 5000) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAppBrandNotifyReportComponent", "cut off exposed message");
                                sb6.setLength(sb6.length() - 1);
                                o0(a17, sb6.toString());
                                sb6.delete(0, sb6.length());
                                z18 = true;
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        b17.close();
                        throw th6;
                    }
                }
                b17.close();
                if (sb6.length() > 0) {
                    sb6.setLength(sb6.length() - 1);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6.toString().trim())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAppBrandNotifyReportComponent", "empty msg show report content, skip report");
                } else {
                    if (!z18) {
                        a17 = null;
                    }
                    o0(a17, sb6.toString());
                }
            }
            hashSet.clear();
            this.f281433i = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 i5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5.class);
            if (i5Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0) i5Var;
                d0Var.f156580d = null;
                d0Var.f156581e = null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        if (n0()) {
            this.f281432h = gm0.j1.b().h();
            this.f281429e = android.os.SystemClock.elapsedRealtime();
            java.lang.System.currentTimeMillis();
            this.f281430f = 0L;
            this.f281431g = 0;
            ((java.util.HashSet) this.f281434m).clear();
        }
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (n0()) {
            this.f281431g = java.lang.Math.max(this.f281431g, i19 - i17);
        }
    }

    public final void m0(int i17, long j17, int i18, java.lang.String str, int i19, int i27, long j18, int i28, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19724, 1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), 0, java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str2, str3, str4, null, 0, null, null, 0, null, null, this.f281433i);
    }

    public final boolean n0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280113d.x())) {
            return false;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.B3(this.f280113d.x());
    }

    public final void o0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19724, 2, 0, 0, 0, 0, null, 0, 0, 0, null, null, null, null, 0, null, null, 0, str2, str, this.f281433i);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (n0()) {
            this.f281429e = android.os.SystemClock.elapsedRealtime();
            this.f281435n.mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (n0()) {
            this.f281430f += (android.os.SystemClock.elapsedRealtime() - this.f281429e) / 1000;
            this.f281435n.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389;
        if (n0()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7("appbrand_notify_message") >= 2 && (mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).mo75871xfb80e389(0)) != null && mo75871xfb80e389.A0() == 2) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).I0(1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 i5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5.class);
            if (i5Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0) i5Var;
                this.f281433i = d0Var.f156580d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h5 h5Var = d0Var.f156581e;
                int i19 = h5Var.f170216b;
                i18 = h5Var.f170215a;
                i17 = i19;
            } else {
                i17 = 0;
                i18 = 0;
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            m0(1, 0L, 0, null, 0, i17, android.os.SystemClock.elapsedRealtime(), i18, null, null, null);
        }
    }
}
