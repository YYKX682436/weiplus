package qi4;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final qi4.p f445309a;

    /* renamed from: b, reason: collision with root package name */
    public static final si4.f f445310b;

    /* renamed from: c, reason: collision with root package name */
    public static final si4.c f445311c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f445312d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f445313e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f445314f;

    static {
        qi4.p pVar = new qi4.p();
        f445309a = pVar;
        f445312d = jz5.h.b(qi4.l.f445305d);
        f445313e = jz5.h.b(qi4.o.f445308d);
        f445314f = jz5.h.b(qi4.n.f445307d);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27537xb5a24534.m117379x9cf0d20b().m117381xb88708c8(qi4.c.f445296a);
        ai4.b0 b0Var = ai4.b0.f86656a;
        b0Var.getClass();
        boolean z17 = ai4.b0.f86658c;
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusDBWrapper", "[initAffStatusDB] ready on " + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "[initAffStatusDB] initIlinkTimeCost=" + currentTimeMillis2);
            qj4.s.f445491a.r(4096L, (r20 & 2) != 0 ? null : null, (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : java.lang.Long.valueOf(currentTimeMillis2), (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            java.lang.String h17 = gm0.j1.u().h();
            java.lang.String k17 = gm0.j1.b().k();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117484x316510(h17, k17, i17, false, h17 + "status/media/");
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "clean timeStamp: " + currentTimeMillis3);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117476xe2b632d6(currentTimeMillis3, false, false, qi4.m.f445306a);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117477xbf8582cb();
            if (pVar.d()) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564 m117475x9cf0d20b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b();
                bw5.pm0 pm0Var = new bw5.pm0();
                bk4.n nVar = bk4.n.f103046a;
                pm0Var.f113281d = nVar.e("v3_");
                boolean[] zArr = pm0Var.f113285h;
                zArr[1] = true;
                pm0Var.f113282e = nVar.d("v3_");
                zArr[2] = true;
                pm0Var.f113284g = nVar.j("v3_");
                zArr[4] = true;
                pm0Var.f113283f = nVar.i("v3_");
                zArr[3] = true;
                m117475x9cf0d20b.m117485x319eeef1(pm0Var, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "[initAffStatusDB] finish, myUserName=" + k17 + ", clientVersion = " + i17 + ", rootPath = " + h17 + ", isDebug = false");
        }
        b0Var.getClass();
        if (ai4.b0.f86659d) {
            si4.f b17 = pVar.b(null);
            f445310b = b17;
            f445311c = pVar.a(b17);
        } else {
            si4.c a17 = pVar.a(null);
            f445311c = a17;
            b0Var.getClass();
            f445310b = z17 ? pVar.b(a17) : pVar.b(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatus.StatusDBWrapper", "init, thread=" + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
    }

    public final si4.c a(si4.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createAffInfoStorage: fallbackDB=");
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusDBWrapper", sb6.toString());
        return new si4.c(aVar);
    }

    public final si4.f b(si4.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNativeInfoStorage: fallbackDB=");
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusDBWrapper", sb6.toString());
        return new si4.f(c(), aVar);
    }

    public final d95.b0 c() {
        return (d95.b0) f445312d.mo141623x754a37bb();
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.v4.C20748x400e5ac1 c20748x400e5ac1 = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.v4.C20748x400e5ac1();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = false;
        boolean z18 = z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c;
        int h17 = z18 ? bm5.o1.f104252a.h(c20748x400e5ac1) : -1;
        java.lang.String str2 = "repairerConfig";
        if (z18 && h17 == 1) {
            z17 = true;
        } else if (!z18 || h17 != 2) {
            z17 = j62.e.g().l("clicfg_textstatus_android_use_flutter_publish_page_android", false, true, true);
            str2 = "expt";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "FlutterPublishPage enable=" + z17 + ", source=" + str2 + ", useRepairer=" + z18 + ", repairerConfig=" + h17);
        return z17;
    }

    public final si4.a d(boolean z17) {
        if (z17) {
            return f445311c;
        }
        return f445310b;
    }
}
