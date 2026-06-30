package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f87552a;

    public s0(java.lang.String appId, com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView pipContainerView) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pipContainerView, "pipContainerView");
        this.f87552a = appId;
        pipContainerView.a(new com.tencent.mm.plugin.appbrand.pip.r0(this));
    }
}
