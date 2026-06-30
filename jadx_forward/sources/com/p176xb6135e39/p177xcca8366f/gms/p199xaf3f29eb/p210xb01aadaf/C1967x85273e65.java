package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf;

/* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusCodes */
/* loaded from: classes13.dex */
public final class C1967x85273e65 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449 {

    /* renamed from: INSUFFICIENT_STORAGE */
    public static final int f5969xfe5a8a1f = 46003;

    /* renamed from: MODULE_NOT_FOUND */
    public static final int f5970x12a09cc3 = 46002;

    /* renamed from: NOT_ALLOWED_MODULE */
    public static final int f5971x4533e40f = 46001;

    /* renamed from: SUCCESS */
    public static final int f5972xbb80cbe3 = 0;

    /* renamed from: UNKNOWN_MODULE */
    public static final int f5973xdf1fbc21 = 46000;

    private C1967x85273e65() {
    }

    /* renamed from: getStatusCodeString */
    public static java.lang.String m18437x30a6166(int i17) {
        switch (i17) {
            case f5973xdf1fbc21 /* 46000 */:
                return "UNKNOWN_MODULE";
            case f5971x4533e40f /* 46001 */:
                return "NOT_ALLOWED_MODULE";
            case f5970x12a09cc3 /* 46002 */:
                return "MODULE_NOT_FOUND";
            case f5969xfe5a8a1f /* 46003 */:
                return "INSUFFICIENT_STORAGE";
            default:
                return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449.m17735x30a6166(i17);
        }
    }
}
