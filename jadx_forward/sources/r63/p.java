package r63;

/* loaded from: classes14.dex */
public final class p extends gp1.e0 implements gp1.y {
    @Override // gp1.e0, gp1.x
    public void F0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoReplaced replacedBallInfo ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        sb6.append(" targetBallInfo ");
        sb6.append(c12886x91aa2b6d2 != null ? c12886x91aa2b6d2.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoRemoved ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        if (c12886x91aa2b6d != null) {
            r63.l lVar = r63.l.f474555a;
            java.lang.String key = c12886x91aa2b6d.f174582g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474568n, key)) {
                r63.l.f474568n = "";
            }
            r63.l.f474567m.remove(key);
        }
    }

    @Override // gp1.e0, gp1.x
    public void N0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallDeleteButtonClick ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.e0, gp1.x
    public void S(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, int i18, int i19, int i27) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallCollapseStateChanged ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.e0, gp1.x
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoExposed ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.e0, gp1.x
    public void V0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfoList, "ballInfoList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", "onFloatBallInfoChanged");
    }

    @Override // gp1.e0, gp1.x
    public void X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoAdded ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        if (c12886x91aa2b6d != null) {
            r63.l lVar = r63.l.f474555a;
            java.lang.String key = c12886x91aa2b6d.f174582g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
            java.util.Map map = r63.l.f474567m;
            if (map.containsKey(key)) {
                return;
            }
            map.put(key, java.lang.Integer.valueOf(r63.l.f474560f));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "key " + key + ", enterType " + r63.l.f474560f);
        }
    }

    @Override // gp1.e0, gp1.x
    public boolean Y0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddMessageFloatBall ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        return false;
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoClicked ");
        sb6.append(c12886x91aa2b6d != null ? c12886x91aa2b6d.f174596x : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        if (c12886x91aa2b6d != null) {
            r63.l lVar = r63.l.f474555a;
            java.lang.String key = c12886x91aa2b6d.f174582g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
            r63.l.f474568n = key;
            o63.e[] eVarArr = o63.e.f424729d;
            java.lang.String key2 = c12886x91aa2b6d.f174582g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key2, "key");
            if (!r63.n.f474575a.p() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474563i, java.lang.Boolean.FALSE)) {
                r63.l.c(lVar, null, 7, (java.lang.Integer) ((java.util.LinkedHashMap) r63.l.f474567m).get(key2), 0, 8, null);
            }
        }
    }
}
