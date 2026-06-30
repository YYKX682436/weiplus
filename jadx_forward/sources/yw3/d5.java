package yw3;

/* loaded from: classes11.dex */
public final class d5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f548252b;

    public d5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f548251a = repairerPatchDemoUI;
        this.f548252b = mm6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f548251a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(repairerPatchDemoUI.d, "onDialogClick %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            int i17 = this.f548252b.f462213s;
            repairerPatchDemoUI.getClass();
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574955k42, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), java.lang.Integer.valueOf(i17), 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 28L, 1L, false);
        }
    }
}
