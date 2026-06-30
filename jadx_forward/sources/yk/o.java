package yk;

/* loaded from: classes12.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a() {
        int i17 = java.util.Calendar.getInstance().get(11);
        return 1 <= i17 && i17 <= 6 ? ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135237s).mo141623x754a37bb()).intValue() : ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135236r).mo141623x754a37bb()).intValue();
    }

    public final a5.y b(android.content.Context context) {
        if (!(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8()) && !((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135235q).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "Foreground task not executed");
            return a5.y.a();
        }
        if (com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135238t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "is working, not executed");
            return a5.y.a();
        }
        com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135238t = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pt0.p.f439751a1.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
        c6754x4f2fd58c.p("db_start_clean");
        c6754x4f2fd58c.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "Background task executed start");
        java.util.List list = com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135233o;
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("works");
            throw null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object newInstance = java.lang.Class.forName(((java.lang.Class) it.next()).getName()).getConstructor(android.content.Context.class).newInstance(context);
            yk.v vVar = newInstance instanceof yk.v ? (yk.v) newInstance : null;
            if (vVar != null) {
                vVar.a();
            }
        }
        com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135238t = false;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        pt0.p.f439751a1.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
        c6754x4f2fd58c2.p("db_end_clean");
        c6754x4f2fd58c2.f140818n = (int) (currentTimeMillis2 / 1000);
        c6754x4f2fd58c2.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "Background task executed done, timeCost: " + currentTimeMillis2);
        return a5.y.a();
    }
}
