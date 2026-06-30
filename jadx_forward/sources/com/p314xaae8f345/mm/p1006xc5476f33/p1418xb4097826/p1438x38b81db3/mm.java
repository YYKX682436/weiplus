package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class mm implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f185541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f185545h;

    public mm(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, int i17, int i18, int i19, android.widget.TextView textView) {
        this.f185541d = c1073x7e08a787;
        this.f185542e = i17;
        this.f185543f = i18;
        this.f185544g = i19;
        this.f185545h = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f185541d;
        c1073x7e08a787.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f185545h.setMaxWidth(((c1073x7e08a787.getMeasuredWidth() - this.f185542e) - this.f185543f) - this.f185544g);
    }
}
