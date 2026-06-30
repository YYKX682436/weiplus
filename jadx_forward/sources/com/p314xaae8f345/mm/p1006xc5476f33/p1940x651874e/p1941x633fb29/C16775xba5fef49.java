package com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29;

/* renamed from: com.tencent.mm.plugin.order.model.ProductSectionItem */
/* loaded from: classes9.dex */
public class C16775xba5fef49 implements android.os.Parcelable {

    /* renamed from: CREATER */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49> f37716x681a0ad6 = new dp3.s();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f234342d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f234343e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f234344f;

    /* renamed from: g, reason: collision with root package name */
    public int f234345g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f234346h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f234347i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f234348m;

    /* renamed from: n, reason: collision with root package name */
    public int f234349n;

    /* renamed from: com.tencent.mm.plugin.order.model.ProductSectionItem$Skus */
    /* loaded from: classes9.dex */
    public static class Skus implements android.os.Parcelable {

        /* renamed from: CREATER */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus> f37717x681a0ad6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.b();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f234350d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f234351e;

        public Skus(android.os.Parcel parcel) {
            this.f234350d = parcel.readString();
            this.f234351e = parcel.readString();
        }

        public static java.lang.String a(java.util.List list) {
            if (list == null || list.size() == 0) {
                return "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus skus = (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus) list.get(i17);
                if (i17 != 0) {
                    sb6.append("、");
                }
                sb6.append(skus.f234351e);
            }
            return sb6.toString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f234350d);
            parcel.writeString(this.f234351e);
        }
    }

    public C16775xba5fef49(android.os.Parcel parcel) {
        this.f234342d = parcel.readString();
        this.f234343e = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f234344f = new java.util.ArrayList();
            for (int i17 = 0; i17 < readInt; i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus skus = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus();
                skus.f234350d = parcel.readString();
                skus.f234351e = parcel.readString();
                this.f234344f.add(skus);
            }
        }
        this.f234345g = parcel.readInt();
        this.f234346h = parcel.readString();
        this.f234347i = parcel.readString();
        this.f234348m = parcel.readString();
        this.f234349n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f234342d);
        parcel.writeString(this.f234343e);
        java.util.List list = this.f234344f;
        if (list != null) {
            parcel.writeInt(list.size());
            for (int i18 = 0; i18 < this.f234344f.size(); i18++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus skus = (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus) this.f234344f.get(i18);
                parcel.writeString(skus.f234350d);
                parcel.writeString(skus.f234351e);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f234345g);
        parcel.writeString(this.f234346h);
        parcel.writeString(this.f234347i);
        parcel.writeString(this.f234348m);
        parcel.writeInt(this.f234349n);
    }
}
