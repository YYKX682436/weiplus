package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class MJMaterialCategory {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.g f48218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48219b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48220c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48221d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object[] f48222e;

    public MJMaterialCategory(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        this.f48218a = com.tencent.maas.material.g.a(i17);
        this.f48219b = i18;
        this.f48220c = str;
        this.f48221d = str2;
        this.f48222e = objArr;
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = this.f48222e;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.tencent.maas.material.MJMaterialInfo) obj);
            }
        }
        return arrayList;
    }

    public java.lang.String toString() {
        return "MJMaterialCategory{materialScene=" + this.f48218a + ", categoryID=" + this.f48219b + ", categoryName='" + this.f48220c + "', previewImageURL='" + this.f48221d + "', materialInfoObjs=" + this.f48222e + '}';
    }
}
