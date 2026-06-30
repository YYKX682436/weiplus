package c43;

/* loaded from: classes15.dex */
public final class h extends c43.x {
    public x33.b Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.View itemView, int i17) {
        super(itemView, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
    }

    public final x33.b C() {
        x33.b bVar = this.Z;
        if (bVar != null) {
            return bVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
        throw null;
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 c15734x6ef15a81;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15734x6ef15a81 = c15791x7c5dbdd8.f36769xaea0f97c) == null) {
            return;
        }
        C().f533155j.setText(c15734x6ef15a81.f36587x6942258);
        r53.v vVar = new r53.v();
        vVar.f474240e = false;
        r53.w a17 = vVar.a();
        r53.y.a().e(C().f533148c, c15734x6ef15a81.f36585xdd86d13a, a17, null);
        java.lang.String str = c15734x6ef15a81.f36583x95bc6f40;
        if (str != null) {
            r53.y.a().e(null, str, a17, new c43.g(this));
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b> linkedList = c15734x6ef15a81.f36586xdc7136c3;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b> sheet_row_list = c15734x6ef15a81.f36586xdc7136c3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sheet_row_list, "sheet_row_list");
        int i17 = 0;
        for (java.lang.Object obj : sheet_row_list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b c15816xdda8581b = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b) obj;
            if (i17 == 0) {
                java.util.LinkedList<java.lang.String> linkedList2 = c15816xdda8581b.f36858xb37a46dd;
                if (linkedList2 != null) {
                    int i19 = 0;
                    for (java.lang.Object obj2 : linkedList2) {
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.lang.String str2 = (java.lang.String) obj2;
                        if (i19 == 0) {
                            C().f533152g.setText(str2);
                        } else if (i19 == 1) {
                            C().f533153h.setText(str2);
                        } else if (i19 == 2) {
                            C().f533154i.setText(str2);
                        }
                        i19 = i27;
                    }
                } else {
                    continue;
                }
            } else {
                java.util.LinkedList<java.lang.String> linkedList3 = c15816xdda8581b.f36858xb37a46dd;
                if (linkedList3 != null) {
                    int i28 = 0;
                    for (java.lang.Object obj3 : linkedList3) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.lang.String str3 = (java.lang.String) obj3;
                        if (i28 == 0) {
                            C().f533149d.setText(str3);
                        } else if (i28 == 1) {
                            C().f533150e.setText(str3);
                        } else if (i28 == 2) {
                            C().f533151f.setText(str3);
                        }
                        i28 = i29;
                    }
                } else {
                    continue;
                }
            }
            i17 = i18;
        }
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bet, (android.view.ViewGroup) null, false);
        int i17 = com.p314xaae8f345.mm.R.id.goc;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.goc);
        if (relativeLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.god;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.god);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.goe;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.goe);
                if (linearLayout2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.hle;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.hle);
                    if (imageView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.omy;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.omy);
                        if (textView != null) {
                            i17 = com.p314xaae8f345.mm.R.id.omz;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.omz);
                            if (textView2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.f568967on0;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568967on0);
                                if (textView3 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.f568968on1;
                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568968on1);
                                    if (textView4 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.f568969on2;
                                        android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568969on2);
                                        if (textView5 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f568970on3;
                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568970on3);
                                            if (textView6 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.f568971on4;
                                                android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568971on4);
                                                if (textView7 != null) {
                                                    this.Z = new x33.b((android.widget.FrameLayout) inflate, relativeLayout, linearLayout, linearLayout2, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    android.widget.FrameLayout frameLayout = C().f533146a;
                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getRoot(...)");
                                                    return frameLayout;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 c15734x6ef15a81;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15734x6ef15a81 = c15791x7c5dbdd8.f36769xaea0f97c) == null || s()) {
            return;
        }
        s33.y.h(this.f120025g, c15734x6ef15a81.f36584x28d1961f);
    }
}
