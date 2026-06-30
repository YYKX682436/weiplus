package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f184209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.r f184210g;

    public x3(java.lang.String str, int i17, r45.qt2 qt2Var, yz5.r rVar) {
        this.f184207d = str;
        this.f184208e = i17;
        this.f184209f = qt2Var;
        this.f184210g = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMpLinkVerifier", "verify " + this.f184207d);
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderExtendedReadingPrefix");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                d17 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + ';';
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            boolean z17 = true;
            java.util.List e07 = r26.n0.e0(r26.n0.u0(d17).toString(), new char[]{';'}, false, 0, 6, null);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : e07) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r26.n0.u0((java.lang.String) obj).toString())) {
                    arrayList.add(obj);
                }
            }
            java.lang.String str3 = this.f184207d;
            boolean z18 = false;
            for (java.lang.String str4 : arrayList) {
                java.lang.String lowerCase = str3.toLowerCase();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                if (r26.i0.y(lowerCase, r26.n0.u0(str4).toString(), false)) {
                    z18 = true;
                }
            }
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMpLinkVerifier", "scheme or host not valid");
                this.f184210g.C(-100, "", "", null);
                return;
            }
            dk2.ef efVar = dk2.ef.f314905a;
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                boolean z19 = ((mm2.c1) eVar.a(mm2.c1.class)).T;
                if (!((mm2.n0) eVar.a(mm2.n0.class)).f410806r) {
                    z17 = false;
                }
                if (!z19 && !z17) {
                    if (zl2.r4.f555483a.w1()) {
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        str2 = xy2.c.e(context);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMpLinkVerifier", "verify but role invalid");
                        str2 = null;
                    }
                    str = str2;
                }
                str2 = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
                str = str2;
            } else {
                str = null;
            }
            new db2.c4(this.f184208e, this.f184207d, 1, null, this.f184209f, str, null, false, 200, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w3(this.f184210g, this.f184207d));
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveMpLinkVerifier", e17, "MalformedURLException", new java.lang.Object[0]);
            this.f184210g.C(-100, "", "", null);
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveMpLinkVerifier", e18, "IOException", new java.lang.Object[0]);
            this.f184210g.C(java.lang.Integer.valueOf(org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed), null, "", null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveMpLinkVerifier", th6, "Throwable", new java.lang.Object[0]);
            this.f184210g.C(java.lang.Integer.valueOf(org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed), "", "", null);
        }
    }
}
