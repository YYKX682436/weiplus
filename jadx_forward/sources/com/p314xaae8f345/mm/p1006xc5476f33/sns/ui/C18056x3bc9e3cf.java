package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsEditText */
/* loaded from: classes5.dex */
public class C18056x3bc9e3cf extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 {
    public int G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f248683J;
    public float K;
    public final int L;

    public C18056x3bc9e3cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 0;
        this.H = false;
        this.I = 0;
        this.f248683J = false;
        this.L = 10;
        addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ci(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6, fl5.i
    /* renamed from: getPasterLen */
    public int mo70737xc8d30aa0() {
        return this.G;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if (i17 == 16908322) {
            this.H = true;
        }
        return super.onTextContextMenuItem(i17);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            if (java.lang.Math.abs(this.K - motionEvent.getY()) > this.L) {
                this.f248683J = true;
            }
        } else if (motionEvent.getAction() != 1) {
            this.f248683J = false;
        } else if (this.f248683J) {
            this.f248683J = false;
            return true;
        }
        this.K = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: setPasterLen */
    public void mo70738x2526cb14(int i17) {
        this.G = i17;
    }
}
