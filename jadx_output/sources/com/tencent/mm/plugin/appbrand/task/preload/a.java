package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes7.dex */
public class a implements java.util.Comparator {
    public a(com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController appBrandBatchPreloadController) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return new java.lang.Float(((com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo) obj2).openRate).compareTo(new java.lang.Float(((com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo) obj).openRate));
    }
}
