package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes9.dex */
public final class e1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u60.g f156071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 f156072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f156073f;

    public e1(u60.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var, android.widget.TextView textView) {
        this.f156071d = gVar;
        this.f156072e = l1Var;
        this.f156073f = textView;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public final boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectAddressDialog", "loc result: " + z17 + ", lng:" + f17 + ", lat:" + f18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var = this.f156072e;
        u60.g gVar = this.f156071d;
        if (z17) {
            ((i11.g) ((t60.e) gVar).wi()).b(new u60.h(f18, f17, true), l1Var.F);
        } else {
            this.f156073f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iei);
        }
        ((t60.e) gVar).getClass();
        i11.h.e().m(l1Var.E);
        return false;
    }
}
