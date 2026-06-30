package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.highlight.v f111434e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111435f;

    public h(com.tencent.mm.plugin.finder.highlight.v listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f111434e = listener;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e7m;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String format;
        com.tencent.mm.plugin.finder.highlight.d item = (com.tencent.mm.plugin.finder.highlight.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.highlight.e(this, item));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tfg);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tff);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.tfh);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) holder.p(com.tencent.mm.R.id.tfj);
        mMPAGView.o(true);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.tfi);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.gb1 gb1Var = item.f111427d;
        int integer = gb1Var.getInteger(0);
        int i19 = integer / 3600;
        int i27 = (integer % 3600) / 60;
        int i28 = integer % 60;
        if (i19 > 0) {
            format = java.lang.String.format("%02d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28)}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
        } else {
            format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
        }
        sb6.append(format);
        sb6.append(' ');
        sb6.append(gb1Var.getString(2));
        textView.setText(sb6.toString());
        textView2.setText(gb1Var.getString(3));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.plugin.finder.highlight.n nVar = (com.tencent.mm.plugin.finder.highlight.n) this.f111434e;
        nVar.getClass();
        com.tencent.mm.plugin.finder.highlight.p pVar = nVar.f111452a;
        int i29 = (pVar.f111456c.isEmpty() ^ true) && kotlin.jvm.internal.o.b(kz5.n0.i0(pVar.f111456c), item) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i29));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert", "refreshContent", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert", "refreshContent", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!kotlin.jvm.internal.o.b(pVar.f111459f, item)) {
            imageView.setVisibility(0);
            mMPAGView.setVisibility(8);
            mMPAGView.n();
            imageView.setImageResource(com.tencent.mm.R.raw.finder_live_highlight_play_medium);
            imageView.setColorFilter(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.abw));
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.abw));
            return;
        }
        imageView.setVisibility(8);
        mMPAGView.setVisibility(0);
        if (mMPAGView.getUseRfx()) {
            if (mMPAGView.getRfxComposition() == null) {
                kotlinx.coroutines.r2 r2Var = this.f111435f;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                this.f111435f = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.finder.highlight.f(mMPAGView, null), 3, null);
            } else {
                mMPAGView.g();
            }
        } else if (mMPAGView.getComposition() == null) {
            kotlinx.coroutines.r2 r2Var2 = this.f111435f;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            this.f111435f = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.finder.highlight.g(mMPAGView, null), 3, null);
        } else {
            mMPAGView.g();
        }
        textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.Brand_100));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) holder.p(com.tencent.mm.R.id.tfj);
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        kotlinx.coroutines.r2 r2Var = this.f111435f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f111435f = null;
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) holder.p(com.tencent.mm.R.id.tfj);
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        kotlinx.coroutines.r2 r2Var = this.f111435f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f111435f = null;
    }
}
