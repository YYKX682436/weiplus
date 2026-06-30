package com.tencent.mm.plugin.appbrand.game.cgipkg;

/* loaded from: classes7.dex */
public class GameMenuParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.game.cgipkg.GameMenuParcel> CREATOR = new ga1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78199d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.lg3 f78200e;

    public GameMenuParcel(android.os.Parcel parcel, ga1.a aVar) {
        this.f78199d = parcel.readString();
        this.f78200e = (r45.lg3) com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78199d);
        com.tencent.mm.ipcinvoker.extension.c.d(this.f78200e, parcel);
    }
}
