package n7;

/* loaded from: classes13.dex */
public abstract class k extends n7.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f416769d;

    /* renamed from: e, reason: collision with root package name */
    public final n7.j f416770e;

    public k(android.view.View view) {
        q7.n.b(view);
        this.f416769d = view;
        this.f416770e = new n7.j(view);
    }

    @Override // n7.h
    public m7.b a() {
        java.lang.Object tag = this.f416769d.getTag(com.p314xaae8f345.mm.R.id.f566707u04);
        if (tag == null) {
            return null;
        }
        if (tag instanceof m7.b) {
            return (m7.b) tag;
        }
        throw new java.lang.IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // n7.h
    public void d(m7.b bVar) {
        this.f416769d.setTag(com.p314xaae8f345.mm.R.id.f566707u04, bVar);
    }

    @Override // n7.h
    public void e(n7.g gVar) {
        ((java.util.ArrayList) this.f416770e.f416767b).remove(gVar);
    }

    @Override // n7.h
    public void f(n7.g gVar) {
        n7.j jVar = this.f416770e;
        int c17 = jVar.c();
        int b17 = jVar.b();
        boolean z17 = false;
        if (c17 > 0 || c17 == Integer.MIN_VALUE) {
            if (b17 > 0 || b17 == Integer.MIN_VALUE) {
                z17 = true;
            }
        }
        if (z17) {
            ((m7.h) gVar).l(c17, b17);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) jVar.f416767b;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (jVar.f416768c == null) {
            android.view.ViewTreeObserver viewTreeObserver = jVar.f416766a.getViewTreeObserver();
            n7.i iVar = new n7.i(jVar);
            jVar.f416768c = iVar;
            viewTreeObserver.addOnPreDrawListener(iVar);
        }
    }

    /* renamed from: toString */
    public java.lang.String m149165x9616526c() {
        return "Target for: " + this.f416769d;
    }
}
