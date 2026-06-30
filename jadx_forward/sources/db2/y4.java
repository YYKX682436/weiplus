package db2;

/* loaded from: classes8.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f309777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.u f309778f;

    public y4(java.lang.String str, r45.qt2 qt2Var, yz5.u uVar) {
        this.f309776d = str;
        this.f309777e = qt2Var;
        this.f309778f = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verify ");
        java.lang.String str = this.f309776d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderExtendReadingVerifier", sb6.toString());
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderExtendedReadingPrefix");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                d17 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + ';';
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            java.util.List e07 = r26.n0.e0(r26.n0.u0(d17).toString(), new char[]{';'}, false, 0, 6, null);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : e07) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r26.n0.u0((java.lang.String) obj).toString())) {
                    arrayList.add(obj);
                }
            }
            boolean z17 = false;
            for (java.lang.String str2 : arrayList) {
                java.lang.String lowerCase = str.toLowerCase();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                if (r26.i0.y(lowerCase, r26.n0.u0(str2).toString(), false)) {
                    z17 = true;
                }
            }
            if (z17) {
                new db2.c4(1, this.f309776d, 0, null, this.f309777e, null, null, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de, null).l().K(new db2.x4(this.f309778f, str));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderExtendReadingVerifier", "scheme or host not valid");
            yz5.u uVar = this.f309778f;
            java.util.Map map = db2.z4.f309792a;
            uVar.K(java.lang.Integer.valueOf(db2.z4.f309793b), "", this.f309776d, "", 0, 2, null);
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderExtendReadingVerifier", e17, "MalformedURLException", new java.lang.Object[0]);
            yz5.u uVar2 = this.f309778f;
            java.util.Map map2 = db2.z4.f309792a;
            uVar2.K(java.lang.Integer.valueOf(db2.z4.f309793b), "", this.f309776d, "", 0, 2, null);
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderExtendReadingVerifier", e18, "IOException", new java.lang.Object[0]);
            yz5.u uVar3 = this.f309778f;
            java.util.Map map3 = db2.z4.f309792a;
            uVar3.K(java.lang.Integer.valueOf(db2.z4.f309794c), "", this.f309776d, "", 0, 2, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderExtendReadingVerifier", th6, "Throwable", new java.lang.Object[0]);
            yz5.u uVar4 = this.f309778f;
            java.util.Map map4 = db2.z4.f309792a;
            uVar4.K(java.lang.Integer.valueOf(db2.z4.f309794c), "", this.f309776d, "", 0, 2, null);
        }
    }
}
