package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes2.dex */
public class g extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f234152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f234153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f234154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f234155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e f234156h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, android.widget.CheckBox checkBox, android.view.View.OnClickListener onClickListener, android.view.ViewGroup viewGroup, android.widget.Button button) {
        super(false);
        this.f234156h = c16759xaa786f9e;
        this.f234152d = checkBox;
        this.f234153e = onClickListener;
        this.f234154f = viewGroup;
        this.f234155g = button;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        if (this.f234152d.isChecked()) {
            this.f234153e.onClick(view);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22805, 2);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e = this.f234156h;
        int dimensionPixelOffset = c16759xaa786f9e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.f234154f, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22805, 1);
        this.f234155g.announceForAccessibility(c16759xaa786f9e.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kke));
    }
}
