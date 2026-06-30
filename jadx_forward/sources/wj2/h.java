package wj2;

/* loaded from: classes10.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528216d;

    public h(wj2.w wVar) {
        this.f528216d = wVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str;
        g4Var.clear();
        wj2.w wVar = this.f528216d;
        lj2.v0 v0Var = wVar.f528252i;
        int E = v0Var.a0().E();
        g4Var.g(10001, E > 0 ? wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eni, java.lang.Integer.valueOf(E)) : wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573115eg1), com.p314xaae8f345.mm.R.raw.f79513xf5cc1f29);
        g4Var.g(10002, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnb), com.p314xaae8f345.mm.R.raw.f79518x59b47ad4);
        lj2.t0 a07 = v0Var.a0();
        km2.q m145849x949ba2a5 = wVar.m145849x949ba2a5();
        if (m145849x949ba2a5 == null || (str = m145849x949ba2a5.f390703a) == null) {
            str = "";
        }
        if (a07.j(str)) {
            g4Var.g(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjh), com.p314xaae8f345.mm.R.raw.f79592xe85c2ae9);
            int i17 = wVar.f528258r == 2 ? 3 : 4;
            lf2.a aVar = (lf2.a) v0Var.o(lf2.a.class);
            if (aVar != null) {
                aVar.Z6(1, i17);
            }
            g4Var.g(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, wVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573353mo5), com.p314xaae8f345.mm.R.raw.f79559xde67b1f8);
        }
        java.util.List list = g4Var.f309877d;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                v0Var.i0(((android.view.MenuItem) it.next()).getItemId());
            }
        }
    }
}
