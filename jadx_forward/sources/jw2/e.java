package jw2;

/* loaded from: classes9.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f383846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c f383847e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c c15207xe9913b6c, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f383847e = c15207xe9913b6c;
        this.f383846d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f383847e.f212325e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        android.view.View view = viewHolder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c c15207xe9913b6c = this.f383847e;
        textView.setText((java.lang.CharSequence) c15207xe9913b6c.f212325e.get(i17));
        float measureText = textView.getPaint().measureText((java.lang.String) c15207xe9913b6c.f212325e.get(i17));
        android.content.Context context = this.f383846d;
        float h17 = measureText + i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).setMarginStart(i17 == 0 ? (i65.a.B(context) - ((int) h17)) / 2 : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams2).setMarginEnd(i17 == mo1894x7e414b06() + (-1) ? (i65.a.B(context) - ((int) h17)) / 2 : 0);
        textView.setAlpha(i17 == c15207xe9913b6c.f212326f ? 1.0f : 0.5f);
        textView.setTag(java.lang.Integer.valueOf(i17));
        textView.setOnClickListener(new jw2.c(c15207xe9913b6c, i17));
        if (c15207xe9913b6c.f212331n) {
            if (i17 == c15207xe9913b6c.f212326f) {
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            } else {
                textView.setTypeface(android.graphics.Typeface.DEFAULT);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new jw2.d(android.view.LayoutInflater.from(this.f383846d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570616b82, parent, false));
    }
}
