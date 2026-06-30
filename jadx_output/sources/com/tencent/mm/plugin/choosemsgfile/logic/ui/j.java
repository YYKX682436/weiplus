package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.l f95540f;

    public j(com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar, java.lang.String str, boolean z17) {
        this.f95540f = lVar;
        this.f95538d = str;
        this.f95539e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q v17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar = this.f95540f;
        android.database.Cursor b17 = cj6.b1(lVar.f95527a, 0, -1);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileListUIController", "[loadData] cursor is null!");
            return;
        }
        java.util.List e17 = xv1.d.e(this.f95538d);
        long j17 = 0;
        while (b17.moveToNext()) {
            try {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(b17);
                java.lang.String j18 = f9Var.j();
                if (j18 != null && (v17 = ot0.q.v(j18)) != null) {
                    if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i))) {
                        wv1.k kVar = new wv1.k(lVar.f95544d, f9Var, lVar.f95527a);
                        java.util.ArrayList arrayList = (java.util.ArrayList) e17;
                        boolean z17 = true;
                        if (arrayList.size() != 0) {
                            java.util.Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z17 = false;
                                    break;
                                } else if (kVar.d().endsWith((java.lang.String) it.next())) {
                                    break;
                                }
                            }
                        }
                        if (z17) {
                            long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var.getCreateTime()));
                            if (j17 != a17) {
                                linkedList.add(new wv1.i(lVar.f95544d, f9Var.getCreateTime()));
                            }
                            linkedList.add(kVar);
                            j17 = a17;
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                b17.close();
                throw th6;
            }
        }
        b17.close();
        ((java.util.ArrayList) lVar.f95545e).addAll(linkedList);
        linkedList.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUIController", "[loadData] data:%s", java.lang.Integer.valueOf(((java.util.ArrayList) lVar.f95545e).size()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.logic.ui.i(this));
    }
}
