package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f152116a = false;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f152117b = "";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f152118c = new java.util.HashSet();

    public static final void a(java.lang.String str) {
        java.util.Collection collection;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AesGcmSessionKeySwitch", "setUseAesGcmSessionKeyCgiList [%s]", str);
        f152117b = str;
        java.util.HashSet hashSet = f152118c;
        hashSet.clear();
        int length = str.length() - 1;
        int i17 = 0;
        boolean z17 = false;
        while (i17 <= length) {
            boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str.charAt(!z17 ? i17 : length), 32) <= 0;
            if (z17) {
                if (!z18) {
                    break;
                } else {
                    length--;
                }
            } else if (z18) {
                i17++;
            } else {
                z17 = true;
            }
        }
        java.util.List g17 = new r26.t(",").g(str.subSequence(i17, length + 1).toString(), 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f395529d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        if (strArr.length > 0) {
            for (java.lang.String str2 : strArr) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0);
                if (P > 0) {
                    hashSet.add(java.lang.Integer.valueOf(P));
                }
            }
        }
    }

    public static final void b() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            f152116a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("UseAesGcmSessionKeySwitch", 0) == 1;
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("UseAesGcmSessionKeyCgiList", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            a(string);
        } else {
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AesGcmSessionKeySwitch", "account no ready.");
                return;
            }
            if (gm0.j1.s(c25.e.class) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AesGcmSessionKeySwitch", "config service is null.");
                return;
            }
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("UseAesGcmSessionKeySwitch", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AesGcmSessionKeySwitch", "MXM_DynaCfg_AV_Item_Key_UseAesGcmSessionKeySwitch %d", java.lang.Integer.valueOf(b17));
            if (b17 != com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("UseAesGcmSessionKeySwitch", 0)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("UseAesGcmSessionKeySwitch", b17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getClass();
            }
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseAesGcmSessionKeyCgiList");
            if (d17 == null) {
                d17 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AesGcmSessionKeySwitch", "MXM_DynaCfg_AV_Item_Key_UseAesGcmSessionKeyCgiList %s", d17);
            a(d17);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("UseAesGcmSessionKeyCgiList", ""))) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("UseAesGcmSessionKeyCgiList", d17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getClass();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AesGcmSessionKeySwitch", "updateConfig UseAesGcmSessionKeySwitch:" + f152116a + " UseAesGcmSessionKeyCgiList:" + f152117b + " IsMainProcess:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n());
    }
}
