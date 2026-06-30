package ni;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni.i f418711d;

    public f(ni.i iVar) {
        this.f418711d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        synchronized (this.f418711d.f418716i) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = this.f418711d.f418716i.iterator();
            while (it.hasNext()) {
                oi.e eVar = (oi.e) it.next();
                if (eVar != null) {
                    if (this.f418711d.f418714g != null) {
                        oi.h hVar = oi.h.f427100e;
                        synchronized (hVar.f427102b) {
                            z17 = !((java.util.LinkedList) hVar.f427102b).contains(eVar);
                        }
                        if (!z17) {
                            this.f418711d.f418714g.a(eVar);
                            linkedList.add(eVar);
                        }
                    }
                    it.remove();
                }
            }
            ni.g gVar = this.f418711d.f418715h;
            if (gVar != null) {
                ((com.p314xaae8f345.mm.p849xbf8d97c1.a0) gVar).a(linkedList);
            }
        }
    }
}
