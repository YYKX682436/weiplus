package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j f224003d;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f224004a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f224005b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f224006c = false;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j a() {
        if (f224003d == null) {
            f224003d = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j();
        }
        return f224003d;
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.vfs.z7 a17;
        com.p314xaae8f345.mm.vfs.z2 m17;
        if (!this.f224006c || z17) {
            d();
            java.io.InputStream inputStream = null;
            try {
                try {
                    a17 = com.p314xaae8f345.mm.vfs.z7.a(lp0.b.e() + "ipcallCountryCodeConfig.cfg");
                    java.lang.String str = a17.f294812f;
                    if (str != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                        if (!str.equals(l17)) {
                            a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                        }
                    }
                    m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallCountryCodeConfig", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallCountryCodeConfig", "initConfig error: %s", e17.getMessage());
                }
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    this.f224006c = true;
                    java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
                    return;
                }
                inputStream = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17));
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                java.lang.String str2 = "";
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine;
                }
                c(str2);
                this.f224006c = true;
            } finally {
                com.p314xaae8f345.mm.vfs.e8.d(null);
            }
        }
    }

    public final void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("restriction");
            jSONArray.length();
            java.util.ArrayList arrayList = this.f224005b;
            arrayList.clear();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                arrayList.add(java.lang.Integer.valueOf(jSONArray.getInt(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallCountryCodeConfig", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallCountryCodeConfig", "initConfigFromContent error: %s", e17.getMessage());
        }
    }

    public final void d() {
        s83.k Ui = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ui();
        Ui.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = Ui.f486417d.f("SELECT IPCallPopularCountry.countryCode,IPCallPopularCountry.callTimeCount,IPCallPopularCountry.lastCallTime FROM IPCallPopularCountry   ORDER BY IPCallPopularCountry.callTimeCount DESC,IPCallPopularCountry.lastCallTime DESC", null, 2);
        if (f17 != null && f17.moveToFirst()) {
            new java.util.ArrayList();
            do {
                s83.i iVar = new s83.i();
                iVar.mo9015xbf5d97fd(f17);
                arrayList.add(java.lang.Integer.valueOf(iVar.f68050x13b516de));
            } while (f17.moveToNext());
        }
        if (f17 != null) {
            f17.close();
        }
        if (arrayList.size() > 0) {
            this.f224004a = arrayList;
            return;
        }
        this.f224004a.clear();
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeChatOutTopCountryCode");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return;
        }
        java.lang.String[] split = d17.trim().split(",");
        int length = split.length;
        try {
            for (java.lang.String str : split) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0));
                this.f224004a.add(valueOf);
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ui().y0(valueOf.intValue(), length);
                length--;
            }
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallCountryCodeConfig", "initPopularCountryFromDynamicConfig error: %s", e17.getMessage());
        }
    }

    public boolean e(int i17) {
        if (!this.f224006c) {
            b(false);
        }
        java.util.ArrayList arrayList = this.f224005b;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return arrayList.contains(java.lang.Integer.valueOf(i17));
    }
}
