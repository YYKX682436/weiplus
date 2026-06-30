package com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/storage/emotion/EmojiIPSetInfo;", "Ldm/u2;", "Landroid/os/Parcelable;", "<init>", "()V", "z85/g", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.storage.emotion.EmojiIPSetInfo */
/* loaded from: classes7.dex */
public final class C21052x34cf13a3 extends dm.u2 implements android.os.Parcelable {

    /* renamed from: v, reason: collision with root package name */
    public static final z85.g f275424v = new z85.g(null);

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f275425w = dm.u2.m125530x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3> f39213x681a0c0c = new z85.f();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.u2, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = f275425w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f68543x4b6e619a);
        parcel.writeString(this.f68545x29dd02d3);
        parcel.writeString(this.f68541x225aa2b6);
        parcel.writeString(this.f68542xd6403ff1);
        parcel.writeString(this.f68544x5cf9de70);
    }
}
