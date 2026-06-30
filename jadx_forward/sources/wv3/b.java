package wv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final wv3.b f531581a = new wv3.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f531582b = new java.util.LinkedHashSet();

    public final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, wv3.d editSource, wv3.c musicScene) {
        wv3.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editSource, "editSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicScene, "musicScene");
        if (c16997xb0aa383a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return "";
        }
        wv3.l a17 = wv3.m.f531601a.a(c16997xb0aa383a.C);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("musiceditsource", editSource.f531590d);
        jSONObject.put("songname", c16997xb0aa383a.f237256t);
        jSONObject.put("singername", kz5.n0.g0(c16997xb0aa383a.f237247h, null, null, null, 0, null, null, 63, null));
        java.lang.String str = null;
        jSONObject.put("musicid", a17 != null ? a17.f531598a : null);
        jSONObject.put("musicscene", musicScene.f531586d);
        if (a17 != null && (kVar = a17.f531599b) != null) {
            str = kVar.f531597a;
        }
        jSONObject.put("musicidtype", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, wv3.d editSource, wv3.c musicScene) {
        wv3.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editSource, "editSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicScene, "musicScene");
        if (c16997xb0aa383a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return;
        }
        wv3.l a17 = wv3.m.f531601a.a(c16997xb0aa383a.C);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("view_id", "musiceditfinish");
        lVarArr[1] = new jz5.l("musiceditsource", java.lang.Integer.valueOf(editSource.f531590d));
        lVarArr[2] = new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        lVarArr[3] = new jz5.l("singername", kz5.n0.g0(c16997xb0aa383a.f237247h, null, null, null, 0, null, null, 63, null));
        lVarArr[4] = new jz5.l("songname", c16997xb0aa383a.f237256t);
        lVarArr[5] = new jz5.l("musicscene", java.lang.Integer.valueOf(musicScene.f531586d));
        java.lang.Integer num = null;
        lVarArr[6] = new jz5.l("musicid", a17 != null ? a17.f531598a : null);
        if (a17 != null && (kVar = a17.f531599b) != null) {
            num = java.lang.Integer.valueOf(kVar.a());
        }
        lVarArr[7] = new jz5.l("snspostmusictype", num);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(lVarArr), 36244);
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, int i17) {
        wv3.k kVar;
        if (c16997xb0aa383a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return;
        }
        if (i17 != 5 && i17 != 6 && i17 != 15 && i17 != 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMusicReporter", "dataType:" + i17 + " return");
            return;
        }
        wv3.d dVar = (i17 == 5 || i17 == 16) ? wv3.d.f531588f : wv3.d.f531587e;
        wv3.c cVar = (i17 == 5 || i17 == 6) ? wv3.c.f531583e : wv3.c.f531584f;
        wv3.l a17 = wv3.m.f531601a.a(c16997xb0aa383a.C);
        int i18 = !z17 ? 1 : 2;
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("musiceditsource", java.lang.Integer.valueOf(dVar.f531590d));
        lVarArr[1] = new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        lVarArr[2] = new jz5.l("singername", kz5.n0.g0(c16997xb0aa383a.f237247h, null, null, null, 0, null, null, 63, null));
        lVarArr[3] = new jz5.l("songname", c16997xb0aa383a.f237256t);
        lVarArr[4] = new jz5.l("musicscene", java.lang.Integer.valueOf(cVar.f531586d));
        lVarArr[5] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54492xdb58c11, java.lang.Integer.valueOf(i18));
        java.lang.Integer num = null;
        lVarArr[6] = new jz5.l("musicid", a17 != null ? a17.f531598a : null);
        if (a17 != null && (kVar = a17.f531599b) != null) {
            num = java.lang.Integer.valueOf(kVar.a());
        }
        lVarArr[7] = new jz5.l("snspostmusictype", num);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("musiclisting", kz5.c1.k(lVarArr), 36244);
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17) {
        int i17;
        wv3.k kVar;
        if (c16997xb0aa383a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return;
        }
        wv3.d dVar = wv3.d.f531587e;
        if (f531582b.contains(c16997xb0aa383a.C)) {
            wv3.c cVar = wv3.c.f531583e;
            i17 = 2;
        } else {
            wv3.c cVar2 = wv3.c.f531583e;
            i17 = 1;
        }
        wv3.l a17 = wv3.m.f531601a.a(c16997xb0aa383a.C);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("view_id", "sns_publish_music");
        lVarArr[1] = new jz5.l("musiceditsource", 2);
        lVarArr[2] = new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        lVarArr[3] = new jz5.l("singername", kz5.n0.g0(c16997xb0aa383a.f237247h, null, null, null, 0, null, null, 63, null));
        lVarArr[4] = new jz5.l("songname", c16997xb0aa383a.f237256t);
        lVarArr[5] = new jz5.l("musicscene", java.lang.Integer.valueOf(i17));
        java.lang.Integer num = null;
        lVarArr[6] = new jz5.l("musicid", a17 != null ? a17.f531598a : null);
        if (a17 != null && (kVar = a17.f531599b) != null) {
            num = java.lang.Integer.valueOf(kVar.a());
        }
        lVarArr[7] = new jz5.l("snspostmusictype", num);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(!z17 ? "view_exp" : "view_clk", kz5.c1.k(lVarArr), 36244);
    }
}
