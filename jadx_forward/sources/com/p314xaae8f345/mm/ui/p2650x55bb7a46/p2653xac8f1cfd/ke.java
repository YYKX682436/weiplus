package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class ke extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f280896d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f280897e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ee f280898f;

    public ke(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ee eeVar) {
        this.f280896d = context;
        this.f280897e = list;
        this.f280898f = eeVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f280897e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.List list = this.f280897e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fe feVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fe) k3Var;
        com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = (com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) list.get(i17);
        android.view.View view = feVar.f280584d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomaa@app.origin");
        android.widget.TextView textView = feVar.f280586f;
        android.widget.ImageView imageView = feVar.f280585e;
        if (D0) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563402bj5);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ftd);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomlive@app.origin")) {
            imageView.setImageDrawable(i65.a.i(this.f280896d, com.p314xaae8f345.mm.R.C30861xcebc809e.bj6));
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571934ty);
        } else {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(c10329x6f52684a.f145215d);
            if (Bi == null) {
                ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(c10329x6f52684a.f145215d, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ie(this, feVar));
            } else {
                x(feVar, Bi);
            }
        }
        android.view.View view2 = feVar.f280584d;
        view2.setTag(c10329x6f52684a);
        view2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.je(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fe(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569979tj, viewGroup, false));
    }

    public final void x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fe feVar, k91.v5 v5Var) {
        n11.a.b().h(v5Var != null ? v5Var.f68920x68aa7b8d : "", feVar.f280585e, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fe.f280583g);
        feVar.f280586f.setText(v5Var != null ? v5Var.f68913x21f9b213 : "");
    }
}
