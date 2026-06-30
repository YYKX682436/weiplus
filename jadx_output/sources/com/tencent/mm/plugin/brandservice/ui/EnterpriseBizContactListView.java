package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes9.dex */
public class EnterpriseBizContactListView extends com.tencent.mm.ui.base.sortview.BaseSortView {
    public final or1.p1 A;
    public java.util.List B;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f94014s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94015t;

    /* renamed from: u, reason: collision with root package name */
    public or1.m0 f94016u;

    /* renamed from: v, reason: collision with root package name */
    public int f94017v;

    /* renamed from: w, reason: collision with root package name */
    public or1.t0 f94018w;

    /* renamed from: x, reason: collision with root package name */
    public or1.s0 f94019x;

    /* renamed from: y, reason: collision with root package name */
    public int f94020y;

    /* renamed from: z, reason: collision with root package name */
    public int f94021z;

    public EnterpriseBizContactListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94017v = -1;
        this.f94020y = 0;
        this.f94021z = 0;
        this.A = new or1.p1(new or1.i0(this));
    }

    public static void g(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView, qk.o oVar, int i17) {
        enterpriseBizContactListView.getClass();
        r01.m y07 = r01.q3.bj().y0(enterpriseBizContactListView.f94014s);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14507, java.lang.Long.valueOf(y07 != null ? y07.field_wwCorpId : 0L), java.lang.Long.valueOf(oVar.w0()), java.lang.Long.valueOf(y07 != null ? y07.field_wwUserVid : 0L), 2, 2, java.lang.Integer.valueOf(i17));
    }

    private java.util.List<fb5.n> getSortEntityList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor o17 = r01.q3.cj().o1(this.f94014s, this.f94015t);
        while (o17.moveToNext()) {
            or1.n0 n0Var = new or1.n0();
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(o17);
            qk.o oVar = new qk.o();
            oVar.convertFrom(o17);
            n0Var.f371676d = z3Var.d1();
            n0Var.f371677e = z3Var;
            n0Var.f371678f = oVar;
            fb5.n nVar = new fb5.n();
            nVar.f260898b = n0Var;
            if (oVar.F0()) {
                nVar.f260897a = "!1";
            } else if (n0Var.f371677e.w2()) {
                nVar.f260897a = "!2";
            } else {
                int c27 = n0Var.f371677e.c2();
                if (c27 >= 97 && c27 <= 122) {
                    c27 -= 32;
                }
                if (c27 < 65 || c27 > 90) {
                    nVar.f260897a = "#";
                } else {
                    nVar.f260897a = ((char) c27) + "";
                }
            }
            arrayList.add(nVar);
        }
        o17.close();
        if (this.B != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.B.size());
            for (r45.co coVar : this.B) {
                fb5.n nVar2 = new fb5.n();
                nVar2.f260898b = coVar;
                nVar2.f260897a = "!1";
                arrayList2.add(nVar2);
            }
            arrayList.addAll(0, arrayList2);
        }
        this.f94017v = arrayList.size();
        java.util.Collections.sort(arrayList, new or1.v0(this, null));
        return arrayList;
    }

    public static void h(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView, android.widget.TextView textView, android.content.Context context, java.lang.String str, int i17) {
        enterpriseBizContactListView.getClass();
        if (textView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            textView.setText(new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17)));
        } catch (java.lang.Exception unused) {
            textView.setText("");
        }
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488744a95, this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public boolean c(java.lang.String str, fb5.n nVar) {
        r45.co coVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || nVar == null || (coVar = (r45.co) nVar.f260898b) == null) {
            return false;
        }
        java.lang.String g27 = coVar.f371677e.g2();
        java.lang.String T0 = coVar.f371677e.T0();
        java.lang.String U0 = coVar.f371677e.U0();
        java.lang.String upperCase = str.toUpperCase();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(g27) && g27.toUpperCase().indexOf(upperCase) != -1) {
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(T0) || T0.toUpperCase().indexOf(upperCase) == -1) {
            return !com.tencent.mm.sdk.platformtools.t8.K0(U0) && U0.toUpperCase().startsWith(upperCase);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f94020y = (int) motionEvent.getRawX();
            this.f94021z = (int) motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getContactCount() {
        return this.f94017v;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public fb5.l getItemViewCreator() {
        return new or1.l0(this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.widget.ListView getListView() {
        return (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View getNoResultView() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kch);
        textView.setText(com.tencent.mm.R.string.c1g);
        return textView;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public com.tencent.mm.ui.base.VerticalScrollBar getScrollBar() {
        return (com.tencent.mm.ui.base.VerticalScrollBar) findViewById(com.tencent.mm.R.id.mwe);
    }

    public void i() {
        java.util.List<fb5.n> sortEntityList = getSortEntityList();
        or1.m0 m0Var = this.f94016u;
        if (m0Var != null) {
            int i17 = this.f94017v;
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI = ((or1.e0) m0Var).f347481a;
            if (enterpriseBizContactListUI.f94009g != null) {
                enterpriseBizContactListUI.f94008f.setVisibility(i17 > 0 ? 0 : 8);
                android.view.View view = enterpriseBizContactListUI.f94009g;
                int i18 = i17 <= 0 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI$2", "onUpdate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI$2", "onUpdate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        e(sortEntityList);
        fb5.m mVar = this.f197866g;
        mVar.c(mVar.f260894d);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        or1.t0 t0Var = this.f94018w;
        if (t0Var != null) {
            ((com.tencent.mm.plugin.brandservice.ui.EnterpriseBizSearchUI) t0Var).hideVKB();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEmptyListener(or1.m0 m0Var) {
        this.f94016u = m0Var;
    }

    public void setExcludeBizChat(boolean z17) {
        this.f94015t = z17;
    }

    public void setFatherBizName(java.lang.String str) {
        this.f94014s = str;
    }

    public void setFixedBrandServiceItem(java.util.List<or1.n0> list) {
        this.B = list;
    }

    public void setOnTouchListener(or1.t0 t0Var) {
        this.f94018w = t0Var;
    }
}
