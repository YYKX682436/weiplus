package com.tencent.mm.kiss.widget.textview;

/* loaded from: classes4.dex */
public class PLTextView extends com.tencent.mm.kiss.widget.textview.StaticTextView {

    /* renamed from: e, reason: collision with root package name */
    public boolean f68480e;

    public PLTextView(android.content.Context context) {
        super(context);
        this.f68480e = true;
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView
    public void c() {
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView
    public void d() {
    }

    public void g(java.lang.CharSequence charSequence) {
    }

    public void h(java.lang.CharSequence charSequence) {
        f(charSequence, false);
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getLayoutWrapper() != null) {
            getLayoutWrapper().f328601a = false;
        }
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void setIsNeedLayoutCache(boolean z17) {
        this.f68480e = z17;
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView
    public void setText(java.lang.CharSequence charSequence) {
        setContentDescription(charSequence);
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return;
        }
        if (!this.f68480e) {
            h(charSequence);
            return;
        }
        if (getLayoutWrapper() != null && getLayoutWrapper().f328601a) {
            mm0.c.f328575b.c(getConfig(), getLayoutWrapper());
        }
        mm0.g b17 = mm0.c.f328575b.b(getConfig(), charSequence);
        if (b17 == null) {
            h(charSequence);
        } else {
            g(charSequence);
            setTextLayout(b17);
        }
    }

    public PLTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68480e = true;
    }

    public PLTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68480e = true;
    }
}
