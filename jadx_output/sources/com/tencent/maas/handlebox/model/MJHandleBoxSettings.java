package com.tencent.maas.handlebox.model;

/* loaded from: classes5.dex */
public class MJHandleBoxSettings {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48042a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48043b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.MJEdgeInsets f48044c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48045d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48046e;

    public MJHandleBoxSettings(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 vec22, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.base.Vec2 vec23, float f17) {
        this.f48042a = vec2;
        this.f48043b = vec22;
        this.f48044c = mJEdgeInsets;
        this.f48045d = vec23;
        this.f48046e = f17;
    }

    public com.tencent.maas.base.Vec2 getContentSize() {
        return this.f48043b;
    }

    public com.tencent.maas.model.MJEdgeInsets getEdgeInsets() {
        return this.f48044c;
    }

    public com.tencent.maas.base.Vec2 getPosition() {
        return this.f48042a;
    }

    public float getRotation() {
        return this.f48046e;
    }

    public com.tencent.maas.base.Vec2 getScale() {
        return this.f48045d;
    }

    public java.lang.String toString() {
        return "MJHandleBoxSettings{position=" + this.f48042a + ", contentSize=" + this.f48043b + ", edgeInsets=" + this.f48044c + ", scale=" + this.f48045d + ", rotation=" + this.f48046e + '}';
    }
}
