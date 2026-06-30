package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPVideoCapture */
/* loaded from: classes16.dex */
public class C26202xc7addee7 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02 {
    private static final java.lang.String TAG = "TPThumbPlayer[TPVideoCapture.java]";

    /* renamed from: mTpImageGenerator */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26395xca503554 f51072x5e1103e1;

    /* renamed from: mWidth */
    private int f51073xbefb7959 = 0;

    /* renamed from: mHeight */
    private int f51068x6a4b7f4 = 0;

    /* renamed from: mRequestedTimeMsToleranceBefore */
    private long f51071xa61e118 = 0;

    /* renamed from: mRequestedTimeMsToleranceAfter */
    private long f51070x484d23 = 0;

    /* renamed from: mOpaque */
    private long f51069x132e2aee = 0;

    /* renamed from: mCallBackMap */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26202xc7addee7.TPVideoCaptureCallBack> f51067x7cb6140a = new java.util.HashMap();

    /* renamed from: com.tencent.thumbplayer.api.TPVideoCapture$TPVideoCaptureCallBack */
    /* loaded from: classes16.dex */
    public interface TPVideoCaptureCallBack {
        /* renamed from: onCaptureError */
        void m101196xa18c41e1(int i17);

        /* renamed from: onCaptureSuccess */
        void m101197x58601d9c(android.graphics.Bitmap[] bitmapArr);
    }

    public C26202xc7addee7(java.lang.String str) {
        this.f51072x5e1103e1 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26395xca503554(str, this);
        try {
            this.f51072x5e1103e1.m102580x316510();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "init: " + android.util.Log.getStackTraceString(e17));
        }
    }

    /* renamed from: generateOpaqueKey */
    private java.lang.String m101188x2b420089(long j17, long j18) {
        return "opaque_" + j17 + "time_" + j18;
    }

    /* renamed from: getParameters */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa m101189x99879e0() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa();
        c26396x622fcbfa.f53128xb45ff7f7 = 37;
        c26396x622fcbfa.f53132x6be2dc6 = this.f51073xbefb7959;
        c26396x622fcbfa.f53129xb7389127 = this.f51068x6a4b7f4;
        c26396x622fcbfa.f53130xe0bfca90 = this.f51070x484d23;
        c26396x622fcbfa.f53131x38da114b = this.f51071xa61e118;
        return c26396x622fcbfa;
    }

    /* renamed from: generateImageAsyncAtTime */
    public void m101190xbf439a76(long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26202xc7addee7.TPVideoCaptureCallBack tPVideoCaptureCallBack) {
        long j18 = this.f51069x132e2aee + 1;
        this.f51069x132e2aee = j18;
        this.f51067x7cb6140a.put(m101188x2b420089(j18, j17), tPVideoCaptureCallBack);
        try {
            this.f51072x5e1103e1.m102578xbf439a76(j17, this.f51069x132e2aee, m101189x99879e0());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "generateImageAsyncAtTime: " + android.util.Log.getStackTraceString(e17));
        }
    }

    /* renamed from: generateImagesAsyncForTimes */
    public void m101191x8387474c(long[] jArr, com.p314xaae8f345.p3006xb8ff1437.api.C26202xc7addee7.TPVideoCaptureCallBack tPVideoCaptureCallBack) {
        this.f51069x132e2aee++;
        for (long j17 : jArr) {
            this.f51067x7cb6140a.put(m101188x2b420089(this.f51069x132e2aee, j17), tPVideoCaptureCallBack);
        }
        try {
            this.f51072x5e1103e1.m102579x8387474c(jArr, this.f51069x132e2aee, m101189x99879e0());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "generateImagesAsyncForTimes: " + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02
    /* renamed from: onImageGenerationCompleted */
    public void mo101192x387b1fb7(int i17, long j17, long j18, long j19, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26334x22c4354e c26334x22c4354e) {
        com.p314xaae8f345.p3006xb8ff1437.api.C26202xc7addee7.TPVideoCaptureCallBack tPVideoCaptureCallBack = this.f51067x7cb6140a.get(m101188x2b420089(j19, j17));
        if (tPVideoCaptureCallBack != null) {
            if (i17 != 0 || c26334x22c4354e == null) {
                tPVideoCaptureCallBack.m101196xa18c41e1(i17);
            } else {
                tPVideoCaptureCallBack.m101197x58601d9c(com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26254xdcaf79a7.m101544x9557cff(c26334x22c4354e));
            }
        }
        this.f51067x7cb6140a.remove(m101188x2b420089(j19, j17));
    }

    /* renamed from: release */
    public void m101193x41012807() {
        try {
            this.f51072x5e1103e1.m102577x228500e7();
            this.f51072x5e1103e1.m102581xcdd7f349();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "release: " + android.util.Log.getStackTraceString(e17));
        }
        this.f51067x7cb6140a.clear();
        this.f51072x5e1103e1 = null;
    }

    /* renamed from: setSize */
    public void m101194x76500f83(int i17, int i18) {
        if (i17 < 0 || i18 < 0) {
            throw new java.lang.IllegalArgumentException("Size is illegal");
        }
        this.f51073xbefb7959 = i17;
        this.f51068x6a4b7f4 = i18;
    }

    /* renamed from: setTimeMsTolerance */
    public void m101195x48496b38(long j17, long j18) {
        if (j17 > j18) {
            throw new java.lang.IllegalArgumentException("Tolerance is illegal");
        }
        this.f51071xa61e118 = j17;
        this.f51070x484d23 = j18;
    }
}
