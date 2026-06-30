package aa3;

/* loaded from: classes15.dex */
public final class g0 extends aa3.d {
    @Override // aa3.d
    public android.content.Context a() {
        java.util.Iterator it = ((java.util.ArrayList) aa3.h0.f84066h).iterator();
        while (it.hasNext()) {
            q80.w wVar = (q80.w) it.next();
            if (((aa3.f0) wVar).f84053a) {
                aa3.d dVar = ((aa3.f0) wVar).f84054b;
                if (dVar != null) {
                    return dVar.a();
                }
                return null;
            }
        }
        return null;
    }

    @Override // aa3.d
    public android.view.View b() {
        java.lang.ref.WeakReference weakReference = aa3.h0.f84062d;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }
}
