package com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7;

/* renamed from: com.tencent.thumbplayer.caputure.TPThumbCapture */
/* loaded from: classes16.dex */
public class C26257xb7fa952c implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02 {
    private static final java.lang.String TAG = "TPThumbPlayer[TPThumbCapture.java]";

    /* renamed from: mCallBackMap */
    private java.util.Map<java.lang.Long, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf> f51388x7cb6140a;

    /* renamed from: mImageGenerator */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26395xca503554 f51389xf44e7185;

    /* renamed from: mOpaque */
    private long f51390x132e2aee;

    public C26257xb7fa952c(java.lang.String str) {
        this.f51390x132e2aee = 0L;
        this.f51389xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26395xca503554(str, this);
        this.f51388x7cb6140a = new java.util.HashMap();
        try {
            this.f51389xf44e7185.m102580x316510();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "init: " + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301
    /* renamed from: generateImageAsyncAtTime */
    public void mo100553xbf439a76(long j17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf) {
        if (c26396x622fcbfa == null) {
            c26396x622fcbfa = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa();
            c26396x622fcbfa.f53128xb45ff7f7 = 37;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa2 = c26396x622fcbfa;
        long j18 = this.f51390x132e2aee + 1;
        this.f51390x132e2aee = j18;
        this.f51388x7cb6140a.put(java.lang.Long.valueOf(j18), interfaceC26170x325bffaf);
        try {
            this.f51389xf44e7185.m102578xbf439a76(j17, this.f51390x132e2aee, c26396x622fcbfa2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "generateImageAsyncAtTime: " + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.InterfaceC26394xf71c1b02
    /* renamed from: onImageGenerationCompleted */
    public void mo101192x387b1fb7(int i17, long j17, long j18, long j19, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26334x22c4354e c26334x22c4354e) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf = this.f51388x7cb6140a.get(java.lang.Long.valueOf(j19));
        if (interfaceC26170x325bffaf != null) {
            if (i17 != 0 || c26334x22c4354e == null) {
                interfaceC26170x325bffaf.m101026x3c4b75b1(i17);
            } else {
                android.graphics.Bitmap m101543xd702c1f4 = com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26254xdcaf79a7.m101543xd702c1f4(c26334x22c4354e);
                if (m101543xd702c1f4 != null) {
                    interfaceC26170x325bffaf.m101027x1e9c8d0f(m101543xd702c1f4);
                } else {
                    interfaceC26170x325bffaf.m101026x3c4b75b1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d);
                }
            }
        }
        this.f51388x7cb6140a.remove(java.lang.Long.valueOf(j19));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301
    /* renamed from: release */
    public void mo100554x41012807() {
        try {
            this.f51389xf44e7185.m102577x228500e7();
            this.f51389xf44e7185.m102581xcdd7f349();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "release: " + android.util.Log.getStackTraceString(e17));
        }
        this.f51388x7cb6140a.clear();
        this.f51389xf44e7185 = null;
    }

    public C26257xb7fa952c(int i17) {
        this(i17, 0L, 0L);
    }

    public C26257xb7fa952c(int i17, long j17, long j18) {
        this.f51390x132e2aee = 0L;
        this.f51389xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26395xca503554(i17, j17, j18, this);
        this.f51388x7cb6140a = new java.util.HashMap();
        try {
            this.f51389xf44e7185.m102580x316510();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "init: " + android.util.Log.getStackTraceString(e17));
        }
    }
}
