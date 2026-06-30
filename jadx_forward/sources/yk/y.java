package yk;

/* loaded from: classes12.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5089x55bc9d35 f544295d;

    public y(com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5089x55bc9d35 c5089x55bc9d35) {
        this.f544295d = c5089x55bc9d35;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<java.lang.Class> list;
        java.util.List<java.lang.String> list2;
        com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5089x55bc9d35 c5089x55bc9d35 = this.f544295d;
        c5089x55bc9d35.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "executeReport() start");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.util.Set set = qt0.b.f448025b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
            while (it.hasNext()) {
                qt0.e eVar = (qt0.e) it.next();
                arrayList.add(new qt0.f(eVar.f448035g, ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) eVar.f448034f).mo141623x754a37bb()).getBoolean(eVar.f448035g, false)));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "reportIndexTasks() task count: " + arrayList.size());
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                qt0.f fVar = (qt0.f) it6.next();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                c6754x4f2fd58c.p("msg_refactor_index_report");
                c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                c6754x4f2fd58c.r(fVar.f448037a);
                boolean z17 = fVar.f448038b;
                c6754x4f2fd58c.f140818n = z17 ? 1 : 0;
                c6754x4f2fd58c.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "reportIndexTasks() key: " + fVar.f448037a + ", isCreated: " + z17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgRefactorReportWorker", th6, "reportIndexTasks failed", new java.lang.Object[0]);
        }
        try {
            list = com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135233o;
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgRefactorReportWorker", th7, "reportDataCleanWorks failed", new java.lang.Object[0]);
        }
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("works");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "reportDataCleanWorks() work count: " + list.size());
        for (java.lang.Class cls : list) {
            java.lang.String simpleName = cls.getSimpleName();
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(cls.getName()).getConstructor(android.content.Context.class);
            java.lang.Object newInstance = constructor != null ? constructor.newInstance(c5089x55bc9d35.f135239o) : null;
            yk.v vVar = newInstance instanceof yk.v ? (yk.v) newInstance : null;
            if (vVar == null || (list2 = vVar.b()) == null) {
                list2 = kz5.p0.f395529d;
            }
            for (java.lang.String str : list2) {
                boolean a17 = pt0.p.f439751a1.a(str);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                c6754x4f2fd58c2.p("msg_refactor_dataclean_report");
                c6754x4f2fd58c2.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                c6754x4f2fd58c2.r(str);
                c6754x4f2fd58c2.f140818n = a17 ? 1 : 0;
                c6754x4f2fd58c2.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "reportDataCleanWorks() workName: " + simpleName + ", isCleaned: " + a17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRefactorReportWorker", "executeReport() done, timeCost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
