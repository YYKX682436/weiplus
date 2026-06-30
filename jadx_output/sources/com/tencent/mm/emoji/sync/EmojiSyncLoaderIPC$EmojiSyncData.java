package com.tencent.mm.emoji.sync;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/emoji/sync/EmojiSyncLoaderIPC$EmojiSyncData", "Landroid/os/Parcelable;", "CREATOR", "pr/m0", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiSyncLoaderIPC$EmojiSyncData implements android.os.Parcelable {
    public static final pr.m0 CREATOR = new pr.m0(null);

    /* renamed from: d, reason: collision with root package name */
    public int f64925d;

    /* renamed from: e, reason: collision with root package name */
    public int f64926e;

    /* renamed from: f, reason: collision with root package name */
    public int f64927f;

    /* renamed from: g, reason: collision with root package name */
    public int f64928g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64929h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f64925d);
        parcel.writeInt(this.f64926e);
        parcel.writeInt(this.f64927f);
        parcel.writeInt(this.f64928g);
        parcel.writeByte(this.f64929h ? (byte) 1 : (byte) 0);
    }
}
