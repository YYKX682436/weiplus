package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class ye implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f211595e;

    public ye(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, long j17) {
        this.f211594d = activityC15059x3e98c949;
        this.f211595e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211594d;
        long longExtra = activityC15059x3e98c949.getIntent().getLongExtra("cover_time_ms", 0L);
        if (longExtra > 0) {
            if (activityC15059x3e98c949.F == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
            long max = (r3.getMax() * longExtra) / this.f211595e;
            android.widget.SeekBar seekBar = activityC15059x3e98c949.F;
            if (seekBar != null) {
                seekBar.setProgress((int) max);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
        }
    }
}
