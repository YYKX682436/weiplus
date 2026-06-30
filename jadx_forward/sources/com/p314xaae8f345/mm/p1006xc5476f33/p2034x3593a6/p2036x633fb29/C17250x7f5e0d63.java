package com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosQuickReply;", "Landroid/os/Parcelable;", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.rtos.model.RtosQuickReply */
/* loaded from: classes11.dex */
public final /* data */ class C17250x7f5e0d63 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63> f37908x681a0c0c = new jy3.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f240115d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f240116e;

    public C17250x7f5e0d63(int i17, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f240115d = i17;
        this.f240116e = msg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m68506xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63 c17250x7f5e0d63 = (com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63) obj;
        return this.f240115d == c17250x7f5e0d63.f240115d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f240116e, c17250x7f5e0d63.f240116e);
    }

    /* renamed from: hashCode */
    public int m68507x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f240115d) * 31) + this.f240116e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m68508x9616526c() {
        return "RtosQuickReply(index=" + this.f240115d + ", msg=" + this.f240116e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f240115d);
        out.writeString(this.f240116e);
    }
}
