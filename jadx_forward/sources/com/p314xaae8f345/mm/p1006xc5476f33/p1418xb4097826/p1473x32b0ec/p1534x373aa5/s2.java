package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes5.dex */
public final class s2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 f198200d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7) {
        this.f198200d = c14302xfcce20b7;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f198200d.m57246x3ba4d779().size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.t2 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.t2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7 = this.f198200d;
            if (i17 >= c14302xfcce20b7.m57246x3ba4d779().size()) {
                return;
            }
            boolean z17 = false;
            int a17 = i17 == 0 ? com.p314xaae8f345.mm.ui.zk.a(holder.f3639x46306858.getContext(), 32) : 0;
            android.view.View view = holder.f3639x46306858;
            view.setPadding(a17, view.getPaddingTop(), holder.f3639x46306858.getPaddingRight(), holder.f3639x46306858.getPaddingBottom());
            java.lang.String str = c14302xfcce20b7.m57246x3ba4d779().get(i17).f447957b;
            android.widget.TextView textView = holder.f198222d;
            textView.setText(str);
            qs5.c selectedEffect = c14302xfcce20b7.getSelectedEffect();
            if (selectedEffect != null) {
                if (selectedEffect.f447956a == c14302xfcce20b7.m57246x3ba4d779().get(i17).f447956a) {
                    z17 = true;
                }
            }
            textView.setActivated(z17);
            holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r2(c14302xfcce20b7, i17));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ae_, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.t2(inflate);
    }
}
