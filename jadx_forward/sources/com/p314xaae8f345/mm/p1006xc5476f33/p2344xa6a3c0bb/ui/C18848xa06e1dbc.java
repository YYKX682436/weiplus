package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView */
/* loaded from: classes15.dex */
public class C18848xa06e1dbc extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f257757d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f257758e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f257759f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f257760g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f257761h;

    public C18848xa06e1dbc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f257758e = false;
        this.f257761h = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.db6, (android.view.ViewGroup) this, true);
        this.f257757d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.p6i);
        this.f257759f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.p6k);
        this.f257760g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.p6j);
        b();
    }

    public void a() {
        if (this.f257760g.getVisibility() != 0 || this.f257761h) {
            this.f257760g.clearAnimation();
            this.f257760g.setVisibility(4);
        } else {
            this.f257760g.clearAnimation();
            this.f257761h = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.g1.a(this.f257760g, getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.y0(this));
        }
    }

    public void b() {
        this.f257759f.setTextSize(0, getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562166ae1));
        this.f257759f.getTextSize();
        this.f257759f.clearAnimation();
    }

    public void c() {
        this.f257760g.animate().alpha(1.0f).setDuration(200L).withStartAction(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.x0(this)).start();
    }

    public void d() {
        this.f257757d.getVisibility();
        if ((this.f257757d.getVisibility() != 4 && this.f257757d.getVisibility() != 8) || this.f257758e) {
            this.f257757d.clearAnimation();
            this.f257757d.setVisibility(0);
            this.f257757d.invalidate();
            return;
        }
        this.f257757d.clearAnimation();
        this.f257758e = true;
        android.widget.TextView textView = this.f257757d;
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.v0(this);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        loadAnimation.setDuration(300L);
        loadAnimation.setFillAfter(true);
        loadAnimation.setRepeatCount(0);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.d1(v0Var));
        textView.startAnimation(loadAnimation);
    }

    /* renamed from: setErr */
    public void m72726xca0261a3(java.lang.String str) {
        this.f257760g.setText(str);
    }

    /* renamed from: setTipText */
    public void m72728x63103da6(java.lang.String str) {
        this.f257759f.setText(str);
        this.f257759f.setVisibility(0);
    }

    /* renamed from: setTitleText */
    public void m72730xdc742163(java.lang.String str) {
        this.f257757d.setText(str);
        this.f257757d.setVisibility(0);
    }

    /* renamed from: setErr */
    public void m72725xca0261a3(int i17) {
        this.f257760g.setText(i17);
    }

    /* renamed from: setTipText */
    public void m72727x63103da6(int i17) {
        this.f257759f.setText(i17);
        this.f257759f.setVisibility(0);
    }

    /* renamed from: setTitleText */
    public void m72729xdc742163(int i17) {
        this.f257757d.setText(i17);
        this.f257757d.setVisibility(0);
    }
}
