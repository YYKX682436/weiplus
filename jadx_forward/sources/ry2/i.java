package ry2;

/* loaded from: classes10.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f482928d;

    public i(java.util.List list) {
        this.f482928d = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        yz5.a aVar;
        java.util.Iterator it = this.f482928d.iterator();
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
        if (fVar2 == null || (aVar = fVar2.f482920d) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }
}
