package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class g4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 f207237d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var) {
        this.f207237d = k4Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207256a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207257b.m75941xfb821914(0).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207256a;
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207257b.m75941xfb821914(0).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.j4 j4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.f207237d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(k4Var.f207278d ? k4Var.f207279e ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ajf : com.p314xaae8f345.mm.R.C30864xbddafb2a.aje : k4Var.f207279e ? com.p314xaae8f345.mm.R.C30864xbddafb2a.b8f : com.p314xaae8f345.mm.R.C30864xbddafb2a.b8e, viewGroup, false);
            j4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.j4(k4Var);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            j4Var.f207265a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.bzh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            j4Var.f207266b = (android.widget.ImageView) findViewById2;
            j4Var.f207267c = view.findViewById(com.p314xaae8f345.mm.R.id.g1v);
            view.setTag(j4Var);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderSearchHistoryLogic.HistoryItemHolder");
            j4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.j4) tag;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207256a;
        java.lang.String m75945x2fec8307 = ((r45.ku2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207257b.m75941xfb821914(0).get(i17)).m75945x2fec8307(1);
        android.widget.TextView textView = j4Var.f207265a;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentTV");
            throw null;
        }
        textView.setText(m75945x2fec8307);
        android.widget.ImageView imageView = j4Var.f207266b;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIV");
            throw null;
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f4(i17, k4Var));
        android.view.View view2 = j4Var.f207267c;
        if (view2 != null) {
            view2.setTag(com.p314xaae8f345.mm.R.id.e5o, m75945x2fec8307);
        }
        return view;
    }
}
