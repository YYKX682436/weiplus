package dk2;

/* loaded from: classes14.dex */
public final class ug {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.ug f315751a = new dk2.ug();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f315752b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f315753c;

    static {
        java.lang.String wi6 = ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).wi(rh0.z.f477146g, "FaceMakeUpLevel");
        f315752b = !(wi6 == null || wi6.length() == 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1(wi6) == 1.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MakeupSuitDataManager", "#init cfgValue=" + wi6);
        f315753c = jz5.h.b(dk2.tg.f315668d);
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (lo0.h0 h0Var : ko0.l0.f391411a.b().f401596d.f401573f) {
            sb6.append(h0Var.f401530a + ':' + h0Var.f401539j);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f315753c).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(lo0.p0 r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ug.c(lo0.p0):void");
    }

    public final void d(lo0.b bVar) {
        if (bVar.f401497e != null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_MAKEUP_");
        sb6.append(gm0.j1.b().h());
        sb6.append('_');
        java.lang.String str = bVar.f401493a;
        sb6.append(str);
        int i17 = b17.getInt(sb6.toString(), -1);
        if (i17 < 0) {
            bVar.f401497e = java.lang.Integer.valueOf(bVar.f401495c);
            java.lang.String str2 = bVar.f401496d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            bVar.f401498f = str2;
            e(bVar);
            return;
        }
        bVar.f401497e = java.lang.Integer.valueOf(i17);
        java.lang.String string = b().getString("MMKV_LIVE_BEAUTY_BADGE_GROUP_MAKEUP_" + gm0.j1.b().h() + '_' + str, null);
        if (string == null) {
            string = "";
        }
        bVar.f401498f = string;
    }

    public final void e(lo0.b badge) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badge, "badge");
        java.lang.Integer num = badge.f401497e;
        if (num != null) {
            int intValue = num.intValue();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_MAKEUP_");
            sb6.append(gm0.j1.b().h());
            sb6.append('_');
            java.lang.String str = badge.f401493a;
            sb6.append(str);
            b17.putInt(sb6.toString(), intValue);
            b().putString("MMKV_LIVE_BEAUTY_BADGE_GROUP_MAKEUP_" + gm0.j1.b().h() + '_' + str, badge.f401498f);
        }
    }

    public final void f(lo0.k0 makeupItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(makeupItem, "makeupItem");
        if (makeupItem.f401569b) {
            for (lo0.h0 h0Var : makeupItem.f401573f) {
                dk2.ug ugVar = f315751a;
                double d17 = h0Var.f401539j;
                ugVar.b().putInt("MMKV_KEY_LIVE_MAKEUP_DETAIL_VALUE_" + gm0.j1.b().h() + '_' + makeupItem.f401568a + '_' + h0Var.f401530a, a06.d.a(d17 * 100.0d));
            }
        }
    }

    public final void g(java.lang.String str) {
        b().putString("MMKV_KEY_SUIT_ID_v2_" + gm0.j1.b().h(), str);
    }
}
