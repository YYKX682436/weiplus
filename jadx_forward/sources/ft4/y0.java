package ft4;

/* loaded from: classes14.dex */
public final class y0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f348262d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f348263e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348264f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348265g;

    /* renamed from: h, reason: collision with root package name */
    public int f348266h;

    /* renamed from: i, reason: collision with root package name */
    public int f348267i;

    /* renamed from: m, reason: collision with root package name */
    public int f348268m;

    /* renamed from: n, reason: collision with root package name */
    public long f348269n;

    /* renamed from: o, reason: collision with root package name */
    public long f348270o;

    /* renamed from: p, reason: collision with root package name */
    public int f348271p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.z1 f348272q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.z1 f348273r;

    /* renamed from: s, reason: collision with root package name */
    public ft4.s0 f348274s;

    public y0(android.content.Context context, java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f348262d = context;
        this.f348263e = data;
        this.f348264f = "";
        this.f348265g = "";
        this.f348266h = 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f348263e.size() + 3;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (mo1894x7e414b06() <= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerPersonDetailAdapter", "itemCount:" + mo1894x7e414b06() + " is small than " + i17);
            return;
        }
        boolean z17 = holder instanceof ft4.u0;
        android.content.Context context = this.f348262d;
        if (z17) {
            ft4.u0 u0Var = (ft4.u0) holder;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(u0Var.f348245e, this.f348265g, 0.1f);
            u0Var.f348246f.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lh6, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.A(this.f348265g, this.f348264f)));
            android.widget.TextView textView = u0Var.f348247g;
            textView.setVisibility(8);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f348264f)) {
                textView.setVisibility(0);
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgz, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.A(this.f348264f, "")));
                return;
            }
            return;
        }
        if (holder instanceof ft4.w0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.z1 z1Var = this.f348272q;
            if (z1Var != null) {
                ((ft4.w0) holder).f348256f.setOnClickListener(z1Var);
            }
            ft4.w0 w0Var = (ft4.w0) holder;
            w0Var.f348255e.setText(context.getString(dt4.p.f324799f.c(this.f348271p)));
            w0Var.f348257g.a(this.f348273r);
            ft4.u uVar = w0Var.f348257g;
            uVar.f348232c = this.f348266h;
            uVar.b(this.f348267i, this.f348268m, this.f348269n, this.f348270o);
            return;
        }
        if (holder instanceof ft4.t0) {
            ((ft4.t0) holder).f348229e.setVisibility(8);
            return;
        }
        if (holder instanceof ft4.v0) {
            int i18 = i17 - 2;
            if (i18 >= this.f348263e.size() || i18 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerPersonDetailAdapter", "position:" + i17 + "-2 is >=  " + this.f348263e.size() + " || < 0");
                return;
            }
            dt4.u uVar2 = (dt4.u) this.f348263e.get(i18);
            java.lang.String A = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.A(uVar2.f324826b, this.f348264f);
            java.lang.String string = context.getString(dt4.p.f324799f.c(uVar2.f324829e));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (uVar2.f324827c > 0) {
                ((ft4.v0) holder).f348249e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lh9, string, A));
            } else {
                ((ft4.v0) holder).f348249e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lh_, string, A));
            }
            ft4.v0 v0Var = (ft4.v0) holder;
            v0Var.f348250f.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ley), uVar2.f324828d));
            java.lang.String C = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.C(uVar2.f324827c);
            android.widget.TextView textView2 = v0Var.f348251g;
            textView2.setText(C);
            if (uVar2.f324827c > 0) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
            } else {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            }
            if (i17 == mo1894x7e414b06() - 2) {
                android.view.View view = v0Var.f348252h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = v0Var.f348252h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f348274s != null) {
                v0Var.f348248d.setOnClickListener(new ft4.x0(holder, this));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571157de5, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new ft4.u0(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.de6, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new ft4.w0(inflate2);
        }
        if (i17 == 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.deb, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new ft4.v0(inflate3);
        }
        if (i17 != 4) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.deb, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
            return new ft4.v0(inflate4);
        }
        android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.de8, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate5, "inflate(...)");
        return new ft4.t0(inflate5);
    }
}
