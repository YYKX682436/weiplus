package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e;

/* renamed from: com.google.android.material.tabs.TabItem */
/* loaded from: classes13.dex */
public class C2717x6997428 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f126070d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f126071e;

    /* renamed from: f, reason: collision with root package name */
    public final int f126072f;

    public C2717x6997428(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515663t);
        this.f126070d = obtainStyledAttributes.getText(2);
        this.f126071e = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : k.a.a(context, resourceId);
        this.f126072f = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
