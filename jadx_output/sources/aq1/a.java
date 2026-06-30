package aq1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {
    public a(aq1.b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.ia.J("ver" + o45.wf.f343029g);
        com.tencent.mm.pluginsdk.model.app.c1 Ui = com.tencent.mm.pluginsdk.model.app.u5.Ui();
        Ui.getClass();
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        Ri.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor rawQuery = Ri.rawQuery("select appId from AppInfo where openId is NULL ", new java.lang.String[0]);
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "get null cursor");
        } else {
            int count = rawQuery.getCount();
            if (count <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppInfoStorage", "getNullOpenIdList fail, cursor count = " + count);
                rawQuery.close();
            } else {
                if (rawQuery.moveToFirst()) {
                    while (!rawQuery.isAfterLast()) {
                        int columnIndex = rawQuery.getColumnIndex("appId");
                        if (columnIndex >= 0) {
                            java.lang.String string = rawQuery.getString(columnIndex);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                                arrayList.add(string);
                            }
                        }
                        rawQuery.moveToNext();
                    }
                }
                rawQuery.close();
            }
        }
        Ui.c(arrayList);
        if (com.tencent.mm.sdk.event.d.f192370d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BigBallAuthHandle", "EventPool is null.");
            return;
        }
        com.tencent.mm.autogen.events.GetCardCountEvent getCardCountEvent = new com.tencent.mm.autogen.events.GetCardCountEvent();
        getCardCountEvent.f54382g.f7031a = true;
        getCardCountEvent.e();
        new com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent().e();
        com.tencent.mm.autogen.events.ExDeviceGetBoundIotDevicesEvent exDeviceGetBoundIotDevicesEvent = new com.tencent.mm.autogen.events.ExDeviceGetBoundIotDevicesEvent();
        exDeviceGetBoundIotDevicesEvent.f54130g.f7691a = true;
        exDeviceGetBoundIotDevicesEvent.e();
        new com.tencent.mm.autogen.events.OnAuthSyncEvent().e();
        com.tencent.mm.modelsimple.b0.H(true);
        w11.w1.wi().h(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallAuthHandle", "summerbadcr triggerSync bgfg after manual auth");
    }

    public java.lang.String toString() {
        return super.toString() + "|onGYNetEnd2";
    }
}
