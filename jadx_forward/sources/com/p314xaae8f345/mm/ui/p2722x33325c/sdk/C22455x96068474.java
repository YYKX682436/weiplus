package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient */
/* loaded from: classes13.dex */
public class C22455x96068474 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474> f39604x681a0c0c = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.v();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60[] f290700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f290701e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request f290702f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f290703g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f290704h;

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$Result */
    /* loaded from: classes13.dex */
    public static class Result implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Result> f39606x681a0c0c = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.x();

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.y f290714d;

        /* renamed from: e, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5 f290715e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f290716f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f290717g;

        /* renamed from: h, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request f290718h;

        /* renamed from: i, reason: collision with root package name */
        public final java.util.Map f290719i;

        /* renamed from: m, reason: collision with root package name */
        public final java.util.Map f290720m;

        public Result(android.os.Parcel parcel, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.v vVar) {
            this.f290714d = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.y.m80809xdce0328(parcel.readString());
            this.f290715e = (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5) parcel.readParcelable(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5.class.getClassLoader());
            this.f290716f = parcel.readString();
            this.f290717g = parcel.readString();
            this.f290718h = (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request) parcel.readParcelable(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request.class.getClassLoader());
            this.f290719i = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22454x642d6fa4.b(parcel);
            this.f290720m = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22454x642d6fa4.b(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f290714d.name());
            parcel.writeParcelable(this.f290715e, i17);
            parcel.writeString(this.f290716f);
            parcel.writeString(this.f290717g);
            parcel.writeParcelable(this.f290718h, i17);
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60.a(parcel, this.f290719i);
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60.a(parcel, this.f290720m);
        }
    }

    public C22455x96068474(android.app.Activity activity) {
        this.f290701e = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelableArray(this.f290700d, i17);
        parcel.writeInt(this.f290701e);
        parcel.writeParcelable(this.f290702f, i17);
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60.a(parcel, this.f290703g);
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60.a(parcel, this.f290704h);
    }

    public C22455x96068474(android.os.Parcel parcel) {
        this.f290701e = -1;
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60.class.getClassLoader());
        this.f290700d = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60[readParcelableArray.length];
        for (int i17 = 0; i17 < readParcelableArray.length; i17++) {
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60[] abstractC22456xe50d9e60Arr = this.f290700d;
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60 abstractC22456xe50d9e60 = (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60) readParcelableArray[i17];
            abstractC22456xe50d9e60Arr[i17] = abstractC22456xe50d9e60;
            if (abstractC22456xe50d9e60.f290722e == null) {
                abstractC22456xe50d9e60.f290722e = this;
            } else {
                throw new java.lang.RuntimeException("Can't set LoginClient if it is already set.");
            }
        }
        this.f290701e = parcel.readInt();
        this.f290702f = (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request) parcel.readParcelable(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request.class.getClassLoader());
        this.f290703g = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22454x642d6fa4.b(parcel);
        this.f290704h = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22454x642d6fa4.b(parcel);
    }

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$Request */
    /* loaded from: classes13.dex */
    public static class Request implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request> f39605x681a0c0c = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.w();

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.u f290705d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.Set f290706e;

        /* renamed from: f, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.g f290707f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f290708g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.String f290709h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f290710i;

        /* renamed from: m, reason: collision with root package name */
        public final java.lang.String f290711m;

        /* renamed from: n, reason: collision with root package name */
        public final java.lang.String f290712n;

        /* renamed from: o, reason: collision with root package name */
        public final java.lang.String f290713o;

        public Request(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.u uVar, java.util.Set set, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f290710i = false;
            this.f290705d = uVar;
            this.f290706e = set == null ? new java.util.HashSet() : set;
            this.f290707f = gVar;
            this.f290712n = str;
            this.f290708g = str2;
            this.f290709h = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.u uVar = this.f290705d;
            parcel.writeString(uVar != null ? uVar.name() : null);
            parcel.writeStringList(new java.util.ArrayList(this.f290706e));
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.g gVar = this.f290707f;
            parcel.writeString(gVar != null ? gVar.name() : null);
            parcel.writeString(this.f290708g);
            parcel.writeString(this.f290709h);
            parcel.writeByte(this.f290710i ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f290711m);
            parcel.writeString(this.f290712n);
            parcel.writeString(this.f290713o);
        }

        public Request(android.os.Parcel parcel, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.v vVar) {
            this.f290710i = false;
            java.lang.String readString = parcel.readString();
            this.f290705d = readString != null ? com.p314xaae8f345.mm.ui.p2722x33325c.sdk.u.m80806xdce0328(readString) : null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            parcel.readStringList(arrayList);
            this.f290706e = new java.util.HashSet(arrayList);
            java.lang.String readString2 = parcel.readString();
            this.f290707f = readString2 != null ? com.p314xaae8f345.mm.ui.p2722x33325c.sdk.g.m80798xdce0328(readString2) : null;
            this.f290708g = parcel.readString();
            this.f290709h = parcel.readString();
            this.f290710i = parcel.readByte() != 0;
            this.f290711m = parcel.readString();
            this.f290712n = parcel.readString();
            this.f290713o = parcel.readString();
        }
    }
}
