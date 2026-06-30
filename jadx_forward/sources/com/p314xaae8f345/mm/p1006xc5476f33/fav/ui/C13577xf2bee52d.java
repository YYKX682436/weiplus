package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavVoiceBaseView */
/* loaded from: classes12.dex */
public class C13577xf2bee52d extends android.widget.LinearLayout implements z30.a0, xn5.a0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f181960n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f181961d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f181962e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f181963f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f181964g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f181965h;

    /* renamed from: i, reason: collision with root package name */
    public o72.q3 f181966i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.pa f181967m;

    public C13577xf2bee52d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181965h = "";
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d) {
        if (!c13577xf2bee52d.f181966i.e(c13577xf2bee52d.f181965h, 0)) {
            dp.a.m125853x26a183b(c13577xf2bee52d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572753ce1, 1).show();
        } else {
            c13577xf2bee52d.f181962e.setKeepScreenOn(true);
            c13577xf2bee52d.f181967m.b();
        }
    }

    @Override // z30.a0
    public void a(java.lang.String str, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f181965h)) {
            this.f181962e.setKeepScreenOn(true);
            this.f181967m.b();
        } else {
            this.f181967m.d();
            this.f181962e.setKeepScreenOn(false);
        }
    }

    public boolean c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVoiceBaseView", "pause play");
        boolean d17 = this.f181966i.d();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.pa paVar = this.f181967m;
        paVar.f182874a = true;
        paVar.mo50303x856b99f0(4096);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d = paVar.f182879f;
        c13577xf2bee52d.f181963f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
        c13577xf2bee52d.f181963f.setContentDescription(c13577xf2bee52d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
        this.f181962e.setKeepScreenOn(false);
        return d17;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVoiceBaseView", "on configuration changed, is paused ? %B", java.lang.Boolean.valueOf(this.f181967m.f182874a));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.pa paVar = this.f181967m;
        if (paVar.f182874a) {
            paVar.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.na(this), 128L);
        }
    }

    @Override // z30.a0
    /* renamed from: onFinish */
    public void mo55316x42fe6352() {
        this.f181966i.f();
        this.f181967m.d();
        this.f181962e.setKeepScreenOn(false);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f181961d = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f569145p62);
        this.f181964g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569143p60);
        this.f181962e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569144p61);
        this.f181963f = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.p5z);
        this.f181967m = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.pa(this, null);
        this.f181963f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.oa(this));
    }

    @Override // z30.a0
    /* renamed from: onPause */
    public void mo55317xb01dfb57() {
        c();
    }

    /* renamed from: setVoiceHelper */
    public void m55320x591869be(o72.q3 q3Var) {
        this.f181966i = q3Var;
        java.util.List list = q3Var.f424988o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((z30.a0) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }
}
