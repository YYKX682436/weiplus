package lh4;

/* loaded from: classes8.dex */
public final class m {
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            return false;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if ((i17 != 21 && i17 != 22 && i17 != 25) || ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() != 2) {
                    return false;
                }
            } else if (((uh4.c0) i95.n0.c(uh4.c0.class)).h4() != 2) {
                return false;
            }
        } else if (((uh4.c0) i95.n0.c(uh4.c0.class)).hd() != 2) {
            return false;
        }
        return true;
    }

    public final boolean b(int i17) {
        boolean z17;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_taskbar_disable_snapshot_show, "-1", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionViewModel", "block expt: " + Zi);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            java.util.Iterator it = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                if (i17 == java.lang.Integer.parseInt((java.lang.String) it.next())) {
                    z17 = true;
                    break;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionViewModel", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, th6);
        }
        z17 = false;
        if (!z17) {
            if (i17 == 2 || i17 == 3 || i17 == 4) {
                return true;
            }
        }
        return false;
    }

    public final java.util.ArrayList c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_taskbar_disable_other_type_show, "-1", true);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            java.util.Iterator it = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionViewModel", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, th6);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionViewModel", "block expt: " + Zi);
        return arrayList;
    }
}
