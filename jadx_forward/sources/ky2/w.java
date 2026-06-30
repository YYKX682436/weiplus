package ky2;

/* loaded from: classes.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f395117d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f395118e;

    /* renamed from: f, reason: collision with root package name */
    public final int f395119f;

    /* renamed from: g, reason: collision with root package name */
    public final int f395120g;

    /* renamed from: h, reason: collision with root package name */
    public final int f395121h;

    /* renamed from: i, reason: collision with root package name */
    public final int f395122i;

    /* renamed from: m, reason: collision with root package name */
    public final int f395123m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f395124n;

    /* renamed from: o, reason: collision with root package name */
    public int f395125o;

    /* renamed from: p, reason: collision with root package name */
    public int f395126p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f395127q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f395128r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f395129s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f395130t;

    /* renamed from: u, reason: collision with root package name */
    public final ky2.v f395131u;

    public w(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f395117d = context;
        this.f395118e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f395119f = 50;
        this.f395120g = 24;
        this.f395121h = 60;
        this.f395122i = 1;
        this.f395123m = 2;
        this.f395125o = 2;
        this.f395126p = -1;
        this.f395129s = new java.util.HashMap();
        this.f395131u = new ky2.v(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f395118e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((ky2.r) this.f395118e.get(i17)).f395110c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        android.view.View view;
        android.widget.EditText editText;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        java.lang.Object Z = kz5.n0.Z(payloads);
        if ((Z instanceof java.lang.Integer) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Z, java.lang.Integer.valueOf(i17))) {
            ky2.q qVar = holder instanceof ky2.q ? (ky2.q) holder : null;
            if (qVar == null || (view = qVar.f3639x46306858) == null || (editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.p9w)) == null) {
                return;
            }
            editText.requestFocus();
            return;
        }
        mo864xe5e2e48d(holder, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1r, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new ky2.h(this, inflate);
        }
        if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1k, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new ky2.j(this, inflate2);
        }
        if (i17 != 2) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1o, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
            return new ky2.q(this, inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1o, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
        return new ky2.q(this, inflate4);
    }

    public final void x() {
        java.util.List dataList = this.f395118e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataList, "dataList");
        java.util.Iterator it = dataList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!(((ky2.r) it.next()).f395108a.length() == 0)) {
                i17++;
            }
        }
        yz5.l lVar = this.f395128r;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(i17 >= 2));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int m8185xcdaf1228 = holder.m8185xcdaf1228();
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        if (m8185xcdaf1228 == 0) {
            ky2.h hVar = holder instanceof ky2.h ? (ky2.h) holder : null;
            if (hVar != null) {
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) itemView.findViewById(com.p314xaae8f345.mm.R.id.p_7);
                android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.p_8);
                android.widget.EditText editText = (android.widget.EditText) itemView.findViewById(com.p314xaae8f345.mm.R.id.p_a);
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) itemView.findViewById(com.p314xaae8f345.mm.R.id.p_9);
                android.widget.TextView textView2 = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.p__);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                com.p314xaae8f345.mm.ui.fk.a(textView);
                ky2.w wVar = hVar.f395082d;
                linearLayout.setOnClickListener(new ky2.d(itemView, wVar, i17, textView));
                android.text.InputFilter[] inputFilterArr = {new ky2.t(wVar), new ky2.u(wVar.f395121h, t4Var)};
                if (editText != null) {
                    editText.setFilters(inputFilterArr);
                }
                editText.setOnFocusChangeListener(new ky2.e(itemView, wVar));
                ky2.v vVar = wVar.f395131u;
                editText.removeTextChangedListener(vVar);
                editText.addTextChangedListener(vVar);
                frameLayout.setOnClickListener(new ky2.g(wVar, itemView, textView2, i17));
                return;
            }
            return;
        }
        if (m8185xcdaf1228 == 1) {
            ky2.j jVar = holder instanceof ky2.j ? (ky2.j) holder : null;
            if (jVar != null) {
                android.view.View itemView2 = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) itemView2.findViewById(com.p314xaae8f345.mm.R.id.p9u);
                c1073x7e08a787.setOnClickListener(new ky2.i(i17, jVar.f395087d, c1073x7e08a787, (android.widget.TextView) itemView2.findViewById(com.p314xaae8f345.mm.R.id.p9z)));
                return;
            }
            return;
        }
        if (m8185xcdaf1228 != 2) {
            return;
        }
        ky2.q qVar = holder instanceof ky2.q ? (ky2.q) holder : null;
        if (qVar != null) {
            android.view.View itemView3 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) itemView3.findViewById(com.p314xaae8f345.mm.R.id.p9v);
            android.widget.EditText editText2 = (android.widget.EditText) itemView3.findViewById(com.p314xaae8f345.mm.R.id.p9w);
            ky2.w wVar2 = qVar.f395107d;
            editText2.removeTextChangedListener((android.text.TextWatcher) ((java.util.HashMap) wVar2.f395129s).get(java.lang.Integer.valueOf(itemView3.hashCode())));
            ky2.a aVar = new ky2.a(wVar2);
            aVar.f395038d = i17;
            ((java.util.HashMap) wVar2.f395129s).put(java.lang.Integer.valueOf(itemView3.hashCode()), aVar);
            editText2.addTextChangedListener(aVar);
            java.util.List list = wVar2.f395118e;
            editText2.setText(((ky2.r) list.get(i17)).f395108a);
            c22699x3dcdb352.setOnClickListener(new ky2.k(wVar2, i17, editText2, itemView3));
            editText2.setFocusable(true);
            editText2.setFocusableInTouchMode(true);
            editText2.setCursorVisible(true);
            editText2.setFilters(new android.text.InputFilter[]{new ky2.t(wVar2), new ky2.u(wVar2.f395120g, t4Var)});
            editText2.setOnEditorActionListener(new ky2.l(wVar2, i17, editText2));
            editText2.setOnFocusChangeListener(new ky2.o(itemView3, wVar2, editText2, i17));
            if (wVar2.f395126p == i17 && i17 == list.size() - 2) {
                editText2.requestFocus();
                wVar2.f395126p = -1;
            } else if (i17 == 1 && ((ky2.r) list.get(i17)).f395110c == 2 && wVar2.f395124n) {
                itemView3.postDelayed(new ky2.p(editText2, wVar2), 300L);
            }
        }
    }
}
