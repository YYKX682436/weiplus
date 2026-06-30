package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes9.dex */
public final class y2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f104984e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104985f;

    public y2(java.lang.String finderUsername, boolean z17) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f104984e = finderUsername;
        this.f104985f = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488798dc3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.util.Map linkedHashMap;
        java.lang.String str;
        android.content.Intent intent;
        so2.o0 item = (so2.o0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.g(item, "item");
        try {
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent = activity.getIntent()) == null || (str = intent.getStringExtra("key_biz_passthrough_info")) == null) {
                str = "{}";
            }
            linkedHashMap = d75.b.e(new org.json.JSONObject(str), com.tencent.mm.plugin.finder.convert.x2.f104921d);
        } catch (java.lang.Exception unused) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        java.lang.Object obj = linkedHashMap.get("sdkRequestID");
        final java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null) {
            str2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        java.util.List list2 = item.f410516d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new so2.n0((r45.ri0) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.lqa);
        wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderEmojiSingleSummaryConvert$onBindViewHolder$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.convert.y2 y2Var = com.tencent.mm.plugin.finder.convert.y2.this;
                return new com.tencent.mm.plugin.finder.convert.u2(y2Var.f104984e, 56, str2, y2Var.f104985f);
            }
        }, arrayList2, true));
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 3));
        wxRecyclerView.addOnAttachStateChangeListener(new com.tencent.mm.plugin.finder.convert.w2(item, arrayList2, wxRecyclerView));
    }
}
