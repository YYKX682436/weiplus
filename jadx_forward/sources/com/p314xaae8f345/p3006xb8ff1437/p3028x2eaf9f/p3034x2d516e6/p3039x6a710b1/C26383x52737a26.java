package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem */
/* loaded from: classes15.dex */
public class C26383x52737a26 {

    /* renamed from: mRequestType */
    private int f53058xee9a27bc;

    /* renamed from: mUrl */
    private java.lang.String f53059x32d9c2;

    /* renamed from: mRequestTimes */
    private int f53057xe4a37f04 = 0;

    /* renamed from: mRequestFailedTime */
    private long f53056x9eba3ac = -1;

    public C26383x52737a26(java.lang.String str, int i17) {
        this.f53059x32d9c2 = str;
        this.f53058xee9a27bc = i17;
    }

    /* renamed from: getRequestFailedTime */
    public long m102500xc03ea3e3() {
        return this.f53056x9eba3ac;
    }

    /* renamed from: getRequestTimes */
    public int m102501xae00f86d() {
        return this.f53057xe4a37f04;
    }

    /* renamed from: getRequestType */
    public int m102502x1e635d33() {
        return this.f53058xee9a27bc;
    }

    /* renamed from: getUrl */
    public java.lang.String m102503xb5887639() {
        return this.f53059x32d9c2;
    }

    /* renamed from: updateFailedTime */
    public void m102504xd52c6253() {
        this.f53056x9eba3ac = java.lang.System.currentTimeMillis();
        this.f53057xe4a37f04++;
    }
}
