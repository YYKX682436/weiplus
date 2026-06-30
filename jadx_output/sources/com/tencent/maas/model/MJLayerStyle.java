package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJLayerStyle {

    /* renamed from: a, reason: collision with root package name */
    public float f48260a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48261b;

    /* renamed from: c, reason: collision with root package name */
    public float f48262c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48263d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.maas.model.MJEdgeInsets f48264e;

    public MJLayerStyle(float f17, com.tencent.maas.model.MJColor mJColor, float f18, com.tencent.maas.model.MJColor mJColor2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets) {
        this.f48260a = f17;
        this.f48261b = mJColor;
        this.f48262c = f18;
        this.f48263d = mJColor2;
        this.f48264e = mJEdgeInsets;
    }

    public com.tencent.maas.model.MJColor getBackgroundColor() {
        return this.f48263d;
    }

    public com.tencent.maas.model.MJColor getBorderColor() {
        return this.f48261b;
    }

    public float getBorderWidth() {
        return this.f48262c;
    }

    public float getCornerRadius() {
        return this.f48260a;
    }

    public com.tencent.maas.model.MJEdgeInsets getEdgeInsets() {
        return this.f48264e;
    }

    public void setBackgroundColor(com.tencent.maas.model.MJColor mJColor) {
        this.f48263d = mJColor;
    }

    public void setBorderColor(com.tencent.maas.model.MJColor mJColor) {
        this.f48261b = mJColor;
    }

    public void setBorderWidth(float f17) {
        this.f48262c = f17;
    }

    public void setCornerRadius(float f17) {
        this.f48260a = f17;
    }

    public void setEdgeInsets(com.tencent.maas.model.MJEdgeInsets mJEdgeInsets) {
        this.f48264e = mJEdgeInsets;
    }
}
