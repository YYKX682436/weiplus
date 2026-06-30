package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class b implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 f271716d;

    public b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 c19663x33e018e7) {
        this.f271716d = c19663x33e018e7;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 c19663x33e018e7 = this.f271716d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f fVar = c19663x33e018e7.f271445d;
        int a17 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m) fVar).a((c19663x33e018e7.f271450i * c19663x33e018e7.f271448g) + i17);
        c19663x33e018e7.f271452n.getItem(i17);
        final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m) fVar;
        if (a17 == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083 = mVar.f272009a;
            if (!c19664x489a3083.C.f271678c.f272299a) {
                android.content.Context context = c19664x489a3083.f271470p;
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4r), 0).show();
            } else if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.c(c19664x489a3083)) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.d(c19664x489a3083);
            } else if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.e(c19664x489a3083)) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.g(c19664x489a3083);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19664x489a3083.f271469o;
                if (y4Var == null || y4Var.a() == null || !((sb5.s) c19664x489a3083.f271469o.a().f542241c.a(sb5.s.class)).u()) {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    if (j35.u.h(c19664x489a3083.f271470p, "android.permission.CAMERA")) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.h(c19664x489a3083, true);
                    } else {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.h(c19664x489a3083, false);
                    }
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dy.f215705a.c(c19664x489a3083.f271469o.a().g(), c19664x489a3083.f271469o.a().t(), 2, new yz5.a() { // from class: com.tencent.mm.pluginsdk.ui.chat.m$$a
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m mVar2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m.this;
                            mVar2.getClass();
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a30832 = mVar2.f272009a;
                            ((sb0.f) jVar).getClass();
                            if (j35.u.h(c19664x489a30832.f271470p, "android.permission.CAMERA")) {
                                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.h(c19664x489a30832, true);
                                return null;
                            }
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.h(c19664x489a30832, false);
                            return null;
                        }
                    });
                }
            }
        } else {
            mVar.getClass();
        }
        return true;
    }
}
