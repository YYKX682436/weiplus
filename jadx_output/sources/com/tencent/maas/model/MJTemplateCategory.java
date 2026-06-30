package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJTemplateCategory {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48299a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48300b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48301c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48302d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48303e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f48304f;

    public MJTemplateCategory(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.Object[] objArr) {
        this.f48299a = str;
        this.f48300b = str2;
        this.f48301c = str3;
        this.f48302d = i17;
        this.f48303e = i18;
        this.f48304f = objArr;
    }

    public java.lang.String getCategoryID() {
        return this.f48299a;
    }

    public int getCategoryType() {
        return this.f48303e;
    }

    public java.lang.String getDisplayName() {
        return this.f48301c;
    }

    public int getFoldIndex() {
        return this.f48302d;
    }

    public java.lang.Object[] getTemplateInfoObjs() {
        return this.f48304f;
    }

    public java.util.List<com.tencent.maas.model.MJTemplateInfo> getTemplateInfos() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = this.f48304f;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.tencent.maas.model.MJTemplateInfo) obj);
            }
        }
        return arrayList;
    }

    public java.lang.String getThumbnailURL() {
        return this.f48300b;
    }
}
