package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgBatchLoadTransaction$IPCCallModuleItem", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem */
/* loaded from: classes7.dex */
final /* data */ class C12347x4c8da058 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12347x4c8da058> f35061x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w9();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165978d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f165979e;

    public C12347x4c8da058(java.lang.String moduleName, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        this.f165978d = moduleName;
        this.f165979e = hVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51672xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12347x4c8da058)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12347x4c8da058 c12347x4c8da058 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12347x4c8da058) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165978d, c12347x4c8da058.f165978d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165979e, c12347x4c8da058.f165979e);
    }

    /* renamed from: hashCode */
    public int m51673x8cdac1b() {
        int hashCode = this.f165978d.hashCode() * 31;
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar = this.f165979e;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m51674x9616526c() {
        return "IPCCallModuleItem(moduleName=" + this.f165978d + ", callback=" + this.f165979e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f165978d);
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.d(this.f165979e, dest, 0, 4, null);
    }
}
