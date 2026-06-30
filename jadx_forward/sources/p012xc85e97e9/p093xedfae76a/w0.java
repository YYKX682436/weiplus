package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public final class w0 implements o4.c {
    public void a(o4.g gVar) {
        boolean z17;
        if (!(gVar instanceof p012xc85e97e9.p093xedfae76a.m1)) {
            throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
        p012xc85e97e9.p093xedfae76a.l1 viewModel = ((p012xc85e97e9.p093xedfae76a.m1) gVar).getViewModel();
        o4.b mo2511xdf516e9d = gVar.mo2511xdf516e9d();
        viewModel.getClass();
        java.util.Iterator it = new java.util.HashSet(viewModel.f93169a.keySet()).iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p093xedfae76a.c1 c1Var = (p012xc85e97e9.p093xedfae76a.c1) viewModel.f93169a.get((java.lang.String) it.next());
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = gVar.mo273xed6858b4();
            p012xc85e97e9.p093xedfae76a.C1122xd7858a6e c1122xd7858a6e = (p012xc85e97e9.p093xedfae76a.C1122xd7858a6e) c1Var.m7791xb5887064("androidx.lifecycle.savedstate.vm.tag");
            if (c1122xd7858a6e != null && !(z17 = c1122xd7858a6e.f93123e)) {
                if (z17) {
                    throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
                }
                c1122xd7858a6e.f93123e = true;
                mo273xed6858b4.a(c1122xd7858a6e);
                mo2511xdf516e9d.b(c1122xd7858a6e.f93122d, c1122xd7858a6e.f93124f.f93192d);
                p012xc85e97e9.p093xedfae76a.C1122xd7858a6e.a(mo2511xdf516e9d, mo273xed6858b4);
            }
        }
        if (new java.util.HashSet(viewModel.f93169a.keySet()).isEmpty()) {
            return;
        }
        mo2511xdf516e9d.c(p012xc85e97e9.p093xedfae76a.w0.class);
    }
}
