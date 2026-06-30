package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

@j95.b
/* loaded from: classes.dex */
public class h2 extends i95.w implements su4.a1 {
    public static void Ai(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2 h2Var, int i17) {
        h2Var.getClass();
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20687x5a4ed550()) == 1 && i17 == 3) {
            return;
        }
        su4.r2.p(1000L, false, true, 0);
    }

    public static java.lang.String wi(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2 h2Var, int i17, java.lang.String str) {
        h2Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(i17));
        hashMap.put("type", java.lang.String.valueOf(64));
        hashMap.put("lang", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        hashMap.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        hashMap.put("version", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3)));
        hashMap.put("isHomePage", "0");
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            hashMap.put("isDarkMode", "1");
        }
        if (!android.text.TextUtils.isEmpty("")) {
            hashMap.put("extParams", "");
        }
        hashMap.put("isSug", "1");
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(3).l());
        stringBuffer.append("/app.html?");
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            stringBuffer.append("&");
            stringBuffer.append((java.lang.String) entry.getKey());
            stringBuffer.append("=");
            stringBuffer.append((java.lang.String) entry.getValue());
        }
        if (!hashMap.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            stringBuffer.append("&sessionId=");
            tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
            ((sg0.y3) o1Var).getClass();
            stringBuffer.append(su4.r2.f(D1));
        }
        return stringBuffer.toString();
    }

    public void Bi(android.content.Context context, su4.j2 j2Var) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(context, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.f2(this, j2Var, context));
    }

    public void Di(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, int i18, boolean z18, java.lang.String str3) {
        Ui(context, i17, str, str2, z17, map, false, Integer.MAX_VALUE, "", i18, z18, false, 0, false, str3);
    }

    public void Ni(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, java.lang.String str3, int i18, boolean z18) {
        Ui(context, i17, str, str2, z17, map, false, i18, str3, 0, z18, false, 0, false, "");
    }

    public void Ri(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, boolean z18, int i18, java.lang.String str3, int i19) {
        Ui(context, i17, str, str2, z17, map, z18, i18, str3, i19, false, false, 0, false, "");
    }

    public void Ui(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, boolean z18, int i18, java.lang.String str3, int i19, boolean z19, boolean z27, int i27, boolean z28, java.lang.String str4) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(context, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.g2(this, context, map, str, i17, z17, str4, str2, i19, str3, z19, z27, i27, z28, z18, i18));
    }

    public void Vi(su4.j2 j2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.e2(this, j2Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            e2Var.run();
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(j2Var.f494471a, e2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zi(android.content.Context r33, org.json.JSONObject r34) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2.Zi(android.content.Context, org.json.JSONObject):void");
    }
}
