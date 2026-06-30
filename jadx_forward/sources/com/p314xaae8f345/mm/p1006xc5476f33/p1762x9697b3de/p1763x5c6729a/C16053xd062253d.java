package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload */
/* loaded from: classes4.dex */
public final /* data */ class C16053xd062253d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16053xd062253d> f36981x681a0c0c = new j63.f();

    /* renamed from: d, reason: collision with root package name */
    public final int f223554d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f223555e;

    public C16053xd062253d(int i17, java.lang.String str) {
        this.f223554d = i17;
        this.f223555e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64876xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16053xd062253d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16053xd062253d c16053xd062253d = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16053xd062253d) obj;
        return this.f223554d == c16053xd062253d.f223554d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223555e, c16053xd062253d.f223555e);
    }

    /* renamed from: hashCode */
    public int m64877x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f223554d) * 31;
        java.lang.String str = this.f223555e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m64878x9616526c() {
        return "LiveCurrentRoomInfoPayload(startTime=" + this.f223554d + ", topic=" + this.f223555e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f223554d);
        out.writeString(this.f223555e);
    }
}
