package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class TextOverlayDesc extends sg.d {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48410c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48411d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.model.MJTextStyle f48412e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.model.MJLayerStyle f48413f;

    public TextOverlayDesc(com.tencent.maas.model.MJSpatialInfo mJSpatialInfo, java.lang.String str, float f17, com.tencent.maas.model.MJTextStyle mJTextStyle, com.tencent.maas.model.MJLayerStyle mJLayerStyle) {
        super(mJSpatialInfo, 0);
        this.f48410c = str;
        this.f48411d = f17;
        this.f48412e = mJTextStyle;
        this.f48413f = mJLayerStyle;
    }

    public com.tencent.maas.model.MJLayerStyle getLayerStyle() {
        return this.f48413f;
    }

    public float getMaximumWidth() {
        return this.f48411d;
    }

    public java.lang.String getText() {
        return this.f48410c;
    }

    public com.tencent.maas.model.MJTextStyle getTextStyle() {
        return this.f48412e;
    }
}
