package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class AppBrandCloseTaskView extends com.tencent.mm.plugin.appbrand.widget.recent.AppBrandBaseTaskView {
    public AppBrandCloseTaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void a() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dyx, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
        ((android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.se7)).setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.recent.e(this));
        ((android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.se9)).setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.recent.f(this));
    }

    public AppBrandCloseTaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
