package com.p314xaae8f345.mm.p679x5c28046.p683x361a9b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/emoji/sync/EmojiSyncLoaderIPC$EmojiSyncData", "Landroid/os/Parcelable;", "CREATOR", "pr/m0", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData */
/* loaded from: classes15.dex */
public final class C10444x1291fbaf implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final pr.m0 f27841x681a0c0c = new pr.m0(null);

    /* renamed from: d, reason: collision with root package name */
    public int f146458d;

    /* renamed from: e, reason: collision with root package name */
    public int f146459e;

    /* renamed from: f, reason: collision with root package name */
    public int f146460f;

    /* renamed from: g, reason: collision with root package name */
    public int f146461g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f146462h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f146458d);
        parcel.writeInt(this.f146459e);
        parcel.writeInt(this.f146460f);
        parcel.writeInt(this.f146461g);
        parcel.writeByte(this.f146462h ? (byte) 1 : (byte) 0);
    }
}
