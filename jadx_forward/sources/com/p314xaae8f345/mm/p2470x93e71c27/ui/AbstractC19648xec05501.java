package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileItemView */
/* loaded from: classes8.dex */
public abstract class AbstractC19648xec05501 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f271345d;

    public AbstractC19648xec05501(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract void a();

    /* renamed from: getLayout */
    public abstract int mo67643x22f21e20();

    public AbstractC19648xec05501(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.LayoutInflater.from(context).inflate(mo67643x22f21e20(), this);
        a();
    }
}
