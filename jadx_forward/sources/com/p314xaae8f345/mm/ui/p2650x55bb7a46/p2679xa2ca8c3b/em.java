package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class em extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285424s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570050vp, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fm fmVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fm();
        fmVar.f39500xcbecde0f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        fmVar.f39502xce2b2f8d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.brc);
        fmVar.f285514b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bp_);
        fmVar.f285515c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565232br4);
        fmVar.f285516d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bkl);
        fmVar.f39493x8ad70635 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        inflate.setTag(fmVar);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (this.f285424s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        com.p314xaae8f345.mm.p2621x8fb0427b.c9 J6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).J6(erVar.c().j());
        java.lang.String str = J6.f275354f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            java.lang.String str2 = J6.f275352d;
            if ((str2 != null ? str2 : "").length() <= 0) {
                return true;
            }
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(J6.f275352d)), null);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msgid", erVar.c().m124847x74d37ac6());
        intent.putExtra("talker", erVar.c().Q0());
        j45.l.j(dVar.g(), "qqmail", ".ui.ReadMailUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 14);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean b0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285424s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fm fmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fm) g0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.c9 J6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).J6(f9Var.j());
        fmVar.f285515c.setText(J6.f275349a);
        fmVar.f285516d.setText(J6.f275350b);
        X(fmVar, J6.f275351c);
        fmVar.f285514b.setVisibility(J6.f275353e ? 0 : 8);
        fmVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), fmVar, null));
        fmVar.f39493x8ad70635.setOnClickListener(w(dVar));
        fmVar.f39493x8ad70635.setOnLongClickListener(u(dVar));
        fmVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
    }
}
