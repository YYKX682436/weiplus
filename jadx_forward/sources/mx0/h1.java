package mx0;

/* loaded from: classes5.dex */
public final class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f413552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.l1 f413553e;

    public h1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, mx0.l1 l1Var) {
        this.f413552d = k0Var;
        this.f413553e = l1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        this.f413552d.u();
        int itemId = menuItem.getItemId();
        mx0.l1 l1Var = this.f413553e;
        switch (itemId) {
            case 1000:
                l1Var.a();
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) l1Var.f413654e;
                c10977x8e40eced.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "reportJump2VideoEditPageForMaterialImportPreview");
                i95.m c17 = i95.n0.c(w40.e.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                w40.e.eh((w40.e) c17, "SCAssetGenerateToMC", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0, 8, null);
                c10977x8e40eced.v0(true, new mx0.a6(c10977x8e40eced, null));
                return;
            case 1001:
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced2 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) l1Var.f413654e;
                c10977x8e40eced2.getClass();
                ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
                yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.u5(m7Var, null), 3, null);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map Ai = m7Var.Ai();
                Ai.put("view_id", "sc_asset_generate_save_video");
                ((cy1.a) rVar).yj("sc_asset_generate_save_video", null, Ai, 6, false);
                c10977x8e40eced2.v0(false, new mx0.p8(c10977x8e40eced2, null));
                return;
            case 1002:
                l1Var.getClass();
                ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
                yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.t5(m7Var2, null), 3, null);
                dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map Ai2 = m7Var2.Ai();
                Ai2.put("view_id", "sc_asset_generate_feedback");
                ((cy1.a) rVar2).yj("sc_asset_generate_feedback", null, Ai2, 6, false);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=autoreplyfeedback/index&wechat_feedback_source=5#/form/14296");
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                j45.l.n(l1Var.f413653d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 206);
                return;
            default:
                return;
        }
    }
}
