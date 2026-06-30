package wj2;

/* loaded from: classes10.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528209d;

    public g(wj2.w wVar) {
        this.f528209d = wVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        r45.xn1 xn1Var;
        g4Var.clear();
        wj2.w wVar = this.f528209d;
        if (wVar.B()) {
            ((db5.h4) g4Var.i(2, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxz), android.graphics.Color.parseColor("#B4B4B4"), com.p314xaae8f345.mm.R.raw.f80168x53dab22f, android.graphics.Color.parseColor("#B4B4B4"))).f309908s = true;
        } else if (wVar.f528252i.a0().F()) {
            g4Var.h(2, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwx), com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f80170x6b29fe4d : com.p314xaae8f345.mm.R.raw.f80171xfa8a011f, 0);
        } else {
            g4Var.g(2, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxy), com.p314xaae8f345.mm.R.raw.f80167x277b931f);
        }
        if (wVar.z()) {
            if (wVar.f528254n == 1) {
                km2.q m145849x949ba2a5 = wVar.m145849x949ba2a5();
                if (!((m145849x949ba2a5 == null || (xn1Var = m145849x949ba2a5.f390720r) == null || !km2.o.a(xn1Var)) ? false : true)) {
                    g4Var.g(7, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyc), com.p314xaae8f345.mm.R.raw.f80346xe0fea6fa);
                }
            } else {
                g4Var.g(6, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dya), com.p314xaae8f345.mm.R.raw.f80028xebd2cfb6);
            }
        }
        if (wVar.C()) {
            g4Var.g(3, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573148do1), com.p314xaae8f345.mm.R.raw.f80030x5363b36);
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R).mo141623x754a37bb()).r()).intValue() == 1) {
                g4Var.g(5, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dun), com.p314xaae8f345.mm.R.raw.f80297x3360acc9);
            }
        }
        g4Var.g(4, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573138dn1), com.p314xaae8f345.mm.R.raw.f79302x8f8681b4);
    }
}
