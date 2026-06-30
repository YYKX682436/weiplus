package fh1;

/* loaded from: classes7.dex */
public final class e0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.v7 {

    /* renamed from: a, reason: collision with root package name */
    public static final fh1.e0 f344076a = new fh1.e0();

    public final jc3.x b(java.lang.String instanceName, android.os.Parcelable parcelable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745 c12411x6bc6c745 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745) parcelable;
        fh1.l0 l0Var = new fh1.l0(instanceName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 wxaCommLib = c12411x6bc6c745.f167276f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaCommLib, "wxaCommLib");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("registerFileSystem fsPath:");
        java.lang.String str = c12411x6bc6c745.f167275e;
        sb6.append(str == null ? "" : str);
        sb6.append(", lib:");
        sb6.append(wxaCommLib.W0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f344093e, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = new fh1.j0(str).f344089b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u1Var, "provide(...)");
        l0Var.f344095g = u1Var;
        l0Var.f344094f = wxaCommLib;
        return l0Var;
    }
}
