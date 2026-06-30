package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public class n2 implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f283533m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.LayoutInflater f283534n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f283535o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.m2 f283536p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f283537q;

    /* renamed from: s, reason: collision with root package name */
    public int f283539s;

    /* renamed from: u, reason: collision with root package name */
    public int f283541u;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f283527d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f283528e = java.lang.Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f283529f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f283530g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f283531h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f283532i = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final int f283538r = com.p314xaae8f345.mm.R.C30868x68b1db1.f576161rz;

    /* renamed from: t, reason: collision with root package name */
    public r01.g0 f283540t = null;

    public n2(android.content.Context context, android.view.ViewGroup viewGroup) {
        this.f283533m = null;
        this.f283536p = null;
        this.f283533m = context;
        this.f283535o = viewGroup;
        this.f283534n = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        a();
        this.f283536p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m2(this, null);
    }

    public boolean a() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f283537q;
        if (!(c21505x98c24a7e != null && c21505x98c24a7e.f279010g.isShowing())) {
            return false;
        }
        this.f283537q.a();
        return true;
    }

    public boolean b(r01.g0 g0Var, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f283537q;
        if (!(c21505x98c24a7e != null && c21505x98c24a7e.f279010g.isShowing())) {
            return c(g0Var, i17, i18, z17);
        }
        boolean a17 = a();
        if (g0Var == null) {
            return a17;
        }
        r01.g0 g0Var2 = this.f283540t;
        return (g0Var2.f449606a == g0Var.f449606a && g0Var2.f449609d.equals(g0Var.f449609d)) ? a17 : a17 & c(g0Var, i17, i18, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(r01.g0 r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.n2.c(r01.g0, int, int, boolean):boolean");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
