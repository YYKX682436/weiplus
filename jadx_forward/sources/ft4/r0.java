package ft4;

/* loaded from: classes14.dex */
public final class r0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f348212d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f348213e;

    /* renamed from: f, reason: collision with root package name */
    public int f348214f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348216h;

    /* renamed from: i, reason: collision with root package name */
    public int f348217i;

    /* renamed from: m, reason: collision with root package name */
    public int f348218m;

    /* renamed from: n, reason: collision with root package name */
    public int f348219n;

    /* renamed from: o, reason: collision with root package name */
    public long f348220o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f348221p;

    /* renamed from: q, reason: collision with root package name */
    public ft4.l0 f348222q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.z1 f348223r;

    public r0(android.content.Context context, java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f348212d = context;
        this.f348213e = data;
        this.f348215g = "";
        this.f348216h = "";
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f348213e.size() + 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 == 1) {
            return 2;
        }
        return i17 == mo1894x7e414b06() - 1 ? 4 : 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (mo1894x7e414b06() <= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerPersonAdapter", "itemCount:" + mo1894x7e414b06() + " is small than " + i17);
            return;
        }
        boolean z17 = holder instanceof ft4.n0;
        android.content.Context context = this.f348212d;
        if (z17) {
            ft4.n0 n0Var = (ft4.n0) holder;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(n0Var.f348192e, this.f348216h, 0.1f);
            java.lang.String A = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.A(this.f348216h, this.f348215g);
            if (this.f348217i > 0) {
                str = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(java.lang.System.currentTimeMillis()) / 10000 == this.f348217i / 10000 ? com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), this.f348217i) : com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), this.f348217i);
            } else if (this.f348219n % 100 > 31) {
                str = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ld_), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(this.f348218m));
            } else {
                java.lang.String r17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(this.f348218m));
                java.lang.String r18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(this.f348219n));
                if (this.f348218m / 10000 == this.f348219n / 10000) {
                    r18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(this.f348219n));
                }
                str = r17 + '-' + r18;
            }
            long j17 = this.f348220o;
            android.widget.TextView textView = n0Var.f348193f;
            if (j17 > 0) {
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lh7, str, A));
            } else {
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lh8, str, A));
            }
            n0Var.f348194g.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.C(this.f348220o));
            return;
        }
        if (holder instanceof ft4.p0) {
            if (this.f348220o > 0) {
                ((ft4.p0) holder).f348206e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhg));
                return;
            } else {
                ((ft4.p0) holder).f348206e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhi));
                return;
            }
        }
        if (holder instanceof ft4.m0) {
            android.widget.TextView textView2 = ((ft4.m0) holder).f348186e;
            this.f348221p = textView2;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView2);
            int i18 = this.f348214f;
            if (i18 == 1) {
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575078lh5));
            } else if (i18 != 2) {
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lo_));
            } else {
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lo9));
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.z1 z1Var = this.f348223r;
            if (z1Var == null) {
                textView2.setVisibility(8);
                return;
            } else {
                textView2.setOnClickListener(z1Var);
                textView2.setVisibility(0);
                return;
            }
        }
        if (holder instanceof ft4.o0) {
            int i19 = i17 - 2;
            java.util.List list = this.f348213e;
            if (i19 >= list.size() || i19 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerPersonAdapter", "position:" + i17 + "-2 is >=  " + list.size() + " || < 0");
                return;
            }
            dt4.u uVar = (dt4.u) list.get(i19);
            java.lang.String A2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.A(uVar.f324826b, this.f348215g);
            java.lang.String string = context.getString(dt4.p.f324799f.c(uVar.f324829e));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (this.f348220o > 0) {
                ((ft4.o0) holder).f348200e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lh9, string, A2));
            } else {
                ((ft4.o0) holder).f348200e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lh_, string, A2));
            }
            ft4.o0 o0Var = (ft4.o0) holder;
            o0Var.f348201f.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ley), uVar.f324828d));
            o0Var.f348202g.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.C(uVar.f324827c));
            if (i17 == mo1894x7e414b06() - 2) {
                android.view.View view = o0Var.f348203h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = o0Var.f348203h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f348222q != null) {
                o0Var.f348199d.setOnClickListener(new ft4.q0(holder, this));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.de9, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new ft4.n0(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.de_, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new ft4.p0(inflate2);
        }
        if (i17 == 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.deb, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new ft4.o0(inflate3);
        }
        if (i17 != 4) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.deb, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
            return new ft4.o0(inflate4);
        }
        android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.de8, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate5, "inflate(...)");
        return new ft4.m0(inflate5);
    }
}
