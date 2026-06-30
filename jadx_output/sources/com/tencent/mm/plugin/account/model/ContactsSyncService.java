package com.tencent.mm.plugin.account.model;

/* loaded from: classes8.dex */
public class ContactsSyncService extends android.app.Service implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public v61.j f73191d = null;

    public ContactsSyncService() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService construction");
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        android.os.IBinder iBinder;
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(this, "android.permission.READ_CONTACTS", true)) {
            if (this.f73191d == null) {
                this.f73191d = new v61.j(this, getApplicationContext());
            }
            iBinder = this.f73191d.getSyncAdapterBinder();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind no permission");
            iBinder = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind ret[%s]", iBinder);
        return iBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "contacts sync service destroy");
        super.onDestroy();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.getType());
        if (m1Var.getType() == 133) {
            gm0.j1.d().q(133, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "uploadcontact onSceneEnd: errType = " + i17 + ", errCode = " + i18);
            long longValue = ((java.lang.Long) gm0.j1.u().c().l(327728, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (i18 != 0 && currentTimeMillis - longValue < 86400000) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactsSyncService", "uploadmcontact list null, do not do getmfriend.");
                return;
            }
            gm0.j1.u().c().w(327728, java.lang.Long.valueOf(currentTimeMillis));
            gm0.j1.d().a(32, this);
            r61.t1 t1Var = (r61.t1) m1Var;
            gm0.j1.d().g(new r61.h1(t1Var.f392956e, t1Var.f392957f));
        }
        if (m1Var.getType() == 32) {
            gm0.j1.d().q(32, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncService", "getmfriend onSceneEnd: errType = " + i17 + ", errCode = " + i18);
        }
    }
}
