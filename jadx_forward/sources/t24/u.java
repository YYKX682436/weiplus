package t24;

/* loaded from: classes.dex */
public final class u extends a24.g {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f496871e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f496872f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f496873g;

    public u(yz5.a getSearchText, yz5.a getSearchQueryID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getSearchText, "getSearchText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getSearchQueryID, "getSearchQueryID");
        this.f496871e = getSearchText;
        this.f496872f = getSearchQueryID;
        this.f496873g = jz5.h.b(t24.t.f496870d);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        android.content.Intent intent5;
        c24.c item = (c24.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = (java.lang.String) this.f496871e.mo152xb9724478();
        java.lang.String str2 = (java.lang.String) this.f496872f.mo152xb9724478();
        android.content.Context context = holder.f374654e;
        boolean z18 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f3 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context : null;
        boolean z19 = true;
        if (abstractActivityC17509x7e1428f3 != null && (intent5 = abstractActivityC17509x7e1428f3.getIntent()) != null) {
            intent5.putExtra("cell_source_type", 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f32 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context : null;
        if (abstractActivityC17509x7e1428f32 != null && (intent4 = abstractActivityC17509x7e1428f32.getIntent()) != null) {
            intent4.putExtra("search_word", str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f33 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context : null;
        if (abstractActivityC17509x7e1428f33 != null && (intent3 = abstractActivityC17509x7e1428f33.getIntent()) != null) {
            intent3.putExtra("search_query_id", str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f34 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context : null;
        if (abstractActivityC17509x7e1428f34 != null && (intent2 = abstractActivityC17509x7e1428f34.getIntent()) != null) {
            intent2.putExtra("key_config_item", "SettingGroup_Main");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 abstractActivityC17509x7e1428f35 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3) context : null;
        if (abstractActivityC17509x7e1428f35 != null && (intent = abstractActivityC17509x7e1428f35.getIntent()) != null) {
            intent.putExtra("search_index", i17 + 1);
        }
        p(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.oct);
        if (p17 != null) {
            p17.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(android.R.id.summary);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.oct);
        wd0.y1 y1Var = (wd0.y1) ((jz5.n) this.f496873g).mo141623x754a37bb();
        java.lang.String str3 = str == null ? "" : str;
        wd0.x1 x1Var = item.f119604e;
        jz5.l Vi = ((vd0.l3) y1Var).Vi(x1Var, str3);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) Vi.f384366d;
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) Vi.f384367e;
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(android.R.id.title);
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        java.lang.CharSequence charSequence3 = charSequence2.length() > 0 ? charSequence2 : null;
        if (charSequence3 != null && charSequence3.length() != 0) {
            z19 = false;
        }
        if (z19) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (p18 != null) {
                u24.o.a(p18, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.aii), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.aii));
            }
        } else {
            if (textView != null) {
                textView.setVisibility(0);
                com.p314xaae8f345.mm.ui.kk.f(textView, 0);
                textView.setText(charSequence3);
            }
            if (p18 != null) {
                u24.o.a(p18, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561089yd), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561089yd));
            }
        }
        holder.f3639x46306858.setOnClickListener(new t24.s(holder, str, str2, i17, this, x1Var));
    }

    @Override // a24.g
    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseItem, "baseItem");
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570828c11);
    }

    @Override // a24.g
    public boolean o() {
        return false;
    }
}
