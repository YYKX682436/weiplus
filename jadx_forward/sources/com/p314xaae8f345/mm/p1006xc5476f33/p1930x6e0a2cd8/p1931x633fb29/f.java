package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f233905a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Map f233906b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f f233907c;

    public f() {
        f233905a = new java.util.HashMap();
        f233906b = new java.util.HashMap();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.j a(int i17) {
        if (f233907c == null) {
            f233907c = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f();
        }
        f233907c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.j) ((java.util.HashMap) f233905a).get(java.lang.Integer.valueOf(i17));
        if (jVar == null) {
            switch (i17) {
                case 70001002:
                    jVar = new tn3.a();
                    break;
                case 70001003:
                    jVar = new tn3.c();
                    break;
                default:
                    jVar = null;
                    break;
            }
            if (jVar != null) {
                ((java.util.HashMap) f233905a).put(java.lang.Integer.valueOf(i17), jVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsFilterPool", "Invalid tipsId:%s", java.lang.Integer.valueOf(i17));
            }
        }
        return jVar;
    }
}
