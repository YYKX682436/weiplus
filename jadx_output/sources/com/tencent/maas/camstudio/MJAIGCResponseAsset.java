package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCResponseAsset {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f47843a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.i f47844b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f47845c;

    public MJAIGCResponseAsset(java.util.List list, com.tencent.maas.camstudio.i iVar, java.util.Map map) {
        this.f47843a = list;
        this.f47844b = iVar;
        this.f47845c = map;
    }

    public java.util.Map<java.lang.String, java.lang.String> getExtraParams() {
        return this.f47845c;
    }

    public java.util.List<com.tencent.maas.camstudio.MJAIGCResponseMediaFile> getMediaFiles() {
        return this.f47843a;
    }

    public int getSpliceTypeValue() {
        return this.f47844b.f47962d;
    }
}
