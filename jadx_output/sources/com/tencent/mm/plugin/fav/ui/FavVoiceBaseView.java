package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class FavVoiceBaseView extends android.widget.LinearLayout implements z30.a0, xn5.a0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f100427n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f100428d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f100429e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f100430f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f100431g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f100432h;

    /* renamed from: i, reason: collision with root package name */
    public o72.q3 f100433i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.pa f100434m;

    public FavVoiceBaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f100432h = "";
    }

    public static void b(com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView) {
        if (!favVoiceBaseView.f100433i.e(favVoiceBaseView.f100432h, 0)) {
            dp.a.makeText(favVoiceBaseView.getContext(), com.tencent.mm.R.string.f491220ce1, 1).show();
        } else {
            favVoiceBaseView.f100429e.setKeepScreenOn(true);
            favVoiceBaseView.f100434m.b();
        }
    }

    @Override // z30.a0
    public void a(java.lang.String str, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f100432h)) {
            this.f100429e.setKeepScreenOn(true);
            this.f100434m.b();
        } else {
            this.f100434m.d();
            this.f100429e.setKeepScreenOn(false);
        }
    }

    public boolean c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVoiceBaseView", "pause play");
        boolean d17 = this.f100433i.d();
        com.tencent.mm.plugin.fav.ui.pa paVar = this.f100434m;
        paVar.f101341a = true;
        paVar.removeMessages(4096);
        com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView = paVar.f101346f;
        favVoiceBaseView.f100430f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
        favVoiceBaseView.f100430f.setContentDescription(favVoiceBaseView.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf));
        this.f100429e.setKeepScreenOn(false);
        return d17;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVoiceBaseView", "on configuration changed, is paused ? %B", java.lang.Boolean.valueOf(this.f100434m.f101341a));
        com.tencent.mm.plugin.fav.ui.pa paVar = this.f100434m;
        if (paVar.f101341a) {
            paVar.postDelayed(new com.tencent.mm.plugin.fav.ui.na(this), 128L);
        }
    }

    @Override // z30.a0
    public void onFinish() {
        this.f100433i.f();
        this.f100434m.d();
        this.f100429e.setKeepScreenOn(false);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f100428d = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f487612p62);
        this.f100431g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487610p60);
        this.f100429e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487611p61);
        this.f100430f = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.p5z);
        this.f100434m = new com.tencent.mm.plugin.fav.ui.pa(this, null);
        this.f100430f.setOnClickListener(new com.tencent.mm.plugin.fav.ui.oa(this));
    }

    @Override // z30.a0
    public void onPause() {
        c();
    }

    public void setVoiceHelper(o72.q3 q3Var) {
        this.f100433i = q3Var;
        java.util.List list = q3Var.f343455o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((z30.a0) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }
}
