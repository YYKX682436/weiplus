package wm3;

/* loaded from: classes9.dex */
public final class f implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wm3.j f528799a;

    public f(wm3.j jVar) {
        this.f528799a = jVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g0
    public void a(android.view.View view, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (view != null && c21560x1fce98fb != null) {
            wm3.j jVar = this.f528799a;
            jVar.f528812o.put(view, new java.lang.ref.WeakReference(c21560x1fce98fb));
            java.util.Set entrySet = jVar.f528812o.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            java.util.Iterator it = entrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.lang.ref.WeakReference) entry.getValue()).get();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21560x1fce98fb2 != null ? c21560x1fce98fb2.f279313q : null, c21560x1fce98fb.f279313q)) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), view)) {
                        jVar.f528812o.remove(entry.getKey());
                    }
                }
            }
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.util.Objects.toString(view);
        }
    }
}
