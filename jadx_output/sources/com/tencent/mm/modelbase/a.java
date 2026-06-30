package com.tencent.mm.modelbase;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f70583a = false;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f70584b = "";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f70585c = new java.util.HashSet();

    public static final void a(java.lang.String str) {
        java.util.Collection collection;
        com.tencent.mars.xlog.Log.i("MicroMsg.AesGcmSessionKeySwitch", "setUseAesGcmSessionKeyCgiList [%s]", str);
        f70584b = str;
        java.util.HashSet hashSet = f70585c;
        hashSet.clear();
        int length = str.length() - 1;
        int i17 = 0;
        boolean z17 = false;
        while (i17 <= length) {
            boolean z18 = kotlin.jvm.internal.o.i(str.charAt(!z17 ? i17 : length), 32) <= 0;
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
        collection = kz5.p0.f313996d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        if (strArr.length > 0) {
            for (java.lang.String str2 : strArr) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(str2, 0);
                if (P > 0) {
                    hashSet.add(java.lang.Integer.valueOf(P));
                }
            }
        }
    }

    public static final void b() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            f70583a = com.tencent.mm.sdk.platformtools.o4.L().getInt("UseAesGcmSessionKeySwitch", 0) == 1;
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("UseAesGcmSessionKeyCgiList", "");
            kotlin.jvm.internal.o.d(string);
            a(string);
        } else {
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AesGcmSessionKeySwitch", "account no ready.");
                return;
            }
            if (gm0.j1.s(c25.e.class) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AesGcmSessionKeySwitch", "config service is null.");
                return;
            }
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("UseAesGcmSessionKeySwitch", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AesGcmSessionKeySwitch", "MXM_DynaCfg_AV_Item_Key_UseAesGcmSessionKeySwitch %d", java.lang.Integer.valueOf(b17));
            if (b17 != com.tencent.mm.sdk.platformtools.o4.L().getInt("UseAesGcmSessionKeySwitch", 0)) {
                com.tencent.mm.sdk.platformtools.o4.L().putInt("UseAesGcmSessionKeySwitch", b17);
                com.tencent.mm.sdk.platformtools.o4.L().getClass();
            }
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseAesGcmSessionKeyCgiList");
            if (d17 == null) {
                d17 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AesGcmSessionKeySwitch", "MXM_DynaCfg_AV_Item_Key_UseAesGcmSessionKeyCgiList %s", d17);
            a(d17);
            if (!kotlin.jvm.internal.o.b(d17, com.tencent.mm.sdk.platformtools.o4.L().getString("UseAesGcmSessionKeyCgiList", ""))) {
                com.tencent.mm.sdk.platformtools.o4.L().putString("UseAesGcmSessionKeyCgiList", d17);
                com.tencent.mm.sdk.platformtools.o4.L().getClass();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AesGcmSessionKeySwitch", "updateConfig UseAesGcmSessionKeySwitch:" + f70583a + " UseAesGcmSessionKeyCgiList:" + f70584b + " IsMainProcess:" + com.tencent.mm.sdk.platformtools.x2.n());
    }
}
