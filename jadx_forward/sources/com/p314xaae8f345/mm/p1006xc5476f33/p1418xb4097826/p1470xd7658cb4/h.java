package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.v f192967e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f192968f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.v listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f192967e = listener;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e7m;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String format;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.e(this, item));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tfg);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tff);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.tfh);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) holder.p(com.p314xaae8f345.mm.R.id.tfj);
        c22789xd23e9a9b.o(true);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.tfi);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.gb1 gb1Var = item.f192960d;
        int m75939xb282bd08 = gb1Var.m75939xb282bd08(0);
        int i19 = m75939xb282bd08 / 3600;
        int i27 = (m75939xb282bd08 % 3600) / 60;
        int i28 = m75939xb282bd08 % 60;
        if (i19 > 0) {
            format = java.lang.String.format("%02d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28)}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        } else {
            format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        }
        sb6.append(format);
        sb6.append(' ');
        sb6.append(gb1Var.m75945x2fec8307(2));
        textView.setText(sb6.toString());
        textView2.setText(gb1Var.m75945x2fec8307(3));
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.n) this.f192967e;
        nVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = nVar.f192985a;
        int i29 = (pVar.f192989c.isEmpty() ^ true) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.i0(pVar.f192989c), item) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i29));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert", "refreshContent", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert", "refreshContent", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f192992f, item)) {
            imageView.setVisibility(0);
            c22789xd23e9a9b.setVisibility(8);
            c22789xd23e9a9b.n();
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79234x61654c7b);
            imageView.setColorFilter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            return;
        }
        imageView.setVisibility(8);
        c22789xd23e9a9b.setVisibility(0);
        if (c22789xd23e9a9b.getUseRfx()) {
            if (c22789xd23e9a9b.m82578x583e633c() == null) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f192968f;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                this.f192968f = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.f(c22789xd23e9a9b, null), 3, null);
            } else {
                c22789xd23e9a9b.g();
            }
        } else if (c22789xd23e9a9b.m82574xa7d55074() == null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f192968f;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            this.f192968f = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.g(c22789xd23e9a9b, null), 3, null);
        } else {
            c22789xd23e9a9b.g();
        }
        textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) holder.p(com.p314xaae8f345.mm.R.id.tfj);
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f192968f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f192968f = null;
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) holder.p(com.p314xaae8f345.mm.R.id.tfj);
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f192968f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f192968f = null;
    }
}
