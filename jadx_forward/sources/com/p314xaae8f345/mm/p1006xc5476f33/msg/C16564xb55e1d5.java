package com.p314xaae8f345.mm.p1006xc5476f33.msg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/msg/MsgIdTalker;", "Landroid/os/Parcelable;", "oi3/b", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.msg.MsgIdTalker */
/* loaded from: classes9.dex */
public final class C16564xb55e1d5 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final long f231013d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f231014e;

    /* renamed from: f, reason: collision with root package name */
    public static final oi3.b f231011f = new oi3.b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f231012g = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(0, null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5> f37684x681a0c0c = new oi3.a();

    public C16564xb55e1d5(long j17, java.lang.String str) {
        this.f231013d = j17;
        this.f231014e = str;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f231014e;
        return str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66993xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) obj;
        return this.f231013d == c16564xb55e1d5.f231013d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a(), c16564xb55e1d5.a());
    }

    /* renamed from: hashCode */
    public int m66994x8cdac1b() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.f231013d), a());
    }

    /* renamed from: toString */
    public java.lang.String m66995x9616526c() {
        return this.f231013d + ", " + this.f231014e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeLong(this.f231013d);
        parcel.writeString(this.f231014e);
    }
}
