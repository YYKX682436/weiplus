package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class u4 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.o f98210e;

    /* renamed from: f, reason: collision with root package name */
    public final int f98211f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f98212g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f98213h;

    /* renamed from: i, reason: collision with root package name */
    public final int f98214i;

    /* renamed from: m, reason: collision with root package name */
    public final int f98215m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f98216n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.l f98217o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f98218p;

    public u4(androidx.lifecycle.o lifecycle, int i17, boolean z17, java.lang.String sdkRequestID, int i18, int i19, yz5.l onClicked, yz5.l setActivityCallback, boolean z18) {
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.o.g(sdkRequestID, "sdkRequestID");
        kotlin.jvm.internal.o.g(onClicked, "onClicked");
        kotlin.jvm.internal.o.g(setActivityCallback, "setActivityCallback");
        this.f98210e = lifecycle;
        this.f98211f = i17;
        this.f98212g = z17;
        this.f98213h = sdkRequestID;
        this.f98214i = i18;
        this.f98215m = i19;
        this.f98216n = onClicked;
        this.f98217o = setActivityCallback;
        this.f98218p = z18;
    }

    @Override // in5.r
    public int e() {
        return !this.f98212g ? com.tencent.mm.R.layout.dby : com.tencent.mm.R.layout.agf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        gr.a0 item = (gr.a0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        bw5.ra raVar = ((so2.p) item).f410535d;
        j12.i iVar = new j12.i(raVar);
        if (raVar == null ? false : n22.l.b(raVar.f32456d)) {
            if (n22.l.a()) {
                iVar.c(7);
            } else {
                iVar.c(3);
            }
        }
        com.tencent.mm.plugin.emoji.model.p pVar = com.tencent.mm.plugin.emoji.model.q.f97591c;
        iVar.b(pVar.b(), null, pVar.a(raVar.f32456d));
        i22.b0 b0Var = new i22.b0();
        android.content.Context context = holder.f293121e;
        b0Var.f287934c = context;
        b0Var.f287937f = this.f98211f;
        b0Var.f287938g = 0L;
        b0Var.f287939h = "";
        n22.f fVar = n22.f.f334290a;
        boolean z18 = this.f98212g;
        if (z18) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.hib);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.hhb);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.hhr);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.hiq);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            android.graphics.drawable.Drawable b17 = fVar.b(0, i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_0_5), 0.0f, 0.0f, 0.0f, 0.0f);
            ((android.widget.TextView) findViewById4).setText(raVar.f32458f);
            n11.a b18 = n11.a.b();
            java.lang.String str = raVar.f32457e;
            b18.h(str, (android.widget.ImageView) findViewById3, y12.f.b(raVar.f32456d, str));
            findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
            findViewById.setBackground(b17);
            holder.itemView.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.q4(this, item));
            return;
        }
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.emoji.ui.p4 p4Var = new com.tencent.mm.plugin.emoji.ui.p4(itemView2, context, holder.getAdapterPosition(), this.f98211f, iVar, null, true, false, null, this.f98213h, this.f98214i, this.f98215m, this.f98218p, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, null);
        p4Var.f98128n = new com.tencent.mm.plugin.emoji.ui.s4(b0Var, p4Var, this);
        if (!new java.util.ArrayList().isEmpty()) {
            p4Var.f();
            i19 = 0;
        } else {
            boolean z19 = p4Var.f98126i;
            j12.i iVar2 = p4Var.f98125h;
            if (z19) {
                iVar2.f297175j = true;
                iVar2.f297173h = true;
                i19 = 0;
                iVar2.f297174i = false;
            } else {
                i19 = 0;
            }
            iVar2.f297174i = p4Var.f98127m;
            bw5.ra raVar2 = iVar2.f297168c;
            if (raVar2 != null) {
                p4Var.f98133s.setText(raVar2.f32458f);
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(raVar2.E)};
                android.content.Context context2 = p4Var.f98122e;
                p4Var.f98134t.setText(context2.getString(com.tencent.mm.R.string.d7s, objArr));
                p4Var.f98135u.post(new com.tencent.mm.plugin.emoji.ui.m4(p4Var, raVar2));
                p4Var.E.setText(context2.getString(com.tencent.mm.R.string.d7q, fVar.c(raVar2.S.f390163e)));
                p4Var.D.setText(context2.getString(com.tencent.mm.R.string.d7q, fVar.c(raVar2.S.f390162d)));
                android.widget.LinearLayout linearLayout = p4Var.F;
                boolean z27 = p4Var.f98132r;
                if (z27) {
                    linearLayout.setVisibility(i19 == true ? 1 : 0);
                } else {
                    linearLayout.setVisibility(8);
                }
                p4Var.f();
                com.tencent.mm.plugin.emoji.ui.n4 n4Var = new com.tencent.mm.plugin.emoji.ui.n4(p4Var);
                com.tencent.mm.ui.widget.button.WeButton weButton = p4Var.f98137w;
                weButton.setOnClickListener(n4Var);
                p4Var.f98139y.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.o4(p4Var));
                java.lang.String str2 = p4Var.f98129o;
                if ((str2.length() > 0 ? true : i19 == true ? 1 : 0) != false) {
                    cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    android.view.View view = p4Var.f98121d;
                    aVar.pk(view, "finder_profile_emoticon_cell");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(view, 40, 10, i19);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(weButton, "finder_profile_emoticon_cell_add");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(weButton, 8, 10, i19);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    if (!(str2.length() != 0 ? i19 == true ? 1 : 0 : true)) {
                        java.lang.String ProductID = raVar2.f32456d;
                        kotlin.jvm.internal.o.f(ProductID, "ProductID");
                        hashMap.put("pid", ProductID);
                        hashMap.put("emoticon_type", 2);
                        hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(p4Var.f98131q));
                        hashMap.put("pos_id", java.lang.Integer.valueOf(p4Var.f98123f));
                        hashMap.put("emoticon_sessionid", str2);
                        hashMap.put("emoticon_user_type", z27 ? "1" : "2");
                        hashMap.put("enter_isred", java.lang.Integer.valueOf(p4Var.f98130p));
                        hashMap2.put("page_id", 50090);
                        hashMap2.put("page_name", "FinderProfileEmoticonTab");
                        hashMap.put("cur_page", hashMap2);
                    }
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view, hashMap);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(weButton, hashMap);
                }
            }
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.t4(this, item));
        if (z18) {
            android.view.View view2 = p4Var.f98136v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(i19)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = p4Var.f98136v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(i19)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
