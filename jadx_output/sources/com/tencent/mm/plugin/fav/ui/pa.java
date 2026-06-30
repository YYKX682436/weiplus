package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class pa extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f101341a;

    /* renamed from: b, reason: collision with root package name */
    public float f101342b;

    /* renamed from: c, reason: collision with root package name */
    public float f101343c;

    /* renamed from: d, reason: collision with root package name */
    public int f101344d;

    /* renamed from: e, reason: collision with root package name */
    public int f101345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavVoiceBaseView f101346f;

    public pa(com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView, com.tencent.mm.plugin.fav.ui.na naVar) {
        this.f101346f = favVoiceBaseView;
    }

    public void b() {
        d();
        this.f101341a = false;
        com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView = this.f101346f;
        favVoiceBaseView.f100430f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
        favVoiceBaseView.f100430f.setContentDescription(favVoiceBaseView.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
        sendEmptyMessage(4096);
    }

    public void c() {
        float f17 = 1.0f - (this.f101343c / this.f101342b);
        com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView = this.f101346f;
        int width = favVoiceBaseView.f100428d.getWidth();
        this.f101344d = ((int) (f17 * (width - r3))) + this.f101345e;
        favVoiceBaseView.f100431g.setText(com.tencent.mm.plugin.fav.ui.w6.b(favVoiceBaseView.getContext(), java.lang.Math.min((int) java.lang.Math.ceil(this.f101343c), (int) this.f101342b)));
        favVoiceBaseView.f100429e.setWidth(this.f101344d);
    }

    public void d() {
        this.f101341a = false;
        removeMessages(4096);
        int i17 = com.tencent.mm.plugin.fav.ui.FavVoiceBaseView.f100427n;
        com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView = this.f101346f;
        favVoiceBaseView.getClass();
        this.f101341a = false;
        com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
        float f17 = 0 / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        if (f17 > 60.0f) {
            f17 = 60.0f;
        }
        float round = java.lang.Math.round(f17);
        this.f101342b = round;
        this.f101343c = round;
        this.f101345e = i65.a.b(favVoiceBaseView.getContext(), 3);
        favVoiceBaseView.f100431g.setText(com.tencent.mm.plugin.fav.ui.w6.b(favVoiceBaseView.getContext(), (int) this.f101342b));
        favVoiceBaseView.f100430f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
        favVoiceBaseView.f100430f.setContentDescription(favVoiceBaseView.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf));
        favVoiceBaseView.f100429e.setWidth(this.f101345e);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f101343c = java.lang.Math.max(0.0f, this.f101343c - 0.256f);
        c();
        if (this.f101343c <= 0.1f) {
            return;
        }
        sendEmptyMessageDelayed(4096, 256L);
    }
}
