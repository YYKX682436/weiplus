package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class bp extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ah7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.km item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.km) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.s(com.p314xaae8f345.mm.R.id.gzb, item.f188756f);
        android.view.ViewGroup.LayoutParams layoutParams = holder.p(com.p314xaae8f345.mm.R.id.gzc).getLayoutParams();
        int m75939xb282bd08 = item.f188754d.m75939xb282bd08(2);
        android.content.Context context = holder.f374654e;
        if (m75939xb282bd08 == 0) {
            layoutParams.height = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561960xm);
        } else {
            layoutParams.height = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.gzb);
        if (textView == null) {
            return;
        }
        textView.setText("");
    }
}
