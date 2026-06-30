package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xt extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f201914h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.d f201915i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(android.content.Context context, yz5.l onReplayCancelCallBack) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onReplayCancelCallBack, "onReplayCancelCallBack");
        this.f201914h = onReplayCancelCallBack;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayCancelWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.d dVar = this.f201915i;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = dVar.f343500b.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayCancelWidget", "click left btn");
            y(false);
        } else {
            fg2.d dVar2 = this.f201915i;
            if (dVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = dVar2.f343501c.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayCancelWidget", "click right btn");
                y(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.uyt;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uyt);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.uyu;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uyu);
            if (textView2 != null) {
                i17 = com.p314xaae8f345.mm.R.id.uyv;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uyv);
                if (linearLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.uyw;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uyw);
                    if (c22699x3dcdb352 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f568170uz0;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f568170uz0);
                        if (textView3 != null) {
                            this.f201915i = new fg2.d((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView, textView, textView2, linearLayout, c22699x3dcdb352, textView3);
                            textView.setOnClickListener(this);
                            fg2.d dVar = this.f201915i;
                            if (dVar != null) {
                                dVar.f343501c.setOnClickListener(this);
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    public final void y(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayCancelWidget", "onReplayCancel: " + z17);
        a();
        this.f201914h.mo146xb9724478(java.lang.Boolean.valueOf(z17));
    }
}
