package com.p314xaae8f345.mm.p617xd6d92827.p620x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/util/MagicAdPushMsg;", "Landroid/os/Parcelable;", "ad-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.util.MagicAdPushMsg */
/* loaded from: classes.dex */
public final /* data */ class C4983x817cf557 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.p620x36f002.C4983x817cf557> f21394x681a0c0c = new ik.g();

    /* renamed from: d, reason: collision with root package name */
    public final int f134716d;

    /* renamed from: e, reason: collision with root package name */
    public final long f134717e;

    /* renamed from: f, reason: collision with root package name */
    public final long f134718f;

    /* renamed from: g, reason: collision with root package name */
    public final long f134719g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f134720h;

    public C4983x817cf557(int i17, long j17, long j18, long j19, java.lang.String traceid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceid, "traceid");
        this.f134716d = i17;
        this.f134717e = j17;
        this.f134718f = j18;
        this.f134719g = j19;
        this.f134720h = traceid;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42912xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p617xd6d92827.p620x36f002.C4983x817cf557)) {
            return false;
        }
        com.p314xaae8f345.mm.p617xd6d92827.p620x36f002.C4983x817cf557 c4983x817cf557 = (com.p314xaae8f345.mm.p617xd6d92827.p620x36f002.C4983x817cf557) obj;
        return this.f134716d == c4983x817cf557.f134716d && this.f134717e == c4983x817cf557.f134717e && this.f134718f == c4983x817cf557.f134718f && this.f134719g == c4983x817cf557.f134719g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134720h, c4983x817cf557.f134720h);
    }

    /* renamed from: hashCode */
    public int m42913x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f134716d) * 31) + java.lang.Long.hashCode(this.f134717e)) * 31) + java.lang.Long.hashCode(this.f134718f)) * 31) + java.lang.Long.hashCode(this.f134719g)) * 31) + this.f134720h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m42914x9616526c() {
        return "MagicAdPushMsg(opcpde=" + this.f134716d + ", aid=" + this.f134717e + ", slotid=" + this.f134718f + ", op_time=" + this.f134719g + ", traceid=" + this.f134720h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f134716d);
        out.writeLong(this.f134717e);
        out.writeLong(this.f134718f);
        out.writeLong(this.f134719g);
        out.writeString(this.f134720h);
    }
}
