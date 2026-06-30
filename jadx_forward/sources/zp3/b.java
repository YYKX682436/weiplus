package zp3;

/* loaded from: classes12.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) ph.a.a(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class);
        if (cVar == null) {
            return null;
        }
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc b17 = com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.a(c10754x630c9a2.f149937d, true), cVar.f476827a.f444868d.f444830p);
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85 c4639x13061b85 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85();
        c4639x13061b85.f134118d = b17.f134091d;
        c4639x13061b85.f134119e = b17.f134093f;
        c4639x13061b85.f134121g = ((java.lang.Integer) b17.f134096i.f477085a).intValue();
        c4639x13061b85.f134120f = ((java.lang.Long) b17.f134094g.f477085a).longValue();
        c4639x13061b85.f134122h = new java.util.ArrayList(b17.f134095h.f477093a.size());
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot : b17.f134095h.f477093a) {
            java.util.List list = c4639x13061b85.f134122h;
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies ipcThreadJiffies = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies();
            ipcThreadJiffies.f134123d = threadJiffiesSnapshot.f134098b;
            ipcThreadJiffies.f134124e = threadJiffiesSnapshot.f134099c;
            ipcThreadJiffies.f134125f = threadJiffiesSnapshot.f134101e;
            ipcThreadJiffies.f134126g = ((java.lang.Long) threadJiffiesSnapshot.f477085a).longValue();
            list.add(ipcThreadJiffies);
        }
        return c4639x13061b85;
    }
}
