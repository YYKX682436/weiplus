package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1014x633fb29;

/* renamed from: com.tencent.mm.plugin.account.model.ContactsSyncService */
/* loaded from: classes8.dex */
public class ServiceC11387x52d7dd27 extends android.app.Service implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public v61.j f154724d = null;

    public ServiceC11387x52d7dd27() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService construction");
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        android.os.IBinder iBinder;
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(this, "android.permission.READ_CONTACTS", true)) {
            if (this.f154724d == null) {
                this.f154724d = new v61.j(this, getApplicationContext());
            }
            iBinder = this.f154724d.getSyncAdapterBinder();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind no permission");
            iBinder = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind ret[%s]", iBinder);
        return iBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "contacts sync service destroy");
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.mo808xfb85f7b0());
        if (m1Var.mo808xfb85f7b0() == 133) {
            gm0.j1.d().q(133, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "uploadcontact onSceneEnd: errType = " + i17 + ", errCode = " + i18);
            long longValue = ((java.lang.Long) gm0.j1.u().c().l(327728, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (i18 != 0 && currentTimeMillis - longValue < 86400000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactsSyncService", "uploadmcontact list null, do not do getmfriend.");
                return;
            }
            gm0.j1.u().c().w(327728, java.lang.Long.valueOf(currentTimeMillis));
            gm0.j1.d().a(32, this);
            r61.t1 t1Var = (r61.t1) m1Var;
            gm0.j1.d().g(new r61.h1(t1Var.f474489e, t1Var.f474490f));
        }
        if (m1Var.mo808xfb85f7b0() == 32) {
            gm0.j1.d().q(32, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "getmfriend onSceneEnd: errType = " + i17 + ", errCode = " + i18);
        }
    }
}
