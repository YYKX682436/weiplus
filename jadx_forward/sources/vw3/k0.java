package vw3;

/* loaded from: classes.dex */
public final class k0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f522542e;

    public k0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f522541d = repairerFileListUI;
        this.f522542e = r6Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f522541d;
        android.content.res.Resources resources = repairerFileListUI.mo55332x76847179().getResources();
        g4Var.j(1, resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572092yh) : null, com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, i65.a.d(repairerFileListUI, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
        android.content.res.Resources resources2 = repairerFileListUI.mo55332x76847179().getResources();
        g4Var.j(2, resources2 != null ? resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0) : null, com.p314xaae8f345.mm.R.raw.f79697xe8d412c3, i65.a.d(repairerFileListUI, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
        g4Var.j(3, "查看并拷贝exif-aigc信息", com.p314xaae8f345.mm.R.raw.f79725xeb966bb2, i65.a.d(repairerFileListUI, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
        if (this.f522542e.A()) {
            g4Var.j(4, "以图片方式打开", com.p314xaae8f345.mm.R.raw.f79630x4129ee57, i65.a.d(repairerFileListUI, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
        }
        g4Var.j(5, "查看并拷贝exif-隐私信息", com.p314xaae8f345.mm.R.raw.f79899x267f2c0, i65.a.d(repairerFileListUI, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
        g4Var.j(6, "查看视频信息", com.p314xaae8f345.mm.R.raw.f79772xf1451aff, i65.a.d(repairerFileListUI, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
    }
}
