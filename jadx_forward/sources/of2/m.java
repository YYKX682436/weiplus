package of2;

/* loaded from: classes10.dex */
public final class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final nf2.f1 H;
    public final of2.a I;

    /* renamed from: J, reason: collision with root package name */
    public nf2.a f426624J;
    public nf2.l1 K;
    public boolean L;
    public of2.g M;
    public of2.d N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, nf2.f1 initialConfig, of2.a callback) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialConfig, "initialConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.H = initialConfig;
        this.I = callback;
        this.f426624J = initialConfig.f418265n;
        this.K = initialConfig.f418269r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ea6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ose);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        X(new android.graphics.drawable.ColorDrawable(this.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a)));
        d0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.uen);
        this.M = new of2.g(this, new of2.h(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 0, false));
        c1163xf1deaba4.mo7960x6cab2c8d(this.M);
        c1163xf1deaba4.N(new of2.i(c1163xf1deaba4));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.uek);
        this.N = new of2.d(this, new of2.j(this));
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba42.getContext(), 0, false));
        c1163xf1deaba42.mo7960x6cab2c8d(this.N);
        c1163xf1deaba42.N(new of2.k(c1163xf1deaba42));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        android.view.View view;
        super.S();
        if (this.L) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsStyleEditPanel", "onDismiss: cancelled (not confirmed)");
        nf2.g gVar = (nf2.g) this.I;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsController", "onPanelCancelled");
        nf2.d1 d1Var = gVar.f418271b.f418341m;
        if (d1Var == null || !d1Var.f418236x) {
            return;
        }
        d1Var.f418236x = false;
        nf2.f1 f1Var = d1Var.f418238z;
        jz5.l lVar = d1Var.f418237y;
        nf2.a aVar = d1Var.f418215c.f418265n;
        d1Var.f418237y = null;
        d1Var.f418238z = null;
        if (f1Var != null) {
            boolean z17 = aVar != f1Var.f418265n;
            d1Var.D = lVar;
            d1Var.j(f1Var);
            if (!z17 && lVar != null) {
                d1Var.l(((java.lang.Number) lVar.f384366d).floatValue(), ((java.lang.Number) lVar.f384367e).floatValue());
            }
        }
        if (!d1Var.f418233u && d1Var.f418215c.f418256e && (view = d1Var.f418221i) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "exitPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "exitPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "exitPreviewMode: restored position=" + lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void T() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsStyleEditPanel", "onLeftClick: cancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        nf2.k1 k1Var;
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsStyleEditPanel", "onRightClick: componentLayout=" + this.f426624J + ", color=" + this.K);
        this.L = true;
        int ordinal = this.f426624J.ordinal();
        if (ordinal == 0) {
            k1Var = nf2.k1.f418300d;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            k1Var = nf2.k1.f418301e;
        }
        nf2.f1 a17 = nf2.f1.a(this.H, 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.f426624J, k1Var, null, 0L, this.K, 106495, null);
        nf2.g gVar = (nf2.g) this.I;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsController", "onStyleConfirmed: componentLayout=" + a17.f418265n + ", renderDirection=" + a17.f418266o + ", color=" + a17.f418269r);
        nf2.w wVar = gVar.f418271b;
        nf2.d1 d1Var = wVar.f418341m;
        if (d1Var != null && d1Var.f418236x) {
            d1Var.f418236x = false;
            jz5.l lVar = d1Var.f418237y;
            d1Var.f418237y = null;
            d1Var.f418238z = null;
            if (lVar != null) {
                d1Var.l(((java.lang.Number) lVar.f384366d).floatValue(), ((java.lang.Number) lVar.f384367e).floatValue());
            }
            if (!d1Var.f418233u && d1Var.f418215c.f418256e && (view = d1Var.f418221i) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "confirmPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "confirmPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "confirmPreviewMode: restored position=" + lVar);
        }
        wVar.f418351w = a17;
        wVar.f7(1, 2);
        wVar.f7(2, null);
        if (dk2.ef.f314917g) {
            wVar.h7(a17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        return y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        android.widget.TextView textView = new android.widget.TextView(this.f199716e);
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        textView.setBackground(textView.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo));
        textView.setMinWidth((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        textView.setMinHeight((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
        textView.setGravity(17);
        return textView;
    }
}
