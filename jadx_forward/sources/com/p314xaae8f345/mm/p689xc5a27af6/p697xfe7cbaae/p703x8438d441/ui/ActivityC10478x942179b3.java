package com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p703x8438d441.ui;

@db5.c9
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/brandecs/timeline/ui/EcsTLTestUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lnf/m;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClick", "<init>", "()V", "rw/a", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI */
/* loaded from: classes7.dex */
public final class ActivityC10478x942179b3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements nf.m {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f146761d = "MicroMsg.EcsTLTestUI";

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f146762e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");

    public static final void T6(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p703x8438d441.ui.ActivityC10478x942179b3 activityC10478x942179b3) {
        activityC10478x942179b3.getClass();
        if (yq1.j.f545970c) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Success! WeChat will kill self in 1 second...", 1).show();
            ku5.u0 u0Var = ku5.t0.f394148d;
            yq1.d dVar = yq1.d.f545959d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(dVar, 1000L, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProcessorCommand", "should not autoReboot now.");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(activityC10478x942179b3, ".ui.LauncherUI", intent, null);
    }

    public static final void U6(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p703x8438d441.ui.ActivityC10478x942179b3 activityC10478x942179b3, int i17) {
        activityC10478x942179b3.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WebCanvasStorage").A("BizTimeLineAdPkgPreviewMode", i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SurfacePackageDownloadStorage").A("PkgPreviewMode", i17);
    }

    public final void V6(java.util.List list, android.content.Context context, yz5.a aVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = new rw.d(list);
        k0Var.f293414s = new rw.e(list, aVar);
        k0Var.q(" ", 1);
        k0Var.X1 = true;
        k0Var.v();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e4r;
    }

    /* renamed from: onClick */
    public final void m44063xaf6b9ae9(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.ufj) {
            V6(kz5.c0.i(new rw.a("预览状态", new rw.f(this)), new rw.a("发布状态-忽略频控", new rw.g(this)), new rw.a("发布状态", new rw.h(this)), new rw.a("清理本地代码包", new rw.i(this)), new rw.a("代码包版本-旧框架", new rw.j(this)), new rw.a("代码包版本-mb代码包", new rw.k(this))), this, rw.l.f482113d);
        } else if (id6 == com.p314xaae8f345.mm.R.id.ufi) {
            V6(kz5.b0.c(new rw.a("插入动态卡片", rw.m.f482114d)), this, rw.c.f482103d);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        o25.n1.c(this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574066gv3);
        if (eq1.n0.f337370a.a()) {
            mo54448x9c8c0d33(new rw.b(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f146761d, "Not test env, finish now!!!");
            finish();
        }
    }
}
