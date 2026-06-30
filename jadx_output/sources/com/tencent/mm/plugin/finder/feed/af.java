package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class af extends com.tencent.mm.ui.component.UIComponent {
    public static final float B1 = j65.f.f();
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView A;
    public final int A1;
    public android.widget.ImageView B;
    public android.widget.ImageView C;
    public android.widget.ImageView D;
    public android.widget.ImageView E;
    public androidx.constraintlayout.widget.ConstraintLayout F;
    public android.widget.TextView G;
    public android.widget.ScrollView H;
    public com.tencent.mm.ui.widget.RoundCornerRelativeLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f106254J;
    public android.widget.ImageView K;
    public android.widget.TextView L;
    public com.tencent.mm.ui.widget.imageview.WeImageView M;
    public android.view.View N;
    public java.lang.String P;
    public int Q;
    public int R;
    public java.util.LinkedList S;
    public r45.m70 T;
    public r45.l70 U;
    public java.lang.String V;
    public int W;
    public long X;
    public boolean Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106255d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f106256e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106257f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f106258g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f106259h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.RCConstraintLayout f106260i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f106261l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f106262m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106263n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106264o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106265p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f106266p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f106267p1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106268q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f106269r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106270s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106271t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106272u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106273v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ConcertTicketTextView f106274w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f106275x;

    /* renamed from: x0, reason: collision with root package name */
    public az2.f f106276x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f106277x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f106278y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.LinkedList f106279y0;

    /* renamed from: y1, reason: collision with root package name */
    public final db5.t4 f106280y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f106281z;

    /* renamed from: z1, reason: collision with root package name */
    public final int f106282z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f106255d = "FinderLiveConcertTicketUIC";
        this.P = "";
        this.f106279y0 = new java.util.LinkedList();
        this.f106280y1 = new com.tencent.mm.plugin.finder.feed.ce(this);
        this.f106282z1 = 1;
        this.A1 = 2;
    }

    public static final void O6(com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        if (afVar.f106277x1 == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) afVar.getContext(), 0, true);
            afVar.f106277x1 = k0Var;
            k0Var.X1 = false;
            k0Var.U1 = true;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = afVar.f106277x1;
        if (k0Var2 != null) {
            k0Var2.f211855d2 = false;
        }
        if (k0Var2 != null) {
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            new com.tencent.mm.pluginsdk.forward.m().Di(afVar.getActivity(), k0Var2, 2, null, new com.tencent.mm.plugin.finder.feed.pe(z17, afVar));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = afVar.f106277x1;
        if (k0Var3 != null) {
            k0Var3.f211872n = new com.tencent.mm.plugin.finder.feed.ke(afVar, z17);
        }
        if (k0Var3 != null) {
            k0Var3.f211881s = afVar.f106280y1;
        }
        if (k0Var3 != null) {
            k0Var3.p(new com.tencent.mm.plugin.finder.feed.sd(afVar));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var4 = afVar.f106277x1;
        if (k0Var4 != null) {
            k0Var4.v();
        }
    }

    public static final android.graphics.Bitmap P6(com.tencent.mm.plugin.finder.feed.af afVar, android.graphics.Bitmap bitmap, float f17) {
        java.lang.Throwable th6;
        ib5.k kVar;
        java.lang.StringBuilder sb6;
        afVar.getClass();
        android.graphics.Bitmap S = com.tencent.mm.sdk.platformtools.x.S(bitmap, bitmap.getHeight() / 5, bitmap.getWidth() / 5, true, true);
        kotlin.jvm.internal.o.f(S, "extractThumbNail(...)");
        new android.graphics.Canvas(S).drawColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
        java.lang.String str = afVar.f106255d;
        ib5.k kVar2 = null;
        try {
            if (f17 > 25.0f) {
                S = com.tencent.mm.sdk.platformtools.x.X(S, (int) f17);
            } else {
                kVar = new ib5.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
                try {
                    kVar.b(S, f17);
                    kVar2 = kVar;
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    try {
                        com.tencent.mars.xlog.Log.e(str, "setBlurBitmap error:" + th6.getMessage());
                        S = com.tencent.mm.sdk.platformtools.x.X(S, (int) f17);
                        if (kVar != null) {
                            try {
                                kVar.destroy();
                            } catch (android.renderscript.RSInvalidStateException e17) {
                                e = e17;
                                sb6 = new java.lang.StringBuilder("RSInvalidStateException ");
                                sb6.append(e.getMessage());
                                com.tencent.mars.xlog.Log.w(str, sb6.toString());
                                kotlin.jvm.internal.o.d(S);
                                return S;
                            }
                        }
                        kotlin.jvm.internal.o.d(S);
                        return S;
                    } catch (java.lang.Throwable th8) {
                        if (kVar != null) {
                            try {
                                kVar.destroy();
                            } catch (android.renderscript.RSInvalidStateException e18) {
                                com.tencent.mars.xlog.Log.w(str, "RSInvalidStateException " + e18.getMessage());
                            }
                        }
                        throw th8;
                    }
                }
            }
            if (kVar2 != null) {
                try {
                    kVar2.destroy();
                } catch (android.renderscript.RSInvalidStateException e19) {
                    e = e19;
                    sb6 = new java.lang.StringBuilder("RSInvalidStateException ");
                    sb6.append(e.getMessage());
                    com.tencent.mars.xlog.Log.w(str, sb6.toString());
                    kotlin.jvm.internal.o.d(S);
                    return S;
                }
            }
        } catch (java.lang.Throwable th9) {
            ib5.k kVar3 = kVar2;
            th6 = th9;
            kVar = kVar3;
        }
        kotlin.jvm.internal.o.d(S);
        return S;
    }

    public static final void Q6(com.tencent.mm.plugin.finder.feed.af afVar) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = afVar.f106277x1;
        if (k0Var != null) {
            k0Var.u();
        }
    }

    public static final void R6(com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        r45.el4 el4Var;
        java.lang.String string;
        r45.el4 el4Var2;
        r45.el4 el4Var3;
        afVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (z17) {
            afVar.e7();
            intent.putExtra("Retr_File_Name", afVar.V);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
        } else {
            java.lang.String X6 = afVar.X6("1");
            com.tencent.mars.xlog.Log.i(afVar.f106255d, "#shareToFriends finally share url = ".concat(X6));
            ot0.q qVar = new ot0.q();
            r45.m70 m70Var = afVar.T;
            java.lang.String str3 = "";
            if (m70Var == null || (el4Var3 = (r45.el4) m70Var.getCustom(25)) == null || (str = el4Var3.getString(0)) == null) {
                str = "";
            }
            qVar.f348654f = str;
            r45.m70 m70Var2 = afVar.T;
            if (m70Var2 == null || (el4Var2 = (r45.el4) m70Var2.getCustom(25)) == null || (str2 = el4Var2.getString(1)) == null) {
                str2 = "";
            }
            qVar.f348658g = str2;
            qVar.f348662h = "view";
            qVar.f348666i = 5;
            qVar.f348674k = X6;
            r45.m70 m70Var3 = afVar.T;
            if (m70Var3 != null && (el4Var = (r45.el4) m70Var3.getCustom(25)) != null && (string = el4Var.getString(3)) != null) {
                str3 = string;
            }
            qVar.f348734z = str3;
            intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
            intent.putExtra("Retr_Msg_Type", 2);
        }
        android.app.Activity context = afVar.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, new com.tencent.mm.plugin.finder.feed.ue(afVar, z17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if ((r2.length() > 0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void S6(com.tencent.mm.plugin.finder.feed.af r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.af.S6(com.tencent.mm.plugin.finder.feed.af, boolean):void");
    }

    public static /* synthetic */ void b7(com.tencent.mm.plugin.finder.feed.af afVar, java.lang.String str, android.widget.ImageView imageView, boolean z17, com.tencent.mm.plugin.finder.storage.y90 y90Var, mn2.f1 f1Var, boolean z18, int i17, int i18, java.lang.Object obj) {
        afVar.a7(str, imageView, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? com.tencent.mm.plugin.finder.storage.y90.f128356f : y90Var, (i18 & 16) != 0 ? mn2.f1.f329964r : f1Var, (i18 & 32) != 0 ? false : z18, (i18 & 64) != 0 ? afVar.A1 : i17);
    }

    public final void T6() {
        com.tencent.mm.view.RCConstraintLayout rCConstraintLayout = this.f106260i;
        if (rCConstraintLayout != null) {
            rCConstraintLayout.postDelayed(new com.tencent.mm.plugin.finder.feed.rd(this), 50L);
        } else {
            kotlin.jvm.internal.o.o("concertTicketViewRoot");
            throw null;
        }
    }

    public final void U6() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = this.S;
        if ((linkedList2 == null || linkedList2.isEmpty()) || (linkedList = this.S) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView = this.f106271t;
        if (concertTicketTextView == null) {
            kotlin.jvm.internal.o.o("concertLyricsTv");
            throw null;
        }
        concertTicketTextView.setText(((r45.fb7) linkedList.get(this.Q)).getString(0));
        this.Q = (this.Q + 1) % linkedList.size();
    }

    public final int V6(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doTpPx originDensity: ");
        float f17 = B1;
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i(this.f106255d, sb6.toString());
        return a06.d.b(f17 * i17);
    }

    public final void W6() {
        az2.f fVar = this.f106276x0;
        if (fVar != null) {
            fVar.b();
        }
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView = this.f106265p;
        if (concertTicketTextView != null) {
            concertTicketTextView.setClickable(true);
        } else {
            kotlin.jvm.internal.o.o("changeImgBtn");
            throw null;
        }
    }

    public final java.lang.String X6(java.lang.String str) {
        r45.el4 el4Var;
        r45.m70 m70Var = this.T;
        java.lang.String string = (m70Var == null || (el4Var = (r45.el4) m70Var.getCustom(25)) == null) ? null : el4Var.getString(2);
        if (string == null || string.length() == 0) {
            return "";
        }
        java.lang.String builder = android.net.Uri.parse(string).buildUpon().appendQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str).toString();
        kotlin.jvm.internal.o.f(builder, "toString(...)");
        return builder;
    }

    public final void Y6(boolean z17) {
        int i17;
        java.util.LinkedList list;
        r45.l70 l70Var;
        java.util.LinkedList list2;
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String headUrl;
        r45.jb7 jb7Var;
        java.util.LinkedList list3;
        java.util.LinkedList list4;
        r45.m70 m70Var;
        java.util.LinkedList list5;
        java.util.LinkedList list6;
        java.util.LinkedList list7;
        jz5.f0 f0Var = null;
        if (z17) {
            int i18 = this.R;
            r45.m70 m70Var2 = this.T;
            if (i18 < ((m70Var2 == null || (list7 = m70Var2.getList(22)) == null) ? 0 : list7.size() - 1)) {
                r45.m70 m70Var3 = this.T;
                if (((m70Var3 == null || (list6 = m70Var3.getList(22)) == null) ? 0 : list6.size()) > 0) {
                    this.R++;
                    m70Var = this.T;
                    if (m70Var != null && (list5 = m70Var.getList(22)) != null) {
                        l70Var = (r45.l70) kz5.n0.a0(list5, this.R);
                    }
                    l70Var = null;
                }
            }
            this.R = 0;
            m70Var = this.T;
            if (m70Var != null) {
                l70Var = (r45.l70) kz5.n0.a0(list5, this.R);
            }
            l70Var = null;
        } else {
            r45.m70 m70Var4 = this.T;
            if (m70Var4 != null && (list2 = m70Var4.getList(22)) != null) {
                java.util.Iterator it = list2.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    java.lang.String string = ((r45.l70) it.next()).getString(0);
                    r45.m70 m70Var5 = this.T;
                    if (kotlin.jvm.internal.o.b(string, m70Var5 != null ? m70Var5.getString(21) : null)) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                i17 = 0;
            }
            this.R = i17;
            if (i17 < 0) {
                this.R = 0;
            }
            r45.m70 m70Var6 = this.T;
            if (m70Var6 != null && (list = m70Var6.getList(22)) != null) {
                l70Var = (r45.l70) kz5.n0.a0(list, this.R);
            }
            l70Var = null;
        }
        this.U = l70Var;
        this.f106267p1 = l70Var != null ? l70Var.getString(0) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("concertTicketInfo id:");
        r45.m70 m70Var7 = this.T;
        sb6.append(m70Var7 != null ? m70Var7.getString(0) : null);
        sb6.append(", size:");
        r45.m70 m70Var8 = this.T;
        sb6.append((m70Var8 == null || (list4 = m70Var8.getList(22)) == null) ? null : java.lang.Integer.valueOf(list4.size()));
        sb6.append(", title:");
        r45.m70 m70Var9 = this.T;
        sb6.append(m70Var9 != null ? m70Var9.getString(1) : null);
        sb6.append(", resourceId:");
        r45.l70 l70Var2 = this.U;
        sb6.append(l70Var2 != null ? l70Var2.getString(0) : null);
        sb6.append(", resourceWordSize:");
        r45.l70 l70Var3 = this.U;
        sb6.append((l70Var3 == null || (jb7Var = (r45.jb7) l70Var3.getCustom(11)) == null || (list3 = jb7Var.getList(3)) == null) ? null : java.lang.Integer.valueOf(list3.size()));
        sb6.append(", isChange:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(this.f106255d, sb6.toString());
        r45.l70 l70Var4 = this.U;
        if (l70Var4 != null) {
            if (z17) {
                az2.f a17 = az2.c.a(az2.f.f16125d, getContext(), getContext().getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
                this.f106276x0 = a17;
                a17.a();
                com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView = this.f106265p;
                if (concertTicketTextView == null) {
                    kotlin.jvm.internal.o.o("changeImgBtn");
                    throw null;
                }
                concertTicketTextView.setClickable(false);
            } else {
                f7();
            }
            java.lang.String string2 = l70Var4.getString(8);
            java.lang.String str = string2 == null ? "" : string2;
            java.lang.String string3 = l70Var4.getString(2);
            java.lang.String str2 = string3 == null ? "" : string3;
            r45.m70 m70Var10 = this.T;
            java.lang.String str3 = (m70Var10 == null || (xn1Var = (r45.xn1) m70Var10.getCustom(7)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (headUrl = finderContact.getHeadUrl()) == null) ? "" : headUrl;
            java.lang.String string4 = l70Var4.getString(3);
            java.lang.String str4 = string4 == null ? "" : string4;
            java.lang.String string5 = l70Var4.getString(9);
            h7(str, str2, str3, str4, string5 == null ? "" : string5, z17);
            android.widget.TextView textView = this.G;
            if (textView == null) {
                kotlin.jvm.internal.o.o("concertRetryBtn");
                throw null;
            }
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.yd(this, z17));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.we(this));
        }
    }

    public final boolean Z6() {
        r45.el4 el4Var;
        java.lang.String string;
        r45.m70 m70Var = this.T;
        if (m70Var == null || (el4Var = (r45.el4) m70Var.getCustom(25)) == null || (string = el4Var.getString(2)) == null) {
            return false;
        }
        return string.length() > 0;
    }

    public final void a7(java.lang.String str, android.widget.ImageView imageView, boolean z17, com.tencent.mm.plugin.finder.storage.y90 y90Var, mn2.f1 f1Var, boolean z18, int i17) {
        com.tencent.mars.xlog.Log.i(this.f106255d, "loadConcertImage url: " + str + ", view: " + imageView.hashCode());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, y90Var), g1Var.h(f1Var));
            com.tencent.mm.plugin.finder.feed.ae aeVar = new com.tencent.mm.plugin.finder.feed.ae(z17, z18, this, imageView, i17);
            b17.getClass();
            b17.f447873d = aeVar;
            b17.f();
            return;
        }
        if (i17 == 0) {
            imageView.setImageDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.c0z));
            c7();
            return;
        }
        if (i17 == this.f106282z1) {
            imageView.setImageDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bhm));
            c7();
        } else if (i17 == this.A1) {
            if (z17) {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.we(this));
            } else {
                imageView.setImageDrawable(null);
                c7();
            }
        }
    }

    public final void c7() {
        this.W++;
        com.tencent.mars.xlog.Log.i(this.f106255d, "currentReadyCount: " + this.W);
        if (this.W == 5) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.qe(this));
        }
    }

    public final void d7(android.widget.TextView textView, java.util.LinkedList linkedList, int i17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        java.lang.String str = linkedList != null ? (java.lang.String) kz5.n0.Z(linkedList) : null;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = linkedList != null ? (java.lang.String) kz5.n0.k0(linkedList) : null;
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
                    sb6.append(linkedList != null ? (java.lang.String) linkedList.getFirst() : null);
                    i17 = android.graphics.Color.parseColor(sb6.toString());
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.i(this.f106255d, "color parse false");
                }
            }
        }
        textView.setTextColor(i17);
    }

    public final void e7() {
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView = this.f106263n;
        if (concertTicketTextView == null) {
            kotlin.jvm.internal.o.o("changeWordBtn");
            throw null;
        }
        concertTicketTextView.setVisibility(4);
        com.tencent.mm.view.RCConstraintLayout rCConstraintLayout = this.f106260i;
        if (rCConstraintLayout == null) {
            kotlin.jvm.internal.o.o("concertTicketViewRoot");
            throw null;
        }
        rCConstraintLayout.setRadius(0.0f);
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        r45.m70 m70Var = this.T;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102139h);
        sb6.append("concert_");
        sb6.append(m70Var != null ? java.lang.Long.valueOf(m70Var.getLong(8)) : null);
        sb6.append('_');
        sb6.append(c01.id.a());
        sb6.append(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        this.V = sb6.toString();
        com.tencent.mm.view.RCConstraintLayout rCConstraintLayout2 = this.f106260i;
        if (rCConstraintLayout2 == null) {
            kotlin.jvm.internal.o.o("concertTicketViewRoot");
            throw null;
        }
        com.tencent.mm.sdk.platformtools.x.D0(com.tencent.mm.sdk.platformtools.x.b0(rCConstraintLayout2), 100, android.graphics.Bitmap.CompressFormat.JPEG, this.V, true);
        java.util.LinkedList linkedList = this.S;
        if ((linkedList != null ? linkedList.size() : 0) > 1) {
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView2 = this.f106263n;
            if (concertTicketTextView2 == null) {
                kotlin.jvm.internal.o.o("changeWordBtn");
                throw null;
            }
            concertTicketTextView2.setVisibility(0);
        }
        com.tencent.mm.view.RCConstraintLayout rCConstraintLayout3 = this.f106260i;
        if (rCConstraintLayout3 != null) {
            rCConstraintLayout3.setRadius(i65.a.b(getContext(), 20));
        } else {
            kotlin.jvm.internal.o.o("concertTicketViewRoot");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f7() {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.af.f7():void");
    }

    public final void g7(android.view.View view, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(view, "view");
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5);
        java.lang.String str = linkedList != null ? (java.lang.String) kz5.n0.Z(linkedList) : null;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = linkedList != null ? (java.lang.String) kz5.n0.k0(linkedList) : null;
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
                    sb6.append(linkedList != null ? (java.lang.String) linkedList.getFirst() : null);
                    color = android.graphics.Color.parseColor(sb6.toString());
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.i(this.f106255d, "color parse false");
                }
            }
        }
        view.setBackgroundColor(color);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.apl;
    }

    public final void h7(java.lang.String qrUrl, java.lang.String concertBgUrl, java.lang.String headerUrl, java.lang.String viewBgUrl, java.lang.String logoUrl, boolean z17) {
        kotlin.jvm.internal.o.g(qrUrl, "qrUrl");
        kotlin.jvm.internal.o.g(concertBgUrl, "concertBgUrl");
        kotlin.jvm.internal.o.g(headerUrl, "headerUrl");
        kotlin.jvm.internal.o.g(viewBgUrl, "viewBgUrl");
        kotlin.jvm.internal.o.g(logoUrl, "logoUrl");
        this.f106279y0.clear();
        android.widget.ImageView imageView = this.B;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("concertVisitorShareImage");
            throw null;
        }
        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128355e;
        mn2.f1 f1Var = mn2.f1.f329965s;
        b7(this, qrUrl, imageView, true, y90Var, f1Var, z17, 0, 64, null);
        android.widget.ImageView imageView2 = this.C;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("concertUserHeadImg");
            throw null;
        }
        b7(this, headerUrl, imageView2, false, null, null, z17, this.f106282z1, 24, null);
        android.widget.ImageView imageView3 = this.D;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("concertTicketPicBg");
            throw null;
        }
        b7(this, concertBgUrl, imageView3, true, y90Var, f1Var, z17, 0, 64, null);
        android.widget.ImageView imageView4 = this.f106275x;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("concertLogoIv");
            throw null;
        }
        a7(logoUrl, imageView4, false, y90Var, f1Var, z17, 0);
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(viewBgUrl, y90Var), g1Var.h(f1Var));
        com.tencent.mm.plugin.finder.feed.te teVar = new com.tencent.mm.plugin.finder.feed.te(this, z17);
        b17.getClass();
        b17.f447873d = teVar;
        b17.f();
    }

    public final void i7(android.view.ViewGroup viewGroup, int i17) {
        int childCount = viewGroup.getChildCount();
        if (childCount < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (childAt instanceof android.view.ViewGroup) {
                i7((android.view.ViewGroup) childAt, i17);
            } else if (childAt instanceof android.widget.TextView) {
                ((android.widget.TextView) childAt).setTextColor(i17);
            }
            if (i18 == childCount) {
                return;
            } else {
                i18++;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        W6();
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        T6();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0410  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.af.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.feed.nd.f108570a.a();
        if (!this.Y) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            long j17 = this.X;
            java.lang.String str2 = this.Z;
            java.lang.String enterScene = this.P;
            r45.m70 m70Var = this.T;
            if (m70Var == null || (str = m70Var.getString(0)) == null) {
                str = "";
            }
            r0Var.getClass();
            kotlin.jvm.internal.o.g(enterScene, "enterScene");
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct();
            if (str2 == null || str2.length() == 0) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                str2 = b52.b.b();
            }
            finderBroadcastPageOutStruct.q(str2);
            finderBroadcastPageOutStruct.r("1003");
            finderBroadcastPageOutStruct.p("311");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("staytime", j17);
            jSONObject.put("enter_sence", enterScene);
            jSONObject.put("activityid", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderBroadcastPageOutStruct.s(r26.i0.t(jSONObject2, ",", ";", false));
            finderBroadcastPageOutStruct.k();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22947, contextid = " + finderBroadcastPageOutStruct.f56570i + ", page_id = " + finderBroadcastPageOutStruct.f56566e + ", commentScene = " + finderBroadcastPageOutStruct.f56574m + ", pg_udf_kv = " + finderBroadcastPageOutStruct.f56573l);
            this.Y = true;
        }
        this.f106279y0.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        java.lang.String str = this.f106255d;
        super.onPause();
        r45.m70 m70Var = this.T;
        if (m70Var != null && m70Var.getBoolean(23)) {
            try {
                com.tencent.mars.xlog.Log.i(str, "choose resouceId: " + this.f106267p1);
                r45.eb2 eb2Var = new r45.eb2();
                eb2Var.set(1, db2.t4.f228171a.a(7996));
                r45.m70 m70Var2 = this.T;
                eb2Var.set(2, m70Var2 != null ? m70Var2.getString(0) : null);
                eb2Var.set(3, this.f106267p1);
                eb2Var.set(4, xy2.c.e(getContext()));
                eb2Var.d().l();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str, "#FinderLiveSwitchConcertTicketReq fail. " + e17);
            }
        }
    }
}
