package gf;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f352563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f352564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f352565c;

    public d(int i17, com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        this.f352563a = i17;
        this.f352564b = c3955x2d990bfe;
        this.f352565c = yVar;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25572xa06c2def
    /* renamed from: onWindowReady */
    public void mo95681x8df18c34(int i17) {
        java.lang.Object remove;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", this.f352563a + " onWindowReady id:" + i17);
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = this.f352564b;
        synchronized (c3955x2d990bfe.f129252o) {
            c3955x2d990bfe.f129251n.add(java.lang.Integer.valueOf(i17));
        }
        df.a1 a1Var = df.a1.f310954a;
        synchronized (a1Var) {
            java.lang.Long l17 = (java.lang.Long) df.a1.f310957d.get(java.lang.Integer.valueOf(i17));
            if (l17 == null) {
                l17 = 0L;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            df.x0 x0Var = (df.x0) df.a1.f310956c.get(java.lang.Long.valueOf(l17.longValue()));
            if (x0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SkylineManager", "notifyFlutterReady id:" + i17 + " fail");
            } else {
                if (x0Var.f311140e == i17) {
                    df.y0 y0Var = x0Var.f311137b;
                    y0Var.getClass();
                    y0Var.f311147b = java.lang.System.currentTimeMillis();
                } else {
                    df.y0 y0Var2 = (df.y0) x0Var.f311138c.get(java.lang.Integer.valueOf(i17));
                    if (y0Var2 != null) {
                        y0Var2.f311147b = java.lang.System.currentTimeMillis();
                    }
                }
                x0Var.f311142g.add(java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "Thread.currentThread().priority:" + java.lang.Thread.currentThread().getPriority() + " Process.priority:" + android.os.Process.getThreadPriority(android.os.Process.myTid()));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyFlutterReady id:");
                sb6.append(i17);
                sb6.append(" size:");
                java.util.HashMap hashMap = df.a1.f310958e;
                sb6.append(hashMap.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", sb6.toString());
                synchronized (a1Var) {
                    remove = hashMap.remove(java.lang.Integer.valueOf(i17));
                }
                yz5.l lVar = (yz5.l) remove;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            }
        }
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe2 = this.f352564b;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f352565c;
        c3955x2d990bfe2.d(yVar, false);
        c3955x2d990bfe2.e(new gf.q(yVar, i17));
    }
}
