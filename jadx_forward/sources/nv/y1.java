package nv;

/* loaded from: classes12.dex */
public class y1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17 = kn1.f.f391134g;
        synchronized (kn1.a.class) {
            java.util.Iterator it = kn1.a.f391133a.iterator();
            while (it.hasNext()) {
                ((kn1.a) it.next()).b();
            }
            kn1.a.f391133a.clear();
        }
        kn1.f.f391135h = "key".getBytes();
        kn1.f.f391134g = 0;
        kn1.f.f391136i = null;
        return false;
    }
}
