package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/magicbrush_frame/mb_host/MBFramePkgManagementFsIPCInitArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs */
/* loaded from: classes7.dex */
public final /* data */ class C12411x6bc6c745 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745> f35095x681a0c0c = new fh1.m0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f167274d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f167275e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f167276f;

    public C12411x6bc6c745(java.lang.String bizInstanceName, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 wxaCommLib) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizInstanceName, "bizInstanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaCommLib, "wxaCommLib");
        this.f167274d = bizInstanceName;
        this.f167275e = str;
        this.f167276f = wxaCommLib;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51937xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745 c12411x6bc6c745 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167274d, c12411x6bc6c745.f167274d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167275e, c12411x6bc6c745.f167275e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167276f, c12411x6bc6c745.f167276f);
    }

    /* renamed from: hashCode */
    public int m51938x8cdac1b() {
        int hashCode = this.f167274d.hashCode() * 31;
        java.lang.String str = this.f167275e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f167276f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51939x9616526c() {
        return "MBFramePkgManagementFsIPCInitArgs(bizInstanceName=" + this.f167274d + ", fsPath=" + this.f167275e + ", wxaCommLib=" + this.f167276f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f167274d);
        out.writeString(this.f167275e);
        out.writeParcelable(this.f167276f, i17);
    }
}
