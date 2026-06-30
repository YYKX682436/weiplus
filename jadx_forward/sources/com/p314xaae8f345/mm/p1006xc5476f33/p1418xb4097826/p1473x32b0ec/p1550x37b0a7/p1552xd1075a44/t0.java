package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class t0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a implements kn2.b {
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 D;
    public android.widget.TextView E;
    public android.widget.TextView F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup H;
    public android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f202309J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 K;

    /* renamed from: n, reason: collision with root package name */
    public final kn2.c f202310n;

    /* renamed from: o, reason: collision with root package name */
    public final kn2.d f202311o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f202312p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f202313q;

    /* renamed from: r, reason: collision with root package name */
    public r45.c04 f202314r;

    /* renamed from: s, reason: collision with root package name */
    public r45.c04 f202315s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f202316t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f202317u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedHashMap f202318v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedHashMap f202319w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f202320x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f202321y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f202322z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(android.content.Context r24, p012xc85e97e9.p093xedfae76a.y r25, kn2.c r26, kn2.d r27, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0.<init>(android.content.Context, androidx.lifecycle.y, kn2.c, kn2.d, com.tencent.mm.plugin.finder.live.view.k0):void");
    }

    public final void A(ln2.f fVar) {
        android.view.View view;
        java.lang.String str;
        r45.kv1 kv1Var;
        java.lang.String m75945x2fec8307;
        r45.kv1 kv1Var2;
        java.lang.String str2;
        r45.kv1 kv1Var3;
        java.lang.String m75945x2fec83072;
        r45.kv1 kv1Var4;
        java.lang.String str3;
        r45.kv1 kv1Var5;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.A;
        if (c1073x7e08a787 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
        int childCount = c1073x7e08a787.getChildCount();
        java.lang.String str4 = "NULL_ITEM";
        if (childCount >= 0) {
            int i17 = 0;
            while (true) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.A;
                if (c1073x7e08a7872 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                    throw null;
                }
                android.view.View childAt = c1073x7e08a7872.getChildAt(i17);
                java.lang.Object tag = childAt != null ? childAt.getTag() : null;
                if (fVar == null || (kv1Var5 = fVar.f401423a) == null || (str3 = kv1Var5.m75945x2fec8307(0)) == null) {
                    str3 = "NULL_ITEM";
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, str3)) {
                    if (i17 == childCount) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.A;
                    if (c1073x7e08a7873 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                        throw null;
                    }
                    view = c1073x7e08a7873.getChildAt(i17);
                }
            }
        }
        view = null;
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "add same view return data: " + fVar);
            return;
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = this.A;
        if (c1073x7e08a7874 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
        int childCount2 = c1073x7e08a7874.getChildCount();
        java.util.LinkedHashMap linkedHashMap = this.f202319w;
        java.util.LinkedHashMap linkedHashMap2 = this.f202318v;
        if (childCount2 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "addView contesxt: " + this.f199914d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y(this, fVar);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = this.A;
            if (c1073x7e08a7875 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                throw null;
            }
            android.view.View rootView = yVar.f202346e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
            c1073x7e08a7875.addView(rootView);
            if (fVar == null || (kv1Var2 = fVar.f401423a) == null || (str = kv1Var2.m75945x2fec8307(0)) == null) {
                str = "NULL_ITEM";
            }
            linkedHashMap2.put(str, fVar);
            if (fVar != null && (kv1Var = fVar.f401423a) != null && (m75945x2fec8307 = kv1Var.m75945x2fec8307(0)) != null) {
                str4 = m75945x2fec8307;
            }
            linkedHashMap.put(str4, yVar);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add view size = MAX: ");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7876 = this.A;
        if (c1073x7e08a7876 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
        sb6.append(c1073x7e08a7876.getChildCount());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", sb6.toString());
        linkedHashMap2.remove("NULL_ITEM");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y yVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y) linkedHashMap.remove("NULL_ITEM");
        if (yVar2 != null) {
            if (fVar == null || (kv1Var4 = fVar.f401423a) == null || (str2 = kv1Var4.m75945x2fec8307(0)) == null) {
                str2 = "NULL_ITEM";
            }
            linkedHashMap2.put(str2, fVar);
            yVar2.a(fVar);
            if (fVar != null && (kv1Var3 = fVar.f401423a) != null && (m75945x2fec83072 = kv1Var3.m75945x2fec8307(0)) != null) {
                str4 = m75945x2fec83072;
            }
            linkedHashMap.put(str4, yVar2);
        }
    }

    public final void B() {
        android.widget.TextView textView = this.C;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sumValueText");
            throw null;
        }
        textView.setText(java.lang.String.valueOf(D()));
        java.util.Collection values = this.f202318v.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        boolean z17 = !((java.util.ArrayList) kz5.n0.V(values)).isEmpty();
        kn2.d dVar = this.f202311o;
        boolean z18 = z17 || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) dVar).D1();
        android.view.View view = this.f199916f;
        if (!z18) {
            r45.c04 data = this.f202314r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            if (!(((data.m75942xfb822ef2(1) > 0L ? 1 : (data.m75942xfb822ef2(1) == 0L ? 0 : -1)) > 0 && (data.m75942xfb822ef2(0) > ((long) 0) ? 1 : (data.m75942xfb822ef2(0) == ((long) 0) ? 0 : -1)) > 0 && (data.m75942xfb822ef2(0) > ((long) 3) ? 1 : (data.m75942xfb822ef2(0) == ((long) 3) ? 0 : -1)) <= 0) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) dVar).f196513w)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
                android.widget.TextView textView2 = (android.widget.TextView) view;
                textView2.setTextColor(textView2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
                textView2.setEnabled(false);
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView3 = (android.widget.TextView) view;
        textView3.setTextColor(textView3.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
        textView3.setEnabled(true);
    }

    public final java.lang.String C() {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T7()) {
            z17 = true;
        }
        return z17 ? "startlive.more.anchorwish.interactionwish" : "anchorlive.more.anchorwish.interactionwish";
    }

    public final long D() {
        java.util.Iterator it = this.f202318v.entrySet().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            ln2.f fVar = (ln2.f) ((java.util.Map.Entry) it.next()).getValue();
            if (fVar != null) {
                j17 += ((int) fVar.f401423a.m75938x746dc8a6(9)) * fVar.f401424b;
            }
        }
        return j17;
    }

    public final void E() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.A;
        if (c1073x7e08a787 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
        c1073x7e08a787.removeAllViews();
        this.f202318v.clear();
        this.f202319w.clear();
        A(null);
        android.widget.TextView textView = this.C;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sumValueText");
            throw null;
        }
        textView.setText(java.lang.String.valueOf(D()));
        I();
    }

    public final void F(r45.xs1 xs1Var) {
        r45.c04 c04Var;
        java.lang.String str;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) this.f202311o).C1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "updateCurrentInteractionWishPanel ignore as isInteractionWishSwitchEnable false");
            return;
        }
        if (xs1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WishEditPanelWidget", "updateCurrentInteractionWishPanel with null configResp");
            return;
        }
        this.f202321y = xs1Var.m75933x41a8a7f2(7);
        java.util.LinkedList m75941xfb821914 = xs1Var.m75941xfb821914(5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getEnable_config_interaction_type(...)");
        java.util.ArrayList arrayList = this.f202316t;
        arrayList.clear();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            r45.b04 b04Var = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer num = (java.lang.Integer) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            int intValue = num.intValue();
            if (intValue == 0) {
                b04Var = r45.b04.kInteractionType_Unknown;
            } else if (intValue == 1) {
                b04Var = r45.b04.kInteractionType_Like;
            } else if (intValue == 2) {
                b04Var = r45.b04.kInteractionType_Comment;
            } else if (intValue == 3) {
                b04Var = r45.b04.kInteractionType_Share;
            }
            if (b04Var != null) {
                arrayList.add(b04Var);
            }
        }
        if (xs1Var.m75933x41a8a7f2(3)) {
            c04Var = (r45.c04) xs1Var.m75936x14adae67(1);
            if (c04Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WishEditPanelWidget", "getInteractionWishConfig with config " + xs1Var.m75933x41a8a7f2(3) + " but invalid wish config.");
                c04Var = new r45.c04();
            }
        } else {
            c04Var = new r45.c04();
        }
        H(c04Var);
        java.util.LinkedList m75941xfb8219142 = xs1Var.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getDefault_wish_config_list(...)");
        java.util.HashMap hashMap = this.f202317u;
        hashMap.clear();
        java.util.Iterator it6 = m75941xfb8219142.iterator();
        while (it6.hasNext()) {
            r45.c04 c04Var2 = (r45.c04) it6.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "updateInteractionWishDefaultTarget add " + ((int) c04Var2.m75942xfb822ef2(0)) + " -> " + c04Var2.m75942xfb822ef2(1));
            hashMap.put(java.lang.Integer.valueOf((int) c04Var2.m75942xfb822ef2(0)), java.lang.Long.valueOf(c04Var2.m75942xfb822ef2(1)));
        }
        boolean m75933x41a8a7f2 = xs1Var.m75933x41a8a7f2(4);
        r45.c04 c04Var3 = (r45.c04) xs1Var.m75936x14adae67(2);
        if (!m75933x41a8a7f2) {
            android.widget.TextView textView = this.F;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishRecommendDesc");
                throw null;
            }
        }
        if (c04Var3 != null) {
            if (c04Var3.m75942xfb822ef2(1) > 0 && c04Var3.m75942xfb822ef2(0) > ((long) 0) && c04Var3.m75942xfb822ef2(0) <= ((long) 3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "updateInteractionWishRecommendTarget type:" + c04Var3.m75942xfb822ef2(0) + ", target:" + c04Var3.m75942xfb822ef2(1));
                this.f202315s = c04Var3;
                android.widget.TextView textView2 = this.F;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishRecommendDesc");
                    throw null;
                }
                android.content.Context context = this.f199914d;
                android.content.res.Resources resources = context.getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                int m75942xfb822ef2 = (int) c04Var3.m75942xfb822ef2(0);
                java.lang.String targetCount = zl2.r4.S(zl2.r4.f555483a, c04Var3.m75942xfb822ef2(1), 0, 2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetCount, "targetCount");
                if (m75942xfb822ef2 == 1) {
                    str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575246or0, targetCount);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                } else if (m75942xfb822ef2 == 2) {
                    str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqp, targetCount);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                } else if (m75942xfb822ef2 == 3) {
                    str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575250or4, targetCount);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionWishDataHelper", "getInteractionTypeDescText: unknown interactionType=" + m75942xfb822ef2 + ", using defaultString=\"\"");
                    str = "";
                }
                objArr[0] = str;
                textView2.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575248or2, objArr));
                android.widget.TextView textView3 = this.F;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishRecommendDesc");
                    throw null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WishEditPanelWidget", "updateInteractionWishRecommendTarget fail, recommendWishConfig invalid");
        android.widget.TextView textView4 = this.F;
        if (textView4 != null) {
            textView4.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishRecommendDesc");
            throw null;
        }
    }

    public final void G(java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        java.util.LinkedList linkedList3;
        jz5.f0 f0Var;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) this.f202311o).B1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "updateGiftWishPanel ignore as isGiftEnable false");
            return;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.z94 z94Var = (r45.z94) it.next();
                r45.kv1 kv1Var = (r45.kv1) z94Var.m75936x14adae67(0);
                if (kv1Var != null) {
                    A(new ln2.f(kv1Var, z94Var.m75942xfb822ef2(1), z94Var.m75942xfb822ef2(2)));
                    I();
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateGiftWishRecommend called with recommendValue size: ");
        sb6.append(linkedList2 != null ? java.lang.Integer.valueOf(linkedList2.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", sb6.toString());
        this.f202320x.clear();
        if (linkedList2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (((r45.kv1) ((r45.z94) obj).m75936x14adae67(0)) != null) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.z((r45.z94) it6.next(), new android.text.SpannableString("")));
            }
            linkedList3 = new java.util.LinkedList(arrayList2);
        } else {
            linkedList3 = new java.util.LinkedList();
        }
        this.f202320x = linkedList3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "Created giftRecommendData with size: " + this.f202320x.size());
        int i17 = 0;
        for (java.lang.Object obj2 : this.f202320x) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.kv1 kv1Var2 = (r45.kv1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.z) obj2).f202357a.m75936x14adae67(0);
            if (kv1Var2 != null) {
                java.lang.String m75945x2fec8307 = kv1Var2.m75945x2fec8307(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "Loading recommend gift image[" + i17 + "] URL: " + m75945x2fec8307);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WishEditPanelWidget", "Recommend gift image URL[" + i17 + "] is null or empty");
                    i17 = i18;
                } else {
                    try {
                        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
                        a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.s0(i17, this);
                        ((wo0.b) a17).a();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WishEditPanelWidget", "Exception when setting up image loader for[" + i17 + "] URL: " + m75945x2fec8307, e17);
                    }
                    f0Var = jz5.f0.f384359a;
                }
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WishEditPanelWidget", "Recommend wish[" + i17 + "] has no gift data");
            }
            i17 = i18;
        }
        if (this.f202320x.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "No recommend data available, hiding recommend desc");
            android.widget.TextView textView = this.B;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftRecommendDesc");
                throw null;
            }
            textView.setVisibility(8);
        }
        B();
    }

    public final void H(r45.c04 c04Var) {
        java.lang.String m75945x2fec8307;
        this.f202314r = c04Var;
        java.lang.String str = "";
        java.lang.String str2 = (this.f202321y || (m75945x2fec8307 = c04Var.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307;
        android.widget.TextView textView = this.E;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishSelectorDesc");
            throw null;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(c04Var.m75942xfb822ef2(1));
        java.lang.Long l17 = valueOf.longValue() > 0 ? valueOf : null;
        if (l17 != null) {
            java.lang.String b17 = ln2.a.b(ln2.b.f401409a, this.f199914d, (int) c04Var.m75942xfb822ef2(0), zl2.r4.S(zl2.r4.f555483a, l17.longValue(), 0, 2, null), str2, null, 16, null);
            if (b17 != null) {
                str = b17;
            }
        }
        textView.setText(str);
        B();
    }

    public final void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y) this.f202319w.get("NULL_ITEM");
        if (yVar != null) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.A;
            if (c1073x7e08a787 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                throw null;
            }
            android.view.View rootView = yVar.f202346e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
            c1073x7e08a787.removeView(rootView);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.A;
            if (c1073x7e08a7872 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
            c1073x7e08a7872.addView(rootView);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.A;
        if (c1073x7e08a7873 != null) {
            z(c1073x7e08a7873);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        return f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anl;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ln2.f fVar = (ln2.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "onChanged: " + fVar);
        A(fVar);
        I();
        B();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.frh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.A = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f569252pk1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.C = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f564548ud);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById3;
        this.D = viewOnClickListenerC22631x1cc07cc8;
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            z17 = !pm0.v.z((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q, 4194304);
        } else {
            z17 = false;
        }
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.D;
        if (viewOnClickListenerC22631x1cc07cc82 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftWallSwitchBtn");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.b0(this));
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tiu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.H = (android.view.ViewGroup) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tj7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.G = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tjj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.E = (android.widget.TextView) findViewById6;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.sd8);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.c0(this));
        }
        android.view.View findViewById7 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566213tj5);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.d0(this));
        }
        android.view.View findViewById8 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tjf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.I = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tje);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.F = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.g0(this));
        android.view.View findViewById10 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tiv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById10;
        this.B = textView2;
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.h0(this));
        android.widget.TextView textView3 = this.C;
        if (textView3 != null) {
            hc2.o.a(textView3, false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sumValueText");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) this.f202311o;
        if (wn0Var.B1()) {
            boolean D1 = wn0Var.D1();
            java.util.LinkedHashMap linkedHashMap = this.f202318v;
            kn2.c cVar = this.f202310n;
            boolean z17 = true;
            if (D1) {
                java.util.Collection values = linkedHashMap.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                if (((java.util.ArrayList) kz5.n0.V(values)).isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) cVar;
                    wn0Var2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wn0Var2, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zm0(wn0Var2, true, null), 2, null);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedHashMap.values(), "<get-values>(...)");
            if (!((java.util.ArrayList) kz5.n0.V(r0)).isEmpty()) {
                java.util.Collection values2 = linkedHashMap.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
                java.util.LinkedList linkedList = new java.util.LinkedList(kz5.n0.V(values2));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) cVar;
                wn0Var3.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "createRewardWishList: " + wn0Var3.D1());
                r45.i82 i82Var = (r45.i82) ((mm2.f7) wn0Var3.P0(mm2.f7.class)).f410591f.mo3195x754a37bb();
                if (i82Var != null && i82Var.m75942xfb822ef2(2) < i82Var.m75942xfb822ef2(1)) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wn0Var3, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wm0(wn0Var3, linkedList, null), 2, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wn0Var3, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vn0(wn0Var3, linkedList, null), 2, null);
                }
            }
        }
        a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        kn2.d dVar = this.f202311o;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) dVar).C1()) {
            android.view.ViewGroup viewGroup = this.G;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
                throw null;
            }
            viewGroup.setVisibility(0);
            java.lang.Integer num = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 3);
            if (num != null) {
                num.intValue();
                jSONObject.put("type", num.intValue());
            }
            jSONObject.put("sub_element", 1);
            jSONObject.put("sub_type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "interactiveWish disable, hide interaction wish UI.");
            android.view.ViewGroup viewGroup2 = this.G;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
                throw null;
            }
            viewGroup2.setVisibility(8);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) dVar).B1()) {
            android.view.ViewGroup viewGroup3 = this.H;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftWishLayout");
                throw null;
            }
            viewGroup3.setVisibility(0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "gift disable, hide gift wish UI.");
            android.view.ViewGroup viewGroup4 = this.H;
            if (viewGroup4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftWishLayout");
                throw null;
            }
            viewGroup4.setVisibility(8);
        }
        super.w();
    }
}
