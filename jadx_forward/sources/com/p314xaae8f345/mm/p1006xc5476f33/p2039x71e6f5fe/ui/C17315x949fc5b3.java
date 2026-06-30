package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher */
/* loaded from: classes13.dex */
public class C17315x949fc5b3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f240995d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f240996e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240998g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240999h;

    public C17315x949fc5b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240997f = false;
        c();
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerFlashSwitcher", "closeFlashStatus");
        this.f240998g = false;
        this.f240995d.setImageResource(com.p314xaae8f345.mm.R.raw.f80997x99ca4eac);
        this.f240996e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i9k);
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerFlashSwitcher", "hide");
        setEnabled(false);
        this.f240999h = false;
        this.f240995d.animate().alpha(0.0f).setDuration(500L);
        this.f240996e.animate().alpha(0.0f).setDuration(500L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b4(this));
        this.f240998g = false;
    }

    public final void c() {
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570962ci3, (android.view.ViewGroup) this, true);
        this.f240995d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.g87);
        this.f240996e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g7y);
        this.f240997f = true;
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerFlashSwitcher", "show, isFirstShow: %s", java.lang.Boolean.valueOf(this.f240997f));
        this.f240999h = true;
        if (this.f240997f) {
            this.f240995d.setAlpha(0.0f);
            this.f240996e.setAlpha(0.0f);
            setVisibility(0);
            this.f240996e.animate().alpha(1.0f).setListener(null).setDuration(500L);
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.z3(this));
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(500L);
            ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a4(this));
            ofFloat.start();
            this.f240997f = false;
        } else {
            setVisibility(0);
            this.f240996e.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
            this.f240995d.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        }
        setEnabled(true);
    }

    public C17315x949fc5b3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f240997f = false;
        c();
    }
}
