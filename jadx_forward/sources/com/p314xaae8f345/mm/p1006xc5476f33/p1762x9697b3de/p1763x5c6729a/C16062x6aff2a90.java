package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$SimpleLiveStateChangePayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload */
/* loaded from: classes.dex */
public final /* data */ class C16062x6aff2a90 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16062x6aff2a90> f36990x681a0c0c = new j63.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f223604d;

    public C16062x6aff2a90(java.util.Map data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f223604d = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64912xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16062x6aff2a90) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223604d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16062x6aff2a90) obj).f223604d);
    }

    /* renamed from: hashCode */
    public int m64913x8cdac1b() {
        return this.f223604d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m64914x9616526c() {
        return "SimpleLiveStateChangePayload(data=" + this.f223604d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.Map map = this.f223604d;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeInt(((java.lang.Number) entry.getValue()).intValue());
        }
    }
}
