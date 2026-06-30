package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public abstract class AppBrandTaskView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.c2 f91905d;

    public AppBrandTaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract void a();

    public abstract void b();

    public abstract int getRecentCount();

    public com.tencent.mm.plugin.appbrand.widget.recent.c2 getSceneFactory() {
        return this.f91905d;
    }

    public abstract java.lang.String getTaskSessionId();

    public abstract com.tencent.mm.plugin.appbrand.widget.recent.h1 getTaskViewListener();

    public void setSceneFactory(com.tencent.mm.plugin.appbrand.widget.recent.c2 c2Var) {
        this.f91905d = c2Var;
    }

    public abstract void setTaskViewListener(com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var);

    public AppBrandTaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
