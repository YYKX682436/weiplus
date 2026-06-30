package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* renamed from: com.tencent.mm.ui.widget.snackbar.Snack */
/* loaded from: classes10.dex */
class C22720x4c5182e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22720x4c5182e> f39758x681a0c0c = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f293984d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f293985e;

    /* renamed from: f, reason: collision with root package name */
    public final int f293986f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Parcelable f293987g;

    /* renamed from: h, reason: collision with root package name */
    public final int f293988h;

    /* renamed from: i, reason: collision with root package name */
    public final int f293989i;

    /* renamed from: m, reason: collision with root package name */
    public final int f293990m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f293991n;

    public C22720x4c5182e(java.lang.String str, java.lang.String str2, int i17, android.os.Parcelable parcelable, int i18, int i19, int i27, android.view.View view) {
        this.f293984d = str;
        this.f293985e = str2;
        this.f293986f = i17;
        this.f293987g = parcelable;
        this.f293988h = i18;
        this.f293989i = i19;
        this.f293990m = i27;
        this.f293991n = view;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f293984d);
        parcel.writeString(this.f293985e);
        parcel.writeInt(this.f293986f);
        parcel.writeParcelable(this.f293987g, 0);
        parcel.writeInt(this.f293988h);
        parcel.writeInt(this.f293989i);
        parcel.writeInt(this.f293990m);
    }

    public C22720x4c5182e(android.os.Parcel parcel) {
        this.f293984d = parcel.readString();
        this.f293985e = parcel.readString();
        this.f293986f = parcel.readInt();
        this.f293987g = parcel.readParcelable(parcel.getClass().getClassLoader());
        this.f293988h = (short) parcel.readInt();
        this.f293989i = parcel.readInt();
        this.f293990m = parcel.readInt();
    }
}
