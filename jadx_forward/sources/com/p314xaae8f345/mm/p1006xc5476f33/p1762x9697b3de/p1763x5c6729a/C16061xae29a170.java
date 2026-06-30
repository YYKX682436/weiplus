package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveTopicPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload */
/* loaded from: classes7.dex */
public final /* data */ class C16061xae29a170 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16061xae29a170> f36989x681a0c0c = new j63.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f223601d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f223602e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f223603f;

    public C16061xae29a170(java.lang.String topic, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        this.f223601d = topic;
        this.f223602e = z17;
        this.f223603f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64908xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16061xae29a170)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16061xae29a170 c16061xae29a170 = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16061xae29a170) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223601d, c16061xae29a170.f223601d) && this.f223602e == c16061xae29a170.f223602e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223603f, c16061xae29a170.f223603f);
    }

    /* renamed from: hashCode */
    public int m64909x8cdac1b() {
        int hashCode = ((this.f223601d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f223602e)) * 31;
        java.lang.String str = this.f223603f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m64910x9616526c() {
        return "LiveTopicPayload(topic=" + this.f223601d + ", ret=" + this.f223602e + ", errMsg=" + this.f223603f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f223601d);
        out.writeInt(this.f223602e ? 1 : 0);
        out.writeString(this.f223603f);
    }
}
