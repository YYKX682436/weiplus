package ai5;

/* loaded from: classes12.dex */
public final class a extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        hu.f fVar;
        r45.gp0 gp0Var;
        int i17;
        mf3.f fVar2;
        mf3.k bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.String stringExtra = intent.getStringExtra("message_talker");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        long longExtra = intent.getLongExtra("message_id", -1L);
        java.lang.String stringExtra2 = intent.getStringExtra("record_data_id");
        java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordMsgDataProvider", "fetch, talker:" + stringExtra + " msgId:" + longExtra + " dataId:" + str2);
        java.lang.String stringExtra3 = intent.getStringExtra("params");
        if (stringExtra3 == null || stringExtra3.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordMsgDataProvider", "RecordDetailUIParams, null");
            fVar = null;
        } else {
            hu.f fVar3 = new hu.f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordMsgDataProvider", "RecordDetailUIParams, embedded num: " + fVar3.j());
            fVar3.m126727xb579bd1f(stringExtra3);
            fVar = fVar3;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(stringExtra, longExtra);
        oi3.e qj6 = k17 != null ? ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(k17) : null;
        if (fVar != null) {
            fVar.f366537d = qj6;
        }
        ot0.q v17 = ot0.q.v(e0Var.n(stringExtra, longExtra).U1());
        r45.ul5 o17 = v17 != null ? bt3.g2.o(v17.f430196h0, str2) : null;
        if (o17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MediaGallery.RecordMsgDataProvider", "get record msg data error, empty");
            return false;
        }
        mf3.f fVar4 = new mf3.f();
        java.util.Iterator it = o17.f468998f.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            r45.gp0 gp0Var2 = (r45.gp0) it.next();
            int i19 = gp0Var2.I;
            if (i19 == 2) {
                gp0Var = gp0Var2;
                i17 = i18;
                fVar2 = fVar4;
                bVar = new ai5.b(gp0Var, longExtra, stringExtra, fVar);
            } else if (i19 != 4) {
                gp0Var = gp0Var2;
                i17 = i18;
                fVar2 = fVar4;
                bVar = null;
            } else {
                gp0Var = gp0Var2;
                i17 = i18;
                fVar2 = fVar4;
                bVar = new ai5.d(gp0Var2, longExtra, stringExtra, fVar);
            }
            if (bVar != null) {
                if (bVar.mo2109xfb85f7b0() != mf3.u.f407655d) {
                    fVar2.add(bVar);
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gp0Var.T, str2)) {
                    i18 = fVar2.size() - 1;
                    str = bVar.mo2110x5db1b11();
                    fVar4 = fVar2;
                }
            }
            fVar4 = fVar2;
            i18 = i17;
        }
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar4, false);
        listener.T3(i18);
        return true;
    }
}
