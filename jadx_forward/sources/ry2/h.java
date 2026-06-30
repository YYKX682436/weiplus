package ry2;

/* loaded from: classes10.dex */
public final class h implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f482926a;

    public h(java.util.List list) {
        this.f482926a = list;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        java.lang.Object obj;
        yz5.q qVar;
        java.util.Iterator it = this.f482926a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ry2.f fVar = (ry2.f) obj;
            boolean z17 = false;
            if (menuItem != null && fVar.f482917a == menuItem.getItemId()) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        ry2.f fVar2 = (ry2.f) obj;
        if (fVar2 == null || (qVar = fVar2.f482921e) == null) {
            return;
        }
        qVar.mo147xb9724478(view, java.lang.Integer.valueOf(i17), menuItem);
    }
}
