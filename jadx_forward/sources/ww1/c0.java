package ww1;

/* loaded from: classes15.dex */
public class c0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f531693d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f531694e;

    /* renamed from: f, reason: collision with root package name */
    public final int f531695f;

    public c0(android.content.Context context, int i17) {
        this.f531693d = context;
        this.f531695f = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f531694e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ww1.a0 a0Var = (ww1.a0) k3Var;
        java.util.List list = this.f531694e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        ww1.b0 b0Var = (ww1.b0) this.f531694e.get(i17);
        android.content.Context context = this.f531693d;
        int b17 = i65.a.b(context, 16);
        int b18 = i65.a.b(context, 18);
        if (i17 == this.f531694e.size() - 1) {
            a0Var.f531613d.setPadding(b17, b18, b17, b18);
            a0Var.f531613d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562814pd);
        } else {
            a0Var.f531613d.setPadding(b17, b18, b17, 0);
            a0Var.f531613d.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        }
        android.view.View view = a0Var.f531613d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i18 = this.f531695f;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = a0Var.f531615f;
        if (i18 == 2) {
            c19659x677e0913.m75394x3288e7c1(true);
            c19659x677e0913.m75395x7083e041(0.1f);
            c19659x677e0913.b(b0Var.f531739r, 0, 0, com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b0Var.f531728d)) {
            c19659x677e0913.setVisibility(8);
        } else {
            c19659x677e0913.setVisibility(0);
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(b0Var.f531728d);
            if (f07 == null || ((int) f07.E2) <= 0) {
                ((c01.k7) c01.n8.a()).b(b0Var.f531728d, 4, new ww1.z(this, java.lang.System.currentTimeMillis(), a0Var, b0Var));
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(c19659x677e0913, b0Var.f531728d, null);
            }
        }
        java.lang.String str = b0Var.f531735n;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b0Var.f531728d)) {
            str = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(b0Var.f531728d);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = a0Var.f531614e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        int i19 = b0Var.f531734m;
        a0Var.f531616g.setText(i19 != 0 ? i19 != 1 ? i19 != 2 ? "" : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_f) : b0Var.f531650s ? com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(b0Var.f531730f, b0Var.f531731g) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_g) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_i));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new ww1.a0(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570183zk, viewGroup, false));
    }
}
