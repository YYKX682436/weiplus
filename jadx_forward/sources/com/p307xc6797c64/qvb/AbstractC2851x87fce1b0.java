package com.p307xc6797c64.qvb;

/* renamed from: com.qcloud.qvb.Logger */
/* loaded from: classes10.dex */
public abstract class AbstractC2851x87fce1b0 {

    /* renamed from: logger */
    private static com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 f9716xbe97f590;

    /* renamed from: debug */
    public static void m21193x5b09653(java.lang.String str) {
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 abstractC2851x87fce1b0 = f9716xbe97f590;
        if (abstractC2851x87fce1b0 != null) {
            abstractC2851x87fce1b0.d(str);
        }
    }

    /* renamed from: error */
    public static void m21194x5c4d208(java.lang.String str) {
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 abstractC2851x87fce1b0 = f9716xbe97f590;
        if (abstractC2851x87fce1b0 != null) {
            abstractC2851x87fce1b0.e(str);
        }
    }

    /* renamed from: info */
    public static void m21195x3164ae(java.lang.String str) {
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 abstractC2851x87fce1b0 = f9716xbe97f590;
        if (abstractC2851x87fce1b0 != null) {
            abstractC2851x87fce1b0.i(str);
        }
    }

    /* renamed from: setLogger */
    public static void m21196x16e44c92(com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 abstractC2851x87fce1b0) {
        f9716xbe97f590 = abstractC2851x87fce1b0;
    }

    /* renamed from: verbose */
    public static void m21197x14ed7982(java.lang.String str) {
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 abstractC2851x87fce1b0 = f9716xbe97f590;
        if (abstractC2851x87fce1b0 != null) {
            abstractC2851x87fce1b0.v(str);
        }
    }

    /* renamed from: warn */
    public static void m21198x379286(java.lang.String str) {
        com.p307xc6797c64.qvb.AbstractC2851x87fce1b0 abstractC2851x87fce1b0 = f9716xbe97f590;
        if (abstractC2851x87fce1b0 != null) {
            abstractC2851x87fce1b0.w(str);
        }
    }

    public abstract void d(java.lang.String str);

    public abstract void e(java.lang.String str);

    public abstract void i(java.lang.String str);

    public abstract void v(java.lang.String str);

    public abstract void w(java.lang.String str);
}
