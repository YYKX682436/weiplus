package androidx.lifecycle;

/* loaded from: classes13.dex */
public final class w0 implements o4.c {
    public void a(o4.g gVar) {
        boolean z17;
        if (!(gVar instanceof androidx.lifecycle.m1)) {
            throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
        androidx.lifecycle.l1 viewModel = ((androidx.lifecycle.m1) gVar).getViewModel();
        o4.b savedStateRegistry = gVar.getSavedStateRegistry();
        viewModel.getClass();
        java.util.Iterator it = new java.util.HashSet(viewModel.f11636a.keySet()).iterator();
        while (it.hasNext()) {
            androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) viewModel.f11636a.get((java.lang.String) it.next());
            androidx.lifecycle.o mo133getLifecycle = gVar.mo133getLifecycle();
            androidx.lifecycle.SavedStateHandleController savedStateHandleController = (androidx.lifecycle.SavedStateHandleController) c1Var.getTag("androidx.lifecycle.savedstate.vm.tag");
            if (savedStateHandleController != null && !(z17 = savedStateHandleController.f11590e)) {
                if (z17) {
                    throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
                }
                savedStateHandleController.f11590e = true;
                mo133getLifecycle.a(savedStateHandleController);
                savedStateRegistry.b(savedStateHandleController.f11589d, savedStateHandleController.f11591f.f11659d);
                androidx.lifecycle.SavedStateHandleController.a(savedStateRegistry, mo133getLifecycle);
            }
        }
        if (new java.util.HashSet(viewModel.f11636a.keySet()).isEmpty()) {
            return;
        }
        savedStateRegistry.c(androidx.lifecycle.w0.class);
    }
}
