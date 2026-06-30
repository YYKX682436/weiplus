package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMoviePlayerWrapper */
/* loaded from: classes5.dex */
public class C4075x560b499f {
    private static final java.lang.String TAG = "MJLocalMoviePlayer";

    /* renamed from: moviePlayer */
    private com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 f15972xb197a231;

    /* renamed from: clipBundlePath */
    private java.lang.String f15970xcdd9337 = null;

    /* renamed from: surface */
    private android.view.Surface f15973x9189ecad = null;

    /* renamed from: looping */
    private boolean f15971x14db9ebe = false;

    public C4075x560b499f(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, android.os.Handler handler) {
        this.f15972xb197a231 = c3962x4bd0d642.m(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$prepareAsync$0 */
    public static /* synthetic */ void m33257x83f1337e(float f17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3 c4090xe7a30da3) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$prepareAsync$1 */
    public static /* synthetic */ void m33258x83f1337f(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        if (onComplete != null) {
            onComplete.mo9354x815f5438(c4093x6b88526b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$2 */
    public /* synthetic */ void m33259x7afbb638(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        this.f15970xcdd9337 = null;
        this.f15973x9189ecad = null;
        this.f15971x14db9ebe = false;
        this.f15972xb197a231.m33242x41012807();
        this.f15972xb197a231 = null;
    }

    /* renamed from: isLooping */
    public boolean m33260xf24ce634() {
        return this.f15971x14db9ebe;
    }

    /* renamed from: isPlaying */
    public boolean m33261xc00617a4() {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f15972xb197a231;
        java.util.Objects.requireNonNull(c4073xbc40c54, "movieSession is null");
        return c4073xbc40c54.m33238xb7d72d0e() == 5;
    }

    /* renamed from: pause */
    public void m33262x65825f6(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f15972xb197a231;
        java.util.Objects.requireNonNull(c4073xbc40c54, "movieSession is null");
        c4073xbc40c54.m33252x9600b9cc(onComplete);
    }

    /* renamed from: play */
    public void m33263x348b34(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        java.util.Objects.requireNonNull(this.f15972xb197a231, "movieSession is null");
        if (this.f15972xb197a231.m33238xb7d72d0e() == 5) {
            onComplete.mo9354x815f5438(null);
            return;
        }
        if (this.f15972xb197a231.m33238xb7d72d0e() != 4) {
            throw new java.lang.IllegalStateException("movieSession state is incorrect: " + this.f15972xb197a231.m33238xb7d72d0e() + ", should be Initial!");
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33239xebfaa445 = this.f15972xb197a231.m33239xebfaa445();
        if (!m33239xebfaa445.m33983x7b953cf2()) {
            throw new java.lang.IllegalStateException("movieSession playback duration is invalid!");
        }
        this.f15972xb197a231.m33250xda91516c(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33997xe9d83e0e(0.0d, m33239xebfaa445.m33988x124aa384()), com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, this.f15971x14db9ebe ? 999 : 1, true, onComplete);
    }

    /* renamed from: prepareAsync */
    public void m33264x857611b5(final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        if (this.f15972xb197a231 == null) {
            throw new java.lang.IllegalStateException("movieSession is null");
        }
        if (android.text.TextUtils.isEmpty(this.f15970xcdd9337)) {
            throw new java.lang.IllegalStateException("DataSource is empty");
        }
        this.f15972xb197a231.m33241x635bfa42(this.f15970xcdd9337, new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4077xb8ce9e3(), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete() { // from class: com.tencent.maas.instamovie.MJMoviePlayerWrapper$$c
            @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete
            /* renamed from: onComplete */
            public final void mo9354x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4075x560b499f.m33258x83f1337f(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete.this, c4093x6b88526b);
            }
        });
    }

    /* renamed from: release */
    public void m33265x41012807() {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f15972xb197a231;
        if (c4073xbc40c54 == null) {
            return;
        }
        c4073xbc40c54.m33253x9ccada24(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete() { // from class: com.tencent.maas.instamovie.MJMoviePlayerWrapper$$a
            @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete
            /* renamed from: onComplete */
            public final void mo9354x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4075x560b499f.this.m33259x7afbb638(c4093x6b88526b);
            }
        });
    }

    /* renamed from: seekTo */
    public void m33266xc9fc1b13(int i17) {
        m33267xc9fc1b13(i17, false);
    }

    /* renamed from: setDataSource */
    public void m33268x683d6267(java.lang.String str) {
        if (this.f15972xb197a231 == null) {
            throw new java.lang.IllegalStateException("movieSession is null");
        }
        this.f15970xcdd9337 = str;
    }

    /* renamed from: setLooping */
    public void m33269xc61a27fc(boolean z17) {
        if (this.f15972xb197a231 == null) {
            throw new java.lang.IllegalStateException("movieSession is null");
        }
        this.f15971x14db9ebe = z17;
    }

    /* renamed from: setSurface */
    public void m33270x42c875eb(android.view.Surface surface) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f15972xb197a231;
        java.util.Objects.requireNonNull(c4073xbc40c54, "movieSession is null");
        c4073xbc40c54.m33246x42c875eb(surface);
    }

    /* renamed from: seekTo */
    public void m33267xc9fc1b13(int i17, boolean z17) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = this.f15972xb197a231;
        java.util.Objects.requireNonNull(c4073xbc40c54, "movieSession is null");
        c4073xbc40c54.m33249xca528117(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(i17), 0L, true, z17);
    }
}
