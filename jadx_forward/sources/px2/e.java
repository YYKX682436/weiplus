package px2;

/* loaded from: classes2.dex */
public final class e implements cw2.e4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd f440407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f440408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 f440409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f440410d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f440407a = abstractGestureDetectorOnGestureListenerC15410x706991fd;
        this.f440408b = c15188xd8bd4bd;
        this.f440409c = c15179x385a9ce5;
        this.f440410d = c15196x85976f5f;
    }

    @Override // cw2.e4
    public void a(int i17) {
        bb2.y2 bulletLifecycle = this.f440410d.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bb2.y2.r(bulletLifecycle, i17, false, 2, null);
        }
    }

    @Override // cw2.e4
    public void b(float f17) {
    }

    @Override // cw2.e4
    public void c(long j17) {
        int i17 = (int) (j17 / 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd = this.f440407a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd videoView = this.f440408b;
        abstractGestureDetectorOnGestureListenerC15410x706991fd.o(videoView, i17, false);
        abstractGestureDetectorOnGestureListenerC15410x706991fd.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
        int mo56694x36bbd779 = videoView.mo56694x36bbd779();
        abstractGestureDetectorOnGestureListenerC15410x706991fd.m62799x68422f5c().m62814x62f64c5b().setText(zl2.q4.f555466a.l(h3.a.b(mo56694x36bbd779 - i17, 0, mo56694x36bbd779)));
        if (videoView.mo58787xc00617a4()) {
            this.f440409c.mo61296x11f3be80(true);
            android.content.Context context = abstractGestureDetectorOnGestureListenerC15410x706991fd.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 4);
            }
        }
        long mo56695x7723e6ff = videoView.mo56695x7723e6ff();
        android.widget.SeekBar seekBar = abstractGestureDetectorOnGestureListenerC15410x706991fd.N;
        if (seekBar != null) {
            seekBar.setProgress((int) (seekBar.getMax() * java.lang.Math.min(1.0f, ((float) j17) / ((float) mo56695x7723e6ff))));
        }
    }

    @Override // cw2.e4
    public void d() {
    }

    @Override // cw2.e4
    public void e(boolean z17) {
        this.f440407a.setKeepScreenOn(z17);
        this.f440408b.mo56716x4121a19(z17);
    }

    @Override // cw2.e4
    /* renamed from: onVideoEnded */
    public void mo55679x653dba3e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd = this.f440407a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd.v(abstractGestureDetectorOnGestureListenerC15410x706991fd, false, null, 2, null);
        abstractGestureDetectorOnGestureListenerC15410x706991fd.m62799x68422f5c().setVisibility(8);
    }
}
