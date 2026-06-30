package com.tencent.maas.handlebox.model;

/* loaded from: classes5.dex */
public class MJHandleBoxBorderStyle {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.MJColor f48015a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48016b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.MJColor f48017c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48018d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.handlebox.model.MJDashLineStyle f48019e;

    public MJHandleBoxBorderStyle(com.tencent.maas.model.MJColor mJColor, float f17, com.tencent.maas.model.MJColor mJColor2, float f18) {
        this.f48015a = mJColor;
        this.f48016b = f17;
        this.f48017c = mJColor2;
        this.f48018d = f18;
        this.f48019e = null;
    }

    public com.tencent.maas.handlebox.model.MJDashLineStyle getDashLineStyle() {
        return this.f48019e;
    }

    public com.tencent.maas.model.MJColor getShadowColor() {
        return this.f48017c;
    }

    public float getShadowWidth() {
        return this.f48018d;
    }

    public com.tencent.maas.model.MJColor getStrokeColor() {
        return this.f48015a;
    }

    public float getStrokeWidth() {
        return this.f48016b;
    }

    public MJHandleBoxBorderStyle(com.tencent.maas.model.MJColor mJColor, float f17, com.tencent.maas.model.MJColor mJColor2, float f18, com.tencent.maas.handlebox.model.MJDashLineStyle mJDashLineStyle) {
        this.f48015a = mJColor;
        this.f48016b = f17;
        this.f48017c = mJColor2;
        this.f48018d = f18;
        this.f48019e = mJDashLineStyle;
    }
}
