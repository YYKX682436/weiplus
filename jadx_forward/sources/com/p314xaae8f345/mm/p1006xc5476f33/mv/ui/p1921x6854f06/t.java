package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes5.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.s f232495d;

    /* renamed from: e, reason: collision with root package name */
    public final int f232496e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f232497f;

    /* renamed from: g, reason: collision with root package name */
    public int f232498g;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.s itemClickListener, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemClickListener, "itemClickListener");
        this.f232495d = itemClickListener;
        this.f232496e = i17;
        this.f232497f = new java.util.ArrayList();
        this.f232498g = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f232497f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.r holder = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.r) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f232497f;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(i17);
        android.widget.TextView textView = holder.f232494d;
        textView.setText(charSequence);
        textView.setContentDescription((java.lang.CharSequence) arrayList.get(i17));
        if (i17 == this.f232498g && this.f232496e == 1) {
            textView.setTextColor(-16777216);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (this.f232496e == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cmr, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.r(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cmq, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.r(this, inflate2);
    }
}
