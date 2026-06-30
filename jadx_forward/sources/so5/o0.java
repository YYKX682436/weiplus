package so5;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final so5.o0 f492428a = new so5.o0();

    public static final so5.a b(byte[] bArr) {
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            i17 |= (bArr[i18 + 8] & 255) << (i18 * 8);
        }
        return new so5.a(bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7], i17);
    }

    public final java.util.List a() {
        int i17;
        bm5.o1 o1Var = bm5.o1.f104252a;
        int h17 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20802xa44fabc9());
        if (h17 == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int h18 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20805xecbd2365());
        int h19 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20811xf99bb927());
        int h27 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20810xce3ed46b());
        int h28 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20812x1927df1());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (h18 == 1) {
            arrayList2.add(8);
        }
        if (h19 == 1) {
            arrayList2.add(16);
        }
        if (h27 == 1) {
            arrayList2.add(2);
        }
        if (h28 == 1) {
            arrayList2.add(32);
        }
        int h29 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20804xb1f1218e());
        int h37 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20809xaae97fe6());
        int h38 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20808xaae91309());
        int h39 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20807xaae8394f());
        int h47 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20806xaae7ae6a());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (h29 == 1) {
            arrayList3.add(12);
        }
        if (h37 == 1) {
            arrayList3.add(10);
        }
        if (h38 == 1) {
            arrayList3.add(8);
        }
        if (h39 == 1) {
            arrayList3.add(6);
        }
        if (h47 == 1) {
            arrayList3.add(4);
        }
        int h48 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20799xaffcbf25());
        int h49 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20800x3f1663c6());
        int h57 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20801xef96b809());
        int h58 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20803x558211ff());
        int h59 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2577x3751a0.p2579xb2963e16.C20798xf8472fa9());
        if (h17 != 3) {
            byte[] bArr = new byte[12];
            bArr[4] = (byte) h48;
            bArr[5] = (byte) h49;
            bArr[6] = (byte) h57;
            bArr[7] = (byte) h58;
            bArr[8] = (byte) (h59 & 65535);
            bArr[9] = (byte) ((h59 >>> 8) & 65535);
            bArr[10] = (byte) ((h59 >>> 16) & 65535);
            bArr[11] = (byte) ((h59 >>> 24) & 65535);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                bArr[2] = (byte) ((java.lang.Integer) it.next()).intValue();
                java.util.Iterator it6 = arrayList3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = 1;
                        break;
                    }
                    bArr[3] = (byte) ((java.lang.Integer) it6.next()).intValue();
                    arrayList.add(b(bArr));
                    i17 = 1;
                    if (h17 == 1) {
                        break;
                    }
                }
                if (h17 == i17) {
                    break;
                }
            }
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_QOS_CUSTOM_STRING, ""));
                int length = jSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    byte[] decode = android.util.Base64.decode(jSONArray.getString(i18), 0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
                    arrayList.add(b(decode));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIPHelper", "use custom qos config fail:" + e17.getLocalizedMessage());
            }
        }
        return arrayList;
    }
}
