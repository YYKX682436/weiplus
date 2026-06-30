package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.QQMailHistoryExporter$ImageSpanData */
/* loaded from: classes16.dex */
public class C21635x4bbf5569 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21635x4bbf5569> f39416x681a0c0c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.bc();

    /* renamed from: d, reason: collision with root package name */
    public int f279831d;

    /* renamed from: e, reason: collision with root package name */
    public int f279832e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279833f;

    /* renamed from: g, reason: collision with root package name */
    public int f279834g = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f279831d);
        parcel.writeInt(this.f279832e);
        parcel.writeString(this.f279833f);
        parcel.writeInt(this.f279834g);
    }
}
