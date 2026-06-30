package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.MJTemplateRecommendResult */
/* loaded from: classes5.dex */
public class C4123xc221bdc2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129864a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129865b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f129866c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f129867d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f129868e;

    public C4123xc221bdc2(boolean z17, java.lang.String str, java.lang.Object[] objArr, boolean z18, java.lang.Object[] objArr2) {
        this.f129864a = z17;
        this.f129865b = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4120x4de84755) obj);
            }
        }
        this.f129866c = arrayList;
        this.f129867d = z18;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (objArr2 != null) {
            for (java.lang.Object obj2 : objArr2) {
                arrayList2.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) obj2);
            }
        }
        this.f129868e = arrayList2;
    }

    /* renamed from: getAdditionTemplateInfos */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285> m33924x7c2431d9() {
        return this.f129868e;
    }

    /* renamed from: getCategories */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4120x4de84755> m33925x3b87fe12() {
        return this.f129866c;
    }

    /* renamed from: getPagingContext */
    public java.lang.String m33926x38161ccd() {
        return this.f129865b;
    }

    /* renamed from: isEnableSingleTemplateMusicRec */
    public boolean m33927x1ee84eda() {
        return this.f129867d;
    }

    /* renamed from: isHasMoreTemplates */
    public boolean m33928x7fc17c34() {
        return this.f129864a;
    }
}
