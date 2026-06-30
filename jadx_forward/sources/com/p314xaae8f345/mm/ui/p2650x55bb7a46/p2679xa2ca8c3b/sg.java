package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes.dex */
public final class sg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sg f287056a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sg();

    public static final boolean b(v05.b bVar) {
        if (bVar == null) {
            return false;
        }
        int i17 = bVar.f513848e;
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(i17 + 11);
        java.util.List list = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.f286895a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            return false;
        }
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(bVar.m75945x2fec8307(bVar.f449898d + 9))) {
            return false;
        }
        r05.g gVar = (r05.g) bVar.m75936x14adae67(i17 + 25);
        return (gVar != null ? gVar.o() : -1) >= 0;
    }

    public final void a(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (context == null || imageView == null || textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "param null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "srcUsername null");
        }
        if (c01.e2.G(str)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, " ");
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, "", textSize));
        boolean z17 = false;
        imageView.setVisibility(0);
        textView.setVisibility(0);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            e17 = str;
        }
        imageView.setTag(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
            imageView.setTag(str);
            ((c01.k7) c01.n8.a()).b(str, 5, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rg(new java.lang.ref.WeakReference(imageView), textView, context));
            return;
        }
        if (!c01.e2.G(str)) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aj6);
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize2));
            return;
        }
        if (n17 != null && n17.r2()) {
            z17 = true;
        }
        if (!z17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            if (com.p314xaae8f345.mm.p943x351df9c2.g.a(str) == null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
                if (n07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) {
                    lr1.m.a(imageView, n17, n07.d(), true);
                }
            }
        }
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        float textSize3 = textView.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, e17, textSize3));
    }
}
