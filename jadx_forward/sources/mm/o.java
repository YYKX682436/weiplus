package mm;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f410069a = jz5.h.b(mm.n.f410068d);

    public static final boolean a() {
        if (b() || mm.l.a()) {
            return true;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }

    public static final boolean b() {
        return z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c;
    }

    public static final boolean c() {
        return d(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, 50000);
    }

    public static final boolean d(java.lang.String diceKey, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(diceKey, "diceKey");
        jz5.g gVar = f410069a;
        if (((java.util.Map) ((jz5.n) gVar).mo141623x754a37bb()).containsKey(diceKey)) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.TRUE, ((java.util.Map) ((jz5.n) gVar).mo141623x754a37bb()).get(diceKey));
        }
        j62.e g17 = j62.e.g();
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = diceKey.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        boolean z17 = false;
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(g17.a("clicfg_battery_dice_".concat(lowerCase), java.lang.String.valueOf(i17), false, true), 0);
        if (D1 < 10) {
            D1 = 10;
        }
        double random = java.lang.Math.random();
        if (D1 >= 1 && random < 1 / D1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.dice", "dice hit, go kv stat!");
            z17 = true;
        }
        ((java.util.Map) ((jz5.n) gVar).mo141623x754a37bb()).put(diceKey, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static final boolean e() {
        return mm.l.c() && mm.m.f410060h.h();
    }

    public static final boolean f() {
        if (!(a() || e() || mm.m.f410058f.h())) {
            return false;
        }
        if (b() || !e()) {
            return a() || mm.m.f410059g.h();
        }
        return false;
    }

    public static final boolean g() {
        return a() || mm.m.f410062m.h();
    }

    public static boolean h(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if (a()) {
            return true;
        }
        return (mm.l.c() && !z17) || mm.m.f410063n.h();
    }

    public static final boolean i(boolean z17) {
        return a() || (mm.l.c() && !z17) || mm.m.f410064o.h();
    }

    public static /* synthetic */ boolean j(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return i(z17);
    }

    public static final boolean k(int i17) {
        long j17 = i17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() % j17;
        return currentTimeMillis + (j17 & (((currentTimeMillis ^ j17) & ((-currentTimeMillis) | currentTimeMillis)) >> 63)) == 0;
    }
}
