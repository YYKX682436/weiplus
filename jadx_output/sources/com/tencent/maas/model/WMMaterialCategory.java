package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class WMMaterialCategory {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.WMMaterialInfo.WMMaterialType f48344a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48345b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48346c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48347d;

    public WMMaterialCategory(int i17, long j17, java.lang.String str, java.lang.String str2) {
        this.f48344a = com.tencent.maas.model.WMMaterialInfo.WMMaterialType.a(i17);
        this.f48345b = j17;
        this.f48346c = str;
        this.f48347d = str2;
    }

    public long getCategoryID() {
        return this.f48345b;
    }

    public java.lang.String getCategoryName() {
        return this.f48346c;
    }

    public com.tencent.maas.model.WMMaterialInfo.WMMaterialType getMaterialType() {
        return this.f48344a;
    }

    public java.lang.String getThumbnailURL() {
        return this.f48347d;
    }

    public java.lang.String toString() {
        return "MJMaterialCategory{materialType=" + this.f48344a + ", categoryID='" + this.f48345b + "', categoryName='" + this.f48346c + "', thumbnailURL='" + this.f48347d + "'}";
    }
}
