package com.tencent.mm.feature.yuanbao;

/* loaded from: classes8.dex */
public class IYuanBaoAgreement$AgreementInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo> CREATOR = new vh0.b1();

    /* renamed from: d, reason: collision with root package name */
    public final int f67859d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67860e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f67861f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67862g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f67863h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f67864i;

    public IYuanBaoAgreement$AgreementInfo(int i17, java.lang.String str, java.lang.String str2, int i18, boolean z17, boolean z18) {
        this.f67859d = i17;
        this.f67860e = str;
        this.f67861f = str2;
        this.f67862g = i18;
        this.f67863h = z17;
        this.f67864i = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f67859d);
        parcel.writeString(this.f67860e);
        parcel.writeString(this.f67861f);
        parcel.writeInt(this.f67862g);
        parcel.writeInt(this.f67863h ? 1 : 0);
        parcel.writeInt(this.f67864i ? 1 : 0);
    }

    public IYuanBaoAgreement$AgreementInfo(android.os.Parcel parcel) {
        this.f67859d = parcel.readInt();
        this.f67860e = parcel.readString();
        this.f67861f = parcel.readString();
        this.f67862g = parcel.readInt();
        this.f67863h = parcel.readInt() != 0;
        this.f67864i = parcel.readInt() != 0;
    }
}
