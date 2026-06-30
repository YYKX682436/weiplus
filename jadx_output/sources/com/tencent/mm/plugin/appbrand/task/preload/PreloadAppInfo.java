package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes7.dex */
class PreloadAppInfo {
    private static final java.lang.String TAG = "PreloadAppInfo";
    java.lang.String appId;
    int appType;
    float openRate;
    java.lang.String path;

    public java.lang.String toString() {
        return java.lang.String.format("preloadAppInfo appId:%s,appType:%d,path:%s,openRate:%f", this.appId, java.lang.Integer.valueOf(this.appType), this.path, java.lang.Float.valueOf(this.openRate));
    }
}
