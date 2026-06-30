package uc4;

/* loaded from: classes4.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.m0 f507959d;

    public k0(uc4.m0 m0Var) {
        this.f507959d = m0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        if (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) tag;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = i2Var.f250082a;
            j45.l.g("favorite");
            int i17 = c19807x593d1720.f39014x86965dde.f451370e;
            if (i17 != 1) {
                if (i17 == 9) {
                    menu.add(0, 5, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 26) {
                    menu.add(0, 22, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 33) {
                    menu.add(0, 24, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 3) {
                    menu.add(0, 3, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                    c5348xb8e1a564.f135674g.f87754c = i2Var.f250083b;
                    c5348xb8e1a564.e();
                    if (c5348xb8e1a564.f135675h.f87869a) {
                        menu.add(0, 18, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
                    }
                } else if (i17 == 4) {
                    menu.add(0, 4, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a5642 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                    c5348xb8e1a5642.f135674g.f87754c = i2Var.f250083b;
                    c5348xb8e1a5642.e();
                    if (c5348xb8e1a5642.f135675h.f87869a) {
                        menu.add(0, 18, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
                    }
                } else if (i17 == 5) {
                    menu.add(0, 4, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a5643 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                    c5348xb8e1a5643.f135674g.f87754c = i2Var.f250083b;
                    c5348xb8e1a5643.e();
                    if (c5348xb8e1a5643.f135675h.f87869a) {
                        menu.add(0, 18, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
                    }
                } else if (i17 == 14) {
                    menu.add(0, 9, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 15) {
                    menu.add(0, 10, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 != 29) {
                    if (i17 == 30) {
                        menu.add(0, 23, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    } else if (i17 != 37 && i17 != 38) {
                        if (i17 != 41) {
                            if (i17 == 42 || i17 == 47) {
                                android.content.Context context = v17.getContext();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                je4.g.b(context, i2Var.f250082a, menu);
                                menu.add(0, 28, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a5644 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                                c5348xb8e1a5644.f135674g.f87754c = i2Var.f250083b;
                                c5348xb8e1a5644.e();
                                if (c5348xb8e1a5644.f135675h.f87869a) {
                                    menu.add(0, 18, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
                                }
                            } else if (i17 != 48) {
                                switch (i17) {
                                    case 53:
                                    case 55:
                                    case 56:
                                        break;
                                    case 54:
                                        break;
                                    default:
                                        menu.add(0, 3, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                                        break;
                                }
                            } else {
                                android.content.Context context2 = v17.getContext();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                if (je4.g.d(context2, i2Var.f250082a)) {
                                    menu.add(0, 30, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                                }
                            }
                        } else if (new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fav.C20148xa6aa0a27().p()) {
                            menu.add(0, 32, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu: liteapp expt skip");
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(menu, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(i2Var.f250083b));
            }
            menu.add(0, 2, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(menu, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(i2Var.f250083b));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) tag;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = i2Var.f250082a;
        int i17 = c19807x593d1720.f39014x86965dde.f451370e;
        if (i17 == 10 || i17 == 17 || i17 == 22 || i17 == 23) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
            return false;
        }
        this.f507959d.e().e(view, i2Var.f250083b, c19807x593d1720);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        return true;
    }
}
