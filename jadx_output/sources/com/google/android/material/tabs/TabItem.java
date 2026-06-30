package com.google.android.material.tabs;

/* loaded from: classes13.dex */
public class TabItem extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f44537d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f44538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44539f;

    public TabItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434130t);
        this.f44537d = obtainStyledAttributes.getText(2);
        this.f44538e = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : k.a.a(context, resourceId);
        this.f44539f = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
