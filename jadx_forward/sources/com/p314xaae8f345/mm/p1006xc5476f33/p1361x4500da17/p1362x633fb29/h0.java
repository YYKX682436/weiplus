package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes14.dex */
public class h0 extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 f178809a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var) {
        this.f178809a = l0Var;
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoRemoved");
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var = this.f178809a;
        if (l0Var.h0() || !l0Var.f178831w.isEmpty()) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 34, 3403, 1, 21, 0, l0Var.f0());
        }
        java.util.Iterator it = l0Var.f178829u.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) it.next();
            if (i0Var.f178814c == 5) {
                l0Var.j0(i0Var, 2L, 7);
            }
        }
        l0Var.f178831w.clear();
        l0Var.f178823o = 0;
        l0Var.f178824p = false;
        if (l0Var.f178829u.isEmpty()) {
            return;
        }
        l0Var.f178832x = true;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        l0Var.f178833y = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        l0Var.f178833y.u(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.brj));
        if (l0Var.f178827s.f178814c == 1) {
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dgt, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qdy);
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvi);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adl)), string.length() - 5, string.length(), 18);
            textView.setText(spannableString);
            inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.g0(this));
            l0Var.f178833y.d(inflate);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = l0Var.f178833y;
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cub));
        u1Var.s();
        l0Var.A.m43071x58998cd();
        l0Var.m0(true);
    }

    @Override // gp1.a0, gp1.z
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoExposed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var = this.f178809a;
        l0Var.f178825q = true;
        if (l0Var.f178827s.f178814c == 5) {
            return;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 34, 3403, 0, 1, 0, "");
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 34, 3403, 1, 1, 0, l0Var.f0());
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallPlayButtonClick");
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var = this.f178809a;
        if (l0Var.f178827s.f178814c == 5) {
            return;
        }
        java.util.LinkedList linkedList = l0Var.f178831w;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallPlayButtonClick but list is empty");
            return;
        }
        gp1.v vVar = l0Var.f174669h;
        if (vVar != null) {
            vVar.B(true);
        }
        if (linkedList.size() > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.e0(l0Var, true);
            return;
        }
        h02.a e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) linkedList.get(0)).f178813b);
        if (e17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f68419xf1e9b966)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDownloadFloatBallHelper", "installApk, path is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "APK File Path: %s", e17.f68419xf1e9b966);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 34, 3403, 1, 8, 0, l0Var.f0());
        k02.l.a(e17.f68408x32b20428, false, null);
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoClicked");
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var = this.f178809a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var = l0Var.f178827s;
        if (i0Var.f178814c != 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.e0(l0Var, l0Var.f178824p);
            return;
        }
        h02.a e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.e(i0Var.f178813b);
        if (e17 != null) {
            long j17 = e17.f68413xf432b5ad;
            long j18 = e17.f68443x78351860;
            if (j17 < j18 && j18 > 0) {
                z17 = true;
                l81.b1 b1Var = new l81.b1();
                b1Var.f398547b = l0Var.f178827s.f178812a;
                b1Var.f398565k = 1131;
                b1Var.f398567l = "wva_game_download";
                b1Var.f398566k0 = z17;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
                l0Var.j0(l0Var.f178827s, 1L, 6);
            }
        }
        z17 = false;
        l81.b1 b1Var2 = new l81.b1();
        b1Var2.f398547b = l0Var.f178827s.f178812a;
        b1Var2.f398565k = 1131;
        b1Var2.f398567l = "wva_game_download";
        b1Var2.f398566k0 = z17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var2);
        l0Var.j0(l0Var.f178827s, 1L, 6);
    }

    @Override // gp1.a0, gp1.z
    public void w(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onFloatBallInfoHide");
        this.f178809a.f178825q = false;
    }
}
