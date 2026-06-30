package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamInitParam {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47879b;

    public MJCamInitParam() {
        this.f47878a = false;
        this.f47879b = false;
    }

    public boolean isOpenLayerRenderStats() {
        return this.f47879b;
    }

    public boolean isOpenMD5Check() {
        return this.f47878a;
    }

    public MJCamInitParam(boolean z17, boolean z18) {
        this.f47878a = z17;
        this.f47879b = z18;
    }
}
