package gt;

/* loaded from: classes7.dex */
public class j5 implements hm0.w {
    @Override // hm0.w
    /* renamed from: onNetworkChange */
    public void mo1990xde9f63df(int i17) {
        if (gm0.j1.a()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                java.util.List k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().k();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : k17) {
                    if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) obj).k()) {
                        arrayList.add(obj);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it.next();
                    java.util.Iterator it6 = ((java.util.ArrayList) kVar.g()).iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(kVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12609xdb34b5cf((java.lang.String) it6.next()), null, 2, null);
                    }
                }
            }
            q81.z.i().j();
        }
    }
}
