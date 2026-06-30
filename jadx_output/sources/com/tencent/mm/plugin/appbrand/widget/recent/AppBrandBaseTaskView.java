package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class AppBrandBaseTaskView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.h1 f91856d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer f91857e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.g1 f91858f;

    public AppBrandBaseTaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public com.tencent.mm.plugin.appbrand.widget.recent.g1 getAppBrandTaskReport() {
        return this.f91858f;
    }

    public com.tencent.mm.plugin.appbrand.widget.recent.h1 getTaskViewListener() {
        return this.f91856d;
    }

    public void setTaskContainer(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer) {
        this.f91857e = appBrandTaskContainer;
        this.f91858f = appBrandTaskContainer;
    }

    public void setTaskViewListener(com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var) {
        this.f91856d = h1Var;
    }

    public AppBrandBaseTaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
