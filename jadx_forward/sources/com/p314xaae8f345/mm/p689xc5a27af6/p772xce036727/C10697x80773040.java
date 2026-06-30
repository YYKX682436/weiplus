package com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727;

/* renamed from: com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo */
/* loaded from: classes8.dex */
public class C10697x80773040 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040> f28937x681a0c0c = new vh0.b1();

    /* renamed from: d, reason: collision with root package name */
    public final int f149392d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f149393e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f149394f;

    /* renamed from: g, reason: collision with root package name */
    public final int f149395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f149396h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f149397i;

    public C10697x80773040(int i17, java.lang.String str, java.lang.String str2, int i18, boolean z17, boolean z18) {
        this.f149392d = i17;
        this.f149393e = str;
        this.f149394f = str2;
        this.f149395g = i18;
        this.f149396h = z17;
        this.f149397i = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f149392d);
        parcel.writeString(this.f149393e);
        parcel.writeString(this.f149394f);
        parcel.writeInt(this.f149395g);
        parcel.writeInt(this.f149396h ? 1 : 0);
        parcel.writeInt(this.f149397i ? 1 : 0);
    }

    public C10697x80773040(android.os.Parcel parcel) {
        this.f149392d = parcel.readInt();
        this.f149393e = parcel.readString();
        this.f149394f = parcel.readString();
        this.f149395g = parcel.readInt();
        this.f149396h = parcel.readInt() != 0;
        this.f149397i = parcel.readInt() != 0;
    }
}
