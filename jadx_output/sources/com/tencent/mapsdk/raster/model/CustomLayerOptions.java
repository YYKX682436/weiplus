package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public class CustomLayerOptions {
    private java.lang.String mLayerId;
    private java.lang.String mLayerVersion;

    public java.lang.String getLayerId() {
        return this.mLayerId;
    }

    public com.tencent.mapsdk.raster.model.CustomLayerOptions layerId(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mLayerId = str;
        }
        return this;
    }
}
