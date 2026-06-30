package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.r f102677g;

    public x3(java.lang.String str, int i17, r45.qt2 qt2Var, yz5.r rVar) {
        this.f102674d = str;
        this.f102675e = i17;
        this.f102676f = qt2Var;
        this.f102677g = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMpLinkVerifier", "verify " + this.f102674d);
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderExtendedReadingPrefix");
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                d17 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + ';';
            }
            kotlin.jvm.internal.o.d(d17);
            boolean z17 = true;
            java.util.List e07 = r26.n0.e0(r26.n0.u0(d17).toString(), new char[]{';'}, false, 0, 6, null);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : e07) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(r26.n0.u0((java.lang.String) obj).toString())) {
                    arrayList.add(obj);
                }
            }
            java.lang.String str3 = this.f102674d;
            boolean z18 = false;
            for (java.lang.String str4 : arrayList) {
                java.lang.String lowerCase = str3.toLowerCase();
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                if (r26.i0.y(lowerCase, r26.n0.u0(str4).toString(), false)) {
                    z18 = true;
                }
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveMpLinkVerifier", "scheme or host not valid");
                this.f102677g.C(-100, "", "", null);
                return;
            }
            dk2.ef efVar = dk2.ef.f233372a;
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                boolean z19 = ((mm2.c1) eVar.a(mm2.c1.class)).T;
                if (!((mm2.n0) eVar.a(mm2.n0.class)).f329273r) {
                    z17 = false;
                }
                if (!z19 && !z17) {
                    if (zl2.r4.f473950a.w1()) {
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        str2 = xy2.c.e(context);
                    } else {
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMpLinkVerifier", "verify but role invalid");
                        str2 = null;
                    }
                    str = str2;
                }
                str2 = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
                str = str2;
            } else {
                str = null;
            }
            new db2.c4(this.f102675e, this.f102674d, 1, null, this.f102676f, str, null, false, 200, null).l().K(new com.tencent.mm.plugin.finder.assist.w3(this.f102677g, this.f102674d));
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveMpLinkVerifier", e17, "MalformedURLException", new java.lang.Object[0]);
            this.f102677g.C(-100, "", "", null);
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveMpLinkVerifier", e18, "IOException", new java.lang.Object[0]);
            this.f102677g.C(java.lang.Integer.valueOf(org.chromium.net.NetError.ERR_INVALID_URL), null, "", null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveMpLinkVerifier", th6, "Throwable", new java.lang.Object[0]);
            this.f102677g.C(java.lang.Integer.valueOf(org.chromium.net.NetError.ERR_INVALID_URL), "", "", null);
        }
    }
}
