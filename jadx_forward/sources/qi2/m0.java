package qi2;

/* loaded from: classes3.dex */
public final class m0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f445103h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 f445104i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f445105m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f445106n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f445107o;

    /* renamed from: p, reason: collision with root package name */
    public int f445108p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, yz5.p onSelect) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelect, "onSelect");
        this.f445103h = onSelect;
        this.f445107o = new java.util.LinkedList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dl6;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLivePkDurationSelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.Button button = this.f445105m;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        int id6 = button.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            a();
        } else {
            android.widget.Button button2 = this.f445106n;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
                throw null;
            }
            int id7 = button2.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                a();
                java.util.LinkedList linkedList = this.f445107o;
                java.lang.Object obj = linkedList.get(this.f445108p);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(((java.lang.Number) linkedList.get(this.f445108p)).intValue() / 60));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                this.f445103h.mo149xb9724478(obj, string);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLivePkDurationSelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.qv6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f445104i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f445105m = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f445106n = (android.widget.Button) findViewById3;
        android.widget.Button button = this.f445105m;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        button.setOnClickListener(this);
        android.widget.Button button2 = this.f445106n;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
            throw null;
        }
        button2.setOnClickListener(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = this.f445104i;
        if (c22706xd568f79 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
        if (c22706xd568f79 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
        c22706xd568f79.addView(c22706xd568f79.m82065xfb86a31b(), new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = this.f445104i;
        if (c22706xd568f792 != null) {
            c22706xd568f792.m82069x5dc03d58(new qi2.l0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
    }

    public final void y(java.util.LinkedList battleDurationList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleDurationList, "battleDurationList");
        w();
        java.util.LinkedList linkedList = this.f445107o;
        linkedList.clear();
        linkedList.addAll(battleDurationList);
        this.f445108p = battleDurationList.indexOf(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = this.f445104i;
        if (c22706xd568f79 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(battleDurationList, 10));
        java.util.Iterator it = battleDurationList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue() / 60)));
        }
        c22706xd568f79.m82070x203ffbdd((java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = this.f445104i;
        if (c22706xd568f792 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
        c22706xd568f792.m82071x53d8522f(this.f445108p);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f793 = this.f445104i;
        if (c22706xd568f793 != null) {
            c22706xd568f793.c(this.f445108p);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
            throw null;
        }
    }
}
