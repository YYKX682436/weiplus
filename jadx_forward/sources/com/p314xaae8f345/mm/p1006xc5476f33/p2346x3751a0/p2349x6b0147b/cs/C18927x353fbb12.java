package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.cs;

/* renamed from: com.tencent.mm.plugin.voip.video.cs.MovableVideoView */
/* loaded from: classes.dex */
public class C18927x353fbb12 extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 {

    /* renamed from: u, reason: collision with root package name */
    public float f258614u;

    /* renamed from: v, reason: collision with root package name */
    public float f258615v;

    /* renamed from: w, reason: collision with root package name */
    public int f258616w;

    /* renamed from: x, reason: collision with root package name */
    public int f258617x;

    /* renamed from: y, reason: collision with root package name */
    public long f258618y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnClickListener f258619z;

    public C18927x353fbb12(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258616w = 800;
        this.f258617x = 480;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnClickListener onClickListener;
        motionEvent.getAction();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f258614u = motionEvent.getRawX();
            this.f258615v = motionEvent.getRawY();
            this.f258618y = java.lang.System.currentTimeMillis();
        } else if (action == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f258618y;
            if (j17 != 0 && currentTimeMillis - j17 < 300 && currentTimeMillis - j17 >= 0 && (onClickListener = this.f258619z) != null) {
                onClickListener.onClick(this);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11079, 2);
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f258614u;
            float rawY = motionEvent.getRawY() - this.f258615v;
            if (java.lang.Math.abs(rawX) > 1.0f || java.lang.Math.abs(rawY) > 1.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
                int i17 = (int) (layoutParams.rightMargin - rawX);
                int i18 = (int) (layoutParams.topMargin + rawY);
                if (i17 < 0) {
                    i17 = 0;
                } else {
                    int i19 = this.f258617x;
                    if (i17 > i19) {
                        i17 = i19;
                    }
                }
                layoutParams.rightMargin = i17;
                if (i18 < 0) {
                    i18 = 0;
                } else {
                    int i27 = this.f258616w;
                    if (i18 > i27) {
                        i18 = i27;
                    }
                }
                layoutParams.topMargin = i18;
                setLayoutParams(layoutParams);
                this.f258614u = motionEvent.getRawX();
                this.f258615v = motionEvent.getRawY();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f258619z = onClickListener;
    }
}
