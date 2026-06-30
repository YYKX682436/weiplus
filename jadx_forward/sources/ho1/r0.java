package ho1;

/* loaded from: classes5.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f364330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 f364331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f364333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364334h;

    public r0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var, ho1.a1 a1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var, java.lang.String str) {
        this.f364330d = gVar;
        this.f364331e = o0Var;
        this.f364332f = a1Var;
        this.f364333g = n0Var;
        this.f364334h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = this.f364330d.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        po1.g gVar = a17.f438829b;
        po1.g gVar2 = po1.g.f438843h;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        if (gVar != gVar2 && this.f364331e == o0Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364332f.f364155a, "Skip force notify. pkgId=" + this.f364330d.f297362d + " deviceType=" + a17.f438829b + ", taskType=" + this.f364331e);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f364333g;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED;
        if (n0Var == n0Var2 || n0Var == n0Var3 || n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PAUSED || n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_ERROR) {
            long j17 = this.f364330d.f297362d;
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a.f174155v;
            java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a.f174155v;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a activityC12848x9fd7b69a = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a) weakReference2.get() : null;
            boolean z17 = true;
            boolean z18 = (activityC12848x9fd7b69a == null || activityC12848x9fd7b69a.isFinishing() || activityC12848x9fd7b69a.isDestroyed()) ? false : true;
            java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
            boolean z19 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u;
            if (z19) {
                if (ho1.c.f364166b > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364332f.f364155a, "Skip force notify, because RoamUI on foreground. pkgId=" + j17);
                    return;
                }
            }
            if (activityC12848x9fd7b69a == null) {
                java.lang.String str2 = this.f364332f.f364155a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uiInstance==null, isProcessForeground=");
                sb6.append(z19);
                sb6.append(" activityRunning=");
                sb6.append(ho1.c.f364166b > 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            } else {
                java.lang.String str3 = this.f364332f.f364155a;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isFinish=");
                sb7.append(activityC12848x9fd7b69a.isFinishing());
                sb7.append(", isDestroyed=");
                sb7.append(activityC12848x9fd7b69a.isDestroyed());
                sb7.append(", uiIsShowing=");
                sb7.append(z18);
                sb7.append(", isProcessForeground=");
                sb7.append(z19);
                sb7.append(", activityRunning=");
                sb7.append(ho1.c.f364166b > 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7.toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364332f.f364155a, "[begin] do force notify, packageId=" + j17 + ", deviceId=" + a17.f438828a + ", state: " + this.f364333g + ", title=" + this.f364334h);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            int ordinal = this.f364331e.ordinal();
            java.lang.String string2 = ordinal != 1 ? ordinal != 3 ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var4 = this.f364333g;
            if (n0Var4 == n0Var2) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oeo, string2);
            } else if (n0Var4 == n0Var3) {
                string = this.f364331e == o0Var ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574380mw2) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mw9, string2);
            } else {
                if (a17.f438829b != gVar2) {
                    return;
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) ro1.v.f479547a.b();
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) it.next()).f438833f, a17.f438833f)) {
                            break;
                        }
                    }
                }
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364332f.f364155a, "[error] force notify, packageId=" + j17 + ", state=" + this.f364333g + ", deviceId=" + a17.f438828a + ", deviceOnline=" + z17);
                if (z17) {
                    return;
                } else {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mw8, string2);
                }
            }
            java.lang.String str4 = string;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            i13.q qVar = new i13.q(uuid, this.f364334h, str4, java.lang.System.currentTimeMillis(), new ho1.q0(this.f364332f, j17));
            k13.l1 l1Var = (k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi();
            l1Var.f(qVar);
            l1Var.c();
            ((ku5.t0) ku5.t0.f394148d).k(new ho1.p0(l1Var, qVar), 5000L);
        }
    }
}
