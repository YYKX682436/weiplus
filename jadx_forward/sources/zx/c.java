package zx;

/* loaded from: classes14.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d f558475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.u f558476e;

    public c(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d c10501xa4ff92d, zx.u uVar) {
        this.f558475d = c10501xa4ff92d;
        this.f558476e = uVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d c10501xa4ff92d = this.f558475d;
        java.lang.Object systemService = c10501xa4ff92d.getContext().getSystemService("clipboard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
        zx.u uVar = this.f558476e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l lVar = uVar.f558505d;
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("Copied Text", lVar.f297882o[4] ? lVar.f297877g : ""));
        xx.y brandDataReporter = c10501xa4ff92d.getBrandDataReporter();
        if (brandDataReporter != null) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l lVar2 = uVar.f558505d;
            java.lang.String b17 = lVar2.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getTraceId(...)");
            long j17 = lVar2.f297874d;
            xx.b bVar = lVar2.f297880m ? xx.b.f539304f : xx.b.f539303e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportCopyCommentClk");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_copy_comment_clk", brandDataReporter.a(brandDataReporter.f539370j, new xx.p(b17, j17, bVar)), 36708);
        }
    }
}
