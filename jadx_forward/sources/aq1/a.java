package aq1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {
    public a(aq1.b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.ia.J("ver" + o45.wf.f424562g);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1 Ui = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ui();
        Ui.getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
        Ri.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor m145256x1d3f4980 = Ri.m145256x1d3f4980("select appId from AppInfo where openId is NULL ", new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "get null cursor");
        } else {
            int count = m145256x1d3f4980.getCount();
            if (count <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppInfoStorage", "getNullOpenIdList fail, cursor count = " + count);
                m145256x1d3f4980.close();
            } else {
                if (m145256x1d3f4980.moveToFirst()) {
                    while (!m145256x1d3f4980.isAfterLast()) {
                        int columnIndex = m145256x1d3f4980.getColumnIndex("appId");
                        if (columnIndex >= 0) {
                            java.lang.String string = m145256x1d3f4980.getString(columnIndex);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                                arrayList.add(string);
                            }
                        }
                        m145256x1d3f4980.moveToNext();
                    }
                }
                m145256x1d3f4980.close();
            }
        }
        Ui.c(arrayList);
        if (com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallAuthHandle", "EventPool is null.");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1 c5591x5fe952d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1();
        c5591x5fe952d1.f135915g.f88564a = true;
        c5591x5fe952d1.e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5341x5ec25e4e().e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5342x2dd7c2ba c5342x2dd7c2ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5342x2dd7c2ba();
        c5342x2dd7c2ba.f135663g.f89224a = true;
        c5342x2dd7c2ba.e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5790x246d8c38().e();
        com.p314xaae8f345.mm.p957x53236a1b.b0.H(true);
        w11.w1.wi().h(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallAuthHandle", "summerbadcr triggerSync bgfg after manual auth");
    }

    /* renamed from: toString */
    public java.lang.String m8827x9616526c() {
        return super.toString() + "|onGYNetEnd2";
    }
}
