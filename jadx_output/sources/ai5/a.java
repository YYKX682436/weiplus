package ai5;

/* loaded from: classes12.dex */
public final class a extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        hu.f fVar;
        r45.gp0 gp0Var;
        int i17;
        mf3.f fVar2;
        mf3.k bVar;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.String stringExtra = intent.getStringExtra("message_talker");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        long longExtra = intent.getLongExtra("message_id", -1L);
        java.lang.String stringExtra2 = intent.getStringExtra("record_data_id");
        java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
        com.tencent.mars.xlog.Log.i("MediaGallery.RecordMsgDataProvider", "fetch, talker:" + stringExtra + " msgId:" + longExtra + " dataId:" + str2);
        java.lang.String stringExtra3 = intent.getStringExtra("params");
        if (stringExtra3 == null || stringExtra3.length() == 0) {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordMsgDataProvider", "RecordDetailUIParams, null");
            fVar = null;
        } else {
            hu.f fVar3 = new hu.f();
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordMsgDataProvider", "RecordDetailUIParams, embedded num: " + fVar3.j());
            fVar3.fromJsonStr(stringExtra3);
            fVar = fVar3;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 k17 = e0Var.k(stringExtra, longExtra);
        oi3.e qj6 = k17 != null ? ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(k17) : null;
        if (fVar != null) {
            fVar.f285004d = qj6;
        }
        ot0.q v17 = ot0.q.v(e0Var.n(stringExtra, longExtra).U1());
        r45.ul5 o17 = v17 != null ? bt3.g2.o(v17.f348663h0, str2) : null;
        if (o17 == null) {
            com.tencent.mars.xlog.Log.w("MediaGallery.RecordMsgDataProvider", "get record msg data error, empty");
            return false;
        }
        mf3.f fVar4 = new mf3.f();
        java.util.Iterator it = o17.f387465f.iterator();
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
                if (bVar.getType() != mf3.u.f326122d) {
                    fVar2.add(bVar);
                }
                if (kotlin.jvm.internal.o.b(gp0Var.T, str2)) {
                    i18 = fVar2.size() - 1;
                    str = bVar.getId();
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
