package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class t30 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f201396t;

    /* renamed from: u, reason: collision with root package name */
    public fg2.u1 f201397u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t30(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40 params) {
        super(context, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f201396t = "FinderLiveVisitorMicReplayWidget";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public java.lang.String A() {
        return this.f201396t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public dk2.na B(r45.jt1 res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        r45.gl4 gl4Var = (r45.gl4) res.m75936x14adae67(1);
        if (gl4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f201396t, "micReplayInfo is null");
            return dk2.na.f315344m;
        }
        dk2.qf qfVar = this.f199489i;
        qfVar.getClass();
        java.util.List list = qfVar.G;
        list.clear();
        list.add(new dk2.rf(gl4Var));
        dk2.ma maVar = dk2.na.f315338d;
        r45.hl4 a17 = r45.hl4.a((int) gl4Var.m75942xfb822ef2(2));
        if (a17 == null) {
            a17 = r45.hl4.kMicReplayFailed;
        }
        return maVar.a(a17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public void C(dk2.na status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        fg2.u1 u1Var = this.f201397u;
        if (u1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var.f343893f.setVisibility(0);
        fg2.u1 u1Var2 = this.f201397u;
        if (u1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var2.f343892e.setVisibility(8);
        fg2.u1 u1Var3 = this.f201397u;
        if (u1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var3.f343897j.setVisibility(8);
        fg2.u1 u1Var4 = this.f201397u;
        if (u1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var4.f343895h.setVisibility(8);
        fg2.u1 u1Var5 = this.f201397u;
        if (u1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var5.f343894g.setVisibility(8);
        int ordinal = status.ordinal();
        android.content.Context context = this.f199914d;
        switch (ordinal) {
            case 0:
            case 8:
                fg2.u1 u1Var6 = this.f201397u;
                if (u1Var6 != null) {
                    u1Var6.f343893f.setVisibility(4);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
            case 1:
                fg2.u1 u1Var7 = this.f201397u;
                if (u1Var7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var7.f343892e.setVisibility(0);
                fg2.u1 u1Var8 = this.f201397u;
                if (u1Var8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var8.f343892e.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575274ov3));
                ml2.n4 n4Var = ml2.n4.U;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 49");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                return;
            case 2:
            case 5:
                fg2.u1 u1Var9 = this.f201397u;
                if (u1Var9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var9.f343897j.setVisibility(0);
                fg2.u1 u1Var10 = this.f201397u;
                if (u1Var10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var10.f343897j.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575276ov5));
                return;
            case 3:
                fg2.u1 u1Var11 = this.f201397u;
                if (u1Var11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var11.f343897j.setVisibility(0);
                fg2.u1 u1Var12 = this.f201397u;
                if (u1Var12 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var12.f343897j.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov9));
                ml2.n4 n4Var2 = ml2.n4.W;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 51");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
                return;
            case 4:
                fg2.u1 u1Var13 = this.f201397u;
                if (u1Var13 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var13.f343897j.setVisibility(0);
                fg2.u1 u1Var14 = this.f201397u;
                if (u1Var14 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var14.f343895h.setVisibility(0);
                fg2.u1 u1Var15 = this.f201397u;
                if (u1Var15 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var15.f343897j.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov8));
                ml2.n4 n4Var3 = ml2.n4.X;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 52");
                i95.m c19 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ml2.r0.ik((ml2.r0) c19, n4Var3, null, 0, 6, null);
                return;
            case 6:
                fg2.u1 u1Var16 = this.f201397u;
                if (u1Var16 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var16.f343897j.setVisibility(0);
                fg2.u1 u1Var17 = this.f201397u;
                if (u1Var17 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                u1Var17.f343897j.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575275ov4));
                return;
            case 7:
                fg2.u1 u1Var18 = this.f201397u;
                if (u1Var18 != null) {
                    u1Var18.f343894g.setVisibility(0);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public void G() {
        fg2.u1 u1Var = this.f201397u;
        if (u1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var.f343912y.setVisibility(8);
        fg2.u1 u1Var2 = this.f201397u;
        if (u1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var2.f343890c.setVisibility(8);
        fg2.u1 u1Var3 = this.f201397u;
        if (u1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var3.f343893f.setVisibility(8);
        fg2.u1 u1Var4 = this.f201397u;
        if (u1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var4.f343901n.setVisibility(0);
        fg2.u1 u1Var5 = this.f201397u;
        if (u1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var5.f343902o.setVisibility(0);
        fg2.u1 u1Var6 = this.f201397u;
        if (u1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var6.f343903p.setVisibility(0);
        fg2.u1 u1Var7 = this.f201397u;
        if (u1Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var7.f343891d.setVisibility(8);
        dk2.qf qfVar = this.f199489i;
        int i17 = qfVar.B;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i17 == 3) {
            fg2.u1 u1Var8 = this.f201397u;
            if (u1Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u1Var8.f343910w.setVisibility(0);
            fg2.u1 u1Var9 = this.f201397u;
            if (u1Var9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u1Var9.f343911x.setVisibility(8);
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(qfVar.A, null, 2, null);
            fg2.u1 u1Var10 = this.f201397u;
            if (u1Var10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d finderLiveVisitorMicReplaySelfAvatarIconCircle = u1Var10.f343909v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorMicReplaySelfAvatarIconCircle, "finderLiveVisitorMicReplaySelfAvatarIconCircle");
            a17.c(nVar, finderLiveVisitorMicReplaySelfAvatarIconCircle, g1Var.h(mn2.f1.f411490h));
        } else {
            fg2.u1 u1Var11 = this.f201397u;
            if (u1Var11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u1Var11.f343910w.setVisibility(8);
            fg2.u1 u1Var12 = this.f201397u;
            if (u1Var12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u1Var12.f343911x.setVisibility(0);
            vo0.d l17 = g1Var.l();
            mn2.n nVar2 = new mn2.n(qfVar.A, null, 2, null);
            fg2.u1 u1Var13 = this.f201397u;
            if (u1Var13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d finderLiveVisitorMicReplaySelfAvatarIcon = u1Var13.f343908u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorMicReplaySelfAvatarIcon, "finderLiveVisitorMicReplaySelfAvatarIcon");
            l17.c(nVar2, finderLiveVisitorMicReplaySelfAvatarIcon, g1Var.h(mn2.f1.f411494o));
        }
        vo0.d a18 = g1Var.a();
        mn2.n nVar3 = new mn2.n(qfVar.D, null, 2, null);
        fg2.u1 u1Var14 = this.f201397u;
        if (u1Var14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.ImageView finderLiveVisitorMicReplayAnchorAvatarIcon = u1Var14.f343889b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorMicReplayAnchorAvatarIcon, "finderLiveVisitorMicReplayAnchorAvatarIcon");
        a18.c(nVar3, finderLiveVisitorMicReplayAnchorAvatarIcon, g1Var.h(mn2.f1.f411490h));
        fg2.u1 u1Var15 = this.f201397u;
        if (u1Var15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.content.res.Resources resources = this.f199914d.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = qfVar.E;
        if (str == null) {
            str = " ";
        }
        objArr[0] = str;
        u1Var15.f343913z.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ovh, objArr));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public void I() {
        fg2.u1 u1Var = this.f201397u;
        if (u1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var.f343902o.setVisibility(8);
        fg2.u1 u1Var2 = this.f201397u;
        if (u1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u1Var2.f343903p.setVisibility(8);
        fg2.u1 u1Var3 = this.f201397u;
        if (u1Var3 != null) {
            u1Var3.f343891d.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t30.K():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        fg2.u1 u1Var = this.f201397u;
        if (u1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, u1Var.f343905r);
        java.lang.String str = this.f201396t;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClick: my heat icon");
            fj2.s sVar = fj2.s.f344716a;
            sVar.b(ml2.n4.S);
            H();
            sVar.b(ml2.n4.T);
            return;
        }
        fg2.u1 u1Var2 = this.f201397u;
        if (u1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, u1Var2.f343896i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClick: gen status layout");
            dk2.qf qfVar = this.f199489i;
            dk2.na naVar = qfVar.f315519w;
            if (naVar == dk2.na.f315340f) {
                ml2.n4 n4Var = ml2.n4.V;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 50");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                E(true);
                J(dk2.na.f315346o);
                return;
            }
            if (naVar == dk2.na.f315343i) {
                ml2.n4 n4Var2 = ml2.n4.Y;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 53");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
                dk2.rf rfVar = (dk2.rf) kz5.n0.Z(qfVar.G);
                if (rfVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "openFinderPostGallery: micReplayInfoList is empty");
                } else {
                    D(rfVar, t40.d.f497010e, 109);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.tpy;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tpy);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f566380tq0;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566380tq0);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.f566381tq1;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566381tq1);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f566382tq2;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566382tq2);
                    if (textView2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f566383tq3;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566383tq3);
                        if (linearLayout2 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f566384tq4;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566384tq4);
                            if (frameLayout != null) {
                                i17 = com.p314xaae8f345.mm.R.id.f566385tq5;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566385tq5);
                                if (c22699x3dcdb352 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.tq6;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq6);
                                    if (linearLayout3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.tq7;
                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq7);
                                        if (textView3 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.tq8;
                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq8);
                                            if (linearLayout4 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.tq9;
                                                android.widget.Space space = (android.widget.Space) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq9);
                                                if (space != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.tq_;
                                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq_);
                                                    if (textView4 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.tqa;
                                                        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqa);
                                                        if (linearLayout5 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.tqb;
                                                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqb);
                                                            if (progressBar != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.tqc;
                                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqc);
                                                                if (textView5 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.tqd;
                                                                    android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqd);
                                                                    if (linearLayout6 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.tqe;
                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqe);
                                                                        if (c22699x3dcdb3522 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.tqf;
                                                                            android.widget.Space space2 = (android.widget.Space) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqf);
                                                                            if (space2 != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.tqg;
                                                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqg);
                                                                                if (textView6 != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.tqi;
                                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqi);
                                                                                    if (c22628xfde5d61d != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.tqj;
                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqj);
                                                                                        if (c22628xfde5d61d2 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.tqk;
                                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqk);
                                                                                            if (c22644xc8fbf3b2 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.tql;
                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b22 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tql);
                                                                                                if (c22644xc8fbf3b22 != null) {
                                                                                                    i17 = com.p314xaae8f345.mm.R.id.tqm;
                                                                                                    android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqm);
                                                                                                    if (textView7 != null) {
                                                                                                        i17 = com.p314xaae8f345.mm.R.id.tqn;
                                                                                                        android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqn);
                                                                                                        if (textView8 != null) {
                                                                                                            i17 = com.p314xaae8f345.mm.R.id.tqo;
                                                                                                            android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqo);
                                                                                                            if (linearLayout7 != null) {
                                                                                                                i17 = com.p314xaae8f345.mm.R.id.tqp;
                                                                                                                android.widget.Space space3 = (android.widget.Space) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqp);
                                                                                                                if (space3 != null) {
                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.tqq;
                                                                                                                    android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqq);
                                                                                                                    if (textView9 != null) {
                                                                                                                        this.f201397u = new fg2.u1((android.widget.LinearLayout) rootView, imageView, linearLayout, textView, textView2, linearLayout2, frameLayout, c22699x3dcdb352, linearLayout3, textView3, linearLayout4, space, textView4, linearLayout5, progressBar, textView5, linearLayout6, c22699x3dcdb3522, space2, textView6, c22628xfde5d61d, c22628xfde5d61d2, c22644xc8fbf3b2, c22644xc8fbf3b22, textView7, textView8, linearLayout7, space3, textView9);
                                                                                                                        c22699x3dcdb3522.setOnClickListener(this);
                                                                                                                        fg2.u1 u1Var = this.f201397u;
                                                                                                                        if (u1Var != null) {
                                                                                                                            u1Var.f343896i.setOnClickListener(this);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                            throw null;
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        ml2.n4 n4Var = ml2.n4.R;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 46");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public int y() {
        qs5.d dVar = qs5.d.f447959e;
        return 16;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public long z() {
        return 0L;
    }
}
