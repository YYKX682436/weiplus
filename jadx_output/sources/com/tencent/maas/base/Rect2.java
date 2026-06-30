package com.tencent.maas.base;

/* loaded from: classes5.dex */
public class Rect2 {
    private final com.tencent.maas.base.Vec2 origin;
    private final com.tencent.maas.base.Vec2 size;

    public Rect2(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 vec22) {
        this.origin = vec2;
        this.size = vec22;
    }

    public com.tencent.maas.base.Vec2 getOrigin() {
        return this.origin;
    }

    public com.tencent.maas.base.Vec2 getSize() {
        return this.size;
    }
}
