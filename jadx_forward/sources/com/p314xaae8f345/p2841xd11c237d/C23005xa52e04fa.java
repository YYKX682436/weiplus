package com.p314xaae8f345.p2841xd11c237d;

/* renamed from: com.tencent.paymars.MarsContext */
/* loaded from: classes12.dex */
public class C23005xa52e04fa {
    private static final java.lang.String TAG = "MicroMsg.PayMarsContext";
    public static com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f ctx;

    /* renamed from: getContext */
    public static com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f m84212x76847179() {
        if (ctx == null) {
            synchronized (com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.class) {
                ctx = new com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f("default");
            }
        }
        return ctx;
    }

    /* renamed from: getManager */
    public static <T extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c> T m84213x6f964b77(java.lang.Class<T> cls) {
        T t17 = (T) m84212x76847179().m84276x6f964b77(cls);
        if (t17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getManager %s failed", cls.getName());
            bm5.n.a(t17);
        }
        return t17;
    }

    /* renamed from: release */
    public static void m84214x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mars2 release.");
        com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f = ctx;
        if (c23011x9befcd8f != null) {
            c23011x9befcd8f.m84279xac79a11b();
        }
        ctx = null;
    }
}
