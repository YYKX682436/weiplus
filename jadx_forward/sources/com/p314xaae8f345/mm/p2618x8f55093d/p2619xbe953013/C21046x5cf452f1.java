package com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/sticker/loader/StickerLoadInfo;", "Landroid/os/Parcelable;", "plugin-sticker_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sticker.loader.StickerLoadInfo */
/* loaded from: classes10.dex */
public final class C21046x5cf452f1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1> f39202x681a0c0c = new u85.j();

    /* renamed from: d, reason: collision with root package name */
    public final int f275222d;

    /* renamed from: h, reason: collision with root package name */
    public int f275226h;

    /* renamed from: m, reason: collision with root package name */
    public int f275228m;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275223e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f275224f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f275225g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275227i = "";

    public C21046x5cf452f1(int i17) {
        this.f275222d = i17;
    }

    public final java.lang.String a() {
        if (this.f275222d == 0) {
            return this.f275223e;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f275227i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return a17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f275222d);
        dest.writeString(this.f275223e);
        dest.writeString(this.f275224f);
        dest.writeString(this.f275225g);
        dest.writeInt(this.f275226h);
        dest.writeString(this.f275227i);
        dest.writeInt(this.f275228m);
    }
}
