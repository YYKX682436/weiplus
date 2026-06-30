package com.tencent.mm.plugin.appbrand.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class AppBrandCheckWxaShortLinkUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f89329g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f89330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f89331e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f89332f = new java.util.concurrent.atomic.AtomicBoolean(false);

    public void T6(int i17, com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo shortLinkInfo) {
        kotlin.jvm.internal.o.g(shortLinkInfo, "shortLinkInfo");
        com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchTipActionStruct wCTopicSearchTipActionStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchTipActionStruct();
        wCTopicSearchTipActionStruct.f62183g = i17;
        wCTopicSearchTipActionStruct.f62185i = wCTopicSearchTipActionStruct.b("appid", shortLinkInfo.f88874d, true);
        wCTopicSearchTipActionStruct.f62182f = wCTopicSearchTipActionStruct.b(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, getIntent().getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE), true);
        wCTopicSearchTipActionStruct.f62180d = wCTopicSearchTipActionStruct.b("requestid", getIntent().getStringExtra("requestId"), true);
        try {
            wCTopicSearchTipActionStruct.f62181e = java.lang.Integer.parseInt(getIntent().getStringExtra("scene_for_report"));
        } catch (java.lang.Exception unused) {
        }
        wCTopicSearchTipActionStruct.f62184h = 1;
        wCTopicSearchTipActionStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "reportForDialogWxaTag toShowString = " + wCTopicSearchTipActionStruct.n());
    }

    public final lj1.a U6(com.tencent.mm.pluginsdk.ui.span.l1 l1Var) {
        kotlin.jvm.internal.o.g(l1Var, "<this>");
        switch (l1Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return lj1.a.f318809e;
            case 4:
                return lj1.a.f318810f;
            default:
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                return lj1.a.f318808d;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487924bp;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        android.content.Intent intent = getIntent();
        java.lang.String link = intent != null ? intent.getStringExtra("url") : null;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra = intent2 != null ? intent2.getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : null;
        android.content.Intent intent3 = getIntent();
        java.lang.Boolean valueOf = intent3 != null ? java.lang.Boolean.valueOf(intent3.getBooleanExtra("need_check", true)) : null;
        android.content.Intent intent4 = getIntent();
        int intExtra = intent4 != null ? intent4.getIntExtra("chatType", -1) : -1;
        android.content.Intent intent5 = getIntent();
        java.lang.String stringExtra2 = intent5 != null ? intent5.getStringExtra("senderUsername") : null;
        android.content.Intent intent6 = getIntent();
        boolean booleanExtra = intent6 != null ? intent6.getBooleanExtra("show_launchwxatipdialog", true) : true;
        if (!(link == null || r26.n0.N(link))) {
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "start check short link");
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                com.tencent.mm.pluginsdk.ui.span.l1 valueOf2 = com.tencent.mm.pluginsdk.ui.span.l1.valueOf(stringExtra);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!kotlin.jvm.internal.o.b(valueOf, bool)) {
                    com.tencent.mm.plugin.appbrand.ui.e1 e1Var = new com.tencent.mm.plugin.appbrand.ui.e1((com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo) getIntent().getParcelableExtra("shortLinkInfo"), link, this, stringExtra2, intExtra, valueOf2);
                    com.tencent.mm.plugin.appbrand.ui.f1 f1Var = new com.tencent.mm.plugin.appbrand.ui.f1(weakReference);
                    kotlin.jvm.internal.o.g(link, "link");
                    kj1.l lVar = new kj1.l(this, f1Var, e1Var, link, booleanExtra);
                    kj1.w wVar = kj1.w.f308379a;
                    com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo = (com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo) kj1.w.f308380b.get(link);
                    if (wxaShortLinkInfo != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AbsWxaShortLinkLauncher", "use cache for link:".concat(link));
                        lVar.invoke(bool, wxaShortLinkInfo);
                        return;
                    }
                    return;
                }
                com.tencent.mm.plugin.appbrand.ui.g1 g1Var = new com.tencent.mm.plugin.appbrand.ui.g1(this, weakReference);
                this.f89331e = g1Var;
                com.tencent.mm.sdk.platformtools.u3.i(g1Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f89330d;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
                this.f89330d = f17;
                f17.setCancelable(false);
                com.tencent.mm.plugin.appbrand.ui.c1 c1Var = new com.tencent.mm.plugin.appbrand.ui.c1(valueOf2, intExtra, stringExtra2, this, weakReference);
                com.tencent.mm.plugin.appbrand.ui.d1 d1Var = new com.tencent.mm.plugin.appbrand.ui.d1(weakReference);
                kotlin.jvm.internal.o.g(link, "link");
                kj1.g gVar = new kj1.g(this, d1Var, c1Var, link, true);
                kj1.w wVar2 = kj1.w.f308379a;
                com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo2 = (com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo) kj1.w.f308380b.get(link);
                if (wxaShortLinkInfo2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AbsWxaShortLinkLauncher", "use cache for link:".concat(link));
                    gVar.invoke(bool, wxaShortLinkInfo2);
                    return;
                } else {
                    if (!kj1.m.f308365a.matcher(link).matches()) {
                        d1Var.invoke(kj1.g0.f308327e);
                        return;
                    }
                    lj1.a f18 = c1Var.f();
                    r45.h20 h20Var = new r45.h20();
                    h20Var.f375772e = f18.ordinal();
                    h20Var.f375771d = link;
                    nd.b a17 = nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class);
                    kotlin.jvm.internal.o.d(a17);
                    ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) a17).e1("/cgi-bin/mmbiz-bin/wxaapp/wxaapp_checkshortlink", "", h20Var, r45.i20.class).n(new lj1.b(gVar))).s(new lj1.c(gVar));
                    return;
                }
            }
        }
        setResult(-1, new android.content.Intent());
        finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "url empty or invalid scene, finish");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "onDestroy");
        java.lang.Runnable runnable = this.f89331e;
        if (runnable != null) {
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f89330d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.v9.e(getWindow());
        com.tencent.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        db5.f.c(this, null);
    }
}
