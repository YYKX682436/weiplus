package com.p314xaae8f345.mm.p874xaefb6cc9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/minigame/AppBrandProcessWVARunningNotifyTask$Args", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args */
/* loaded from: classes5.dex */
final /* data */ class C10914xa02a8a2d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p874xaefb6cc9.C10914xa02a8a2d> f29741x681a0c0c = new com.p314xaae8f345.mm.p874xaefb6cc9.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150519d;

    public C10914xa02a8a2d(java.lang.String processName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        this.f150519d = processName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46898xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p874xaefb6cc9.C10914xa02a8a2d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150519d, ((com.p314xaae8f345.mm.p874xaefb6cc9.C10914xa02a8a2d) obj).f150519d);
    }

    /* renamed from: hashCode */
    public int m46899x8cdac1b() {
        return this.f150519d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m46900x9616526c() {
        return "Args(processName=" + this.f150519d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f150519d);
    }
}
