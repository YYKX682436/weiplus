package bi5;

/* loaded from: classes12.dex */
public final class b extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final java.util.List V6(r45.bq0 bq0Var, java.lang.String str) {
        java.util.List V6;
        if ((bq0Var != null ? bq0Var.f452497f : null) != null) {
            java.util.Iterator it = bq0Var.f452497f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gp0Var.T, str)) {
                    return bq0Var.f452497f;
                }
                if (o72.x1.h0(gp0Var.I) && (V6 = V6(gp0Var.f456984y2, str)) != null) {
                    return V6;
                }
            }
        }
        return null;
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        long longExtra = intent.getLongExtra("key_detail_info_id", -1L);
        java.lang.String stringExtra = intent.getStringExtra("key_detail_data_id");
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "data id none");
        }
        boolean booleanExtra = intent.getBooleanExtra("fav_open_from_wnnote", false);
        java.lang.String stringExtra2 = intent.getStringExtra("fav_note_xml");
        new java.util.ArrayList();
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(longExtra);
        objArr[1] = java.lang.Boolean.valueOf(F != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "show one fav info, local id is %d, get from db ok ? %B", objArr);
        if (booleanExtra && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            F = o72.x1.B(stringExtra2, 18);
        }
        java.util.List<r45.gp0> V6 = V6(F.f67640x5ab01132, stringExtra);
        if (V6 == null) {
            V6 = F.f67640x5ab01132.f452497f;
        }
        if (V6 == null || V6.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "data list in layer null");
            return false;
        }
        mf3.f fVar = new mf3.f();
        java.lang.String str = "";
        int i17 = 0;
        for (r45.gp0 gp0Var : V6) {
            bi5.c cVar = new bi5.c(gp0Var);
            if (cVar.mo2109xfb85f7b0() != mf3.u.f407655d) {
                fVar.add(cVar);
            }
            if (stringExtra != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, gp0Var.T)) {
                i17 = fVar.size() - 1;
                str = cVar.mo2110x5db1b11();
            }
        }
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, false);
        listener.T3(i17);
        return true;
    }
}
