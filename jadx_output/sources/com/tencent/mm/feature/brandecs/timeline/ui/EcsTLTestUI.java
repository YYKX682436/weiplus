package com.tencent.mm.feature.brandecs.timeline.ui;

@db5.c9
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/brandecs/timeline/ui/EcsTLTestUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lnf/m;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClick", "<init>", "()V", "rw/a", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class EcsTLTestUI extends com.tencent.mm.ui.MMActivity implements nf.m {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65228d = "MicroMsg.EcsTLTestUI";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f65229e = com.tencent.mm.sdk.platformtools.o4.R("brandService");

    public static final void T6(com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI ecsTLTestUI) {
        ecsTLTestUI.getClass();
        if (yq1.j.f464437c) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Success! WeChat will kill self in 1 second...", 1).show();
            ku5.u0 u0Var = ku5.t0.f312615d;
            yq1.d dVar = yq1.d.f464426d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(dVar, 1000L, false);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProcessorCommand", "should not autoReboot now.");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(ecsTLTestUI, ".ui.LauncherUI", intent, null);
    }

    public static final void U6(com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI ecsTLTestUI, int i17) {
        ecsTLTestUI.getClass();
        com.tencent.mm.sdk.platformtools.o4.M("WebCanvasStorage").A("BizTimeLineAdPkgPreviewMode", i17);
        com.tencent.mm.sdk.platformtools.o4.M("SurfacePackageDownloadStorage").A("PkgPreviewMode", i17);
    }

    public final void V6(java.util.List list, android.content.Context context, yz5.a aVar) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = new rw.d(list);
        k0Var.f211881s = new rw.e(list, aVar);
        k0Var.q(" ", 1);
        k0Var.X1 = true;
        k0Var.v();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e4r;
    }

    public final void onClick(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.ufj) {
            V6(kz5.c0.i(new rw.a("预览状态", new rw.f(this)), new rw.a("发布状态-忽略频控", new rw.g(this)), new rw.a("发布状态", new rw.h(this)), new rw.a("清理本地代码包", new rw.i(this)), new rw.a("代码包版本-旧框架", new rw.j(this)), new rw.a("代码包版本-mb代码包", new rw.k(this))), this, rw.l.f400580d);
        } else if (id6 == com.tencent.mm.R.id.ufi) {
            V6(kz5.b0.c(new rw.a("插入动态卡片", rw.m.f400581d)), this, rw.c.f400570d);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        o25.n1.c(this);
        setMMTitle(com.tencent.mm.R.string.f492533gv3);
        if (eq1.n0.f255837a.a()) {
            setBackBtn(new rw.b(this));
        } else {
            com.tencent.mars.xlog.Log.e(this.f65228d, "Not test env, finish now!!!");
            finish();
        }
    }
}
