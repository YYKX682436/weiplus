package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveNetWorkPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveNetWorkPayload */
/* loaded from: classes3.dex */
public final /* data */ class C16057x7ce92f31 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16057x7ce92f31> f36985x681a0c0c = new j63.j();

    /* renamed from: d, reason: collision with root package name */
    public final int f223560d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223561e;

    public C16057x7ce92f31(int i17, int i18) {
        this.f223560d = i17;
        this.f223561e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64892xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16057x7ce92f31)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16057x7ce92f31 c16057x7ce92f31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16057x7ce92f31) obj;
        return this.f223560d == c16057x7ce92f31.f223560d && this.f223561e == c16057x7ce92f31.f223561e;
    }

    /* renamed from: hashCode */
    public int m64893x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f223560d) * 31) + java.lang.Integer.hashCode(this.f223561e);
    }

    /* renamed from: toString */
    public java.lang.String m64894x9616526c() {
        return "LiveNetWorkPayload(netQuality=" + this.f223560d + ", threshold=" + this.f223561e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f223560d);
        out.writeInt(this.f223561e);
    }
}
