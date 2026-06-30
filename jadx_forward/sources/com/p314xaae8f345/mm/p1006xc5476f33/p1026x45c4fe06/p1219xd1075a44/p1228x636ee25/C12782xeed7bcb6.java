package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1228x636ee25;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar */
/* loaded from: classes5.dex */
public class C12782xeed7bcb6 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f173290d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f173291e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.SeekBar f173292f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f173293g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f173294h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f173295i;

    /* renamed from: m, reason: collision with root package name */
    public sl1.d f173296m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f173297n;

    /* renamed from: o, reason: collision with root package name */
    public sl1.c f173298o;

    public C12782xeed7bcb6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static java.lang.String b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j17 = i17 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        long floor = (long) java.lang.Math.floor((i17 % com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) / 1000);
        if (j17 < 10) {
            sb6.append("0");
        }
        sb6.append(j17 + ":");
        if (floor < 10) {
            sb6.append("0");
        }
        sb6.append(floor);
        return sb6.toString();
    }

    public void a(boolean z17) {
        if (this.f173293g == null) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 360.0f);
            this.f173293g = ofFloat;
            ofFloat.setTarget(this.f173292f);
            this.f173293g.setRepeatCount(100);
            this.f173293g.setDuration(5000L);
            this.f173293g.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f173293g.addUpdateListener(new sl1.b(this));
        }
        this.f173295i = z17;
        if (z17) {
            this.f173293g.start();
        } else {
            this.f173293g.cancel();
            this.f173292f.setThumb(this.f173297n);
        }
    }

    /* renamed from: setColor */
    public void m53549x52d2f021(int i17) {
        this.f173290d.setTextColor(i17);
        this.f173291e.setTextColor(i17);
        this.f173292f.getProgressDrawable().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f173292f.getThumb().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f173297n.setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f173296m.setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
    }

    /* renamed from: setMaxProgress */
    public void m53550xadb2e1ef(int i17) {
        this.f173291e.setText(b(i17));
        this.f173292f.setMax(i17);
    }

    /* renamed from: setOnSeekBarChange */
    public void m53551xf1df49aa(sl1.c cVar) {
        this.f173298o = cVar;
    }

    /* renamed from: setProgress */
    public void m53552x3ae760af(int i17) {
        if (this.f173295i || this.f173294h) {
            return;
        }
        this.f173290d.setText(b(i17));
        this.f173292f.setProgress(i17);
    }

    public C12782xeed7bcb6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173294h = false;
        this.f173295i = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5f, this);
        this.f173290d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565537co3);
        this.f173291e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dgl);
        this.f173292f = (android.widget.SeekBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.mhc);
        this.f173290d.setText("00:00");
        this.f173291e.setText("--:--");
        this.f173296m = new sl1.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cbs));
        this.f173297n = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asb);
        this.f173292f.setOnSeekBarChangeListener(new sl1.a(this));
    }
}
