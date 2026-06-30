package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveMemberInfoPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload */
/* loaded from: classes7.dex */
public final /* data */ class C16056x72b57895 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895> f36984x681a0c0c = new j63.i();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f223558d;

    /* renamed from: e, reason: collision with root package name */
    public int f223559e;

    public C16056x72b57895(java.lang.String str, int i17) {
        this.f223558d = str;
        this.f223559e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64888xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895 c16056x72b57895 = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223558d, c16056x72b57895.f223558d) && this.f223559e == c16056x72b57895.f223559e;
    }

    /* renamed from: hashCode */
    public int m64889x8cdac1b() {
        java.lang.String str = this.f223558d;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f223559e);
    }

    /* renamed from: toString */
    public java.lang.String m64890x9616526c() {
        return "LiveMemberInfoPayload(nickname=" + this.f223558d + ", rewardAmountInHeat=" + this.f223559e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f223558d);
        out.writeInt(this.f223559e);
    }
}
