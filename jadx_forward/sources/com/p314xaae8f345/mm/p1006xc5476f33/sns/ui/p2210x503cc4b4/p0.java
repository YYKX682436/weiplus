package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251377d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251377d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) tag;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = i2Var.f250082a;
            j45.l.g("favorite");
            int i17 = c19807x593d1720.f39014x86965dde.f451370e;
            java.lang.String str = i2Var.f250083b;
            if (i17 != 1) {
                if (i17 == 9) {
                    contextMenu.add(0, 5, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 26) {
                    contextMenu.add(0, 22, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 33) {
                    contextMenu.add(0, 24, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 3) {
                    contextMenu.add(0, 3, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                    c5348xb8e1a564.f135674g.f87754c = str;
                    c5348xb8e1a564.e();
                    if (c5348xb8e1a564.f135675h.f87869a) {
                        contextMenu.add(0, 18, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
                    }
                } else if (i17 == 4) {
                    contextMenu.add(0, 4, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a5642 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                    c5348xb8e1a5642.f135674g.f87754c = str;
                    c5348xb8e1a5642.e();
                    if (c5348xb8e1a5642.f135675h.f87869a) {
                        contextMenu.add(0, 18, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
                    }
                } else if (i17 == 5) {
                    contextMenu.add(0, 4, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a5643 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                    c5348xb8e1a5643.f135674g.f87754c = str;
                    c5348xb8e1a5643.e();
                    if (c5348xb8e1a5643.f135675h.f87869a) {
                        contextMenu.add(0, 18, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
                    }
                } else if (i17 == 14) {
                    contextMenu.add(0, 9, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 == 15) {
                    contextMenu.add(0, 10, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (i17 != 29) {
                    if (i17 == 30) {
                        contextMenu.add(0, 23, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                    } else if (i17 != 37 && i17 != 38) {
                        if (i17 == 41) {
                            contextMenu.add(0, 32, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                        } else if (i17 == 42 || i17 == 47) {
                            je4.g.b(view.getContext(), i2Var.f250082a, contextMenu);
                            contextMenu.add(0, 28, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a5644 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                            c5348xb8e1a5644.f135674g.f87754c = str;
                            c5348xb8e1a5644.e();
                            if (c5348xb8e1a5644.f135675h.f87869a) {
                                contextMenu.add(0, 18, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
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
                                    contextMenu.add(0, 3, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                                    break;
                            }
                        } else if (je4.g.d(view.getContext(), c19807x593d1720)) {
                            contextMenu.add(0, 30, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(contextMenu, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str));
            }
            contextMenu.add(0, 2, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(contextMenu, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) tag;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = i2Var.f250082a;
        int i17 = c19807x593d1720.f39014x86965dde.f451370e;
        if (i17 == 10 || i17 == 17 || i17 == 22 || i17 == 23 || i17 == 49) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
            return false;
        }
        this.f251377d.f251342l.e(view, i2Var.f250083b, c19807x593d1720);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
        return true;
    }
}
