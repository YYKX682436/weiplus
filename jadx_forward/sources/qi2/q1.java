package qi2;

/* loaded from: classes10.dex */
public final class q1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f445138h;

    /* renamed from: i, reason: collision with root package name */
    public final si2.b f445139i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.d1 f445140m;

    /* renamed from: n, reason: collision with root package name */
    public int f445141n;

    /* renamed from: o, reason: collision with root package name */
    public int f445142o;

    /* renamed from: p, reason: collision with root package name */
    public ce2.i f445143p;

    /* renamed from: q, reason: collision with root package name */
    public r45.kl4 f445144q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f445145r;

    /* renamed from: s, reason: collision with root package name */
    public int f445146s;

    /* renamed from: t, reason: collision with root package name */
    public r45.wz1 f445147t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f445148u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f445149v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(gk2.e liveData, android.content.Context context, si2.b callback) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f445138h = liveData;
        this.f445139i = callback;
        this.f445141n = 1;
        this.f445145r = new java.util.LinkedList();
        this.f445148u = jz5.h.b(new qi2.n1(context, this));
        this.f445149v = jz5.h.b(new qi2.l1(context, this));
        this.f199917g.c(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0m));
    }

    public final void A() {
        this.f445142o = 0;
        fg2.d1 d1Var = this.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var.f343515n.setVisibility(0);
        fg2.d1 d1Var2 = this.f445140m;
        if (d1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var2.f343511j.setVisibility(8);
        fg2.d1 d1Var3 = this.f445140m;
        if (d1Var3 != null) {
            d1Var3.f343514m.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void B() {
        this.f445142o = 1;
        fg2.d1 d1Var = this.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var.f343515n.setVisibility(8);
        fg2.d1 d1Var2 = this.f445140m;
        if (d1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var2.f343511j.setVisibility(0);
        fg2.d1 d1Var3 = this.f445140m;
        if (d1Var3 != null) {
            d1Var3.f343514m.setVisibility(this.f445143p != null ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            r6 = this;
            gk2.e r0 = r6.f445138h
            java.lang.Class<mm2.y2> r1 = mm2.y2.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.y2 r0 = (mm2.y2) r0
            dk2.pf r0 = r0.f411099s
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L56
            int r4 = r6.f445141n
            int r5 = r0.f315459a
            if (r5 != r4) goto L56
            int r4 = r6.f445142o
            int r5 = r0.f315460b
            if (r5 != r4) goto L56
            ce2.i r4 = r6.f445143p
            if (r4 == 0) goto L24
            java.lang.String r4 = r4.f67814x2c488eb6
            goto L25
        L24:
            r4 = r3
        L25:
            if (r4 != 0) goto L29
            java.lang.String r4 = ""
        L29:
            java.lang.String r5 = r0.f315461c
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r4)
            if (r4 == 0) goto L56
            int r4 = r6.f445146s
            int r5 = r0.f315462d
            if (r5 != r4) goto L56
            int r4 = r6.f445141n
            if (r4 != r2) goto L4e
            fg2.d1 r4 = r6.f445140m
            if (r4 == 0) goto L47
            com.tencent.mm.ui.widget.MMSwitchBtn r4 = r4.f343504c
            boolean r4 = r4.f292896x
            if (r4 == 0) goto L4e
            r4 = r2
            goto L4f
        L47:
            java.lang.String r0 = "uiBinding"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            throw r3
        L4e:
            r4 = 2
        L4f:
            int r0 = r0.f315463e
            if (r0 == r4) goto L54
            goto L56
        L54:
            r0 = r1
            goto L57
        L56:
            r0 = r2
        L57:
            android.view.View r4 = r6.f199916f
            if (r0 != 0) goto L7a
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L62
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L62:
            if (r3 == 0) goto L98
            r3.setEnabled(r1)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099680(0x7f060020, float:1.781172E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
            goto L98
        L7a:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L81
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L81:
            if (r3 == 0) goto L98
            r3.setEnabled(r2)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131102743(0x7f060c17, float:1.7817933E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.q1.C():void");
    }

    public final void D(ce2.i iVar) {
        this.f445143p = iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPkSettingPanelWidget", "notifyGiftSelect giftId: " + iVar.f67814x2c488eb6 + " selectGiftInfo: " + this.f445143p);
        ce2.i iVar2 = this.f445143p;
        if (iVar2 != null) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(iVar2.f67819x7194d06c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            fg2.d1 d1Var = this.f445140m;
            if (d1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView selectGiftIcon = d1Var.f343513l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(selectGiftIcon, "selectGiftIcon");
            a17.c(selectGiftIcon);
        }
    }

    public final void E() {
        fg2.d1 d1Var = this.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var.f343523v.setVisibility(8);
        fg2.d1 d1Var2 = this.f445140m;
        if (d1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var2.f343522u.setVisibility(8);
        fg2.d1 d1Var3 = this.f445140m;
        if (d1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var3.f343503b.setVisibility(8);
        fg2.d1 d1Var4 = this.f445140m;
        if (d1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var4.f343504c.m81392x52cfa5c6(true);
        this.f445143p = null;
    }

    public final void F(r45.wz1 wz1Var, boolean z17) {
        jz5.f0 f0Var;
        r45.jm1 jm1Var;
        r45.jm1 jm1Var2;
        java.util.LinkedList m75941xfb821914;
        w();
        this.f445147t = wz1Var;
        this.f445144q = wz1Var != null ? (r45.kl4) wz1Var.m75936x14adae67(10) : null;
        if (wz1Var != null && (jm1Var2 = (r45.jm1) wz1Var.m75936x14adae67(14)) != null && (m75941xfb821914 = jm1Var2.m75941xfb821914(0)) != null) {
            java.util.LinkedList linkedList = this.f445145r;
            linkedList.clear();
            linkedList.addAll(m75941xfb821914);
        }
        r45.kl4 kl4Var = this.f445144q;
        fg2.d1 d1Var = this.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec8307 = kl4Var != null ? kl4Var.m75945x2fec8307(7) : null;
        boolean z18 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        android.content.Context context = this.f199914d;
        d1Var.f343519r.setText(!z18 ? kl4Var != null ? kl4Var.m75945x2fec8307(7) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzw));
        fg2.d1 d1Var2 = this.f445140m;
        if (d1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec83072 = kl4Var != null ? kl4Var.m75945x2fec8307(8) : null;
        d1Var2.f343521t.setText(!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0) ? kl4Var != null ? kl4Var.m75945x2fec8307(8) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzy));
        fg2.d1 d1Var3 = this.f445140m;
        if (d1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec83073 = kl4Var != null ? kl4Var.m75945x2fec8307(5) : null;
        d1Var3.f343508g.setText(!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0) ? kl4Var != null ? kl4Var.m75945x2fec8307(5) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljh));
        fg2.d1 d1Var4 = this.f445140m;
        if (d1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec83074 = kl4Var != null ? kl4Var.m75945x2fec8307(6) : null;
        d1Var4.f343506e.setText(!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0) ? kl4Var != null ? kl4Var.m75945x2fec8307(6) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljf));
        gk2.e eVar = this.f445138h;
        if (z17) {
            dk2.pf pfVar = ((mm2.y2) eVar.a(mm2.y2.class)).f411099s;
            if (pfVar != null) {
                int i17 = pfVar.f315459a;
                if (i17 == 1) {
                    y();
                } else if (i17 == 2) {
                    z();
                }
                int i18 = pfVar.f315460b;
                if (i18 == 0) {
                    A();
                } else if (i18 == 1) {
                    B();
                    ce2.i e17 = dk2.u7.f315714a.e(pfVar.f315461c);
                    if (e17 != null) {
                        D(e17);
                    }
                }
                this.f445146s = pfVar.f315462d;
                fg2.d1 d1Var5 = this.f445140m;
                if (d1Var5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                d1Var5.f343504c.m81392x52cfa5c6(pfVar.f315463e == 1);
                fg2.d1 d1Var6 = this.f445140m;
                if (d1Var6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                d1Var6.f343510i.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(this.f445146s / 60)));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                y();
                A();
                fg2.d1 d1Var7 = this.f445140m;
                if (d1Var7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                d1Var7.f343504c.m81392x52cfa5c6(true);
                r45.wz1 wz1Var2 = this.f445147t;
                this.f445146s = (wz1Var2 == null || (jm1Var = (r45.jm1) wz1Var2.m75936x14adae67(14)) == null) ? 300 : jm1Var.m75939xb282bd08(1);
                fg2.d1 d1Var8 = this.f445140m;
                if (d1Var8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                d1Var8.f343510i.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(this.f445146s / 60)));
            }
        }
        fg2.d1 d1Var9 = this.f445140m;
        if (d1Var9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var9.f343510i.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(this.f445146s / 60)));
        C();
        if (((mm2.e1) eVar.a(mm2.e1.class)).g7()) {
            E();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        android.widget.TextView f17 = f();
        f17.setEnabled(true);
        f17.setTextColor(f17.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
        f17.setText(f17.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6t));
        return f17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dkt;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.d1 d1Var = this.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = d1Var.f343518q.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            y();
        } else {
            fg2.d1 d1Var2 = this.f445140m;
            if (d1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = d1Var2.f343520s.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                z();
            } else {
                fg2.d1 d1Var3 = this.f445140m;
                if (d1Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                int id8 = d1Var3.f343507f.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    A();
                } else {
                    fg2.d1 d1Var4 = this.f445140m;
                    if (d1Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = d1Var4.f343505d.getId();
                    jz5.g gVar = this.f445148u;
                    if (valueOf == null || valueOf.intValue() != id9) {
                        fg2.d1 d1Var5 = this.f445140m;
                        if (d1Var5 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = d1Var5.f343514m.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            a();
                            qi2.w0 w0Var = (qi2.w0) ((jz5.n) gVar).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(w0Var.f445180h.a(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qi2.v0(w0Var, 1, null), 2, null);
                            w0Var.w();
                        } else {
                            fg2.d1 d1Var6 = this.f445140m;
                            if (d1Var6 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = d1Var6.f343509h.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                ((qi2.m0) ((jz5.n) this.f445149v).mo141623x754a37bb()).y(this.f445145r, this.f445146s);
                                a();
                            }
                        }
                    } else if (this.f445143p == null) {
                        a();
                        qi2.w0 w0Var2 = (qi2.w0) ((jz5.n) gVar).mo141623x754a37bb();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(w0Var2.f445180h.a(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qi2.v0(w0Var2, 1, null), 2, null);
                        w0Var2.w();
                    } else {
                        B();
                    }
                }
            }
        }
        if (((mm2.e1) this.f445138h.a(mm2.e1.class)).g7()) {
            E();
        }
        C();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveVisitorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.h7q;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.h7q);
        if (c1073x7e08a787 != null) {
            i17 = com.p314xaae8f345.mm.R.id.h8q;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.h8q);
            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                i17 = com.p314xaae8f345.mm.R.id.h8r;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.h8r);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.lly;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.lly);
                    if (c22699x3dcdb352 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.q6g;
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q6g);
                        if (c1073x7e08a7872 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.q6h;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q6h);
                            if (textView2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.q6i;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q6i);
                                if (textView3 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.f566697q72;
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566697q72);
                                    if (c22699x3dcdb3522 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.q7e;
                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q7e);
                                        if (c1073x7e08a7873 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.q7f;
                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q7f);
                                            if (textView4 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.q7g;
                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q7g);
                                                if (textView5 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.qv8;
                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qv8);
                                                    if (c22641xff2656ea != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.qv9;
                                                        android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qv9);
                                                        if (textView6 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.qv_;
                                                            android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qv_);
                                                            if (textView7 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.q9q;
                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q9q);
                                                                if (c22644xc8fbf3b2 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.q9r;
                                                                    android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q9r);
                                                                    if (textView8 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.q_r;
                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_r);
                                                                        if (c22699x3dcdb3523 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.q_s;
                                                                            android.view.View a17 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_s);
                                                                            if (a17 != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.q_t;
                                                                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_t);
                                                                                if (imageView != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.q_u;
                                                                                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_u);
                                                                                    if (c1073x7e08a7874 != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.q_v;
                                                                                        android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_v);
                                                                                        if (textView9 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.q_w;
                                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_w);
                                                                                            if (c22699x3dcdb3524 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.q_y;
                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_y);
                                                                                                if (c22699x3dcdb3525 != null) {
                                                                                                    i17 = com.p314xaae8f345.mm.R.id.q_z;
                                                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_z);
                                                                                                    if (c22699x3dcdb3526 != null) {
                                                                                                        i17 = com.p314xaae8f345.mm.R.id.mz6;
                                                                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mz6);
                                                                                                        if (c1073x7e08a7875 != null) {
                                                                                                            i17 = com.p314xaae8f345.mm.R.id.mz7;
                                                                                                            android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mz7);
                                                                                                            if (textView10 != null) {
                                                                                                                i17 = com.p314xaae8f345.mm.R.id.mz8;
                                                                                                                android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mz8);
                                                                                                                if (textView11 != null) {
                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.f568770nz5;
                                                                                                                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7876 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f568770nz5);
                                                                                                                    if (c1073x7e08a7876 != null) {
                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.nz6;
                                                                                                                        android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.nz6);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.nz7;
                                                                                                                            android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.nz7);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.qcb;
                                                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b22 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qcb);
                                                                                                                                if (c22644xc8fbf3b22 != null) {
                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.qcc;
                                                                                                                                    android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qcc);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        this.f445140m = new fg2.d1((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) rootView, c1073x7e08a787, viewOnClickListenerC22631x1cc07cc8, textView, c22699x3dcdb352, c1073x7e08a7872, textView2, textView3, c22699x3dcdb3522, c1073x7e08a7873, textView4, textView5, c22641xff2656ea, textView6, textView7, c22644xc8fbf3b2, textView8, c22699x3dcdb3523, a17, imageView, c1073x7e08a7874, textView9, c22699x3dcdb3524, c22699x3dcdb3525, c22699x3dcdb3526, c1073x7e08a7875, textView10, textView11, c1073x7e08a7876, textView12, textView13, c22644xc8fbf3b22, textView14);
                                                                                                                                        c1073x7e08a7875.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var = this.f445140m;
                                                                                                                                        if (d1Var == null) {
                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var.f343520s.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var2 = this.f445140m;
                                                                                                                                        if (d1Var2 == null) {
                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var2.f343505d.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var3 = this.f445140m;
                                                                                                                                        if (d1Var3 == null) {
                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var3.f343507f.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var4 = this.f445140m;
                                                                                                                                        if (d1Var4 == null) {
                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var4.f343514m.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var5 = this.f445140m;
                                                                                                                                        if (d1Var5 == null) {
                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var5.f343509h.setOnClickListener(this);
                                                                                                                                        fg2.d1 d1Var6 = this.f445140m;
                                                                                                                                        if (d1Var6 == null) {
                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var6.f343504c.m81392x52cfa5c6(true);
                                                                                                                                        fg2.d1 d1Var7 = this.f445140m;
                                                                                                                                        if (d1Var7 == null) {
                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        d1Var7.f343504c.m81396xb3e0a10a(new qi2.o1(this));
                                                                                                                                        y();
                                                                                                                                        A();
                                                                                                                                        return;
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void u() {
        a();
        this.f445139i.mo164628x3d6f0539();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r7.f343504c.f292896x != false) goto L18;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v() {
        /*
            r8 = this;
            dk2.pf r6 = new dk2.pf
            int r1 = r8.f445141n
            int r2 = r8.f445142o
            ce2.i r0 = r8.f445143p
            r3 = 0
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.f67814x2c488eb6
            goto Lf
        Le:
            r0 = r3
        Lf:
            if (r0 != 0) goto L13
            java.lang.String r0 = ""
        L13:
            r4 = r0
            int r5 = r8.f445146s
            r0 = 1
            if (r1 != r0) goto L2b
            fg2.d1 r7 = r8.f445140m
            if (r7 == 0) goto L24
            com.tencent.mm.ui.widget.MMSwitchBtn r3 = r7.f343504c
            boolean r3 = r3.f292896x
            if (r3 == 0) goto L2b
            goto L2c
        L24:
            java.lang.String r0 = "uiBinding"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            throw r3
        L2b:
            r0 = 2
        L2c:
            r7 = r0
            r0 = r6
            r3 = r4
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            qi2.p1 r0 = new qi2.p1
            r0.<init>(r8)
            si2.b r1 = r8.f445139i
            r1.c(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.q1.v():void");
    }

    public final void y() {
        this.f445141n = 1;
        fg2.d1 d1Var = this.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var.f343516o.setVisibility(0);
        fg2.d1 d1Var2 = this.f445140m;
        if (d1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var2.f343503b.setVisibility(0);
        fg2.d1 d1Var3 = this.f445140m;
        if (d1Var3 != null) {
            d1Var3.f343517p.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void z() {
        this.f445141n = 2;
        fg2.d1 d1Var = this.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var.f343516o.setVisibility(8);
        fg2.d1 d1Var2 = this.f445140m;
        if (d1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var2.f343517p.setVisibility(0);
        fg2.d1 d1Var3 = this.f445140m;
        if (d1Var3 != null) {
            d1Var3.f343503b.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }
}
