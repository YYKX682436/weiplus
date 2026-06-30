package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e f295388a;

    public b(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e eVar) {
        this.f295388a = eVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e eVar = this.f295388a;
        eVar.f295417b = false;
        java.util.ArrayList arrayList = (java.util.ArrayList) eVar.f295416a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                eVar.f295420e.mo523x53d8522f((r45.js5) fVar.f152151d);
                return null;
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d dVar = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d) arrayList.get(size);
            dVar.b((r45.js5) fVar.f152151d, fVar.f152149b, fVar.f152148a);
            arrayList.remove(dVar);
        }
    }
}
