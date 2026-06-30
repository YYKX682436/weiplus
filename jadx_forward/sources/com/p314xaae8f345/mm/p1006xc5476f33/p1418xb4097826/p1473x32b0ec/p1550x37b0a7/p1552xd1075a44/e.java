package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes10.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f202230h;

    /* renamed from: i, reason: collision with root package name */
    public final kn2.b f202231i;

    /* renamed from: m, reason: collision with root package name */
    public final kn2.c f202232m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i f202233n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f202234o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, p012xc85e97e9.p093xedfae76a.y owner, boolean z17, kn2.b interactionWishViewEvent, kn2.c serviceLive) {
        super(context, false, null, z17, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionWishViewEvent, "interactionWishViewEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceLive, "serviceLive");
        this.f202230h = owner;
        this.f202231i = interactionWishViewEvent;
        this.f202232m = serviceLive;
        this.f202234o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.b(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        return f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.graphics.drawable.Drawable i() {
        return new android.graphics.drawable.ColorDrawable(this.f199914d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        rootView.setBackgroundColor(this.f199914d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.b04 b04Var = r45.b04.kInteractionType_Like;
        arrayList.add(b04Var);
        arrayList.add(r45.b04.kInteractionType_Comment);
        arrayList.add(r45.b04.kInteractionType_Share);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = kz5.n0.F0(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.g()).iterator();
        while (it.hasNext()) {
            arrayList2.add(new ln2.c((r45.b04) it.next()));
        }
        this.f202233n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i(b04Var, 0L, "", arrayList2);
        android.content.Context context = rootView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar = this.f202233n;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m(abstractActivityC21394xb3d2c0cf, rootView, this.f199916f, iVar);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar2 = this.f202233n;
        if (iVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractionWishContract.Presenter", "onAttach");
        iVar2.f202246i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.n(iVar2.f202241d);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.wish.widget.InteractionWishTypeContract$Presenter$onAttach$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i.this.f202246i;
                if (nVar != null) {
                    return nVar;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("convert");
                throw null;
            }
        }, iVar2.f202244g, false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.h(iVar2);
        iVar2.f202245h = c22848x6ddd90cf;
        iVar2.f202248n = mVar;
        android.view.View view = mVar.f202265e;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.tjp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        mVar.f202271n = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(view.getContext()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = mVar.f202271n;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("typeRecyclerView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar3 = mVar.f202267g;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = iVar3.f202245h;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf2);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.tj_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        mVar.f202272o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.tjd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        mVar.f202273p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.tj9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        mVar.f202268h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.tja);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        mVar.f202270m = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.p314xaae8f345.mm.R.id.tjc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById6;
        mVar.f202269i = c22621x7603e017;
        c22621x7603e017.mo81583x7e4f2d39(new android.text.InputFilter[]{zl2.r4.f555485c});
        long j17 = iVar3.f202242e;
        if (j17 > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = mVar.f202268h;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishCountEditText");
                throw null;
            }
            c22621x7603e0172.setText(java.lang.String.valueOf(j17));
        }
        if (iVar3.f202243f.length() > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = mVar.f202269i;
            if (c22621x7603e0173 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceNameEditText");
                throw null;
            }
            c22621x7603e0173.setText(iVar3.f202243f);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = mVar.f202268h;
        if (c22621x7603e0174 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishCountEditText");
            throw null;
        }
        c22621x7603e0174.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.l(mVar));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0175 = mVar.f202269i;
        if (c22621x7603e0175 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceNameEditText");
            throw null;
        }
        c22621x7603e0175.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.k(mVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractionWishContract.ViewCallback", "initView completed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar = this.f202233n;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        r45.b04 b04Var = iVar.f202241d;
        if (b04Var == null) {
            b04Var = r45.b04.kInteractionType_Unknown;
        }
        r45.c04 c04Var = new r45.c04();
        c04Var.set(0, java.lang.Long.valueOf(b04Var.f451927d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar2 = this.f202233n;
        if (iVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        c04Var.set(1, java.lang.Long.valueOf(iVar2.f202242e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar3 = this.f202233n;
        if (iVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        c04Var.set(4, iVar3.f202243f);
        c04Var.set(2, 0L);
        c04Var.set(3, 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactionWishEditComplete with type=");
        sb6.append(b04Var);
        sb6.append(", target=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar4 = this.f202233n;
        if (iVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        sb6.append(iVar4);
        sb6.append(".wishCount");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractionWishPanelWidget", sb6.toString());
        ((az2.f) ((jz5.n) this.f202234o).mo141623x754a37bb()).a();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) this.f202232m).w1(c04Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.c(this, c04Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.d(this));
    }

    public final void y(r45.c04 interactionWishConfig, java.util.ArrayList supportWishTypes, java.util.HashMap wishDefaultTargetValues, boolean z17) {
        boolean b17;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionWishConfig, "interactionWishConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supportWishTypes, "supportWishTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wishDefaultTargetValues, "wishDefaultTargetValues");
        w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar = this.f202233n;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        java.lang.String str = "";
        if (supportWishTypes.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("InteractionWishContract.Presenter", "updateConfig fail.supportWishTypes is empty");
            iVar.f202241d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.n nVar = iVar.f202246i;
            if (nVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("convert");
                throw null;
            }
            nVar.f202275e = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m mVar = iVar.f202248n;
            if (mVar != null) {
                mVar.g(0L, "", z17);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = iVar.f202245h;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = kz5.n0.F0(supportWishTypes, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.g()).iterator();
        while (it.hasNext()) {
            arrayList.add(new ln2.c((r45.b04) it.next()));
        }
        java.util.ArrayList<so2.j5> arrayList2 = iVar.f202244g;
        if (arrayList2.size() != arrayList.size()) {
            b17 = false;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (so2.j5 j5Var : arrayList2) {
                ln2.c cVar = j5Var instanceof ln2.c ? (ln2.c) j5Var : null;
                r45.b04 b04Var = cVar != null ? cVar.f401410d : null;
                if (b04Var != null) {
                    arrayList3.add(b04Var);
                }
            }
            java.util.Set X0 = kz5.n0.X0(arrayList3);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var2 = (so2.j5) it6.next();
                ln2.c cVar2 = j5Var2 instanceof ln2.c ? (ln2.c) j5Var2 : null;
                r45.b04 b04Var2 = cVar2 != null ? cVar2.f401410d : null;
                if (b04Var2 != null) {
                    arrayList4.add(b04Var2);
                }
            }
            b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(X0, kz5.n0.X0(arrayList4));
        }
        if (!b17) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = iVar.f202245h;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf2.E0(arrayList2);
        }
        int m75942xfb822ef2 = (int) interactionWishConfig.m75942xfb822ef2(0);
        r45.b04 b04Var3 = m75942xfb822ef2 != 0 ? m75942xfb822ef2 != 1 ? m75942xfb822ef2 != 2 ? m75942xfb822ef2 != 3 ? null : r45.b04.kInteractionType_Share : r45.b04.kInteractionType_Comment : r45.b04.kInteractionType_Like : r45.b04.kInteractionType_Unknown;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (so2.j5 j5Var3 : arrayList2) {
            ln2.c cVar3 = j5Var3 instanceof ln2.c ? (ln2.c) j5Var3 : null;
            r45.b04 b04Var4 = cVar3 != null ? cVar3.f401410d : null;
            if (b04Var4 != null) {
                arrayList5.add(b04Var4);
            }
        }
        java.util.Set X02 = kz5.n0.X0(arrayList5);
        java.lang.Object Z = kz5.n0.Z(arrayList2);
        ln2.c cVar4 = Z instanceof ln2.c ? (ln2.c) Z : null;
        r45.b04 b04Var5 = cVar4 != null ? cVar4.f401410d : null;
        if (b04Var3 == null || !X02.contains(b04Var3)) {
            b04Var3 = b04Var5;
        }
        if (iVar.f202241d != b04Var3) {
            iVar.f202241d = b04Var3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.n nVar2 = iVar.f202246i;
            if (nVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("convert");
                throw null;
            }
            nVar2.f202275e = b04Var3;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = iVar.f202245h;
            if (c22848x6ddd90cf3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf3.m8146xced61ae5();
        }
        iVar.f202242e = interactionWishConfig.m75942xfb822ef2(1) >= 0 ? interactionWishConfig.m75942xfb822ef2(1) : 0L;
        iVar.f202249o = z17;
        if (!z17 && (m75945x2fec8307 = interactionWishConfig.m75945x2fec8307(4)) != null) {
            str = m75945x2fec8307;
        }
        iVar.f202243f = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m mVar2 = iVar.f202248n;
        if (mVar2 != null) {
            mVar2.g(iVar.f202242e, str, z17);
        }
        iVar.f202247m = new java.util.HashMap(wishDefaultTargetValues);
    }
}
