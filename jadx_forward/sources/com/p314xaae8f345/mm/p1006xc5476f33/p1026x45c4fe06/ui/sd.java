package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class sd extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f171746d;

    public sd(java.util.List list) {
        this.f171746d = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f171746d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.rd holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.rd) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f171746d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) list.get(i17);
        if (l0Var == null) {
            return;
        }
        n11.a.b().g(l0Var.f157788b, holder.f171523d);
        holder.f171524e.setText(l0Var.f157789c);
        holder.f171525f.setText(l0Var.f157787a);
        android.widget.TextView textView = holder.f171526g;
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awl, java.lang.Long.valueOf(l0Var.f157790d)));
        android.widget.TextView textView2 = holder.f171527h;
        textView2.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a5w, java.lang.Long.valueOf(l0Var.f157791e)));
        android.widget.TextView textView3 = holder.f171528i;
        textView3.setText(textView3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572202wo, java.lang.Integer.valueOf(l0Var.f157792f)));
        android.widget.TextView textView4 = holder.f171529m;
        textView4.setText(textView4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awe, java.lang.Long.valueOf(l0Var.f157793g)));
        android.text.format.Time time = new android.text.format.Time();
        time.set(l0Var.f157794h * 1000);
        android.widget.TextView textView5 = holder.f171530n;
        textView5.setText(textView5.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572201vw, k35.s.a("yyyy.MM.dd", time).toString()));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569631dp, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.rd(inflate);
    }
}
