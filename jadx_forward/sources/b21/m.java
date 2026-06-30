package b21;

/* loaded from: classes11.dex */
public abstract class m {
    public static b21.o a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
        c5720xee9b9abf.f136042g.f88303a = 8;
        c5720xee9b9abf.e();
        return c5720xee9b9abf.f136043h.f88373d;
    }

    public static b21.r b() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
        c5720xee9b9abf.f136042g.f88303a = -2;
        c5720xee9b9abf.e();
        return c5720xee9b9abf.f136043h.f88370a;
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
        c5720xee9b9abf.f136042g.f88303a = -3;
        c5720xee9b9abf.e();
        return c5720xee9b9abf.f136043h.f88371b;
    }

    public static boolean d() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
        c5720xee9b9abf.f136042g.f88303a = 9;
        c5720xee9b9abf.e();
        return c5720xee9b9abf.f136043h.f88371b;
    }

    public static final java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicHelper", "markMusicVipIdPrefix:%s", str);
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (str.startsWith("getlinkclisdkmid_") || str.startsWith("getlinkmid_"))) {
            return str;
        }
        return "getlinkclisdkmid_" + str;
    }

    public static final void f() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new b21.d());
    }

    public static final void g() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new b21.e());
    }

    public static boolean h(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
        am.gk gkVar = c5720xee9b9abf.f136042g;
        gkVar.f88303a = 7;
        gkVar.f88308f = i17;
        c5720xee9b9abf.e();
        return c5720xee9b9abf.f136043h.f88371b;
    }

    public static void i(b21.r rVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new b21.k(rVar));
    }

    public static final void j() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new b21.f());
    }

    public static void k(b21.r rVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
        am.gk gkVar = c5720xee9b9abf.f136042g;
        gkVar.f88303a = 16;
        gkVar.f88304b = rVar;
        c5720xee9b9abf.e();
    }
}
