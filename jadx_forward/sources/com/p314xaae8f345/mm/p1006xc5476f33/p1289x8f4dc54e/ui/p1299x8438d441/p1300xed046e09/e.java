package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes11.dex */
public final class e implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175750a;

    public e(int i17) {
        this.f175750a = i17;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish, status: ");
        java.lang.Object obj = null;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f441064a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadMgr", sb6.toString());
        if (str != null) {
            int i17 = this.f175750a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175782a;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175787f) {
                z17 = false;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175784c.remove(str)) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175785d;
                    if (i18 > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175785d = i18 - 1;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175785d = 0;
                    }
                    java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175786e;
                    if ((!linkedList.isEmpty()) && (obj = linkedList.pollLast()) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175785d++;
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleDownloadComplete: ");
                    sb7.append(str);
                    sb7.append(", currentRequestCount: ");
                    sb7.append(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h.f175785d);
                    sb7.append(", queueSize: ");
                    sb7.append(linkedList.size());
                    sb7.append(", nextUrl: ");
                    java.lang.String str2 = (java.lang.String) obj;
                    sb7.append(str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadMgr", sb7.toString());
                    if (str2 != null) {
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.f(str2, i17));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadMgr", "handleDownloadComplete: url not pending (maybe cleared): ".concat(str));
                }
            }
            if (bVar != null && bVar.f441064a == 0) {
                z17 = true;
            }
            if (z17) {
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2110L, 2L, 1L, false);
                } else {
                    if (i17 != 2) {
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2110L, 3L, 1L, false);
                }
            }
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
