package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class c4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f64068d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f64069e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f64070f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f64071g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.w3 f64072h;

    public c4(android.content.Context context, boolean z17, java.util.List list, com.tencent.mm.chatroom.ui.w3 w3Var) {
        this.f64068d = context;
        this.f64069e = z17;
        this.f64071g = list;
        this.f64072h = w3Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f64071g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list = this.f64071g;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.tencent.mm.chatroom.ui.x3 x3Var = (com.tencent.mm.chatroom.ui.x3) k3Var;
        com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = (com.tencent.mm.chatroom.storage.GroupToolItem) list.get(i17);
        android.view.View view = x3Var.f64639d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = this.f64069e;
        android.widget.ImageView imageView = x3Var.f64642g;
        android.widget.ImageView imageView2 = x3Var.f64641f;
        android.widget.RelativeLayout relativeLayout = x3Var.f64645m;
        if (z17) {
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            relativeLayout.setVisibility(0);
        } else {
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            relativeLayout.setVisibility(4);
        }
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomaa@app.origin");
        android.widget.TextView textView = x3Var.f64644i;
        android.widget.ImageView imageView3 = x3Var.f64643h;
        if (D0) {
            imageView3.setImageResource(com.tencent.mm.R.drawable.f481869bj5);
            textView.setText(com.tencent.mm.R.string.f490828az0);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomlive@app.origin")) {
            imageView3.setImageDrawable(i65.a.i(this.f64068d, com.tencent.mm.R.drawable.bj6));
            textView.setText(com.tencent.mm.R.string.f490401ty);
        } else {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(groupToolItem.f63682d);
            if (Bi == null) {
                ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(groupToolItem.f63682d, new com.tencent.mm.chatroom.ui.z3(this, x3Var));
            } else {
                x(x3Var, Bi);
            }
        }
        if (this.f64070f) {
            android.view.View view2 = x3Var.f64639d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view3 = x3Var.f64639d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.widget.RelativeLayout relativeLayout2 = x3Var.f64640e;
        ((android.view.ViewGroup) relativeLayout2.getParent()).setTag(java.lang.Boolean.valueOf(z17));
        relativeLayout2.setTag(groupToolItem);
        relativeLayout2.setOnClickListener(new com.tencent.mm.chatroom.ui.a4(this, x3Var));
        if (z17) {
            relativeLayout.setOnLongClickListener(new com.tencent.mm.chatroom.ui.b4(this, x3Var));
        } else {
            relativeLayout.setOnLongClickListener(null);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.chatroom.ui.x3(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488417sq, viewGroup, false));
    }

    public final void x(com.tencent.mm.chatroom.ui.x3 x3Var, k91.v5 v5Var) {
        n11.a.b().h(v5Var != null ? v5Var.field_smallHeadURL : "", x3Var.f64643h, com.tencent.mm.chatroom.ui.x3.f64638n);
        x3Var.f64644i.setText(v5Var != null ? v5Var.field_nickname : "");
    }
}
