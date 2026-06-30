package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1765xc84b4196;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/render/GameLiveAppbrandRenderMgrService$Payload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload */
/* loaded from: classes5.dex */
public final /* data */ class C16072xd300b5e1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1765xc84b4196.C16072xd300b5e1> f36992x681a0c0c = new k63.q();

    /* renamed from: d, reason: collision with root package name */
    public final int f223639d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223640e;

    public C16072xd300b5e1(int i17, int i18) {
        this.f223639d = i17;
        this.f223640e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64916xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1765xc84b4196.C16072xd300b5e1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1765xc84b4196.C16072xd300b5e1 c16072xd300b5e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1765xc84b4196.C16072xd300b5e1) obj;
        return this.f223639d == c16072xd300b5e1.f223639d && this.f223640e == c16072xd300b5e1.f223640e;
    }

    /* renamed from: hashCode */
    public int m64917x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f223639d) * 31) + java.lang.Integer.hashCode(this.f223640e);
    }

    /* renamed from: toString */
    public java.lang.String m64918x9616526c() {
        return "Payload(width=" + this.f223639d + ", height=" + this.f223640e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f223639d);
        out.writeInt(this.f223640e);
    }
}
