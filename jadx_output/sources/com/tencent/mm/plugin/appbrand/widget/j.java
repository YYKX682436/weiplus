package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class j extends android.view.ViewOutlineProvider {
    public j(com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView) {
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(new android.graphics.Rect(0, 0, view.getWidth(), view.getHeight()), com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.A1);
    }
}
