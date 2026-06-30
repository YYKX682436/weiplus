package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton */
/* loaded from: classes5.dex */
public class C19413xc8846f1c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f266298d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f266299e;

    public C19413xc8846f1c(android.content.Context context) {
        super(context);
        b(context);
    }

    public void a(android.widget.FrameLayout frameLayout, tx4.c cVar) {
        if (getParent() == null && frameLayout != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
            frameLayout.addView(this, layoutParams);
        }
        android.widget.ImageView imageView = this.f266298d;
        if (imageView != null) {
            imageView.setOnClickListener(new tx4.b(this, cVar));
        }
        this.f266299e = true;
    }

    public final void b(android.content.Context context) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f266298d = imageView;
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562061a21), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562061a21)));
        this.f266298d.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f266298d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6h);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562060a20), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562060a20), 0);
        addView(this.f266298d, layoutParams);
    }

    public C19413xc8846f1c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public C19413xc8846f1c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }
}
