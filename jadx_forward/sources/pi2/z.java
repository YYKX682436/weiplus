package pi2;

/* loaded from: classes3.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final yz5.p H;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.Button f436354J;
    public android.widget.Button K;
    public final java.util.LinkedList L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, yz5.p onSelect) {
        super(context, false, null, 0.0f, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelect, "onSelect");
        this.H = onSelect;
        this.L = new java.util.LinkedList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dl6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View E(zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dl6, (android.view.ViewGroup) z(), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.odb);
        textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ml7));
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.qv6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.I = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f436354J = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.K = (android.widget.Button) findViewById3;
        android.widget.Button button = this.f436354J;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        button.setOnClickListener(this);
        android.widget.Button button2 = this.K;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
            throw null;
        }
        button2.setOnClickListener(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = this.I;
        if (c22706xd568f79 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
        if (c22706xd568f79 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
        c22706xd568f79.addView(c22706xd568f79.m82065xfb86a31b(), new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = this.I;
        if (c22706xd568f792 != null) {
            c22706xd568f792.m82069x5dc03d58(new pi2.y(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicDurationSelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.Button button = this.f436354J;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        int id6 = button.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
        } else {
            android.widget.Button button2 = this.K;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
                throw null;
            }
            int id7 = button2.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                java.util.LinkedList linkedList = this.L;
                java.lang.Object obj = linkedList.get(this.M);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                java.lang.String string = this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, linkedList.get(this.M));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                this.H.mo149xb9724478(obj, string);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicDurationSelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
