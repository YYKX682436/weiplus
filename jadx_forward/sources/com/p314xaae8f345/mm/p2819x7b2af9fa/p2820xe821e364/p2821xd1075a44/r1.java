package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public int f296157a;

    /* renamed from: b, reason: collision with root package name */
    public int f296158b;

    /* renamed from: d, reason: collision with root package name */
    public int f296160d = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f296162f = false;

    /* renamed from: c, reason: collision with root package name */
    public int f296159c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Interpolator f296161e = null;

    public r1(int i17, int i18) {
        this.f296157a = i17;
        this.f296158b = i18;
    }

    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        int i17 = this.f296160d;
        if (i17 >= 0) {
            this.f296160d = -1;
            c22949xf1deaba4.M(i17);
            this.f296162f = false;
        } else if (this.f296162f) {
            android.view.animation.Interpolator interpolator = this.f296161e;
            if (interpolator != null && this.f296159c < 1) {
                throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i18 = this.f296159c;
            if (i18 < 1) {
                throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
            }
            c22949xf1deaba4.C1.c(this.f296157a, this.f296158b, i18, interpolator);
            this.f296162f = false;
        }
    }
}
