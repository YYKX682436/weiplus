package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f193311p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f193312q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f193313r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193311p = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566066tg0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f193312q = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tfx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f193313r = (android.widget.ImageView) findViewById2;
        rootView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x0(this));
    }

    public static final void v1(java.lang.String value, r45.mb mbVar, be2.b bVar, boolean z17, boolean z18) {
        ce2.b bVar2 = new ce2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        bVar2.f67201x5bec8165 = value;
        java.lang.String m75945x2fec8307 = mbVar.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        bVar2.f67203x5bc050ac = m75945x2fec8307;
        bVar2.f67202x10a0fed7 = mbVar.m75939xb282bd08(0);
        bVar2.f67200x578ce6e1 = z17 ? 1 : 0;
        bVar2.f67199x51deaa2b = z18 ? 1 : 0;
        rl2.b bVar3 = (rl2.b) bVar;
        bVar3.getClass();
        new m75.d(bVar2, null, null, "MicroMsg.SDK.BaseFinderLiveAigcGiftStatus").a(bVar3.f478716d);
    }

    public static final void w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a1 a1Var, r45.mb mbVar, java.lang.String str) {
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = mbVar.m75945x2fec8307(1);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            if (mbVar.m75939xb282bd08(0) == 3) {
                m75945x2fec8307 = a1Var.f193311p.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oq9, str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
            } else {
                if (mbVar.m75939xb282bd08(0) != 2) {
                    return;
                }
                m75945x2fec8307 = a1Var.f193311p.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oq7, str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
            }
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z0(a1Var, m75945x2fec8307));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y0.f196672a[status.ordinal()] == 1 && w0() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            android.view.ViewGroup J1 = ag0Var != null ? ag0Var.J1() : null;
            if (J1 != null && J1.isShown()) {
                t1(J1);
            } else {
                K0(8);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1(android.view.View view) {
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = (!x0() || com.p314xaae8f345.mm.ui.bk.d0()) ? i17 : i18;
        if (!x0() || com.p314xaae8f345.mm.ui.bk.d0()) {
            i17 = i18;
        }
        int[] t17 = pm0.v.t(view);
        int width = t17[0] + view.getWidth();
        int i27 = t17[1];
        android.view.ViewGroup viewGroup = this.f193311p;
        float dimension = viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float dimension2 = viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float f17 = (i19 - i27) - dimension;
        float dimension3 = (i17 - width) - viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        if (dimension3 >= dimension2) {
            dimension2 = dimension3;
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), (int) dimension2, (int) f17);
        android.widget.LinearLayout linearLayout = viewGroup instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) viewGroup : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width2 = ((i17 - dimension2) - width) + ((view.getWidth() / 2) - (viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) / 2));
        android.widget.ImageView imageView = this.f193313r;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width2;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public final void u1(java.lang.Iterable gifts) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gifts, "gifts");
        java.util.Iterator it = gifts.iterator();
        while (it.hasNext()) {
            ce2.i iVar = (ce2.i) it.next();
            r45.mb v07 = iVar.v0();
            if (v07 != null) {
                rl2.b bVar = (rl2.b) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).D).mo141623x754a37bb();
                java.lang.String field_rewardProductId = iVar.f67814x2c488eb6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
                ce2.b y07 = bVar.y0(field_rewardProductId);
                if (y07 == null) {
                    java.lang.String field_rewardProductId2 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId2, "field_rewardProductId");
                    v1(field_rewardProductId2, v07, bVar, false, false);
                } else if (v07.m75939xb282bd08(0) == 0) {
                    java.lang.String field_rewardProductId3 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId3, "field_rewardProductId");
                    v1(field_rewardProductId3, v07, bVar, false, false);
                } else if (v07.m75939xb282bd08(0) == 1) {
                    java.lang.String field_rewardProductId4 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId4, "field_rewardProductId");
                    v1(field_rewardProductId4, v07, bVar, false, false);
                } else {
                    java.lang.String field_submissionId = y07.f67203x5bc050ac;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_submissionId, "field_submissionId");
                    if (r26.i0.p(field_submissionId, v07.m75945x2fec8307(3), false)) {
                        if (!(y07.f67200x578ce6e1 != 0)) {
                            java.lang.String field_name = iVar.f67809x225f1eb0;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
                            w1(this, v07, field_name);
                            java.lang.String field_rewardProductId5 = iVar.f67814x2c488eb6;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId5, "field_rewardProductId");
                            v1(field_rewardProductId5, v07, bVar, true, y07.f67199x51deaa2b != 0);
                        }
                    } else {
                        java.lang.String field_name2 = iVar.f67809x225f1eb0;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name2, "field_name");
                        w1(this, v07, field_name2);
                        java.lang.String field_rewardProductId6 = iVar.f67814x2c488eb6;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId6, "field_rewardProductId");
                        v1(field_rewardProductId6, v07, bVar, true, false);
                    }
                }
            }
        }
    }
}
