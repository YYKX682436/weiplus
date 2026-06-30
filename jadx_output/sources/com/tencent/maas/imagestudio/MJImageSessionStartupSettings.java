package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageSessionStartupSettings {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48074a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48075b;

    public MJImageSessionStartupSettings(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 vec22) {
        this.f48074a = vec2;
        this.f48075b = vec22;
    }

    public com.tencent.maas.base.Vec2 getPreviewLimitedPixelSize() {
        return this.f48074a;
    }

    public com.tencent.maas.base.Vec2 getThumbnailSize() {
        return this.f48075b;
    }
}
