package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class co extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f188018u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f188019v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f188020w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f188021x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm f188022y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f188023z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14065xa37006af r10, int r11, int r12, boolean r13, int r14, p3321xbce91901.jvm.p3324x21ffc6bd.i r15) {
        /*
            r9 = this;
            r14 = r14 & 8
            if (r14 == 0) goto L5
            r13 = 0
        L5:
            r4 = r13
            java.lang.String r13 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r13)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co.<init>(com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI, int, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bdj);
        int m56393xfb854877 = z().f188689e.m56393xfb854877();
        int i18 = i17 - 1;
        if (checkBox != null) {
            if (m56393xfb854877 > 0 && i18 < m56393xfb854877) {
                so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(i18);
                if (j5Var instanceof so2.m4) {
                    so2.m4 m4Var = (so2.m4) j5Var;
                    boolean z17 = !checkBox.isChecked();
                    m4Var.f492015e = z17;
                    if (z17) {
                        this.A++;
                    } else {
                        this.A--;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiRelateUIContract", "[onGridItemClick], " + i17 + ", " + i18 + ", " + this.A + ", " + m4Var.f492015e);
                }
            }
            checkBox.setChecked(!checkBox.isChecked());
            Y();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void N(boolean z17) {
        android.view.View t17 = t();
        if (t17 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) t17.findViewById(com.p314xaae8f345.mm.R.id.m2c);
            if (!z17) {
                if (c22699x3dcdb352 == null) {
                    return;
                }
                c22699x3dcdb352.setVisibility(8);
            } else if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
                c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bo(t17));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void P() {
        this.f188022y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm(this.f187707d, null, 2, null);
        android.view.View view = this.f188018u;
        if (view != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.iig);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zn(this));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.pnr);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ao(this));
            }
        }
        super.P();
    }

    public final void W() {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this.f187707d, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, null, null)) {
            X();
        }
    }

    public final void X() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", -1);
        intent.putExtra("type_pick_location_btn", 2);
        j45.l.n(this.f187707d, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 16666);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(5, 10);
    }

    public final void Y() {
        if (this.A > 0) {
            android.widget.TextView textView = this.f188021x;
            if (textView != null) {
                textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aan);
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.f188021x;
        if (textView2 != null) {
            textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aao);
            textView2.setTextColor(textView2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        return this.f187707d.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        android.view.View inflate = android.view.View.inflate(this.f187707d, com.p314xaae8f345.mm.R.C30864xbddafb2a.b5b, null);
        this.f188018u = inflate;
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.un();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(1, 1);
        c15416x1f1f78b7.m8091xc21abdf5(true);
        return c15416x1f1f78b7;
    }
}
