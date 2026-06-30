package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public abstract class n0 extends com.tencent.mm.plugin.finder.convert.w7 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.k8 f104051f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104052g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.i0 f104053h;

    /* renamed from: i, reason: collision with root package name */
    public final int f104054i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.en2 f104055m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f104056n;

    /* renamed from: o, reason: collision with root package name */
    public final int f104057o;

    /* renamed from: p, reason: collision with root package name */
    public int f104058p;

    /* renamed from: q, reason: collision with root package name */
    public int f104059q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f104060r;

    public n0(com.tencent.mm.plugin.finder.feed.k8 contract, boolean z17, com.tencent.mm.plugin.finder.convert.i0 i0Var, int i17, r45.en2 en2Var, java.lang.String str, int i18, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 2) != 0 ? false : z17;
        i0Var = (i19 & 4) != 0 ? null : i0Var;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        en2Var = (i19 & 16) != 0 ? null : en2Var;
        str = (i19 & 32) != 0 ? "" : str;
        i18 = (i19 & 64) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f104051f = contract;
        this.f104052g = z17;
        this.f104053h = i0Var;
        this.f104054i = i17;
        this.f104055m = en2Var;
        this.f104056n = str;
        this.f104057o = i18;
        this.f104060r = jz5.h.b(com.tencent.mm.plugin.finder.convert.m0.f103958d);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.util.Size t17 = t(holder);
        this.f104058p = t17.getWidth();
        this.f104059q = t17.getHeight();
        holder.itemView.getLayoutParams().width = this.f104058p;
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        if (finderMediaLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = finderMediaLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f104058p;
                layoutParams.height = this.f104059q;
            } else {
                layoutParams = null;
            }
            finderMediaLayout.setLayoutParams(layoutParams);
            holder.itemView.requestLayout();
            com.tencent.mm.plugin.finder.view.qr u17 = u();
            com.tencent.mm.plugin.finder.view.s0 s0Var = new com.tencent.mm.plugin.finder.view.s0();
            s0Var.f132988a = recyclerView;
            finderMediaLayout.b(u17, s0Var);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.g99);
        if (weImageView != null) {
            weImageView.setFocusable(false);
        }
        int dimensionPixelSize = holder.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        holder.itemView.setClipToOutline(true);
        holder.itemView.setOutlineProvider(new com.tencent.mm.plugin.finder.convert.l0(dimensionPixelSize));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        tc2.b bVar = this.f104851e;
        bVar.getClass();
        bVar.b(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        itemView.setTag(com.tencent.mm.R.id.vmu, null);
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.tc7);
        com.tencent.mm.plugin.finder.convert.h0 h0Var = tag instanceof com.tencent.mm.plugin.finder.convert.h0 ? (com.tencent.mm.plugin.finder.convert.h0) tag : null;
        if (h0Var != null) {
            java.util.Iterator it = ((java.util.ArrayList) h0Var.f103533a).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.convert.r0) it.next()).a();
            }
            holder.itemView.setTag(com.tencent.mm.R.id.tc7, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.w7
    public void o(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.o(holder, item, i17, i18, z17, list);
        q(holder, item, this.f104058p, this.f104059q);
        if (!z17) {
            r(holder, item, i17, i18);
        }
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.tc7);
        com.tencent.mm.plugin.finder.convert.h0 h0Var = tag instanceof com.tencent.mm.plugin.finder.convert.h0 ? (com.tencent.mm.plugin.finder.convert.h0) tag : null;
        if (h0Var != null) {
            java.util.Iterator it = ((java.util.ArrayList) h0Var.f103533a).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.convert.r0) it.next()).a();
            }
        }
        com.tencent.mm.plugin.finder.convert.h0 h0Var2 = new com.tencent.mm.plugin.finder.convert.h0(this, holder, item);
        holder.itemView.setTag(com.tencent.mm.R.id.tc7, h0Var2);
        java.util.Iterator it6 = ((java.util.ArrayList) h0Var2.f103533a).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.finder.convert.r0 r0Var = (com.tencent.mm.plugin.finder.convert.r0) it6.next();
            com.tencent.mm.plugin.finder.convert.s0 s0Var = r0Var instanceof com.tencent.mm.plugin.finder.convert.s0 ? (com.tencent.mm.plugin.finder.convert.s0) r0Var : null;
            if (s0Var != null) {
                s0Var.b();
            }
        }
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) holder.p(com.tencent.mm.R.id.ufo);
        if (simpleTouchableLayout != null) {
            simpleTouchableLayout.setOnSingleClickListener(new com.tencent.mm.plugin.finder.convert.j0(this, i17, item));
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        if (finderMediaLayout != null) {
            finderMediaLayout.setOnSingleClickListener(new com.tencent.mm.plugin.finder.convert.k0(this, i17, item));
        }
        com.tencent.mm.plugin.finder.report.s sVar = com.tencent.mm.plugin.finder.report.s.f125337a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        int i19 = this.f104054i;
        r45.en2 en2Var = this.f104055m;
        r45.ey0 ey0Var = en2Var != null ? (r45.ey0) en2Var.getCustom(11) : null;
        r45.en2 en2Var2 = this.f104055m;
        ey2.u s17 = s();
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sVar.b(itemView, item, i17, i19, ey0Var, en2Var2, s17, context, this.f104057o, 160);
    }

    public abstract void q(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18);

    public abstract void r(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18);

    public final ey2.u s() {
        java.lang.String str = this.f104056n;
        if (str != null) {
            return (ey2.u) ey2.l0.f257422a.a(str, ey2.u.class, null);
        }
        return null;
    }

    public android.util.Size t(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        int intValue = ((java.lang.Number) ((jz5.n) this.f104060r).getValue()).intValue() - (holder.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj) * 2);
        return new android.util.Size(intValue, (int) ((intValue * 4.0f) / 3.0f));
    }

    public abstract com.tencent.mm.plugin.finder.view.qr u();
}
