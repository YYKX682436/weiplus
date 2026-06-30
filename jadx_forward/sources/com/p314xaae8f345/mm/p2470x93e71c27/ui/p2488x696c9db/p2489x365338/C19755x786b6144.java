package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p2489x365338;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.tips.TipsPopupWindow */
/* loaded from: classes3.dex */
public class C19755x786b6144 extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f273467a;

    public C19755x786b6144(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.f273467a.getChildAt(0);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f273467a;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    public C19755x786b6144(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f273467a = frameLayout;
        super.setContentView(frameLayout);
    }
}
