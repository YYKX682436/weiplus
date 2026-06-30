package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageMaskStyle {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.model.MJEdgeInsets f48062a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.base.Vec2 f48063b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48064c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48065d;

    /* renamed from: e, reason: collision with root package name */
    public float f48066e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48067f;

    /* renamed from: g, reason: collision with root package name */
    public float f48068g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48069h;

    /* renamed from: i, reason: collision with root package name */
    public float f48070i;

    /* renamed from: j, reason: collision with root package name */
    public float f48071j;

    public MJImageMaskStyle(com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.model.MJColor mJColor, com.tencent.maas.model.MJColor mJColor2, float f17, com.tencent.maas.model.MJColor mJColor3, float f18, com.tencent.maas.model.MJColor mJColor4, float f19, float f27) {
        this.f48062a = mJEdgeInsets;
        this.f48063b = vec2;
        this.f48064c = mJColor;
        this.f48065d = mJColor2;
        this.f48066e = f17;
        this.f48067f = mJColor3;
        this.f48068g = f18;
        this.f48069h = mJColor4;
        this.f48070i = f19;
        this.f48071j = f27;
    }

    public static com.tencent.maas.imagestudio.MJImageMaskStyle a() {
        com.tencent.maas.imagestudio.MJImageMaskStyle mJImageMaskStyle = new com.tencent.maas.imagestudio.MJImageMaskStyle();
        mJImageMaskStyle.f48062a = new com.tencent.maas.model.MJEdgeInsets(-15.0f, 0.0f, -15.0f, 0.0f);
        mJImageMaskStyle.f48063b = new com.tencent.maas.base.Vec2(0.0f, 0.0f);
        mJImageMaskStyle.f48064c = new com.tencent.maas.model.MJColor(0.0f, 0.0f, 0.0f, 0.3f);
        com.tencent.maas.model.MJColor mJColor = com.tencent.maas.model.MJColor.f48251e;
        mJImageMaskStyle.f48065d = mJColor;
        mJImageMaskStyle.f48066e = 1.0f;
        mJImageMaskStyle.f48067f = mJColor;
        mJImageMaskStyle.f48068g = 1.0f;
        mJImageMaskStyle.f48069h = new com.tencent.maas.model.MJColor(0.0f, 0.0f, 0.0f, 0.0f);
        mJImageMaskStyle.f48070i = 0.0f;
        mJImageMaskStyle.f48071j = 0.0f;
        return mJImageMaskStyle;
    }

    public com.tencent.maas.base.Vec2 getCenterOffset() {
        return this.f48063b;
    }

    public com.tencent.maas.model.MJColor getCornerColor() {
        return this.f48069h;
    }

    public float getCornerLength() {
        return this.f48071j;
    }

    public float getCornerWidth() {
        return this.f48070i;
    }

    public com.tencent.maas.model.MJEdgeInsets getDisplayInsets() {
        return this.f48062a;
    }

    public com.tencent.maas.model.MJColor getMaskColor() {
        return this.f48064c;
    }

    public com.tencent.maas.model.MJColor getShadowColor() {
        return this.f48067f;
    }

    public float getShadowWidth() {
        return this.f48068g;
    }

    public com.tencent.maas.model.MJColor getStrokeColor() {
        return this.f48065d;
    }

    public float getStrokeWidth() {
        return this.f48066e;
    }

    private MJImageMaskStyle() {
    }
}
