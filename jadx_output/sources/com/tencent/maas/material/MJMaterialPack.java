package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class MJMaterialPack {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.g f48232a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f48233b;

    public MJMaterialPack(int i17, java.lang.Object[] objArr) {
        this.f48232a = com.tencent.maas.material.g.a(i17);
        this.f48233b = objArr;
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = this.f48233b;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.tencent.maas.material.MJMaterialCategory) obj);
            }
        }
        return arrayList;
    }

    public java.lang.String toString() {
        return "MJMaterialPack{materialScene=" + this.f48232a + ", categorieObjs=" + this.f48233b + '}';
    }
}
