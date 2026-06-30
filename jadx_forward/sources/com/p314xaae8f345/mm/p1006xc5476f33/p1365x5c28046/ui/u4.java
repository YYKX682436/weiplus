package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public final class u4 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.o f179743e;

    /* renamed from: f, reason: collision with root package name */
    public final int f179744f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f179745g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f179746h;

    /* renamed from: i, reason: collision with root package name */
    public final int f179747i;

    /* renamed from: m, reason: collision with root package name */
    public final int f179748m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f179749n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.l f179750o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f179751p;

    public u4(p012xc85e97e9.p093xedfae76a.o lifecycle, int i17, boolean z17, java.lang.String sdkRequestID, int i18, int i19, yz5.l onClicked, yz5.l setActivityCallback, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkRequestID, "sdkRequestID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClicked, "onClicked");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setActivityCallback, "setActivityCallback");
        this.f179743e = lifecycle;
        this.f179744f = i17;
        this.f179745g = z17;
        this.f179746h = sdkRequestID;
        this.f179747i = i18;
        this.f179748m = i19;
        this.f179749n = onClicked;
        this.f179750o = setActivityCallback;
        this.f179751p = z18;
    }

    @Override // in5.r
    public int e() {
        return !this.f179745g ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dby : com.p314xaae8f345.mm.R.C30864xbddafb2a.agf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        gr.a0 item = (gr.a0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        bw5.ra raVar = ((so2.p) item).f492068d;
        j12.i iVar = new j12.i(raVar);
        if (raVar == null ? false : n22.l.b(raVar.f113989d)) {
            if (n22.l.a()) {
                iVar.c(7);
            } else {
                iVar.c(3);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c;
        iVar.b(pVar.b(), null, pVar.a(raVar.f113989d));
        i22.b0 b0Var = new i22.b0();
        android.content.Context context = holder.f374654e;
        b0Var.f369467c = context;
        b0Var.f369470f = this.f179744f;
        b0Var.f369471g = 0L;
        b0Var.f369472h = "";
        n22.f fVar = n22.f.f415823a;
        boolean z18 = this.f179745g;
        if (z18) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.hib);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hhb);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hhr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hiq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            android.graphics.drawable.Drawable b17 = fVar.b(0, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d), 0.0f, 0.0f, 0.0f, 0.0f);
            ((android.widget.TextView) findViewById4).setText(raVar.f113991f);
            n11.a b18 = n11.a.b();
            java.lang.String str = raVar.f113990e;
            b18.h(str, (android.widget.ImageView) findViewById3, y12.f.b(raVar.f113989d, str));
            findViewById2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
            findViewById.setBackground(b17);
            holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q4(this, item));
            return;
        }
        android.view.View itemView2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p4 p4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p4(itemView2, context, holder.m8183xf806b362(), this.f179744f, iVar, null, true, false, null, this.f179746h, this.f179747i, this.f179748m, this.f179751p, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8, null);
        p4Var.f179661n = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s4(b0Var, p4Var, this);
        if (!new java.util.ArrayList().isEmpty()) {
            p4Var.f();
            i19 = 0;
        } else {
            boolean z19 = p4Var.f179659i;
            j12.i iVar2 = p4Var.f179658h;
            if (z19) {
                iVar2.f378708j = true;
                iVar2.f378706h = true;
                i19 = 0;
                iVar2.f378707i = false;
            } else {
                i19 = 0;
            }
            iVar2.f378707i = p4Var.f179660m;
            bw5.ra raVar2 = iVar2.f378701c;
            if (raVar2 != null) {
                p4Var.f179666s.setText(raVar2.f113991f);
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(raVar2.E)};
                android.content.Context context2 = p4Var.f179655e;
                p4Var.f179667t.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7s, objArr));
                p4Var.f179668u.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.m4(p4Var, raVar2));
                p4Var.E.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7q, fVar.c(raVar2.S.f471696e)));
                p4Var.D.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7q, fVar.c(raVar2.S.f471695d)));
                android.widget.LinearLayout linearLayout = p4Var.F;
                boolean z27 = p4Var.f179665r;
                if (z27) {
                    linearLayout.setVisibility(i19 == true ? 1 : 0);
                } else {
                    linearLayout.setVisibility(8);
                }
                p4Var.f();
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n4 n4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n4(p4Var);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = p4Var.f179670w;
                c22661xa3a2b3c0.setOnClickListener(n4Var);
                p4Var.f179672y.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o4(p4Var));
                java.lang.String str2 = p4Var.f179662o;
                if ((str2.length() > 0 ? true : i19 == true ? 1 : 0) != false) {
                    cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    android.view.View view = p4Var.f179654d;
                    aVar.pk(view, "finder_profile_emoticon_cell");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(view, 40, 10, i19);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c22661xa3a2b3c0, "finder_profile_emoticon_cell_add");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(c22661xa3a2b3c0, 8, 10, i19);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    if (!(str2.length() != 0 ? i19 == true ? 1 : 0 : true)) {
                        java.lang.String ProductID = raVar2.f113989d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ProductID, "ProductID");
                        hashMap.put("pid", ProductID);
                        hashMap.put("emoticon_type", 2);
                        hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(p4Var.f179664q));
                        hashMap.put("pos_id", java.lang.Integer.valueOf(p4Var.f179656f));
                        hashMap.put("emoticon_sessionid", str2);
                        hashMap.put("emoticon_user_type", z27 ? "1" : "2");
                        hashMap.put("enter_isred", java.lang.Integer.valueOf(p4Var.f179663p));
                        hashMap2.put("page_id", 50090);
                        hashMap2.put("page_name", "FinderProfileEmoticonTab");
                        hashMap.put("cur_page", hashMap2);
                    }
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view, hashMap);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(c22661xa3a2b3c0, hashMap);
                }
            }
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t4(this, item));
        if (z18) {
            android.view.View view2 = p4Var.f179669v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(i19)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = p4Var.f179669v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(i19)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/emoji/model/EmotionSummaryData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
