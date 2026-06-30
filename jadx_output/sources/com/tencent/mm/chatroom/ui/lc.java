package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class lc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectDateUI f64312d;

    public lc(com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI) {
        this.f64312d = selectDateUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.chatroom.ui.SelectDateUI.f63958o;
        com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI = this.f64312d;
        selectDateUI.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor y27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y2(selectDateUI.f63960e);
        try {
            try {
                if (y27.moveToFirst()) {
                    while (!y27.isAfterLast()) {
                        if (-1 == selectDateUI.f63962g) {
                            selectDateUI.f63962g = y27.getLong(0);
                        }
                        kn.a aVar = new kn.a(y27.getLong(0));
                        aVar.f309375f = y27.getLong(1);
                        java.lang.String aVar2 = aVar.toString();
                        if (!selectDateUI.f63961f.containsKey(aVar2)) {
                            selectDateUI.f63961f.put(aVar2, aVar);
                        }
                        y27.moveToNext();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectDateUI", e17.toString());
            }
            y27.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectDateUI", "[prepareData] time:%s", (java.lang.System.currentTimeMillis() - currentTimeMillis) + "");
            selectDateUI.f63963h.post(new com.tencent.mm.chatroom.ui.kc(this));
        } catch (java.lang.Throwable th6) {
            y27.close();
            throw th6;
        }
    }
}
