package pi2;

/* loaded from: classes3.dex */
public final class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final qf2.q3 H;
    public fg2.n1 I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f436351J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 K;
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf L;
    public final jz5.g M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context, qf2.q3 controller) {
        super(context, false, null, 0.75f, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = controller;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14240xa0fde07 c14240xa0fde07 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14240xa0fde07();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f436351J = arrayList;
        this.L = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(c14240xa0fde07, arrayList, false);
        this.M = jz5.h.b(new pi2.s0(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ds7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.r2_;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r2_);
        if (c22661xa3a2b3c0 != null) {
            i17 = com.p314xaae8f345.mm.R.id.f564243r34;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564243r34);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.b5i;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.b5i);
                if (c22661xa3a2b3c02 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f565399ca1;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f565399ca1);
                    if (textView2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.ci6;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ci6);
                        if (linearLayout != null) {
                            i17 = com.p314xaae8f345.mm.R.id.riw;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.riw);
                            if (linearLayout2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.riy;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.riy);
                                if (c22661xa3a2b3c03 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.rjo;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rjo);
                                    if (linearLayout3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.gyq;
                                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.gyq);
                                        if (relativeLayout != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f567068i05;
                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567068i05);
                                            if (c22699x3dcdb352 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.imn;
                                                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.imn);
                                                if (progressBar != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.lqa;
                                                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.lqa);
                                                    if (c22849x81a93d25 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.r9o;
                                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r9o);
                                                        if (textView3 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.pkg;
                                                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.pkg);
                                                            if (relativeLayout2 != null) {
                                                                this.I = new fg2.n1((android.widget.FrameLayout) rootView, c22661xa3a2b3c0, textView, c22661xa3a2b3c02, textView2, linearLayout, linearLayout2, c22661xa3a2b3c03, linearLayout3, relativeLayout, c22699x3dcdb352, progressBar, c22849x81a93d25, textView3, relativeLayout2);
                                                                c22699x3dcdb352.setOnClickListener(this);
                                                                fg2.n1 n1Var = this.I;
                                                                if (n1Var == null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                    throw null;
                                                                }
                                                                android.widget.TextView waitingText = n1Var.f343706l;
                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(waitingText, "waitingText");
                                                                com.p314xaae8f345.mm.ui.fk.a(waitingText);
                                                                fg2.n1 n1Var2 = this.I;
                                                                if (n1Var2 == null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                    throw null;
                                                                }
                                                                n1Var2.f343698d.setOnClickListener(this);
                                                                fg2.n1 n1Var3 = this.I;
                                                                if (n1Var3 == null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                    throw null;
                                                                }
                                                                n1Var3.f343701g.setOnClickListener(this);
                                                                fg2.n1 n1Var4 = this.I;
                                                                if (n1Var4 == null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                    throw null;
                                                                }
                                                                n1Var4.f343696b.setOnClickListener(this);
                                                                fg2.n1 n1Var5 = this.I;
                                                                if (n1Var5 == null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                    throw null;
                                                                }
                                                                n1Var5.f343705k.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f199716e));
                                                                fg2.n1 n1Var6 = this.I;
                                                                if (n1Var6 == null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                    throw null;
                                                                }
                                                                n1Var6.f343705k.mo7960x6cab2c8d(this.L);
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    public final void e0(boolean z17, r45.nu1 nu1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        if (!z17) {
            if (nu1Var != null) {
                f0(nu1Var);
            }
        } else {
            g0(true);
            pi2.v0 v0Var = new pi2.v0(this);
            qf2.q3 q3Var = this.H;
            q3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePayMicControl", "requestPurchaseInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(q3Var, null, null, new qf2.o3(false, q3Var, v0Var, null), 3, null);
        }
    }

    public final void f0(r45.nu1 nu1Var) {
        if (nu1Var != null) {
            g0(false);
            r45.nb nbVar = (r45.nb) nu1Var.m75936x14adae67(2);
            if (nbVar != null) {
                if (nbVar.m75933x41a8a7f2(3)) {
                    fg2.n1 n1Var = this.I;
                    if (n1Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    n1Var.f343700f.setVisibility(8);
                    fg2.n1 n1Var2 = this.I;
                    if (n1Var2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    n1Var2.f343702h.setVisibility(0);
                    fg2.n1 n1Var3 = this.I;
                    if (n1Var3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    n1Var3.f343697c.setVisibility(0);
                } else {
                    fg2.n1 n1Var4 = this.I;
                    if (n1Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    n1Var4.f343700f.setVisibility(0);
                    fg2.n1 n1Var5 = this.I;
                    if (n1Var5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    n1Var5.f343702h.setVisibility(8);
                    fg2.n1 n1Var6 = this.I;
                    if (n1Var6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    n1Var6.f343697c.setVisibility(8);
                }
                fg2.n1 n1Var7 = this.I;
                if (n1Var7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                n1Var7.f343706l.setText(this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mmz, java.lang.Integer.valueOf(nbVar.m75939xb282bd08(5))));
                java.util.ArrayList arrayList = this.f436351J;
                arrayList.clear();
                java.util.LinkedList<r45.if5> m75941xfb821914 = nbVar.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getApplyed_audience_list(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (r45.if5 if5Var : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(if5Var);
                    arrayList2.add(new vi2.l(if5Var));
                }
                arrayList.addAll(arrayList2);
                this.L.m8146xced61ae5();
            }
        }
    }

    public final void g0(boolean z17) {
        if (z17) {
            fg2.n1 n1Var = this.I;
            if (n1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            n1Var.f343704j.setVisibility(0);
            fg2.n1 n1Var2 = this.I;
            if (n1Var2 != null) {
                n1Var2.f343699e.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        fg2.n1 n1Var3 = this.I;
        if (n1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        n1Var3.f343704j.setVisibility(8);
        fg2.n1 n1Var4 = this.I;
        if (n1Var4 != null) {
            n1Var4.f343699e.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicWaittingPanel"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r7 == 0) goto L27
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L28
        L27:
            r7 = r0
        L28:
            fg2.n1 r1 = r6.I
            java.lang.String r2 = "uiBinding"
            if (r1 == 0) goto Ld4
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r1.f343703i
            int r1 = r1.getId()
            r3 = 0
            r4 = 1
            if (r7 != 0) goto L3a
            goto L45
        L3a:
            int r5 = r7.intValue()
            if (r5 != r1) goto L45
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(r6, r3, r4, r0)
            goto Lbc
        L45:
            fg2.n1 r1 = r6.I
            if (r1 == 0) goto Ld0
            com.tencent.mm.ui.widget.button.WeButton r1 = r1.f343698d
            int r1 = r1.getId()
            if (r7 != 0) goto L52
            goto L5a
        L52:
            int r5 = r7.intValue()
            if (r5 != r1) goto L5a
        L58:
            r1 = r4
            goto L6f
        L5a:
            fg2.n1 r1 = r6.I
            if (r1 == 0) goto Lcc
            com.tencent.mm.ui.widget.button.WeButton r1 = r1.f343701g
            int r1 = r1.getId()
            if (r7 != 0) goto L67
            goto L6e
        L67:
            int r5 = r7.intValue()
            if (r5 != r1) goto L6e
            goto L58
        L6e:
            r1 = r3
        L6f:
            if (r1 == 0) goto L93
            fj2.j r7 = fj2.j.f344707a
            com.tencent.mm.ui.widget.dialog.k0 r0 = r6.K
            android.content.Context r1 = r6.f199716e
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131764179(0x7f1023d3, float:1.9159484E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            pi2.u0 r3 = new pi2.u0
            r3.<init>(r6)
            com.tencent.mm.ui.widget.dialog.k0 r7 = r7.b(r0, r1, r2, r3)
            r6.K = r7
            goto Lbc
        L93:
            fg2.n1 r1 = r6.I
            if (r1 == 0) goto Lc8
            com.tencent.mm.ui.widget.button.WeButton r1 = r1.f343696b
            int r1 = r1.getId()
            if (r7 != 0) goto La0
            goto Lbc
        La0:
            int r7 = r7.intValue()
            if (r7 != r1) goto Lbc
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(r6, r3, r4, r0)
            jz5.g r7 = r6.M
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            r0 = r7
            pi2.t r0 = (pi2.t) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(r0, r1, r2, r3, r4, r5)
        Lbc:
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicWaittingPanel"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        Lc8:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r0
        Lcc:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r0
        Ld0:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r0
        Ld4:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pi2.w0.onClick(android.view.View):void");
    }
}
