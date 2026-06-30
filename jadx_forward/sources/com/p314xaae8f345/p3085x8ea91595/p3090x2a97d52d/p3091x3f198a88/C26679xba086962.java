package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask */
/* loaded from: classes13.dex */
public class C26679xba086962 {

    /* renamed from: mClientKey */
    public java.lang.String f56221x938e4a7;

    /* renamed from: mUrl */
    public java.lang.String f56226x32d9c2;

    /* renamed from: mState */
    public int f56224xbec81024 = 0;

    /* renamed from: mReceivedBytes */
    public long f56223xcf18f39d = 0;

    /* renamed from: mTotalBytes */
    public long f56225xb09057d4 = 0;

    /* renamed from: mProgressUpdateTimestamp */
    public long f56222xd0204533 = 0;

    public C26679xba086962(java.lang.String str, java.lang.String str2) {
        this.f56221x938e4a7 = str;
        this.f56226x32d9c2 = str2;
    }

    /* renamed from: checkIsNeedUpdateProgress */
    public boolean m104958xb69f43e(long j17, long j18, long j19) {
        if (j17 == j18) {
            this.f56223xcf18f39d = j17;
            this.f56225xb09057d4 = j18;
            this.f56222xd0204533 = j19;
            return true;
        }
        if (j19 - this.f56222xd0204533 >= 1000 && j17 != this.f56223xcf18f39d) {
            this.f56223xcf18f39d = j17;
            this.f56225xb09057d4 = j18;
            this.f56222xd0204533 = j19;
            return true;
        }
        if (j18 <= 0 || (((((float) j17) * 1.0f) - (((float) this.f56223xcf18f39d) * 1.0f)) / ((float) j18)) * 1.0f <= 0.009999999776482582d) {
            return false;
        }
        this.f56223xcf18f39d = j17;
        this.f56225xb09057d4 = j18;
        this.f56222xd0204533 = j19;
        return true;
    }
}
