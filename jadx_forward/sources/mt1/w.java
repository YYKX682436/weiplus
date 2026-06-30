package mt1;

/* loaded from: classes12.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f412803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f412804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f412805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f412806g;

    public w(java.util.List list, java.util.List list2, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.util.List list3) {
        this.f412803d = list;
        this.f412804e = list2;
        this.f412805f = c26987xeef691ab;
        this.f412806g = list3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f412803d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!((java.lang.Boolean) this.f412804e.get(i17)).booleanValue()) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f412805f;
                if (c26987xeef691ab != null) {
                    try {
                        c26987xeef691ab.m108011xf4ed245c();
                    } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
                        return;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "Cannot update hash for " + ((java.lang.String) list.get(i17)) + ", e = " + e17);
                    }
                }
                java.lang.String u07 = ot1.h.u0((java.lang.String) list.get(i17));
                if (u07 != null) {
                    byte[] a17 = c01.td.a(u07);
                    mt1.b0.f412724a.n().f430382d.j("WxFileIndex3", "UPDATE WxFileIndex3 SET hash = ? WHERE rowid = ?", new java.lang.Object[]{a17, java.lang.Long.valueOf(((java.lang.Number) this.f412806g.get(i17)).longValue())}, c26987xeef691ab);
                }
            }
        }
    }
}
