package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public final class y1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f243304d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1 f243305e;

    public y1(java.util.ArrayList compositionList, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1 iRingtoneChooseCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositionList, "compositionList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iRingtoneChooseCallback, "iRingtoneChooseCallback");
        this.f243304d = compositionList;
        this.f243305e = iRingtoneChooseCallback;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f243304d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a2 viewHolderLongClick = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolderLongClick, "viewHolderLongClick");
        java.lang.Object obj = this.f243304d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        ip.k kVar = (ip.k) obj;
        viewHolderLongClick.f242328g = kVar;
        viewHolderLongClick.f242326e.setText(kVar.f375105b);
        viewHolderLongClick.f242327f.setVisibility(viewHolderLongClick.f242325d.T5(kVar) ? 0 : 8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cln, viewGroup, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a2(inflate, this.f243305e);
    }
}
