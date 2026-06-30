package com.p314xaae8f345.p3121x37984a.p3130x91727fcf;

/* renamed from: com.tencent.wcdb.support.PrefixPrinter */
/* loaded from: classes12.dex */
public class C26994xdba03508 implements android.util.Printer {

    /* renamed from: mPrefix */
    private final java.lang.String f58443x1500d95f;

    /* renamed from: mPrinter */
    private final android.util.Printer f58444x8b567aed;

    private C26994xdba03508(android.util.Printer printer, java.lang.String str) {
        this.f58444x8b567aed = printer;
        this.f58443x1500d95f = str;
    }

    /* renamed from: create */
    public static android.util.Printer m108047xaf65a0fc(android.util.Printer printer, java.lang.String str) {
        return (str == null || str.equals("")) ? printer : new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26994xdba03508(printer, str);
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        this.f58444x8b567aed.println(this.f58443x1500d95f + str);
    }
}
