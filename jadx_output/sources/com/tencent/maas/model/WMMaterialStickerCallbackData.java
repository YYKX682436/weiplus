package com.tencent.maas.model;

/* loaded from: classes.dex */
public class WMMaterialStickerCallbackData {

    /* renamed from: a, reason: collision with root package name */
    public final long f48359a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f48360b = new java.util.ArrayList();

    public WMMaterialStickerCallbackData(long j17, java.lang.Object[] objArr) {
        this.f48359a = j17;
        for (java.lang.Object obj : objArr) {
            this.f48360b.add((com.tencent.maas.model.WMMaterialInfo) obj);
        }
    }

    public long getCategoryID() {
        return this.f48359a;
    }

    public java.util.List<com.tencent.maas.model.WMMaterialInfo> getMaterialInfos() {
        return this.f48360b;
    }
}
