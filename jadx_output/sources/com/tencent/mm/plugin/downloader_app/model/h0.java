package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class h0 extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.l0 f97276a;

    public h0(com.tencent.mm.plugin.downloader_app.model.l0 l0Var) {
        this.f97276a = l0Var;
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoRemoved");
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97276a;
        if (l0Var.h0() || !l0Var.f97298w.isEmpty()) {
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 34, 3403, 1, 21, 0, l0Var.f0());
        }
        java.util.Iterator it = l0Var.f97296u.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.model.i0 i0Var = (com.tencent.mm.plugin.downloader_app.model.i0) it.next();
            if (i0Var.f97281c == 5) {
                l0Var.j0(i0Var, 2L, 7);
            }
        }
        l0Var.f97298w.clear();
        l0Var.f97290o = 0;
        l0Var.f97291p = false;
        if (l0Var.f97296u.isEmpty()) {
            return;
        }
        l0Var.f97299x = true;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        l0Var.f97300y = new com.tencent.mm.ui.widget.dialog.u1(context);
        l0Var.f97300y.u(context.getString(com.tencent.mm.R.string.brj));
        if (l0Var.f97294s.f97281c == 1) {
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dgt, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qdy);
            java.lang.String string = context.getString(com.tencent.mm.R.string.cvi);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getColor(com.tencent.mm.R.color.adl)), string.length() - 5, string.length(), 18);
            textView.setText(spannableString);
            inflate.setOnClickListener(new com.tencent.mm.plugin.downloader_app.model.g0(this));
            l0Var.f97300y.d(inflate);
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = l0Var.f97300y;
        u1Var.n(context.getString(com.tencent.mm.R.string.cub));
        u1Var.s();
        l0Var.A.alive();
        l0Var.m0(true);
    }

    @Override // gp1.a0, gp1.z
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoExposed");
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97276a;
        l0Var.f97292q = true;
        if (l0Var.f97294s.f97281c == 5) {
            return;
        }
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 34, 3403, 0, 1, 0, "");
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 34, 3403, 1, 1, 0, l0Var.f0());
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallPlayButtonClick");
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97276a;
        if (l0Var.f97294s.f97281c == 5) {
            return;
        }
        java.util.LinkedList linkedList = l0Var.f97298w;
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallPlayButtonClick but list is empty");
            return;
        }
        gp1.v vVar = l0Var.f93136h;
        if (vVar != null) {
            vVar.B(true);
        }
        if (linkedList.size() > 1) {
            com.tencent.mm.plugin.downloader_app.model.l0.e0(l0Var, true);
            return;
        }
        h02.a e17 = com.tencent.mm.plugin.downloader.model.m0.e(((com.tencent.mm.plugin.downloader_app.model.i0) linkedList.get(0)).f97280b);
        if (e17 == null || com.tencent.mm.sdk.platformtools.t8.K0(e17.field_filePath)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadFloatBallHelper", "installApk, path is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "APK File Path: %s", e17.field_filePath);
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 34, 3403, 1, 8, 0, l0Var.f0());
        k02.l.a(e17.field_downloadId, false, null);
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoClicked");
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97276a;
        com.tencent.mm.plugin.downloader_app.model.i0 i0Var = l0Var.f97294s;
        if (i0Var.f97281c != 5) {
            com.tencent.mm.plugin.downloader_app.model.l0.e0(l0Var, l0Var.f97291p);
            return;
        }
        h02.a e17 = com.tencent.mm.plugin.downloader.model.m0.e(i0Var.f97280b);
        if (e17 != null) {
            long j17 = e17.field_downloadedSize;
            long j18 = e17.field_totalSize;
            if (j17 < j18 && j18 > 0) {
                z17 = true;
                l81.b1 b1Var = new l81.b1();
                b1Var.f317014b = l0Var.f97294s.f97279a;
                b1Var.f317032k = 1131;
                b1Var.f317034l = "wva_game_download";
                b1Var.f317033k0 = z17;
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
                l0Var.j0(l0Var.f97294s, 1L, 6);
            }
        }
        z17 = false;
        l81.b1 b1Var2 = new l81.b1();
        b1Var2.f317014b = l0Var.f97294s.f97279a;
        b1Var2.f317032k = 1131;
        b1Var2.f317034l = "wva_game_download";
        b1Var2.f317033k0 = z17;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var2);
        l0Var.j0(l0Var.f97294s, 1L, 6);
    }

    @Override // gp1.a0, gp1.z
    public void w(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoHide");
        this.f97276a.f97292q = false;
    }
}
