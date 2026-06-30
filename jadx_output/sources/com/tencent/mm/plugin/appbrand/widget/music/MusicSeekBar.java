package com.tencent.mm.plugin.appbrand.widget.music;

/* loaded from: classes5.dex */
public class MusicSeekBar extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f91757d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f91758e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.SeekBar f91759f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f91760g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91761h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f91762i;

    /* renamed from: m, reason: collision with root package name */
    public sl1.d f91763m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f91764n;

    /* renamed from: o, reason: collision with root package name */
    public sl1.c f91765o;

    public MusicSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static java.lang.String b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j17 = i17 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        long floor = (long) java.lang.Math.floor((i17 % com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) / 1000);
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
        if (this.f91760g == null) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 360.0f);
            this.f91760g = ofFloat;
            ofFloat.setTarget(this.f91759f);
            this.f91760g.setRepeatCount(100);
            this.f91760g.setDuration(5000L);
            this.f91760g.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f91760g.addUpdateListener(new sl1.b(this));
        }
        this.f91762i = z17;
        if (z17) {
            this.f91760g.start();
        } else {
            this.f91760g.cancel();
            this.f91759f.setThumb(this.f91764n);
        }
    }

    public void setColor(int i17) {
        this.f91757d.setTextColor(i17);
        this.f91758e.setTextColor(i17);
        this.f91759f.getProgressDrawable().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f91759f.getThumb().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f91764n.setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f91763m.setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
    }

    public void setMaxProgress(int i17) {
        this.f91758e.setText(b(i17));
        this.f91759f.setMax(i17);
    }

    public void setOnSeekBarChange(sl1.c cVar) {
        this.f91765o = cVar;
    }

    public void setProgress(int i17) {
        if (this.f91762i || this.f91761h) {
            return;
        }
        this.f91757d.setText(b(i17));
        this.f91759f.setProgress(i17);
    }

    public MusicSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91761h = false;
        this.f91762i = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c5f, this);
        this.f91757d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484004co3);
        this.f91758e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dgl);
        this.f91759f = (android.widget.SeekBar) inflate.findViewById(com.tencent.mm.R.id.mhc);
        this.f91757d.setText("00:00");
        this.f91758e.setText("--:--");
        this.f91763m = new sl1.d(getResources().getDrawable(com.tencent.mm.R.drawable.cbs));
        this.f91764n = getResources().getDrawable(com.tencent.mm.R.drawable.asb);
        this.f91759f.setOnSeekBarChangeListener(new sl1.a(this));
    }
}
