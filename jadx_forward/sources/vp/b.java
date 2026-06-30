package vp;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final zp.c f520265a = new zp.c();

    public void a() {
        zp.c cVar = this.f520265a;
        java.util.LinkedList linkedList = cVar.f556434a;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            zp.b bVar = (zp.b) it.next();
            if (bVar != null) {
                bVar.a();
            }
        }
        linkedList.clear();
        cVar.f556437d = 0;
        cVar.f556438e = 0;
        cVar.f556439f = 0;
    }
}
