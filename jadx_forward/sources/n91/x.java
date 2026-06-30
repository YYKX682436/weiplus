package n91;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n91.e f417433d;

    public x(n91.e eVar) {
        this.f417433d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        android.view.View rootView;
        n91.h hVar = (n91.h) this.f417433d;
        n91.n nVar = hVar.f417410a;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) nVar.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(nVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = nVar.f417424d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = runtime.x0();
        android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.p314xaae8f345.mm.R.id.w_);
        hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
        if (eVar != null) {
            android.view.ViewGroup viewGroup2 = eVar.f363409f;
            if (viewGroup2 != null) {
                eVar.removeView(viewGroup2);
            }
            eVar.f363410g = null;
        }
        runtime.f156344t = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = hVar.f417411b.f417405b;
        n91.g gVar = o6Var.K2;
        if (gVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar = o6Var.E1;
            if (wdVar != null) {
                wdVar.a(gVar.f417408e);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar2 = o6Var.E1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td tdVar = wdVar2.f172493d;
                if (tdVar == null) {
                    if (tdVar != null && (mo273xed6858b4 = tdVar.mo273xed6858b4()) != null) {
                        mo273xed6858b4.c((p012xc85e97e9.p093xedfae76a.v) ((jz5.n) wdVar2.f172494e).mo141623x754a37bb());
                    }
                    wdVar2.f172493d = null;
                    o6Var.E1 = null;
                }
            }
            gVar.b();
        }
    }
}
