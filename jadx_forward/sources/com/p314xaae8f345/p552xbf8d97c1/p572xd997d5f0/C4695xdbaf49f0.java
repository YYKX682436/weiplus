package com.p314xaae8f345.p552xbf8d97c1.p572xd997d5f0;

/* renamed from: com.tencent.matrix.memguard.MemGuard */
/* loaded from: classes12.dex */
public final class C4695xdbaf49f0 {

    /* renamed from: com.tencent.matrix.memguard.MemGuard$Options */
    /* loaded from: classes2.dex */
    public static final class Options {

        /* renamed from: ignoreOverlappedReading */
        public boolean f19990xb4cf6e52;

        /* renamed from: ignoredSOPatterns */
        public java.lang.String[] f19991xea037b1;

        /* renamed from: issueDumpFilePath */
        public java.lang.String f19992xecbe994e;

        /* renamed from: maxAllocationSize */
        public int f19993xe48f6785;

        /* renamed from: maxDetectableAllocationCount */
        public int f19994xf028ace;

        /* renamed from: maxSkippedAllocationCount */
        public int f19995x7141543;

        /* renamed from: minAllocationSize */
        public int f19996x6e8c2ff3;

        /* renamed from: percentageOfLeftSideGuard */
        public int f19997x8e393cb6;

        /* renamed from: perfectRightSideGuard */
        public boolean f19998xf02fe3f;

        /* renamed from: targetSOPatterns */
        public java.lang.String[] f19999x917b49b0;

        /* renamed from: toString */
        public java.lang.String m41145x9616526c() {
            return "Options{minAllocationSize=" + this.f19996x6e8c2ff3 + ", maxAllocationSize=" + this.f19993xe48f6785 + ", maxDetectableAllocationCount=" + this.f19994xf028ace + ", maxSkippedAllocationCount=" + this.f19995x7141543 + ", percentageOfLeftSideGuard=" + this.f19997x8e393cb6 + ", perfectRightSideGuard=" + this.f19998xf02fe3f + ", ignoreOverlappedReading=" + this.f19990xb4cf6e52 + ", issueDumpFilePath=" + this.f19992xecbe994e + ", targetSOPatterns=" + java.util.Arrays.toString(this.f19999x917b49b0) + ", ignoredSOPatterns=" + java.util.Arrays.toString(this.f19991xea037b1) + '}';
        }
    }

    static {
        new hi.a();
    }

    /* renamed from: c2jNotifyOnIssueDumped */
    private static void m41141x73f51189(java.lang.String str) {
        java.lang.Thread thread = new java.lang.Thread(new hi.b(str), "MemGuard.IssueCB");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        thread.start();
        try {
            thread.join(5000L);
        } catch (java.lang.InterruptedException unused) {
            oj.j.f("MemGuard", "Issue callback was interrupted.", new java.lang.Object[0]);
        }
        if (java.lang.System.currentTimeMillis() - currentTimeMillis > 5000) {
            oj.j.f("MemGuard", "Timeout when call issue callback.", new java.lang.Object[0]);
        }
    }

    /* renamed from: nativeGetIssueDumpFilePath */
    private static native java.lang.String m41142xc670b34f();

    /* renamed from: nativeInstall */
    private static native boolean m41143x3ba57584(com.p314xaae8f345.p552xbf8d97c1.p572xd997d5f0.C4695xdbaf49f0.Options options, boolean z17);

    /* renamed from: nativeInstallSigHandler */
    private static native boolean m41144x590191dd();
}
