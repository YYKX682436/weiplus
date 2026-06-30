package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.MJTemplateCategory */
/* loaded from: classes5.dex */
public class C4120x4de84755 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129832a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129833b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129834c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129835d;

    /* renamed from: e, reason: collision with root package name */
    public final int f129836e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f129837f;

    public C4120x4de84755(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.Object[] objArr) {
        this.f129832a = str;
        this.f129833b = str2;
        this.f129834c = str3;
        this.f129835d = i17;
        this.f129836e = i18;
        this.f129837f = objArr;
    }

    /* renamed from: getCategoryID */
    public java.lang.String m33883x3b88368f() {
        return this.f129832a;
    }

    /* renamed from: getCategoryType */
    public int m33884x7a5aa3ce() {
        return this.f129836e;
    }

    /* renamed from: getDisplayName */
    public java.lang.String m33885x40021d37() {
        return this.f129834c;
    }

    /* renamed from: getFoldIndex */
    public int m33886x1d51f69b() {
        return this.f129835d;
    }

    /* renamed from: getTemplateInfoObjs */
    public java.lang.Object[] m33887xbe97423a() {
        return this.f129837f;
    }

    /* renamed from: getTemplateInfos */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285> m33888xb16bed75() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = this.f129837f;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) obj);
            }
        }
        return arrayList;
    }

    /* renamed from: getThumbnailURL */
    public java.lang.String m33889x4baed359() {
        return this.f129833b;
    }
}
