package bt3;

/* loaded from: classes9.dex */
public class l1 implements zs3.x {
    @Override // zs3.x
    public void B0(int i17, zs3.y yVar) {
        boolean z17;
        zs3.b0 b0Var;
        bt3.t2 cj6 = ((ys3.i) i95.n0.c(ys3.i.class)).cj();
        cj6.getClass();
        if (1 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care type %d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo is null");
            return;
        }
        if (2 != yVar.f68334x2262335f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo type is not upload , mediaid:%s, recordLocalId:%d, status:%d", yVar.f68324xaca5bdda, java.lang.Integer.valueOf(yVar.f68327x4ad5cdd0), java.lang.Integer.valueOf(yVar.f68328x10a0fed7));
            return;
        }
        int i18 = yVar.f68328x10a0fed7;
        if (i18 == 0 || 1 == i18 || -1 == i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care status");
            return;
        }
        zs3.u bj6 = ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj();
        int i19 = yVar.f68327x4ad5cdd0;
        bt3.t1 t1Var = (bt3.t1) bj6;
        t1Var.getClass();
        java.util.LinkedList<zs3.y> linkedList = new java.util.LinkedList();
        android.database.Cursor f17 = t1Var.f105943d.f("SELECT * FROM RecordCDNInfo WHERE recordLocalId = " + i19, null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                zs3.y yVar2 = new zs3.y();
                yVar2.mo9015xbf5d97fd(f17);
                linkedList.add(yVar2);
            }
            f17.close();
        }
        linkedList.size();
        for (zs3.y yVar3 : linkedList) {
            int i27 = yVar3.f68328x10a0fed7;
            if (i27 == 0 || 1 == i27 || -1 == i27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but %s not finish", yVar3.f68324xaca5bdda);
                z17 = false;
                break;
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "on cdn storage changed cdnInfoList.size:%d,", java.lang.Integer.valueOf(linkedList.size()));
        if (z17) {
            zs3.w fj6 = ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj();
            int i28 = yVar.f68327x4ad5cdd0;
            bt3.c2 c2Var = (bt3.c2) fj6;
            c2Var.getClass();
            android.database.Cursor f18 = c2Var.f105750d.f("SELECT * FROM RecordMessageInfo WHERE localId=" + i28 + "", null, 2);
            if (f18 == null || !f18.moveToFirst()) {
                b0Var = null;
            } else {
                b0Var = new zs3.b0();
                b0Var.mo9015xbf5d97fd(f18);
            }
            if (f18 != null) {
                f18.close();
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(yVar.f68327x4ad5cdd0);
            objArr[1] = java.lang.Boolean.valueOf(b0Var != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "finish get record info, id %d result %B", objArr);
            if (b0Var != null) {
                java.util.LinkedList linkedList2 = b0Var.f68494x84214f59.f452497f;
                for (zs3.y yVar4 : linkedList) {
                    java.lang.String str = yVar4.f68319xf604e54a;
                    if (yVar4.f68322xf00f0c87) {
                        cj6.e(yVar4, linkedList2, 1);
                    } else {
                        cj6.d(yVar4, linkedList2, 1);
                    }
                }
                cj6.b(b0Var, true);
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9951xb06685ab((zs3.y) it.next(), dm.i4.f66867x2a5c95c7);
            }
            cj6.f105945d = false;
            cj6.f(null, false);
        }
    }
}
