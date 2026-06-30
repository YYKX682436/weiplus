package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class h20 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 implements vm2.f {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f200041t;

    /* renamed from: u, reason: collision with root package name */
    public fg2.t1 f200042u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f200043v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f200044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40 params) {
        super(context, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f200041t = "FinderLiveVisitorKTVMicReplayWidget";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f200044w = arrayList;
        fg2.t1 t1Var = this.f200042u;
        if (t1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 finderLiveVisitorKtvMicReplayDetailRecyclerView = t1Var.f343852d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorKtvMicReplayDetailRecyclerView, "finderLiveVisitorKtvMicReplayDetailRecyclerView");
        finderLiveVisitorKtvMicReplayDetailRecyclerView.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context));
        finderLiveVisitorKtvMicReplayDetailRecyclerView.mo7960x6cab2c8d(new vm2.e(arrayList, this));
    }

    public static /* synthetic */ void N(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h20 h20Var, java.lang.Integer num, ml2.k4 k4Var, java.lang.Integer num2, ml2.l4 l4Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        if ((i17 & 2) != 0) {
            k4Var = null;
        }
        if ((i17 & 4) != 0) {
            num2 = null;
        }
        if ((i17 & 8) != 0) {
            l4Var = null;
        }
        h20Var.M(num, k4Var, num2, l4Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public java.lang.String A() {
        return this.f200041t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public dk2.na B(r45.jt1 res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        r45.b54 b54Var = (r45.b54) res.m75936x14adae67(3);
        if (b54Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f200041t, "micReplayInfo is null");
            return dk2.na.f315344m;
        }
        dk2.qf qfVar = this.f199489i;
        qfVar.getClass();
        java.util.List list = qfVar.G;
        list.clear();
        java.util.LinkedList<r45.gl4> m75941xfb821914 = b54Var.m75941xfb821914(0);
        if (m75941xfb821914 != null) {
            for (r45.gl4 gl4Var : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gl4Var);
                list.add(new dk2.rf(gl4Var));
            }
        }
        dk2.ma maVar = dk2.na.f315338d;
        r45.hl4 a17 = r45.hl4.a((int) b54Var.m75942xfb822ef2(2));
        if (a17 == null) {
            a17 = r45.hl4.kMicReplayFailed;
        }
        dk2.na a18 = maVar.a(a17);
        P(a18);
        return a18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public void C(dk2.na status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        fg2.t1 t1Var = this.f200042u;
        if (t1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var.f343857i.setVisibility(0);
        fg2.t1 t1Var2 = this.f200042u;
        if (t1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var2.f343856h.setVisibility(8);
        fg2.t1 t1Var3 = this.f200042u;
        if (t1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var3.f343861m.setVisibility(8);
        fg2.t1 t1Var4 = this.f200042u;
        if (t1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var4.f343859k.setVisibility(8);
        fg2.t1 t1Var5 = this.f200042u;
        if (t1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var5.f343858j.setVisibility(8);
        int ordinal = status.ordinal();
        android.content.Context context = this.f199914d;
        switch (ordinal) {
            case 0:
            case 8:
                fg2.t1 t1Var6 = this.f200042u;
                if (t1Var6 != null) {
                    t1Var6.f343857i.setVisibility(4);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
            case 1:
                fg2.t1 t1Var7 = this.f200042u;
                if (t1Var7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var7.f343856h.setVisibility(0);
                fg2.t1 t1Var8 = this.f200042u;
                if (t1Var8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var8.f343856h.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575274ov3));
                M(null, ml2.k4.f409182e, 1, ml2.l4.f409232e);
                return;
            case 2:
            case 5:
                fg2.t1 t1Var9 = this.f200042u;
                if (t1Var9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var9.f343861m.setVisibility(0);
                fg2.t1 t1Var10 = this.f200042u;
                if (t1Var10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var10.f343861m.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575276ov5));
                return;
            case 3:
                fg2.t1 t1Var11 = this.f200042u;
                if (t1Var11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var11.f343861m.setVisibility(0);
                fg2.t1 t1Var12 = this.f200042u;
                if (t1Var12 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var12.f343859k.setVisibility(0);
                fg2.t1 t1Var13 = this.f200042u;
                if (t1Var13 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var13.f343861m.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov9));
                M(null, ml2.k4.f409182e, 1, ml2.l4.f409233f);
                return;
            case 4:
                fg2.t1 t1Var14 = this.f200042u;
                if (t1Var14 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var14.f343861m.setVisibility(0);
                fg2.t1 t1Var15 = this.f200042u;
                if (t1Var15 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var15.f343859k.setVisibility(0);
                fg2.t1 t1Var16 = this.f200042u;
                if (t1Var16 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var16.f343861m.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov8));
                M(null, ml2.k4.f409182e, 1, ml2.l4.f409234g);
                return;
            case 6:
                fg2.t1 t1Var17 = this.f200042u;
                if (t1Var17 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var17.f343861m.setVisibility(0);
                fg2.t1 t1Var18 = this.f200042u;
                if (t1Var18 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                t1Var18.f343861m.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575275ov4));
                return;
            case 7:
                fg2.t1 t1Var19 = this.f200042u;
                if (t1Var19 != null) {
                    t1Var19.f343858j.setVisibility(0);
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
        fg2.t1 t1Var = this.f200042u;
        if (t1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var.f343872x.setVisibility(8);
        fg2.t1 t1Var2 = this.f200042u;
        if (t1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var2.f343854f.setVisibility(8);
        fg2.t1 t1Var3 = this.f200042u;
        if (t1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var3.f343857i.setVisibility(8);
        fg2.t1 t1Var4 = this.f200042u;
        if (t1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var4.f343865q.setVisibility(0);
        fg2.t1 t1Var5 = this.f200042u;
        if (t1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var5.f343866r.setVisibility(0);
        fg2.t1 t1Var6 = this.f200042u;
        if (t1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var6.f343867s.setVisibility(0);
        fg2.t1 t1Var7 = this.f200042u;
        if (t1Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var7.f343855g.setVisibility(8);
        dk2.qf qfVar = this.f199489i;
        int i17 = qfVar.B;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i17 == 3) {
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(qfVar.A, null, 2, null);
            fg2.t1 t1Var8 = this.f200042u;
            if (t1Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView finderLiveVisitorMicReplayAvatarIcon = t1Var8.f343853e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorMicReplayAvatarIcon, "finderLiveVisitorMicReplayAvatarIcon");
            a17.c(nVar, finderLiveVisitorMicReplayAvatarIcon, g1Var.h(mn2.f1.f411490h));
        } else {
            vo0.d l17 = g1Var.l();
            mn2.n nVar2 = new mn2.n(qfVar.A, null, 2, null);
            fg2.t1 t1Var9 = this.f200042u;
            if (t1Var9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView finderLiveVisitorMicReplayAvatarIcon2 = t1Var9.f343853e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorMicReplayAvatarIcon2, "finderLiveVisitorMicReplayAvatarIcon");
            l17.c(nVar2, finderLiveVisitorMicReplayAvatarIcon2, g1Var.h(mn2.f1.f411494o));
        }
        fg2.t1 t1Var10 = this.f200042u;
        if (t1Var10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.content.res.Resources resources = this.f199914d.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = qfVar.C;
        if (str == null) {
            str = " ";
        }
        objArr[0] = str;
        t1Var10.f343873y.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.owf, objArr));
        fg2.t1 t1Var11 = this.f200042u;
        if (t1Var11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (t1Var11.f343849a.getWidth() != 0) {
            L(false);
            return;
        }
        fg2.t1 t1Var12 = this.f200042u;
        if (t1Var12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.view.ViewTreeObserver viewTreeObserver = t1Var12.f343849a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g20(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public void I() {
        fg2.t1 t1Var = this.f200042u;
        if (t1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var.f343866r.setVisibility(8);
        fg2.t1 t1Var2 = this.f200042u;
        if (t1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        t1Var2.f343867s.setVisibility(8);
        fg2.t1 t1Var3 = this.f200042u;
        if (t1Var3 != null) {
            t1Var3.f343855g.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h20.K():void");
    }

    public final void L(boolean z17) {
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f200041t, "closeReplayDetailPage: shouldAnimation = " + z17);
        this.f200043v = false;
        fg2.t1 t1Var = this.f200042u;
        if (t1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout finderLiveVisitorKtvMicReplayDetailContent = t1Var.f343851c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorKtvMicReplayDetailContent, "finderLiveVisitorKtvMicReplayDetailContent");
        fg2.t1 t1Var2 = this.f200042u;
        if (t1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        float width = t1Var2.f343849a.getWidth();
        if (!z17) {
            O(false);
            finderLiveVisitorKtvMicReplayDetailContent.setTranslationX(width);
            return;
        }
        O(true);
        android.view.ViewPropertyAnimator animate = finderLiveVisitorKtvMicReplayDetailContent.animate();
        if (animate == null || (translationX = animate.translationX(width)) == null || (duration = translationX.setDuration(300L)) == null || (withEndAction = duration.withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e20(this))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void M(java.lang.Integer num, ml2.k4 k4Var, java.lang.Integer num2, ml2.l4 l4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f200041t, "reportKTVReplay: type = " + num + ", element = " + k4Var + ", subType = " + num2 + ", subElement = " + l4Var);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408750a3;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (num != null) {
            jSONObject.put("type", num.intValue());
        }
        if (k4Var != null) {
            jSONObject.put("element", k4Var.f409186d);
        }
        if (num2 != null) {
            jSONObject.put("subType", num2.intValue());
        }
        if (l4Var != null) {
            jSONObject.put("subElement", l4Var.f409236d);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void O(boolean z17) {
        fg2.t1 t1Var = this.f200042u;
        if (t1Var != null) {
            t1Var.f343849a.m57357x5755edc5(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void P(dk2.na naVar) {
        if (this.f200043v) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("oldSize = ");
            java.util.ArrayList arrayList = this.f200044w;
            sb6.append(arrayList.size());
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = this.f200041t;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            java.util.List S0 = kz5.n0.S0(arrayList);
            arrayList.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "status = " + naVar);
            if (naVar == dk2.na.f315343i) {
                arrayList.add(new vm2.k(3));
            } else {
                arrayList.add(new vm2.k(2));
            }
            int a17 = com.p314xaae8f345.mm.ui.zk.a(this.f199914d, 24);
            for (dk2.rf rfVar : this.f199489i.G) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "add micReplayInfo = " + rfVar);
                arrayList.add(new vm2.n(rfVar, a17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "newSize = " + arrayList.size());
            p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a18 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new vm2.g(S0, arrayList), true);
            fg2.t1 t1Var = this.f200042u;
            if (t1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = t1Var.f343852d.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                a18.b(mo7946xf939df19);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ec9;
    }

    @Override // vm2.f
    public void m1(dk2.rf micReplayInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayInfo, "micReplayInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickItem: micReplayInfo = ");
        sb6.append(micReplayInfo);
        sb6.append(",status = ");
        int i18 = micReplayInfo.f315578m;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f200041t, sb6.toString());
        android.content.Context context = this.f199914d;
        if (i18 == 0 || i18 == 2) {
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ow8);
            e4Var.c();
            return;
        }
        if (i18 == 3) {
            D(micReplayInfo, t40.d.f497012g, 111);
            return;
        }
        int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.oum);
        e4Var2.c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        fg2.t1 t1Var = this.f200042u;
        if (t1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, t1Var.f343869u);
        java.lang.String str = this.f200041t;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClick: my heat icon");
            H();
            N(this, 1, ml2.k4.f409183f, null, null, 12, null);
            return;
        }
        fg2.t1 t1Var2 = this.f200042u;
        if (t1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, t1Var2.f343860l)) {
            fg2.t1 t1Var3 = this.f200042u;
            if (t1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, t1Var3.f343850b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClick: back icon");
                L(true);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClick: gen status layout");
        dk2.qf qfVar = this.f199489i;
        dk2.na naVar = qfVar.f315519w;
        if (naVar == dk2.na.f315340f) {
            E(true);
            J(dk2.na.f315346o);
            M(null, ml2.k4.f409182e, 2, ml2.l4.f409232e);
            return;
        }
        dk2.na naVar2 = dk2.na.f315343i;
        if (naVar == naVar2 || naVar == dk2.na.f315342h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "openReplayDetailPage: shouldAnimation = true");
            this.f200043v = true;
            fg2.t1 t1Var4 = this.f200042u;
            if (t1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.LinearLayout finderLiveVisitorKtvMicReplayDetailContent = t1Var4.f343851c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveVisitorKtvMicReplayDetailContent, "finderLiveVisitorKtvMicReplayDetailContent");
            O(true);
            android.view.ViewPropertyAnimator animate = finderLiveVisitorKtvMicReplayDetailContent.animate();
            if (animate != null && (translationX = animate.translationX(0.0f)) != null && (duration = translationX.setDuration(300L)) != null && (withEndAction = duration.withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f20(this))) != null) {
                withEndAction.start();
            }
            N(this, 1, ml2.k4.f409184g, null, null, 12, null);
            P(qfVar.f315519w);
            dk2.na naVar3 = qfVar.f315519w;
            if (naVar3 == naVar2) {
                M(null, ml2.k4.f409182e, 2, ml2.l4.f409234g);
            } else if (naVar3 == dk2.na.f315342h) {
                M(null, ml2.k4.f409182e, 2, ml2.l4.f409233f);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.tp_;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tp_);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.tpa;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tpa);
            if (c22699x3dcdb352 != null) {
                i17 = com.p314xaae8f345.mm.R.id.tpb;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tpb);
                if (linearLayout2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.tpc;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tpc);
                    if (c1163xf1deaba4 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6) rootView;
                        i17 = com.p314xaae8f345.mm.R.id.tpz;
                        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tpz);
                        if (imageView != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f566380tq0;
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566380tq0);
                            if (linearLayout3 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.f566381tq1;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566381tq1);
                                if (textView != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.f566382tq2;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566382tq2);
                                    if (textView2 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.f566383tq3;
                                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566383tq3);
                                        if (linearLayout4 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f566384tq4;
                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566384tq4);
                                            if (frameLayout != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.f566385tq5;
                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566385tq5);
                                                if (c22699x3dcdb3522 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.tq6;
                                                    android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq6);
                                                    if (linearLayout5 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.tq7;
                                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq7);
                                                        if (textView3 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.tq8;
                                                            android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq8);
                                                            if (linearLayout6 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.tq9;
                                                                android.widget.Space space = (android.widget.Space) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq9);
                                                                if (space != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.tq_;
                                                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tq_);
                                                                    if (textView4 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.tqa;
                                                                        android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqa);
                                                                        if (linearLayout7 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.tqb;
                                                                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqb);
                                                                            if (progressBar != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.tqc;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqc);
                                                                                if (textView5 != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.tqd;
                                                                                    android.widget.LinearLayout linearLayout8 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqd);
                                                                                    if (linearLayout8 != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.tqe;
                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqe);
                                                                                        if (c22699x3dcdb3523 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.tqf;
                                                                                            android.widget.Space space2 = (android.widget.Space) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqf);
                                                                                            if (space2 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.tqg;
                                                                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqg);
                                                                                                if (textView6 != null) {
                                                                                                    i17 = com.p314xaae8f345.mm.R.id.tqm;
                                                                                                    android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqm);
                                                                                                    if (textView7 != null) {
                                                                                                        i17 = com.p314xaae8f345.mm.R.id.tqn;
                                                                                                        android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqn);
                                                                                                        if (textView8 != null) {
                                                                                                            i17 = com.p314xaae8f345.mm.R.id.tqo;
                                                                                                            android.widget.LinearLayout linearLayout9 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqo);
                                                                                                            if (linearLayout9 != null) {
                                                                                                                i17 = com.p314xaae8f345.mm.R.id.tqp;
                                                                                                                android.widget.Space space3 = (android.widget.Space) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqp);
                                                                                                                if (space3 != null) {
                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.tqq;
                                                                                                                    android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tqq);
                                                                                                                    if (textView9 != null) {
                                                                                                                        this.f200042u = new fg2.t1(c14327xf6cdefc6, linearLayout, c22699x3dcdb352, linearLayout2, c1163xf1deaba4, c14327xf6cdefc6, imageView, linearLayout3, textView, textView2, linearLayout4, frameLayout, c22699x3dcdb3522, linearLayout5, textView3, linearLayout6, space, textView4, linearLayout7, progressBar, textView5, linearLayout8, c22699x3dcdb3523, space2, textView6, textView7, textView8, linearLayout9, space3, textView9);
                                                                                                                        c22699x3dcdb3523.setOnClickListener(this);
                                                                                                                        fg2.t1 t1Var = this.f200042u;
                                                                                                                        if (t1Var == null) {
                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        t1Var.f343860l.setOnClickListener(this);
                                                                                                                        fg2.t1 t1Var2 = this.f200042u;
                                                                                                                        if (t1Var2 != null) {
                                                                                                                            t1Var2.f343850b.setOnClickListener(this);
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
        N(this, 1, ml2.k4.f409182e, null, null, 12, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public int y() {
        qs5.d dVar = qs5.d.f447959e;
        return 17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40
    public long z() {
        return 1L;
    }
}
