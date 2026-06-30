package bm2;

/* loaded from: classes3.dex */
public final class a8 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f21777h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f21778i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f21779m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f21780n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f21781o;

    public a8(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f21777h = buContext;
        this.f21778i = "FinderLiveShopMsgAdapter";
        this.f21779m = new java.util.ArrayList();
        this.f21780n = jz5.h.b(new bm2.z7(this));
        this.f21781o = jz5.h.b(new bm2.y7(this));
    }

    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void y(bm2.h1 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        java.lang.Object obj = this.f21779m.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dk2.zf zfVar = (dk2.zf) obj;
        bm2.o1.f22177t.a(holder);
        int type = zfVar.getType();
        if (type == 20002) {
            fk2.o2 o2Var = (fk2.o2) ((jz5.n) this.f21780n).getValue();
            android.content.Context context = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            o2Var.d(context, holder, zfVar, i17);
        } else if (type == 20112) {
            fk2.n nVar = (fk2.n) ((jz5.n) this.f21781o).getValue();
            android.content.Context context2 = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            nVar.d(context2, holder, zfVar, i17);
        }
        dk2.dg dgVar = zfVar instanceof dk2.dg ? (dk2.dg) zfVar : null;
        if (dgVar != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.rlw);
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.rlv);
            if (findViewById == null) {
                findViewById = com.tencent.mm.ui.id.b(holder.itemView.getContext()).inflate(com.tencent.mm.R.layout.f488879dr4, (android.view.ViewGroup) null);
                viewGroup.addView(findViewById);
            }
            android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.rlt);
            android.view.View findViewById3 = findViewById.findViewById(com.tencent.mm.R.id.rlu);
            findViewById2.setOnClickListener(null);
            int ordinal = dgVar.getStatus().ordinal();
            if (ordinal == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (ordinal != 2) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveShopMsgAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new bm2.x7(zfVar, this));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21779m.size();
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        bm2.h1 holder = (bm2.h1) r0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        y(holder, i17, new java.util.ArrayList());
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.apg, null);
        inflate.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        return new bm2.h1(inflate);
    }
}
