package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class nj extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f290960e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f290961f = jz5.h.b(com.p314xaae8f345.mm.ui.lj.f290616d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f290962g = jz5.h.b(com.p314xaae8f345.mm.ui.kj.f290582d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f290963h = jz5.h.b(com.p314xaae8f345.mm.ui.jj.f290543d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f290964i = jz5.h.b(com.p314xaae8f345.mm.ui.ij.f290463d);

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571114eq3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi;
        com.p314xaae8f345.mm.ui.hj item = (com.p314xaae8f345.mm.ui.hj) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbq);
        vg3.x3 x3Var = (vg3.x3) ((jz5.n) this.f290961f).mo141623x754a37bb();
        java.lang.String str = item.f290419d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = (x3Var == null || (Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).Bi()) == null) ? null : Bi.n(str, true);
        if (n17 != null) {
            tg3.v0 v0Var = (tg3.v0) ((jz5.n) this.f290962g).mo141623x754a37bb();
            java.lang.String wi6 = v0Var != null ? ((sg3.a) v0Var).wi(n17) : null;
            if (wi6 == null) {
                wi6 = str;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                wi6 = wi6 + '(' + (((rv1.e) ((jz5.n) this.f290963h).mo141623x754a37bb()) != null ? c01.v1.o(n17.d1()) : 0) + ')';
            }
            textView.setText(wi6);
        }
        kv.b0 b0Var = (kv.b0) ((jz5.n) this.f290964i).mo141623x754a37bb();
        if (b0Var != null) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            ((hn1.s) b0Var).Ai((android.widget.ImageView) p17, str);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.vfd);
        int i19 = item.f290420e;
        int i27 = item.f290421f;
        if (i27 == 1) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_0);
        } else if (i19 == 0) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_3);
        } else if (i19 == i27 - 1) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_1);
        } else {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_2);
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.d0v);
        if (i27 == 1 || i19 == i27 - 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/ui/TipUseDuplicateGroupItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/TipUseDuplicateGroupConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/ui/TipUseDuplicateGroupItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/TipUseDuplicateGroupConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.ui.mj(this, item));
    }
}
