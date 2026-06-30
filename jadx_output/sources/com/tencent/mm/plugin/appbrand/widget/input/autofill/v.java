package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class v extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f91357d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f91358e;

    public v(android.content.Context context, boolean z17) {
        super(context, null, com.tencent.mm.R.attr.f478231e8);
        this.f91358e = z17;
        setCacheColorHint(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f91358e || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f91358e || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f91358e || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f91358e && this.f91357d) || super.isInTouchMode();
    }
}
