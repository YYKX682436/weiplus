package kp3;

/* loaded from: classes12.dex */
public final class e implements android.media.MediaPlayer.OnInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f392504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kp3.f f392505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f392506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.VideoView f392507d;

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, kp3.f fVar, long j17, android.widget.VideoView videoView) {
        this.f392504a = c0Var;
        this.f392505b = fVar;
        this.f392506c = j17;
        this.f392507d = videoView;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        if (i17 == 3) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f392504a;
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f392506c;
                kp3.f fVar = this.f392505b;
                fVar.f392518v = currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmGuideDialog", "[setVideoAndPlay] MEDIA_INFO_VIDEO_RENDERING_START, dialogVideoLoadCost:" + fVar.f392518v);
                this.f392507d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.widget.ImageView imageView = fVar.f392514r;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
        }
        return true;
    }
}
