package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class m2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f103963e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wechat.aff.emoticon.s f103964f;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Parcelable f103966h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f103967i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f103965g = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f103968m = new java.util.LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f103969n = new java.util.LinkedHashSet();

    public m2(int i17, com.tencent.wechat.aff.emoticon.s sVar) {
        this.f103963e = i17;
        this.f103964f = sVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488796dc1;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        com.tencent.wechat.aff.emoticon.s sVar;
        java.util.ArrayList arrayList;
        so2.l0 item = (so2.l0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.util.ArrayList arrayList2 = this.f103965g;
        if (arrayList2.isEmpty() && (sVar = this.f103964f) != null && (arrayList = sVar.f216667e) != null) {
            arrayList2.addAll(arrayList);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.lqa);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(holder.f293121e, 0, false));
        if (this.f103966h != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(this.f103966h);
        }
        recyclerView.i(new com.tencent.mm.plugin.finder.convert.h2(this));
        recyclerView.setAdapter(new com.tencent.mm.plugin.finder.convert.l2(this));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.lqa)).getLayoutManager();
        this.f103966h = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
    }

    public final void n() {
        java.util.ArrayList arrayList;
        java.util.Set set;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        int w17;
        int y17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f103967i;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderEmojiDesignerIPSetListConvert", "report 31502 fail, layoutManager is null");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && (w17 = (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w()) <= (y17 = linearLayoutManager.y())) {
            while (true) {
                arrayList2.add(java.lang.Integer.valueOf(w17));
                if (w17 == y17) {
                    break;
                } else {
                    w17++;
                }
            }
        }
        java.util.Set set2 = this.f103969n;
        set2.clear();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        int i17 = 0;
        while (true) {
            arrayList = this.f103965g;
            set = this.f103968m;
            if (i17 >= size) {
                break;
            }
            int intValue = ((java.lang.Number) arrayList2.get(i17)).intValue();
            if (intValue < arrayList.size() && intValue >= 0) {
                set2.add(java.lang.Integer.valueOf(intValue));
                if (!set.contains(java.lang.Integer.valueOf(intValue))) {
                    arrayList3.add(java.lang.Integer.valueOf(intValue));
                }
            }
            i17++;
        }
        set.clear();
        set.addAll(set2);
        if (arrayList3.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = arrayList.get(((java.lang.Number) it.next()).intValue());
            kotlin.jvm.internal.o.f(obj, "get(...)");
            o((r45.vd0) obj, -1, "view_exp");
        }
    }

    public final void o(r45.vd0 ipSet, int i17, java.lang.String eventId) {
        kotlin.jvm.internal.o.g(ipSet, "ipSet");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "finder_homepage_emoji_image");
        hashMap.put("designer_uin", java.lang.Long.valueOf(this.f103963e & io.flutter.embedding.android.KeyboardMap.kValueMask));
        java.lang.String str = ipSet.f388134d;
        kotlin.jvm.internal.o.f(str, "getKey(...)");
        hashMap.put("emoji_image_id", str);
        if (kotlin.jvm.internal.o.b(eventId, "view_clk")) {
            hashMap.put("clk_index", java.lang.Integer.valueOf(i17));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(eventId, this, hashMap, 10, false);
    }
}
