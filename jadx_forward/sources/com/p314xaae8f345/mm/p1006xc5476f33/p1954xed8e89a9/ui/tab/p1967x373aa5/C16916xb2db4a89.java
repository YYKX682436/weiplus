package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Las3/l0;", "getVisibleTabs", "Lkotlin/Function1;", "Las3/m0;", "Ljz5/f0;", "w", "Lyz5/l;", "getOnTabSelected", "()Lyz5/l;", "setOnTabSelected", "(Lyz5/l;)V", "onTabSelected", "", "getTabCount", "()I", "tabCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout */
/* loaded from: classes11.dex */
public final class C16916xb2db4a89 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.List f236185x = kz5.c0.i(0, 1, 2, 3, 4, 5);

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f236186v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public yz5.l onTabSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16916xb2db4a89(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f236186v = new java.util.ArrayList();
        B();
    }

    /* renamed from: getVisibleTabs */
    private final java.util.List<as3.l0> m67701xe19e55da() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f236186v) {
            if (((as3.l0) obj).f95059c.getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int A(as3.m0 tabType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
        java.util.Iterator<as3.l0> it = m67701xe19e55da().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (it.next().f95057a == tabType) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public final void B() {
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a1p, (android.view.ViewGroup) this, true);
        java.util.ArrayList<as3.l0> arrayList = (java.util.ArrayList) this.f236186v;
        arrayList.clear();
        as3.m0 m0Var = as3.m0.f95063d;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.anc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ane);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var, textView, (android.view.ViewGroup) findViewById2, findViewById(com.p314xaae8f345.mm.R.id.and), new as3.t(this)));
        as3.m0 m0Var2 = as3.m0.f95067h;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.sjr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.sjt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var2, textView2, (android.view.ViewGroup) findViewById4, findViewById(com.p314xaae8f345.mm.R.id.sjs), new as3.u(this)));
        as3.m0 m0Var3 = as3.m0.f95068i;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.sjo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.sjq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var3, textView3, (android.view.ViewGroup) findViewById6, findViewById(com.p314xaae8f345.mm.R.id.sjp), new as3.v(this)));
        as3.m0 m0Var4 = as3.m0.f95065f;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.an7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.an9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var4, textView4, (android.view.ViewGroup) findViewById8, findViewById(com.p314xaae8f345.mm.R.id.an8), new as3.w(this)));
        as3.m0 m0Var5 = as3.m0.f95064e;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.anl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.ann);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var5, textView5, (android.view.ViewGroup) findViewById10, findViewById(com.p314xaae8f345.mm.R.id.anm), new as3.x(this)));
        as3.m0 m0Var6 = as3.m0.f95066g;
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.anf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        android.widget.TextView textView6 = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = findViewById(com.p314xaae8f345.mm.R.id.ani);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        arrayList.add(new as3.l0(m0Var6, textView6, (android.view.ViewGroup) findViewById12, null, new as3.y(this)));
        for (as3.l0 l0Var : arrayList) {
            l0Var.f95059c.setVisibility(8);
            android.view.ViewGroup viewGroup = l0Var.f95059c;
            com.p314xaae8f345.mm.ui.p2740x696c9db.d8.a(viewGroup);
            viewGroup.setOnClickListener(new as3.z(this, l0Var));
        }
    }

    public final void C(int i17) {
        java.util.List<as3.l0> m67701xe19e55da = m67701xe19e55da();
        boolean z17 = false;
        if (i17 >= 0 && i17 < m67701xe19e55da.size()) {
            z17 = true;
        }
        if (z17) {
            D(m67701xe19e55da.get(i17).f95057a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileTabLayout", "bobkw selectIndex: index=" + i17 + " out of range, visibleTabs.size=" + m67701xe19e55da.size());
    }

    public final void D(as3.m0 tabType) {
        android.text.TextPaint paint;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
        if (tabType == as3.m0.f95066g) {
            return;
        }
        for (as3.l0 l0Var : m67701xe19e55da()) {
            boolean z17 = l0Var.f95057a == tabType;
            android.view.View view = l0Var.f95060d;
            if (view != null) {
                int i17 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectTab", "(Lcom/tencent/mm/plugin/profile/ui/tab/view/TabType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectTab", "(Lcom/tencent/mm/plugin/profile/ui/tab/view/TabType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int color = getContext().getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.a0c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560405ji);
            android.widget.TextView textView = l0Var.f95058b;
            textView.setTextColor(color);
            if (z17) {
                android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
                if (paint2 != null) {
                    paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                }
                paint = textView != null ? textView.getPaint() : null;
                if (paint != null) {
                    paint.setStrokeWidth(0.8f);
                }
            } else {
                android.text.TextPaint paint3 = textView != null ? textView.getPaint() : null;
                if (paint3 != null) {
                    paint3.setStyle(android.graphics.Paint.Style.FILL);
                }
                paint = textView != null ? textView.getPaint() : null;
                if (paint != null) {
                    paint.setStrokeWidth(0.0f);
                }
            }
        }
    }

    public final void E(as3.m0 tabType, java.lang.String text) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        java.util.Iterator it = this.f236186v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((as3.l0) obj).f95057a == tabType) {
                    break;
                }
            }
        }
        as3.l0 l0Var = (as3.l0) obj;
        android.widget.TextView textView = l0Var != null ? l0Var.f95058b : null;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void F(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        boolean z37;
        java.util.Iterator it = ((java.util.ArrayList) this.f236186v).iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.List<as3.l0> m67701xe19e55da = m67701xe19e55da();
                boolean z38 = m67701xe19e55da.size() == 1;
                java.util.Iterator<T> it6 = m67701xe19e55da.iterator();
                while (it6.hasNext()) {
                    ((as3.l0) it6.next()).f95058b.setVisibility(z38 ? 8 : 0);
                }
                return;
            }
            as3.l0 l0Var = (as3.l0) it.next();
            int ordinal = l0Var.f95057a.ordinal();
            if (ordinal == 0) {
                z37 = z17;
            } else if (ordinal == 1) {
                z37 = z18;
            } else if (ordinal == 2) {
                z37 = z19;
            } else if (ordinal == 3) {
                z37 = z27;
            } else if (ordinal == 4) {
                z37 = z28;
            } else {
                if (ordinal != 5) {
                    throw new jz5.j();
                }
                z37 = z29;
            }
            android.view.ViewGroup viewGroup = l0Var.f95059c;
            int visibility = viewGroup.getVisibility();
            int i17 = z37 ? 0 : 8;
            if (visibility != i17) {
                viewGroup.setVisibility(i17);
            }
            if (l0Var.f95057a == as3.m0.f95067h) {
                ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
                l0Var.f95058b.setText(com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c.d() ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.noo) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nno));
            }
        }
    }

    public final yz5.l getOnTabSelected() {
        return this.onTabSelected;
    }

    /* renamed from: getTabCount */
    public final int m67703x443e53f0() {
        java.util.List list = this.f236186v;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if ((((as3.l0) it.next()).f95059c.getVisibility() == 0) && (i17 = i17 + 1) < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    /* renamed from: setOnTabSelected */
    public final void m67704x814c5caf(yz5.l lVar) {
        this.onTabSelected = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16916xb2db4a89(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f236186v = new java.util.ArrayList();
        B();
    }
}
