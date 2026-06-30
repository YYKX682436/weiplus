package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes7.dex */
public class e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a f92283d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f92284e;

    public e(android.content.Context context, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a aVar, android.view.View view) {
        super(context);
        this.f92283d = aVar;
        this.f92284e = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f92283d.getClass();
        return false;
    }
}
