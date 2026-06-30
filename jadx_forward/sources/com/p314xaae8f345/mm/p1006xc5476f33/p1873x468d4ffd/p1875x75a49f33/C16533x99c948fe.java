package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.FFmpegSightJNIThumbFetcher */
/* loaded from: classes10.dex */
public class C16533x99c948fe implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j {
    private static final java.lang.String TAG = "MicroMsg.FFmpegSightJNIThumbFetcher";

    /* renamed from: mBufId */
    private int f37674xbdd90281;

    /* renamed from: mDurationMs */
    private int f37675x25993aa7;

    /* renamed from: mReusedBitmap */
    private android.graphics.Bitmap f37676x1f9d8acc;

    /* renamed from: mScaledHeight */
    private int f37677xe3e98b2e;

    /* renamed from: mScaledWidth */
    private int f37678x949256df;

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.FFmpegSightJNIThumbFetcher$ReleaseRunnable */
    /* loaded from: classes10.dex */
    public static class ReleaseRunnable implements java.lang.Runnable {

        /* renamed from: mBufId */
        int f37679xbdd90281;

        /* renamed from: mReusedBitmap */
        android.graphics.Bitmap f37680x1f9d8acc;

        @Override // java.lang.Runnable
        public void run() {
            android.graphics.Bitmap bitmap = this.f37680x1f9d8acc;
            if (bitmap != null && !bitmap.isRecycled()) {
                com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f37680x1f9d8acc);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69170xdc0276eb(this.f37679xbdd90281);
        }

        private ReleaseRunnable(android.graphics.Bitmap bitmap, int i17) {
            this.f37680x1f9d8acc = bitmap;
            this.f37679xbdd90281 = i17;
        }
    }

    /* renamed from: calculateScaledLength */
    private android.graphics.Point m66865x4e3a8a66(int i17, int i18, int i19, int i27, android.graphics.Point point) {
        if (point == null) {
            throw new java.lang.IllegalArgumentException("FFmpegThumbFetcherImpl : Point to calculateScaledLength can not be null.");
        }
        if (i18 <= 0 && i17 <= 0) {
            point.x = i19;
            point.y = i27;
            return point;
        }
        if (i17 <= 0) {
            point.x = (int) ((i18 / i27) * i19);
            point.y = i18;
            return point;
        }
        if (i18 <= 0) {
            point.x = i17;
            point.y = (int) ((i17 / i19) * i27);
            return point;
        }
        float f17 = i18;
        float f18 = i17;
        float f19 = i27;
        float f27 = i19;
        if (f17 / f18 > f19 / f27) {
            point.x = (int) ((f27 * f17) / f19);
            point.y = i18;
        } else {
            point.x = i17;
            point.y = (int) ((f19 * f18) / f27);
        }
        return point;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j
    /* renamed from: getDurationMs */
    public int mo66866x37a7fa50() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getDurationMs() returned: " + this.f37675x25993aa7);
        return this.f37675x25993aa7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j
    /* renamed from: getFrameAtTime */
    public android.graphics.Bitmap mo66867xb2c2d837(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFrameAtTime() called with: timeMs = [%d], mBufId = [%d]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f37674xbdd90281));
        int i17 = this.f37675x25993aa7;
        if (j17 > i17) {
            j17 = i17;
        }
        if (j17 < 0) {
            j17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFrameAtTime() seekStream return %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69237xa4256d8a(((float) j17) / 1000.0f, 1, this.f37674xbdd90281)));
        android.graphics.Bitmap bitmap = this.f37676x1f9d8acc;
        if (bitmap == null || bitmap.isRecycled() || this.f37676x1f9d8acc.getWidth() != this.f37678x949256df || this.f37676x1f9d8acc.getHeight() != this.f37677xe3e98b2e) {
            android.graphics.Bitmap bitmap2 = this.f37676x1f9d8acc;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.n(this.f37676x1f9d8acc);
            }
            this.f37676x1f9d8acc = com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.m(new com.p314xaae8f345.mm.p872xbfc2bd01.t(this.f37678x949256df, this.f37677xe3e98b2e));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFrameAtTime() dr return %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69164xeeb6094f(this.f37674xbdd90281, this.f37676x1f9d8acc, this.f37678x949256df, this.f37677xe3e98b2e)));
        android.graphics.Bitmap bitmap3 = this.f37676x1f9d8acc;
        this.f37676x1f9d8acc = null;
        return bitmap3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j
    /* renamed from: getScaledHeight */
    public int mo66868xad470497() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getScaledHeight() returned: " + this.f37677xe3e98b2e);
        return this.f37677xe3e98b2e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j
    /* renamed from: getScaledWidth */
    public int mo66869xc45b8c56() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getScaledWidth() returned: " + this.f37678x949256df);
        return this.f37678x949256df;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j
    /* renamed from: init */
    public void mo66870x316510(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "init() called with: path = [" + str + "], segment_interval = [" + i17 + "], width = [" + i18 + "], height = [" + i19 + "]");
        int m69217xc14e3efd = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69217xc14e3efd(str, 1, 16, false);
        this.f37674xbdd90281 = m69217xc14e3efd;
        if (m69217xc14e3efd < 0) {
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.m1("open file error.");
        }
        int m69193x8d5c7601 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69193x8d5c7601(m69217xc14e3efd);
        int m69187x463504c = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69187x463504c(this.f37674xbdd90281);
        this.f37675x25993aa7 = (int) (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69186x36bbd779(this.f37674xbdd90281) * 1000.0d);
        android.graphics.Point m66865x4e3a8a66 = m66865x4e3a8a66(i18, i19, m69193x8d5c7601, m69187x463504c, new android.graphics.Point());
        int i27 = m66865x4e3a8a66.x;
        this.f37678x949256df = i27;
        this.f37677xe3e98b2e = m66865x4e3a8a66.y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FFmpegSightJNIThumbFetcher.init. scaled size is (%d, %d); raw size is (%d, %d)", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f37677xe3e98b2e), java.lang.Integer.valueOf(m69193x8d5c7601), java.lang.Integer.valueOf(m69187x463504c));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j
    /* renamed from: release */
    public void mo66871x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "release() called");
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16533x99c948fe.ReleaseRunnable(this.f37676x1f9d8acc, this.f37674xbdd90281), "release");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j
    /* renamed from: reuseBitmap */
    public void mo66872x71b25cc3(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "reuseBitmap() called with: bitmap = [" + bitmap + "]");
        if (bitmap == null) {
            return;
        }
        this.f37676x1f9d8acc = bitmap;
    }
}
