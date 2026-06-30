package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class k0 extends s35.b {
    public static final java.lang.String G = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyq) + "/cgi-bin/report_mm?failuretype=1&devicetype=2&clientversion=%s&os=%s&username=%s&iport=%s&t=weixin_bulletin&f=xhtml&lang=%s";
    public boolean A;
    public boolean B;
    public java.lang.String C;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 D;
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E;
    public android.view.View F;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f289059m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f289060n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f289061o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f289062p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f289063q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f289064r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f289065s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f289066t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f289067u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ProgressBar f289068v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f289069w;

    /* renamed from: x, reason: collision with root package name */
    public int f289070x;

    /* renamed from: y, reason: collision with root package name */
    public int f289071y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f289072z;

    public k0(android.content.Context context) {
        super(context);
        this.f289070x = 0;
        this.F = null;
    }

    public static void l(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var, int i17) {
        k0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("diagnose_state", i17);
        intent.putExtra("diagnose_percent", k0Var.f289071y);
        intent.putExtra("diagnose_kvInfo", k0Var.C);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetWarnView", "put state: %d, process: %d, kv: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k0Var.f289071y), k0Var.C);
        j45.l.j((android.content.Context) k0Var.f484375g.get(), "traceroute", ".ui.NetworkDiagnoseAllInOneUI", intent, null);
    }

    @Override // s35.b
    public void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.D;
        if (b4Var != null) {
            b4Var.d();
            this.D = null;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.E;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7f;
    }

    @Override // s35.b
    public int c() {
        return 4;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.F = view.findViewById(com.p314xaae8f345.mm.R.id.kh7);
        this.f289059m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567709kh2);
        this.f289060n = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567710kh3);
        this.f289061o = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567711kh4);
        this.f289062p = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567708kh1);
        this.f289068v = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.kh6);
        this.f289064r = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567712kh5);
        this.f289065s = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
        this.f289066t = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566584gd1);
        this.f289067u = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.mwv);
        this.f289063q = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dfs);
        this.f289065s.setVisibility(8);
    }

    @Override // s35.b
    public boolean i() {
        int n17 = c01.d9.e().n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetWarnView", "Update network status: %d", java.lang.Integer.valueOf(n17));
        boolean z17 = true;
        boolean z18 = n17 == 0 || n17 == 5 || n17 == 2 || n17 == 3;
        if (z18) {
            f();
        } else if (!this.f484377i) {
            return false;
        }
        this.f289069w = java.lang.String.format(G, "0x" + java.lang.Integer.toHexString(o45.wf.f424562g), wo.q.f529313a, c01.z1.r(), c01.d9.e().l(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
        java.lang.ref.WeakReference weakReference = this.f484375g;
        if (n17 == 0) {
            this.f289059m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu);
            this.f289060n.setVisibility(8);
            this.f289062p.setVisibility(8);
            this.f289068v.setVisibility(8);
            this.f289064r.setVisibility(0);
            this.F.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.h0(this));
        } else if (n17 == 5) {
            this.f289059m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h7k);
            this.f289060n.setText(((android.content.Context) weakReference.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7l));
            this.f289060n.setVisibility(0);
            this.f289062p.setVisibility(8);
            this.f289068v.setVisibility(8);
            this.f289064r.setVisibility(0);
            this.F.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j0(this));
        } else if (n17 == 2) {
            if (this.f289070x == 1) {
                this.f289059m.setText(((android.content.Context) weakReference.get()).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7j, java.lang.Integer.valueOf(this.f289071y)));
            } else {
                this.f289059m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h7i);
            }
            this.f289060n.setVisibility(8);
            this.f289062p.setVisibility(8);
            this.f289068v.setVisibility(8);
            this.f289064r.setVisibility(0);
            this.F.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i0(this));
        } else if (n17 == 3) {
            this.f289059m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h7g);
            this.f289060n.setVisibility(8);
            this.f289062p.setVisibility(8);
            this.f289068v.setVisibility(0);
            this.f289064r.setVisibility(0);
        }
        if (z18) {
            this.f289061o.setVisibility(8);
            this.f289059m.setVisibility(0);
            this.F.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563715b71);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.f289064r.getLayoutParams());
            layoutParams.setMargins(i65.a.b((android.content.Context) weakReference.get(), 28), 0, i65.a.b((android.content.Context) weakReference.get(), 24), 0);
            this.f289064r.setLayoutParams(layoutParams);
            java.lang.Object tag = this.f289064r.getTag();
            if (tag == null || ((java.lang.Integer) tag).intValue() != com.p314xaae8f345.mm.R.raw.f79723x416541f0) {
                this.f289064r.setTag(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79723x416541f0));
                this.f289064r.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) weakReference.get(), com.p314xaae8f345.mm.R.raw.f79723x416541f0, ((android.content.Context) weakReference.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)));
            }
            this.f289066t.setVisibility(8);
            this.f289067u.setVisibility(8);
            this.f289063q.setVisibility(8);
        }
        if (!z18) {
            this.f289065s.setVisibility(8);
        }
        java.lang.Object tag2 = this.f289067u.getTag();
        if (tag2 == null || ((java.lang.Integer) tag2).intValue() != com.p314xaae8f345.mm.R.raw.f78768x7bfa973e) {
            this.f289067u.setTag(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78768x7bfa973e));
            this.f289067u.setImageResource(com.p314xaae8f345.mm.R.raw.f78768x7bfa973e);
        }
        java.lang.Object tag3 = this.f289065s.getTag();
        if (tag3 != null && ((java.lang.Integer) tag3).intValue() == com.p314xaae8f345.mm.R.raw.f78768x7bfa973e) {
            z17 = false;
        }
        if (z17) {
            this.f289065s.setTag(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78768x7bfa973e));
            this.f289065s.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562551iv);
        }
        android.view.View view = this.F;
        int i17 = z18 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return z18;
    }

    @Override // s35.b
    public void k(int i17) {
        android.view.View view = this.F;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
