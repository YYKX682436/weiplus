package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class p3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.t3 f274447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f274449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 f274450d;

    public p3(com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t3 t3Var, java.lang.String str, java.lang.Object obj) {
        this.f274450d = u3Var;
        this.f274447a = t3Var;
        this.f274448b = str;
        this.f274449c = obj;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset doInBackground tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t3 t3Var = this.f274447a;
        if (t3Var != null) {
            gm0.m1 m1Var = (gm0.m1) t3Var;
            m1Var.getClass();
            ku5.u.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new com.p314xaae8f345.mm.p642xad8b531f.p3());
            gm0.m mVar = m1Var.f354792a.f354745e;
            if (mVar != null) {
                synchronized (mVar.f354773c) {
                    mVar.y();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset doInBackground callback done tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f274450d.f274548a.quit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset init start old tid[%d]", java.lang.Long.valueOf(this.f274450d.f274548a.getId()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 u3Var = this.f274450d;
        java.lang.String str = this.f274448b;
        u3Var.f274549b = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "MMHandlerThread";
        }
        u3Var.f274550c = str;
        u3Var.f274548a = s75.a.a(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset init done new tid[%d]", java.lang.Long.valueOf(this.f274450d.f274548a.getId()));
        synchronized (this.f274449c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset notify tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            this.f274449c.notifyAll();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset onPostExecute");
        return true;
    }
}
