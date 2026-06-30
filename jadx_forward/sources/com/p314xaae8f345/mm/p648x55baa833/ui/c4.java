package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class c4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f145601d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f145602e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f145603f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f145604g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.w3 f145605h;

    public c4(android.content.Context context, boolean z17, java.util.List list, com.p314xaae8f345.mm.p648x55baa833.ui.w3 w3Var) {
        this.f145601d = context;
        this.f145602e = z17;
        this.f145604g = list;
        this.f145605h = w3Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f145604g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.List list = this.f145604g;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.x3 x3Var = (com.p314xaae8f345.mm.p648x55baa833.ui.x3) k3Var;
        com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = (com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) list.get(i17);
        android.view.View view = x3Var.f146172d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = this.f145602e;
        android.widget.ImageView imageView = x3Var.f146175g;
        android.widget.ImageView imageView2 = x3Var.f146174f;
        android.widget.RelativeLayout relativeLayout = x3Var.f146178m;
        if (z17) {
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            relativeLayout.setVisibility(0);
        } else {
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            relativeLayout.setVisibility(4);
        }
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomaa@app.origin");
        android.widget.TextView textView = x3Var.f146177i;
        android.widget.ImageView imageView3 = x3Var.f146176h;
        if (D0) {
            imageView3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563402bj5);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572361az0);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomlive@app.origin")) {
            imageView3.setImageDrawable(i65.a.i(this.f145601d, com.p314xaae8f345.mm.R.C30861xcebc809e.bj6));
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571934ty);
        } else {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(c10329x6f52684a.f145215d);
            if (Bi == null) {
                ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(c10329x6f52684a.f145215d, new com.p314xaae8f345.mm.p648x55baa833.ui.z3(this, x3Var));
            } else {
                x(x3Var, Bi);
            }
        }
        if (this.f145603f) {
            android.view.View view2 = x3Var.f146172d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view3 = x3Var.f146172d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.widget.RelativeLayout relativeLayout2 = x3Var.f146173e;
        ((android.view.ViewGroup) relativeLayout2.getParent()).setTag(java.lang.Boolean.valueOf(z17));
        relativeLayout2.setTag(c10329x6f52684a);
        relativeLayout2.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.a4(this, x3Var));
        if (z17) {
            relativeLayout.setOnLongClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.b4(this, x3Var));
        } else {
            relativeLayout.setOnLongClickListener(null);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p648x55baa833.ui.x3(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569950sq, viewGroup, false));
    }

    public final void x(com.p314xaae8f345.mm.p648x55baa833.ui.x3 x3Var, k91.v5 v5Var) {
        n11.a.b().h(v5Var != null ? v5Var.f68920x68aa7b8d : "", x3Var.f146176h, com.p314xaae8f345.mm.p648x55baa833.ui.x3.f146171n);
        x3Var.f146177i.setText(v5Var != null ? v5Var.f68913x21f9b213 : "");
    }
}
