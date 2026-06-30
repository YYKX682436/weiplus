package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJTemplateRecommendResult {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48331a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48332b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f48333c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48334d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f48335e;

    public MJTemplateRecommendResult(boolean z17, java.lang.String str, java.lang.Object[] objArr, boolean z18, java.lang.Object[] objArr2) {
        this.f48331a = z17;
        this.f48332b = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.tencent.maas.model.MJTemplateCategory) obj);
            }
        }
        this.f48333c = arrayList;
        this.f48334d = z18;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (objArr2 != null) {
            for (java.lang.Object obj2 : objArr2) {
                arrayList2.add((com.tencent.maas.model.MJTemplateInfo) obj2);
            }
        }
        this.f48335e = arrayList2;
    }

    public java.util.List<com.tencent.maas.model.MJTemplateInfo> getAdditionTemplateInfos() {
        return this.f48335e;
    }

    public java.util.List<com.tencent.maas.model.MJTemplateCategory> getCategories() {
        return this.f48333c;
    }

    public java.lang.String getPagingContext() {
        return this.f48332b;
    }

    public boolean isEnableSingleTemplateMusicRec() {
        return this.f48334d;
    }

    public boolean isHasMoreTemplates() {
        return this.f48331a;
    }
}
