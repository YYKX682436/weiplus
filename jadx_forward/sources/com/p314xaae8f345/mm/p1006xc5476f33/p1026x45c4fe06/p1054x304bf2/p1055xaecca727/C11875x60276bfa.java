package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1055xaecca727;

/* renamed from: com.tencent.mm.plugin.appbrand.game.cgipkg.GameMenuParcel */
/* loaded from: classes7.dex */
public class C11875x60276bfa implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1055xaecca727.C11875x60276bfa> f33627x681a0c0c = new ga1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f159732d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.lg3 f159733e;

    public C11875x60276bfa(android.os.Parcel parcel, ga1.a aVar) {
        this.f159732d = parcel.readString();
        this.f159733e = (r45.lg3) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f159732d);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.d(this.f159733e, parcel);
    }
}
