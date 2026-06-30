package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageExportResult {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f48057a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f48058b;

    public MJImageExportResult(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        this.f48057a = map;
        this.f48058b = map2;
    }

    public java.util.Map<java.lang.String, java.lang.String> getOutputImageFilePathsBySceneID() {
        return this.f48057a;
    }

    public java.util.Map<java.lang.String, java.lang.String> getOutputVideoFilePathsBySceneID() {
        return this.f48058b;
    }
}
