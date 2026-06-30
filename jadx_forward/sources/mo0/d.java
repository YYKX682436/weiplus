package mo0;

/* loaded from: classes3.dex */
public final class d implements mo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f411791a;

    public d(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1) {
        this.f411791a = c10849x610a91e1;
    }

    @Override // mo0.b
    public void a() {
        java.util.LinkedList m46521x9c2e4f44;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f411791a;
        m46521x9c2e4f44 = c10849x610a91e1.m46521x9c2e4f44();
        java.util.Iterator it = m46521x9c2e4f44.iterator();
        while (it.hasNext()) {
            mo0.b bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.a();
            }
        }
        yz5.p pVar = c10849x610a91e1.f150145n;
        if (pVar != null) {
        }
    }

    @Override // mo0.b
    public void b() {
        java.util.LinkedList m46521x9c2e4f44;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f411791a;
        m46521x9c2e4f44 = c10849x610a91e1.m46521x9c2e4f44();
        java.util.Iterator it = m46521x9c2e4f44.iterator();
        while (it.hasNext()) {
            mo0.b bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.b();
            }
        }
        yz5.p pVar = c10849x610a91e1.f150145n;
        if (pVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
        }
    }

    @Override // mo0.b
    public boolean c(float f17, float f18, int i17, int i18, long j17) {
        java.util.LinkedList m46521x9c2e4f44;
        mo0.b bVar;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f411791a;
        m46521x9c2e4f44 = c10849x610a91e1.m46521x9c2e4f44();
        java.util.Iterator it = m46521x9c2e4f44.iterator();
        while (it.hasNext() && ((bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get()) == null || !bVar.c(f17, f18, i17, i18, j17))) {
        }
        yz5.p pVar = c10849x610a91e1.f150145n;
        if (pVar == null) {
            return false;
        }
        return false;
    }

    @Override // mo0.b
    public void d() {
        yz5.a aVar = this.f411791a.f150147p;
        if (aVar != null) {
        }
    }

    @Override // mo0.b
    public boolean e(float f17, float f18) {
        java.util.LinkedList m46521x9c2e4f44;
        mo0.b bVar;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f411791a;
        m46521x9c2e4f44 = c10849x610a91e1.m46521x9c2e4f44();
        java.util.Iterator it = m46521x9c2e4f44.iterator();
        while (it.hasNext() && ((bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get()) == null || !bVar.e(f17, f18))) {
        }
        yz5.p pVar = c10849x610a91e1.f150145n;
        if (pVar == null) {
            return false;
        }
        return false;
    }
}
