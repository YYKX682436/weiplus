package ni;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f418708a;

    /* renamed from: b, reason: collision with root package name */
    public final ni.c f418709b;

    public d(ni.e eVar, int i17, ni.c cVar) {
        this.f418708a = i17;
        this.f418709b = cVar;
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ni.c cVar = this.f418709b;
        if (cVar == null) {
            return arrayList;
        }
        oi.i iVar = cVar.f418707a;
        iVar.getClass();
        oi.h hVar = oi.h.f427100e;
        synchronized (hVar.f427101a) {
            ((java.util.LinkedList) hVar.f427101a).remove(iVar);
        }
        return cVar.f418707a.f427105a;
    }

    public void b() {
        ni.c cVar = this.f418709b;
        if (cVar != null) {
            oi.i iVar = cVar.f418707a;
            synchronized (iVar.f427105a) {
                ((java.util.LinkedList) iVar.f427105a).clear();
            }
            oi.i iVar2 = cVar.f418707a;
            iVar2.getClass();
            oi.h hVar = oi.h.f427100e;
            synchronized (hVar.f427101a) {
                if (!((java.util.LinkedList) hVar.f427101a).contains(iVar2)) {
                    ((java.util.LinkedList) hVar.f427101a).add(iVar2);
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m149610x9616526c() {
        return "ActivityLeakMonitor{mActivityHashCode=" + this.f418708a + ", mMonitor=" + this.f418709b + '}';
    }
}
