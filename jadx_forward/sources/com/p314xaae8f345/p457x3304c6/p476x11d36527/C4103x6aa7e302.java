package com.p314xaae8f345.p457x3304c6.p476x11d36527;

/* renamed from: com.tencent.maas.material.MJMaterialCategory */
/* loaded from: classes5.dex */
public class C4103x6aa7e302 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.g f129751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129752b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129753c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f129754d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object[] f129755e;

    public C4103x6aa7e302(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        this.f129751a = com.p314xaae8f345.p457x3304c6.p476x11d36527.g.a(i17);
        this.f129752b = i18;
        this.f129753c = str;
        this.f129754d = str2;
        this.f129755e = objArr;
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = this.f129755e;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2) obj);
            }
        }
        return arrayList;
    }

    /* renamed from: toString */
    public java.lang.String m33799x9616526c() {
        return "MJMaterialCategory{materialScene=" + this.f129751a + ", categoryID=" + this.f129752b + ", categoryName='" + this.f129753c + "', previewImageURL='" + this.f129754d + "', materialInfoObjs=" + this.f129755e + '}';
    }
}
