package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui;

/* renamed from: com.tencent.mm.plugin.mv.ui.WeCheckBox */
/* loaded from: classes11.dex */
public class C16656xe36a44b1 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 {

    /* renamed from: r, reason: collision with root package name */
    public boolean f232425r;

    public C16656xe36a44b1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f232425r = false;
    }

    /* renamed from: setChecked */
    public void m67270xdd7d58e5(boolean z17) {
        this.f232425r = z17;
        if (z17) {
            setImageResource(com.p314xaae8f345.mm.R.raw.f80239x9628fc48);
        } else {
            setImageResource(com.p314xaae8f345.mm.R.raw.f80269xfa4f757a);
        }
    }

    /* renamed from: setOnCheckedChangeListener */
    public void m67271x405278aa(jm3.j1 j1Var) {
        super.setOnClickListener(new jm3.i1(this, j1Var));
    }

    public C16656xe36a44b1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f232425r = false;
    }
}
