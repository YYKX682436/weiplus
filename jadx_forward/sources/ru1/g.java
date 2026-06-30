package ru1;

/* loaded from: classes14.dex */
public final class g implements ru1.u {

    /* renamed from: a, reason: collision with root package name */
    public final pu1.a f481247a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f481248b;

    /* renamed from: c, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f481249c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.AudioRecord f481250d;

    public g(android.media.projection.MediaProjection mp6, android.content.Context context, pu1.a cfg, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cfg, "cfg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f481247a = cfg;
        this.f481248b = callback;
        if (android.os.Build.VERSION.SDK_INT < 29 || b3.l.m9698x3fed0563(context, "android.permission.RECORD_AUDIO") != 0) {
            return;
        }
        android.media.AudioPlaybackCaptureConfiguration build = new android.media.AudioPlaybackCaptureConfiguration.Builder(mp6).addMatchingUsage(0).addMatchingUsage(14).addMatchingUsage(1).build();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
        this.f481250d = new android.media.AudioRecord.Builder().setAudioPlaybackCaptureConfig(build).setAudioFormat(new android.media.AudioFormat.Builder().setSampleRate(cfg.f439949b).setEncoding(2).setChannelMask(cfg.f439950c == 2 ? 12 : 16).build()).build();
    }

    @Override // ru1.u
    public void a() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f481249c;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ScreenCastDirectlyEncoder", "startRecord cannot start twice");
        } else {
            this.f481249c = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(lu5.a.f402990f), null, null, new ru1.f(this, null), 3, null);
        }
    }

    @Override // ru1.u
    /* renamed from: stopRecord */
    public void mo163034xad07d6f3() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f481249c;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        android.media.AudioRecord audioRecord = this.f481250d;
        if (audioRecord != null) {
            audioRecord.release();
        }
    }
}
