package df;

/* loaded from: classes7.dex */
public final class v0 extends ef.b {
    @Override // ef.b
    public android.view.View a() {
        java.lang.ref.WeakReference weakReference = df.w0.f311108g;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // ef.b
    public android.content.Context b() {
        java.util.Iterator it = ((java.util.ArrayList) df.w0.f311112k).iterator();
        while (it.hasNext()) {
            df.s0 s0Var = (df.s0) it.next();
            if (s0Var.f311080a) {
                ef.b bVar = s0Var.f311081b;
                if (bVar != null) {
                    return bVar.b();
                }
                return null;
            }
        }
        return null;
    }
}
