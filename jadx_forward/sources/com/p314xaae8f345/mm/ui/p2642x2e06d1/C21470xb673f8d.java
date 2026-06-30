package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.CustomViewPager */
/* loaded from: classes15.dex */
public class C21470xb673f8d extends com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d {
    private static final java.lang.String TAG = "MicroMsg.CustomViewPager";

    /* renamed from: mCanSlide */
    private boolean f39398x1cc7d74e;

    /* renamed from: mCanSlideBySide */
    private boolean f39399x1ce0eb3c;

    /* renamed from: mSwipeBackListener */
    private al5.g3 f39400xa5436a28;

    public C21470xb673f8d(android.content.Context context) {
        super(context);
        this.f39398x1cc7d74e = true;
        this.f39399x1ce0eb3c = true;
        this.f39400xa5436a28 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        al5.g3 g3Var = this.f39400xa5436a28;
        if (g3Var != null && g3Var.mo2163xd71108fe()) {
            if (!this.f39400xa5436a28.d0()) {
                this.f39400xa5436a28.a(motionEvent);
            } else {
                if (this.f39400xa5436a28.e() == 1) {
                    this.f39400xa5436a28.a(motionEvent);
                    return true;
                }
                if (this.f39400xa5436a28.d(motionEvent)) {
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: isCanSlide */
    public boolean m78871xc881d70b() {
        return this.f39398x1cc7d74e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d
    /* renamed from: isGutterDrag */
    public boolean mo78872x4b59f9b9(float f17, float f18) {
        if (this.f39399x1ce0eb3c) {
            return super.mo78872x4b59f9b9(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f39398x1cc7d74e) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "get a Exception", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f39398x1cc7d74e) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "get a Exception", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: setCanSlide */
    public void m78873x6e5cce43(boolean z17) {
        this.f39398x1cc7d74e = z17;
    }

    /* renamed from: setCanSlideBySide */
    public void m78874xccbc1671(boolean z17) {
        this.f39399x1ce0eb3c = z17;
    }

    /* renamed from: setSwipeBackListener */
    public void m78875x372c76d3(al5.g3 g3Var) {
        this.f39400xa5436a28 = g3Var;
    }

    public C21470xb673f8d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39398x1cc7d74e = true;
        this.f39399x1ce0eb3c = true;
        this.f39400xa5436a28 = null;
    }
}
