package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserIconImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserIconImageView */
/* loaded from: classes5.dex */
public final class C19354x2b8ea7ff extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public final int f265543f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19354x2b8ea7ff(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        android.graphics.drawable.Drawable mutate;
        super.drawableStateChanged();
        if (!isEnabled() || !isFocusable()) {
            android.graphics.drawable.Drawable drawable = getDrawable();
            mutate = drawable != null ? drawable.mutate() : null;
            if (mutate == null) {
                return;
            }
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(0, android.graphics.PorterDuff.Mode.SRC_ATOP));
            return;
        }
        if (isPressed()) {
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            mutate = drawable2 != null ? drawable2.mutate() : null;
            if (mutate == null) {
                return;
            }
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f265543f, android.graphics.PorterDuff.Mode.SRC_ATOP));
            return;
        }
        android.graphics.drawable.Drawable drawable3 = getDrawable();
        mutate = drawable3 != null ? drawable3.mutate() : null;
        if (mutate == null) {
            return;
        }
        mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(0, android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19354x2b8ea7ff(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f265543f = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
    }
}
