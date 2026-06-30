package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class i5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 f207259d;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 m5Var) {
        this.f207259d = m5Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207281b.m75941xfb821914(0).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a;
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207281b.m75941xfb821914(0).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l5 l5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 m5Var = this.f207259d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(m5Var.f207309a ? com.p314xaae8f345.mm.R.C30864xbddafb2a.b8f : com.p314xaae8f345.mm.R.C30864xbddafb2a.b8e, viewGroup, false);
            l5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l5(m5Var);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            l5Var.f207298a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.bzh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            l5Var.f207299b = (android.widget.ImageView) findViewById2;
            l5Var.f207300c = view.findViewById(com.p314xaae8f345.mm.R.id.g1v);
            view.setTag(l5Var);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.RingtoneSearchHistoryLogic.HistoryItemHolder");
            l5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l5) tag;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a;
        java.lang.String m75945x2fec8307 = ((r45.ku2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207281b.m75941xfb821914(0).get(i17)).m75945x2fec8307(1);
        android.widget.TextView textView = l5Var.f207298a;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentTV");
            throw null;
        }
        textView.setText(m75945x2fec8307);
        android.widget.ImageView imageView = l5Var.f207299b;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIV");
            throw null;
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.h5(m5Var, i17, m75945x2fec8307));
        android.view.View view2 = l5Var.f207300c;
        if (view2 != null) {
            view2.setTag(com.p314xaae8f345.mm.R.id.e5o, m75945x2fec8307);
        }
        return view;
    }
}
