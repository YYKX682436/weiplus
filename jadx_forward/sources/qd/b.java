package qd;

/* loaded from: classes7.dex */
public class b implements o91.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f443055d = new java.util.LinkedList();

    public b() {
        a(new qd.c());
    }

    public final void a(o91.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.List list = this.f443055d;
        list.remove(aVar);
        list.add(aVar);
    }

    public android.graphics.Bitmap b(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        if (str != null && str.length() != 0) {
            for (o91.a aVar : this.f443055d) {
                if (aVar.a(str)) {
                    return aVar.c(str, rect, bVar);
                }
            }
        }
        return null;
    }

    public void c(java.lang.String str, java.util.Map map, o91.c cVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            if (cVar != null) {
                cVar.a(null);
            }
        } else {
            for (o91.a aVar : this.f443055d) {
                if (aVar.a(str)) {
                    aVar.b(str, map, cVar);
                    return;
                }
            }
        }
    }
}
