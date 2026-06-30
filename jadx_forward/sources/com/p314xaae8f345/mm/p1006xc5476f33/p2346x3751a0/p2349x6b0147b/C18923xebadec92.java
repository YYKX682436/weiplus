package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b;

/* renamed from: com.tencent.mm.plugin.voip.video.NewMovableVideoView */
/* loaded from: classes.dex */
public class C18923xebadec92 extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a {

    /* renamed from: d, reason: collision with root package name */
    public float f258580d;

    /* renamed from: e, reason: collision with root package name */
    public float f258581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f258582f;

    /* renamed from: g, reason: collision with root package name */
    public final int f258583g;

    /* renamed from: h, reason: collision with root package name */
    public long f258584h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnClickListener f258585i;

    public C18923xebadec92(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258582f = 800;
        this.f258583g = 480;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnClickListener onClickListener;
        motionEvent.getAction();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f258580d = motionEvent.getRawX();
            this.f258581e = motionEvent.getRawY();
            this.f258584h = java.lang.System.currentTimeMillis();
        } else if (action == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f258584h;
            if (j17 != 0 && currentTimeMillis - j17 < 300 && currentTimeMillis - j17 >= 0 && (onClickListener = this.f258585i) != null) {
                onClickListener.onClick(this);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11079, 2);
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f258580d;
            float rawY = motionEvent.getRawY() - this.f258581e;
            if (java.lang.Math.abs(rawX) > 1.0f || java.lang.Math.abs(rawY) > 1.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
                int i17 = (int) (layoutParams.rightMargin - rawX);
                int i18 = (int) (layoutParams.topMargin + rawY);
                if (i17 < 0) {
                    i17 = 0;
                } else {
                    int i19 = this.f258583g;
                    if (i17 > i19) {
                        i17 = i19;
                    }
                }
                layoutParams.rightMargin = i17;
                if (i18 < 0) {
                    i18 = 0;
                } else {
                    int i27 = this.f258582f;
                    if (i18 > i27) {
                        i18 = i27;
                    }
                }
                layoutParams.topMargin = i18;
                setLayoutParams(layoutParams);
                this.f258580d = motionEvent.getRawX();
                this.f258581e = motionEvent.getRawY();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f258585i = onClickListener;
    }
}
