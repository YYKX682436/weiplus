package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class x9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final gk2.e H;
    public final r45.lc1 I;

    /* renamed from: J, reason: collision with root package name */
    public final r45.s02 f201837J;
    public final java.lang.String K;
    public java.util.LinkedList L;
    public final int M;
    public int N;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 P;
    public android.widget.FrameLayout Q;
    public int R;
    public yz5.a S;
    public jz5.l T;
    public final jz5.g U;
    public p3325xe03a0797.p3326xc267989b.r2 V;
    public final jz5.g W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(android.content.Context context, gk2.e eVar, r45.lc1 lc1Var, r45.s02 modInfo) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modInfo, "modInfo");
        this.H = eVar;
        this.I = lc1Var;
        this.f201837J = modInfo;
        this.K = "FinderLiveChooseRolePanel";
        this.L = new java.util.LinkedList();
        this.M = -1;
        int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
        this.N = m75939xb282bd08;
        this.R = m75939xb282bd08;
        this.U = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w9(context, this));
        this.W = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k9(context, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 r18, int r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9.f0(com.tencent.mm.plugin.finder.live.widget.x9, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570408dr0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public jz5.l B() {
        android.content.Context context = this.f199716e;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mie);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mic);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return new jz5.l(string, string2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.Q = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.tha);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.rls);
        this.P = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j9) ((jz5.n) this.W).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.P;
        android.content.Context context = this.f199716e;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        }
        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        d0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.V;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.E;
        this.V = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o9(this, null), 3, null) : null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.Object obj;
        r45.lc1 lc1Var;
        android.view.View Q6;
        android.widget.FrameLayout frameLayout;
        java.lang.Object obj2;
        super.V(e0Var, z17, i17);
        int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
        this.N = m75939xb282bd08;
        this.R = m75939xb282bd08;
        java.util.LinkedList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a();
        this.L = a17;
        java.util.Iterator it = a17.iterator();
        while (true) {
            marginLayoutParams = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.of1) obj).m75939xb282bd08(2) == 2) {
                    break;
                }
            }
        }
        if (obj == null) {
            java.util.LinkedList linkedList = this.L;
            r45.of1 of1Var = new r45.of1();
            of1Var.set(2, java.lang.Integer.valueOf(this.M));
            linkedList.add(of1Var);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j9) ((jz5.n) this.W).mo141623x754a37bb()).m8146xced61ae5();
        android.widget.FrameLayout frameLayout2 = this.Q;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2) ((jz5.n) this.U).mo141623x754a37bb();
        if (z2Var != null) {
            r45.lc1 lc1Var2 = this.I;
            if (lc1Var2 == null) {
                gk2.e eVar = this.H;
                if (eVar != null) {
                    mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get-joinLiveVisibleInfo = ");
                    r45.lc1 lc1Var3 = c1Var.f410434v6;
                    if (lc1Var3 == null || (obj2 = pm0.b0.g(lc1Var3)) == null) {
                        obj2 = "null";
                    }
                    sb6.append(obj2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var.f410333f, sb6.toString());
                    lc1Var2 = c1Var.f410434v6;
                } else {
                    lc1Var = null;
                    Q6 = z2Var.Q6(lc1Var, this.f201837J, false, true, true);
                    if (Q6 != null && (frameLayout = this.Q) != null) {
                        frameLayout.addView(Q6);
                    }
                }
            }
            lc1Var = lc1Var2;
            Q6 = z2Var.Q6(lc1Var, this.f201837J, false, true, true);
            if (Q6 != null) {
                frameLayout.addView(Q6);
            }
        }
        android.widget.FrameLayout frameLayout3 = this.Q;
        int childCount = frameLayout3 != null ? frameLayout3.getChildCount() : 0;
        android.content.Context context = this.f199716e;
        if (childCount > 0) {
            android.widget.FrameLayout frameLayout4 = this.Q;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(0);
            }
            android.widget.FrameLayout frameLayout5 = this.Q;
            if (frameLayout5 == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout5.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
                marginLayoutParams = marginLayoutParams2;
            }
            frameLayout5.setLayoutParams(marginLayoutParams);
            return;
        }
        android.widget.FrameLayout frameLayout6 = this.Q;
        if (frameLayout6 != null) {
            frameLayout6.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.P;
        if (c22849x81a93d25 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = c22849x81a93d25.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.bottomMargin = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            marginLayoutParams = marginLayoutParams3;
        }
        c22849x81a93d25.setLayoutParams(marginLayoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        android.widget.TextView textView = new android.widget.TextView(this.f199716e);
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573261m93));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        return textView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        android.widget.TextView textView = new android.widget.TextView(this.f199716e);
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573262m94));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        textView.setBackgroundDrawable(textView.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo));
        textView.setMinWidth((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        textView.setMinHeight((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
        textView.setGravity(17);
        return textView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}
