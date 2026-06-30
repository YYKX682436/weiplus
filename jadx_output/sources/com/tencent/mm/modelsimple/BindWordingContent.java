package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class BindWordingContent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelsimple.BindWordingContent> CREATOR = new com.tencent.mm.modelsimple.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f71276d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71277e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f71278f;

    public BindWordingContent(java.lang.String str, java.lang.String str2) {
        this.f71276d = "";
        this.f71277e = "";
        this.f71278f = 0;
        this.f71276d = str;
        this.f71277e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringArray(new java.lang.String[]{this.f71276d, this.f71277e});
        parcel.writeInt(this.f71278f.intValue());
    }

    public BindWordingContent(android.os.Parcel parcel) {
        this.f71276d = "";
        this.f71277e = "";
        this.f71278f = 0;
        java.lang.String[] strArr = new java.lang.String[2];
        parcel.readStringArray(strArr);
        this.f71276d = strArr[0];
        this.f71277e = strArr[1];
        this.f71278f = java.lang.Integer.valueOf(parcel.readInt());
    }
}
