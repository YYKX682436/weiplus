package com.p314xaae8f345.mm.p965xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/NotifySwitchItem;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.NotifySwitchItem */
/* loaded from: classes9.dex */
public final /* data */ class C11155xafcbdcb0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0> f32575x681a0c0c = new d31.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f153300d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f153301e;

    /* renamed from: f, reason: collision with root package name */
    public final int f153302f;

    public C11155xafcbdcb0(java.lang.String bizUsername, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        this.f153300d = bizUsername;
        this.f153301e = z17;
        this.f153302f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48308xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0)) {
            return false;
        }
        com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0 c11155xafcbdcb0 = (com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f153300d, c11155xafcbdcb0.f153300d) && this.f153301e == c11155xafcbdcb0.f153301e && this.f153302f == c11155xafcbdcb0.f153302f;
    }

    /* renamed from: hashCode */
    public int m48309x8cdac1b() {
        return (((this.f153300d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f153301e)) * 31) + java.lang.Integer.hashCode(this.f153302f);
    }

    /* renamed from: toString */
    public java.lang.String m48310x9616526c() {
        return "NotifySwitchItem(bizUsername=" + this.f153300d + ", isOpen=" + this.f153301e + ", importantNotifyNum=" + this.f153302f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f153300d);
        out.writeInt(this.f153301e ? 1 : 0);
        out.writeInt(this.f153302f);
    }
}
