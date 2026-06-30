package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl */
/* loaded from: classes8.dex */
public class C16936x21d2caed extends android.widget.RelativeLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f236414p = java.util.regex.Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    /* renamed from: d, reason: collision with root package name */
    public boolean f236415d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f236416e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AutoCompleteTextView f236417f;

    /* renamed from: g, reason: collision with root package name */
    public os3.t2 f236418g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f236419h;

    /* renamed from: i, reason: collision with root package name */
    public os3.u2 f236420i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.GestureDetector f236421m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f236422n;

    /* renamed from: o, reason: collision with root package name */
    public os3.q2 f236423o;

    public C16936x21d2caed(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f236415d = false;
        this.f236416e = new java.util.LinkedList();
        this.f236419h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f236423o = null;
        this.f236421m = new android.view.GestureDetector(context, new os3.p2(this));
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = this;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < childCount) {
            android.view.View childAt = c16936x21d2caed.getChildAt(i17);
            if (childAt.getVisibility() != 8 || (childAt instanceof android.widget.AutoCompleteTextView)) {
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                if (width == 0) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
                    width = childAt.getMeasuredWidth();
                }
                android.widget.AutoCompleteTextView autoCompleteTextView = c16936x21d2caed.f236417f;
                if (autoCompleteTextView != null && i17 == childCount - 1 && !autoCompleteTextView.isFocused()) {
                    width = 0;
                }
                if (i18 + width > measuredWidth) {
                    i19 += height;
                    i18 = 0;
                }
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.setMargins(i18, i19, layoutParams.rightMargin, layoutParams.bottomMargin);
                childAt.setLayoutParams(layoutParams);
                i18 += width;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "adjust", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "adjust", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i17++;
            c16936x21d2caed = this;
        }
    }

    public void b(ks3.u uVar) {
        boolean z17;
        if (uVar == null) {
            return;
        }
        java.util.LinkedList linkedList = this.f236416e;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((ks3.u) it.next()).f393284f.equalsIgnoreCase(uVar.f393284f)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cbf, null);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lek);
        viewGroup.removeView((android.view.View) button.getParent());
        button.setText(uVar.f393283e);
        if (this.f236415d) {
            button.setCompoundDrawables(null, null, null, null);
        }
        button.setTag("" + linkedList.size());
        android.view.View view = (android.view.View) button.getParent();
        button.setTag(uVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "insertMailAddr", "(Lcom/tencent/mm/plugin/qqmail/model/MailAddr;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl", "insertMailAddr", "(Lcom/tencent/mm/plugin/qqmail/model/MailAddr;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setTag(uVar);
        addView(view, linkedList.size());
        linkedList.add(uVar);
        this.f236419h.mo50297x7c4d7ca2(new os3.j2(this, button), 100L);
    }

    public void c(java.util.List list, boolean z17) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (z17) {
            removeAllViews();
            this.f236416e.clear();
            a();
            invalidate();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            b((ks3.u) it.next());
        }
    }

    public boolean d() {
        java.lang.String trim = this.f236417f.getEditableText().toString().trim();
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) && f236414p.matcher(trim).matches();
    }

    public final void e(java.lang.String str, boolean z17) {
        java.lang.String trim = str.trim();
        if (trim.length() == 0) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f393239b.e(trim);
        if (arrayList.size() > 0) {
            b((ks3.u) arrayList.get(0));
            this.f236417f.setText("");
            return;
        }
        if (f236414p.matcher(trim).matches()) {
            ks3.u uVar = new ks3.u();
            uVar.f393283e = trim;
            uVar.f393284f = trim;
            uVar.f393285g = 0;
            b(uVar);
            this.f236417f.setText("");
            return;
        }
        if (!z17) {
            os3.q2 q2Var = this.f236423o;
            if (q2Var != null) {
                os3.l0 l0Var = (os3.l0) q2Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = l0Var.f429673a;
                db5.e1.u(activityC16931x24037f86.mo55332x76847179(), activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkd), "", new os3.i0(l0Var, this), new os3.k0(l0Var, this));
                return;
            }
            return;
        }
        os3.q2 q2Var2 = this.f236423o;
        if (q2Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f862 = ((os3.l0) q2Var2).f429673a;
            db5.t7.o(activityC16931x24037f862, activityC16931x24037f862.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkd), 1500L);
        } else {
            dp.a.m125853x26a183b(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hkd, 2000).show();
        }
        this.f236417f.setText(trim);
        this.f236417f.setSelection(trim.length());
    }

    public void f(ks3.u uVar) {
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f236416e;
            if (i17 >= linkedList.size()) {
                return;
            }
            if (uVar.f393284f.equalsIgnoreCase(((ks3.u) linkedList.get(i17)).f393284f)) {
                removeViewAt(i17);
                linkedList.remove(i17);
                a();
                invalidate();
                return;
            }
            i17++;
        }
    }

    public boolean g(boolean z17) {
        java.util.LinkedList linkedList = this.f236416e;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (!f236414p.matcher(((ks3.u) it.next()).f393284f).matches()) {
                return false;
            }
        }
        return !z17 || linkedList.size() > 0;
    }

    /* renamed from: getAddrsString */
    public java.lang.String m67775x35d6741d() {
        int i17 = 0;
        if (d()) {
            e(this.f236417f.getEditableText().toString(), false);
        }
        java.lang.String str = "";
        while (true) {
            java.util.LinkedList linkedList = this.f236416e;
            if (i17 >= linkedList.size()) {
                return str;
            }
            ks3.u uVar = (ks3.u) linkedList.get(i17);
            if (i17 != 0) {
                str = str + ",";
            }
            str = str + uVar.f393284f;
            i17++;
        }
    }

    /* renamed from: getMailAddrStringArray */
    public java.lang.String[] m67776x4f96ea2a() {
        java.util.LinkedList linkedList = this.f236416e;
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            ks3.u uVar = (ks3.u) linkedList.get(i17);
            strArr[i17] = uVar.f393283e + " " + uVar.f393284f;
        }
        return strArr;
    }

    /* renamed from: getMailAddrs */
    public java.util.LinkedList<ks3.u> m67777xeb5f5875() {
        return this.f236416e;
    }

    /* renamed from: getSize */
    public int m67778xfb854877() {
        return this.f236416e.size();
    }

    /* renamed from: setAddrsAdapter */
    public void m67779xe6d70bcf(os3.t2 t2Var) {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f236417f;
        if (autoCompleteTextView == null || t2Var == null) {
            return;
        }
        this.f236418g = t2Var;
        autoCompleteTextView.setAdapter(t2Var);
    }

    /* renamed from: setEditable */
    public void m67780xd6158ce6(boolean z17) {
        android.widget.AutoCompleteTextView autoCompleteTextView;
        this.f236415d = z17;
        if (!z17 || this.f236417f != null) {
            if (z17 || (autoCompleteTextView = this.f236417f) == null) {
                return;
            }
            autoCompleteTextView.setVisibility(8);
            return;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= getChildCount()) {
                break;
            }
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof android.widget.AutoCompleteTextView) {
                this.f236417f = (android.widget.AutoCompleteTextView) childAt;
                break;
            }
            if (childAt instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt;
                for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                    android.view.View childAt2 = viewGroup.getChildAt(i18);
                    if (childAt2 instanceof android.widget.AutoCompleteTextView) {
                        this.f236417f = (android.widget.AutoCompleteTextView) childAt2;
                    }
                }
            }
            if (this.f236417f != null) {
                break;
            } else {
                i17++;
            }
        }
        android.widget.AutoCompleteTextView autoCompleteTextView2 = this.f236417f;
        if (autoCompleteTextView2 != null) {
            autoCompleteTextView2.setDropDownBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.blu);
            setOnClickListener(new os3.h2(this));
            this.f236417f.setOnItemClickListener(new os3.k2(this));
            this.f236417f.setOnEditorActionListener(new os3.l2(this));
            this.f236417f.setOnKeyListener(new os3.m2(this));
            this.f236417f.addTextChangedListener(new os3.n2(this));
            this.f236417f.setOnFocusChangeListener(new os3.o2(this));
        }
    }

    /* renamed from: setInvalidMailAddrListener */
    public void m67781xa7d67871(os3.q2 q2Var) {
        this.f236423o = q2Var;
    }

    /* renamed from: setMailAdds */
    public void m67782x75ed00cb(java.util.List<ks3.u> list) {
        java.util.LinkedList linkedList;
        if (list == null) {
            return;
        }
        int i17 = 0;
        while (true) {
            linkedList = this.f236416e;
            if (i17 >= linkedList.size()) {
                break;
            }
            ks3.u uVar = (ks3.u) linkedList.get(i17);
            int i18 = 0;
            while (i18 < list.size()) {
                if (uVar.f393284f.equalsIgnoreCase(list.get(i18).f393284f)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 == list.size()) {
                f(uVar);
            }
            i17++;
        }
        for (int i19 = 0; i19 < list.size(); i19++) {
            ks3.u uVar2 = list.get(i19);
            int i27 = 0;
            while (i27 < linkedList.size()) {
                if (uVar2.f393284f.equalsIgnoreCase(((ks3.u) linkedList.get(i27)).f393284f)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i27 == linkedList.size()) {
                b(uVar2);
            }
        }
    }

    /* renamed from: setOnActionListener */
    public void m67783xcffab54b(os3.u2 u2Var) {
        this.f236420i = u2Var;
    }
}
