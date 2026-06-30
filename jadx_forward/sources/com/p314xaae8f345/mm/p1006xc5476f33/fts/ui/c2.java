package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes3.dex */
public class c2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f219561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15601x7e0a9753 f219562e;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15601x7e0a9753 viewOnClickListenerC15601x7e0a9753) {
        this.f219562e = viewOnClickListenerC15601x7e0a9753;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(viewOnClickListenerC15601x7e0a9753.f219490p)) {
            this.f219561d = r2;
            java.lang.String[] strArr = {viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ich), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icd), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icg), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ice), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ick), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ici), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icj), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icc)};
        } else {
            this.f219561d = r2;
            java.lang.String[] strArr2 = {viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icd), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icg), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ice), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ick), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ici), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icj), viewOnClickListenerC15601x7e0a9753.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icc)};
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f219561d.length;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d2) k3Var;
        d2Var.f219572d.setTag(java.lang.Integer.valueOf(i17));
        d2Var.f219572d.setText(this.f219561d[i17]);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15601x7e0a9753 viewOnClickListenerC15601x7e0a9753 = this.f219562e;
        return new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d2(viewOnClickListenerC15601x7e0a9753, android.view.LayoutInflater.from(viewOnClickListenerC15601x7e0a9753.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bc9, (android.view.ViewGroup) null));
    }
}
