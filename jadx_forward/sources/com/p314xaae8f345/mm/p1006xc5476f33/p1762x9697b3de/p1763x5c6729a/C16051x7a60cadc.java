package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$AnchorLiveEntrance", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance */
/* loaded from: classes7.dex */
public final /* data */ class C16051x7a60cadc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16051x7a60cadc> f36979x681a0c0c = new j63.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f223545d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223546e;

    /* renamed from: f, reason: collision with root package name */
    public final long f223547f;

    public C16051x7a60cadc(int i17, int i18, long j17) {
        this.f223545d = i17;
        this.f223546e = i18;
        this.f223547f = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64868xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16051x7a60cadc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16051x7a60cadc c16051x7a60cadc = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16051x7a60cadc) obj;
        return this.f223545d == c16051x7a60cadc.f223545d && this.f223546e == c16051x7a60cadc.f223546e && this.f223547f == c16051x7a60cadc.f223547f;
    }

    /* renamed from: hashCode */
    public int m64869x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f223545d) * 31) + java.lang.Integer.hashCode(this.f223546e)) * 31) + java.lang.Long.hashCode(this.f223547f);
    }

    /* renamed from: toString */
    public java.lang.String m64870x9616526c() {
        return "AnchorLiveEntrance(id=" + this.f223545d + ", entranceType=" + this.f223546e + ", entranceId=" + this.f223547f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f223545d);
        out.writeInt(this.f223546e);
        out.writeLong(this.f223547f);
    }
}
