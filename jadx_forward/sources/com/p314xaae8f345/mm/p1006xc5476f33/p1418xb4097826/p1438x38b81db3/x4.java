package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class x4 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569372i;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.r item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (item.f492099g == 1) {
            holder.w(com.p314xaae8f345.mm.R.id.jto, 8);
        } else {
            holder.w(com.p314xaae8f345.mm.R.id.jto, 0);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.jto);
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jib)).getPaint(), 0.8f);
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.M1.c();
            if (layoutParams.width < c17) {
                layoutParams.width = c17;
                p17.setLayoutParams(layoutParams);
            }
        }
        holder.p(com.p314xaae8f345.mm.R.id.jto).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w4(item, this, holder));
    }
}
