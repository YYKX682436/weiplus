package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes3.dex */
public class h3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f219604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15608xc657ed6d f219605e;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15608xc657ed6d viewOnClickListenerC15608xc657ed6d) {
        this.f219605e = viewOnClickListenerC15608xc657ed6d;
        this.f219604d = r0;
        java.lang.String[] strArr = {viewOnClickListenerC15608xc657ed6d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.idx), viewOnClickListenerC15608xc657ed6d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icd)};
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f219604d.length;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.i3 i3Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.i3) k3Var;
        i3Var.f219610d.setTag(java.lang.Integer.valueOf(i17));
        i3Var.f219610d.setText(this.f219604d[i17]);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15608xc657ed6d viewOnClickListenerC15608xc657ed6d = this.f219605e;
        return new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.i3(viewOnClickListenerC15608xc657ed6d, android.view.LayoutInflater.from(viewOnClickListenerC15608xc657ed6d.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bc9, (android.view.ViewGroup) null));
    }
}
