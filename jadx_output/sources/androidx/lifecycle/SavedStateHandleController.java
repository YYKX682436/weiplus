package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class SavedStateHandleController implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f11589d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11590e = false;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.v0 f11591f;

    public SavedStateHandleController(java.lang.String str, androidx.lifecycle.v0 v0Var) {
        this.f11589d = str;
        this.f11591f = v0Var;
    }

    public static void a(final o4.b bVar, final androidx.lifecycle.o oVar) {
        androidx.lifecycle.n b17 = oVar.b();
        if (b17 == androidx.lifecycle.n.INITIALIZED || b17.a(androidx.lifecycle.n.STARTED)) {
            bVar.c(androidx.lifecycle.w0.class);
        } else {
            oVar.a(new androidx.lifecycle.v() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.v
                public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                    if (mVar == androidx.lifecycle.m.ON_START) {
                        androidx.lifecycle.o.this.c(this);
                        bVar.c(androidx.lifecycle.w0.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            this.f11590e = false;
            yVar.mo133getLifecycle().c(this);
        }
    }
}
