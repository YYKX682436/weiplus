package com.p314xaae8f345.mm.p957x53236a1b;

/* renamed from: com.tencent.mm.modelsimple.BindWordingContent */
/* loaded from: classes12.dex */
public class C11133xdc5bf27e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e> f32568x681a0c0c = new com.p314xaae8f345.mm.p957x53236a1b.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152809d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152810e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f152811f;

    public C11133xdc5bf27e(java.lang.String str, java.lang.String str2) {
        this.f152809d = "";
        this.f152810e = "";
        this.f152811f = 0;
        this.f152809d = str;
        this.f152810e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringArray(new java.lang.String[]{this.f152809d, this.f152810e});
        parcel.writeInt(this.f152811f.intValue());
    }

    public C11133xdc5bf27e(android.os.Parcel parcel) {
        this.f152809d = "";
        this.f152810e = "";
        this.f152811f = 0;
        java.lang.String[] strArr = new java.lang.String[2];
        parcel.readStringArray(strArr);
        this.f152809d = strArr[0];
        this.f152810e = strArr[1];
        this.f152811f = java.lang.Integer.valueOf(parcel.readInt());
    }
}
