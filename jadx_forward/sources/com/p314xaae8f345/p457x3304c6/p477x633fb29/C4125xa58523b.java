package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.WMMaterialCategory */
/* loaded from: classes5.dex */
public class C4125xa58523b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType f129877a;

    /* renamed from: b, reason: collision with root package name */
    public final long f129878b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129879c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f129880d;

    public C4125xa58523b(int i17, long j17, java.lang.String str, java.lang.String str2) {
        this.f129877a = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType.a(i17);
        this.f129878b = j17;
        this.f129879c = str;
        this.f129880d = str2;
    }

    /* renamed from: getCategoryID */
    public long m33945x3b88368f() {
        return this.f129878b;
    }

    /* renamed from: getCategoryName */
    public java.lang.String m33946x7a578f1f() {
        return this.f129879c;
    }

    /* renamed from: getMaterialType */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType m33947xe2d90f77() {
        return this.f129877a;
    }

    /* renamed from: getThumbnailURL */
    public java.lang.String m33948x4baed359() {
        return this.f129880d;
    }

    /* renamed from: toString */
    public java.lang.String m33949x9616526c() {
        return "MJMaterialCategory{materialType=" + this.f129877a + ", categoryID='" + this.f129878b + "', categoryName='" + this.f129879c + "', thumbnailURL='" + this.f129880d + "'}";
    }
}
