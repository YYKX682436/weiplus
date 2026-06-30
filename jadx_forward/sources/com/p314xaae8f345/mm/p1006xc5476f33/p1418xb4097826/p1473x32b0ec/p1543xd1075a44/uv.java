package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class uv extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b1 implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f201539i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.q1 f201540m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f201541n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(android.content.Context context, yz5.l onClickAcceptCallback) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickAcceptCallback, "onClickAcceptCallback");
        this.f201539i = onClickAcceptCallback;
    }

    public final void A(java.lang.String curMicTopicText, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curMicTopicText, "curMicTopicText");
        this.f201541n = z17;
        w();
        wd2.g gVar = this.f199917g;
        com.p314xaae8f345.mm.ui.fk.b(gVar.f526377k);
        com.p314xaae8f345.mm.ui.fk.b(gVar.f526376j);
        fg2.q1 q1Var = this.f201540m;
        if (q1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        q1Var.f343801e.setText(curMicTopicText);
        fg2.q1 q1Var2 = this.f201540m;
        if (q1Var2 != null) {
            q1Var2.f343801e.mo81549xf579a34a(curMicTopicText.length());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.graphics.drawable.Drawable i() {
        return this.f199914d.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ebp;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveSetMicTopicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSetMicTopicWidget", sb6.toString());
        fg2.q1 q1Var = this.f201540m;
        if (q1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, q1Var.f343798b)) {
            fg2.q1 q1Var2 = this.f201540m;
            if (q1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.text.Editable text = q1Var2.f343801e.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            this.f201539i.mo146xb9724478(str);
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveSetMicTopicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.toj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.toj);
        if (c22661xa3a2b3c0 != null) {
            i17 = com.p314xaae8f345.mm.R.id.tok;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tok);
            if (c22642x62f5b194 != null) {
                i17 = com.p314xaae8f345.mm.R.id.tol;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tol);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.tom;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tom);
                    if (textView2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.ton;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ton);
                        if (c22621x7603e017 != null) {
                            this.f201540m = new fg2.q1((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView, c22661xa3a2b3c0, c22642x62f5b194, textView, textView2, c22621x7603e017);
                            c22661xa3a2b3c0.setOnClickListener(this);
                            fg2.q1 q1Var = this.f201540m;
                            if (q1Var == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            q1Var.f343801e.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tv(this));
                            return;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b1
    public android.widget.EditText y() {
        fg2.q1 q1Var = this.f201540m;
        if (q1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 finderLiveSetMicTopicText = q1Var.f343801e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveSetMicTopicText, "finderLiveSetMicTopicText");
        return finderLiveSetMicTopicText;
    }
}
