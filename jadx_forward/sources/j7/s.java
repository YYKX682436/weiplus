package j7;

/* loaded from: classes13.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f379557a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f379558b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f379559c;

    public boolean a(m7.b bVar) {
        boolean z17 = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.f379557a.remove(bVar);
        if (!((java.util.ArrayList) this.f379558b).remove(bVar) && !remove) {
            z17 = false;
        }
        if (z17) {
            ((m7.h) bVar).c();
        }
        return z17;
    }

    public void b() {
        boolean z17;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379557a)).iterator();
        while (it.hasNext()) {
            m7.h hVar = (m7.h) ((m7.b) it.next());
            if (!hVar.e()) {
                synchronized (hVar.f405970b) {
                    z17 = hVar.f405987s == m7.g.CLEARED;
                }
                if (!z17) {
                    hVar.c();
                    if (this.f379559c) {
                        ((java.util.ArrayList) this.f379558b).add(hVar);
                    } else {
                        hVar.a();
                    }
                }
            }
        }
    }

    public void c() {
        this.f379559c = false;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379557a)).iterator();
        while (it.hasNext()) {
            m7.h hVar = (m7.h) ((m7.b) it.next());
            if (!hVar.e() && !hVar.g()) {
                hVar.a();
            }
        }
        ((java.util.ArrayList) this.f379558b).clear();
    }

    /* renamed from: toString */
    public java.lang.String m140426x9616526c() {
        return super.toString() + "{numRequests=" + this.f379557a.size() + ", isPaused=" + this.f379559c + "}";
    }
}
