package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class mm implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f104008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f104011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104012h;

    public mm(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i17, int i18, int i19, android.widget.TextView textView) {
        this.f104008d = constraintLayout;
        this.f104009e = i17;
        this.f104010f = i18;
        this.f104011g = i19;
        this.f104012h = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f104008d;
        constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f104012h.setMaxWidth(((constraintLayout.getMeasuredWidth() - this.f104009e) - this.f104010f) - this.f104011g);
    }
}
