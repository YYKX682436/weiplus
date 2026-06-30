package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class r4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f207372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 f207373e;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var) {
        this.f207373e = u4Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f207372d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f207372d;
        android.text.SpannableString spannableString = list != null ? (android.text.SpannableString) list.get(i17) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(spannableString);
        return spannableString;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.s4 s4Var;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var = this.f207373e;
            view = from.inflate(u4Var.f207417e ? u4Var.f207418f ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ajh : com.p314xaae8f345.mm.R.C30864xbddafb2a.ajg : u4Var.f207418f ? com.p314xaae8f345.mm.R.C30864xbddafb2a.b8j : com.p314xaae8f345.mm.R.C30864xbddafb2a.b8i, viewGroup, false);
            s4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.s4(u4Var);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            s4Var.f207383a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568709ns3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            view.setTag(s4Var);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderSearchSuggestionManager.SuggestionItemHolder");
            s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.s4) tag;
        }
        android.widget.TextView textView = s4Var.f207383a;
        android.text.SpannableString spannableString = null;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentTV");
            throw null;
        }
        java.util.List list = this.f207372d;
        if (list != null) {
            if (!(i17 < list.size())) {
                list = null;
            }
            if (list != null) {
                spannableString = (android.text.SpannableString) list.get(i17);
            }
        }
        textView.setText(spannableString);
        return view;
    }
}
