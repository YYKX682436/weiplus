package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public abstract class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w7 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 f185584f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f185585g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i0 f185586h;

    /* renamed from: i, reason: collision with root package name */
    public final int f185587i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.en2 f185588m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f185589n;

    /* renamed from: o, reason: collision with root package name */
    public final int f185590o;

    /* renamed from: p, reason: collision with root package name */
    public int f185591p;

    /* renamed from: q, reason: collision with root package name */
    public int f185592q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f185593r;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i0 i0Var, int i17, r45.en2 en2Var, java.lang.String str, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 2) != 0 ? false : z17;
        i0Var = (i19 & 4) != 0 ? null : i0Var;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        en2Var = (i19 & 16) != 0 ? null : en2Var;
        str = (i19 & 32) != 0 ? "" : str;
        i18 = (i19 & 64) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f185584f = contract;
        this.f185585g = z17;
        this.f185586h = i0Var;
        this.f185587i = i17;
        this.f185588m = en2Var;
        this.f185589n = str;
        this.f185590o = i18;
        this.f185593r = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m0.f185491d);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.util.Size t17 = t(holder);
        this.f185591p = t17.getWidth();
        this.f185592q = t17.getHeight();
        holder.f3639x46306858.getLayoutParams().width = this.f185591p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        if (c15324x3354d808 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c15324x3354d808.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f185591p;
                layoutParams.height = this.f185592q;
            } else {
                layoutParams = null;
            }
            c15324x3354d808.setLayoutParams(layoutParams);
            holder.f3639x46306858.requestLayout();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr u17 = u();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0();
            s0Var.f214521a = recyclerView;
            c15324x3354d808.b(u17, s0Var);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.g99);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setFocusable(false);
        }
        int dimensionPixelSize = holder.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        holder.f3639x46306858.setClipToOutline(true);
        holder.f3639x46306858.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l0(dimensionPixelSize));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        tc2.b bVar = this.f186384e;
        bVar.getClass();
        bVar.b(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        itemView.setTag(com.p314xaae8f345.mm.R.id.vmu, null);
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.tc7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0 h0Var = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0) tag : null;
        if (h0Var != null) {
            java.util.Iterator it = ((java.util.ArrayList) h0Var.f185066a).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r0) it.next()).a();
            }
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tc7, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w7
    public void o(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.o(holder, item, i17, i18, z17, list);
        q(holder, item, this.f185591p, this.f185592q);
        if (!z17) {
            r(holder, item, i17, i18);
        }
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.tc7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0 h0Var = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0) tag : null;
        if (h0Var != null) {
            java.util.Iterator it = ((java.util.ArrayList) h0Var.f185066a).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r0) it.next()).a();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0 h0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h0(this, holder, item);
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tc7, h0Var2);
        java.util.Iterator it6 = ((java.util.ArrayList) h0Var2.f185066a).iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r0) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s0 s0Var = r0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s0) r0Var : null;
            if (s0Var != null) {
                s0Var.b();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) holder.p(com.p314xaae8f345.mm.R.id.ufo);
        if (c15379x1d4ea971 != null) {
            c15379x1d4ea971.m62502x198fa353(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.j0(this, i17, item));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        if (c15324x3354d808 != null) {
            c15324x3354d808.m62224x198fa353(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.k0(this, i17, item));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s.f206870a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        int i19 = this.f185587i;
        r45.en2 en2Var = this.f185588m;
        r45.ey0 ey0Var = en2Var != null ? (r45.ey0) en2Var.m75936x14adae67(11) : null;
        r45.en2 en2Var2 = this.f185588m;
        ey2.u s17 = s();
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sVar.b(itemView, item, i17, i19, ey0Var, en2Var2, s17, context, this.f185590o, 160);
    }

    public abstract void q(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, int i18);

    public abstract void r(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, int i18);

    public final ey2.u s() {
        java.lang.String str = this.f185589n;
        if (str != null) {
            return (ey2.u) ey2.l0.f338955a.a(str, ey2.u.class, null);
        }
        return null;
    }

    public android.util.Size t(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int intValue = ((java.lang.Number) ((jz5.n) this.f185593r).mo141623x754a37bb()).intValue() - (holder.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj) * 2);
        return new android.util.Size(intValue, (int) ((intValue * 4.0f) / 3.0f));
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr u();
}
