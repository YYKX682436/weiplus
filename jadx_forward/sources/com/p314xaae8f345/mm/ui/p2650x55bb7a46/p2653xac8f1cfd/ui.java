package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class ui implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xi f281609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f281611c;

    public ui(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xi xiVar, java.util.List list, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f281609a = xiVar;
        this.f281610b = list;
        this.f281611c = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xi xiVar = this.f281609a;
        xiVar.getClass();
        java.util.List<t35.a> itemList = this.f281610b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        java.lang.String x17 = xiVar.f280113d.x();
        if (x17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PasteComponent", "talkerName is null");
        } else {
            java.lang.String f17 = itemList.size() > 1 ? dh3.c.f314022a.f(x17, dh3.d.f314029e) : "";
            for (t35.a aVar : itemList) {
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(java.lang.String.valueOf(aVar.f496967c));
                ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
                if (k17 > ez.v0.f339310a.h()) {
                    xiVar.n0(aVar, x17, f17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasteComponent", "file size too large, send as file");
                } else {
                    int i17 = aVar.f496965a;
                    if (i17 != 1) {
                        android.net.Uri uri = aVar.f496967c;
                        if (i17 == 2) {
                            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) xiVar.f280113d.f542241c.a(sb5.w1.class))).o0(0, 0, 0, java.lang.String.valueOf(uri), f17);
                        } else if (i17 == 3) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.setData(uri);
                            intent.putExtra("MsgRevokeBatchId", f17);
                            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo) ((sb5.p2) xiVar.f280113d.f542241c.a(sb5.p2.class))).p0(intent, x17);
                        } else if (i17 != 4) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PasteComponent", "unknown type, type = " + java.lang.Integer.valueOf(i17));
                        } else {
                            xiVar.n0(aVar, x17, f17);
                        }
                    } else {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk) ((sb5.f2) xiVar.f280113d.f542241c.a(sb5.f2.class))).q0(aVar.f496966b, f17);
                    }
                }
            }
        }
        this.f281611c.B();
    }
}
