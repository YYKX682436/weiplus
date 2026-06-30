package com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578;

/* renamed from: com.tencent.tmassistantsdk.logreport.DownloadReportManager */
/* loaded from: classes13.dex */
public class C26682x21d6a411 extends com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468 {
    protected static final java.lang.String TAG = "DownloadReportManager";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411 f56233x46143c22;

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411 m104977x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411 c26682x21d6a411;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411.class) {
            if (f56233x46143c22 == null) {
                f56233x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26682x21d6a411();
            }
            c26682x21d6a411 = f56233x46143c22;
        }
        return c26682x21d6a411;
    }

    /* renamed from: createNewChunkLogInfo */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad m104978x4a8e9809(byte b17) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "createNewChunkLogInfo");
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad c26742x5a9e4fad = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad();
        c26742x5a9e4fad.f56631x368f3a = b17;
        c26742x5a9e4fad.f56618x9637d8f2 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105494x7a99aabc();
        c26742x5a9e4fad.f56619x8c549688 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105495x662add52();
        c26742x5a9e4fad.f56617x5fd3d5c = (byte) (!android.text.TextUtils.isEmpty(android.net.Proxy.getDefaultHost()) ? 1 : 0);
        c26742x5a9e4fad.f56630x81158a4f = java.lang.System.currentTimeMillis();
        return c26742x5a9e4fad;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468
    /* renamed from: getLogTable */
    public com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb mo104972xf33d5060() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26770x1f2f7bb2.m105452x9cf0d20b();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468
    /* renamed from: getReportType */
    public byte mo104973x615f5684() {
        return (byte) 0;
    }
}
