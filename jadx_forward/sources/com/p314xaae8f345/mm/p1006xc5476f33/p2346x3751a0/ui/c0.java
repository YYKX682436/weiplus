package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes5.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.c0 f258475d = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, ""));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                try {
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", e17);
                }
                if (jSONObject.has(next)) {
                    i18 = jSONObject.getInt(next);
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a(next, i18));
                }
                i18 = 0;
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a(next, i18));
            }
        } catch (java.lang.Exception unused) {
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a("version", vq4.b0.i()));
            com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab n17 = vq4.b0.n();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("skinSmooth", n17.f270132g);
            jSONObject2.put("faceMorph", n17.f270134i);
            jSONObject2.put("skinBright", n17.f270135m);
            jSONObject2.put("eyeBright", n17.f270136n);
            jSONObject2.put("rosy", n17.f270137o);
            jSONObject2.put("eyePouch", n17.f270138p);
            jSONObject2.put("smileFolds", n17.f270139q);
            jSONObject2.put("sharpen", n17.f270140r);
            jSONObject2.put("teethBright", n17.f270141s);
            jSONObject2.put("smallHead", n17.f270142t);
            jSONObject2.put("cheekBone", n17.f270143u);
            jSONObject2.put("lowerJawbone", n17.f270144v);
            jSONObject2.put("wingOfNose", n17.f270145w);
            jSONObject2.put("chinShort", n17.f270146x);
            jSONObject2.put("chinLong", n17.f270147y);
            jSONObject2.put("hairLineHigh", n17.f270148z);
            jSONObject2.put("hairLineLow", n17.A);
            jSONObject2.put("bigEye", n17.B);
            jSONObject2.put("boySlim", n17.C);
            jSONObject2.put("girlSlim", n17.D);
            jSONObject2.put("mouthMorph", n17.E);
            jSONObject2.put("zhaiLian", n17.F);
            jSONObject2.put("contour", n17.G);
            jSONObject2.put("filterRate", n17.H);
            java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys2, "keys(...)");
            while (keys2.hasNext()) {
                java.lang.String next2 = keys2.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next2);
                try {
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", e18);
                }
                if (jSONObject2.has(next2)) {
                    i17 = jSONObject2.getInt(next2);
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a(next2, i17));
                }
                i17 = 0;
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a(next2, i17));
            }
        }
        return arrayList;
    }
}
