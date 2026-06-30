package com.p314xaae8f345.p542x3306d5;

/* renamed from: com.tencent.mars.MarsContext */
/* loaded from: classes12.dex */
public class C4435xa52e04fa {
    private static final java.lang.String TAG = "MicroMsg.MarsContext";
    public static com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f ctx;

    /* renamed from: getContext */
    public static com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f m37501x76847179() {
        if (ctx == null) {
            synchronized (com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.class) {
                ctx = new com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f("default");
            }
        }
        return ctx;
    }

    /* renamed from: getManager */
    public static <T extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c> T m37502x6f964b77(java.lang.Class<T> cls) {
        T t17 = (T) m37501x76847179().m37619x6f964b77(cls);
        if (t17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getManager %s failed", cls.getName());
            bm5.n.a(t17);
        }
        return t17;
    }

    /* renamed from: release */
    public static void m37503x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mars2 release.");
        com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f = ctx;
        if (c4443x9befcd8f != null) {
            c4443x9befcd8f.m37622xac79a11b();
        }
        ctx = null;
    }
}
