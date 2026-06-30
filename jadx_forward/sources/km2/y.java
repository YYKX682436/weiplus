package km2;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final km2.y f390759a = new km2.y();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f390760b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static km2.x f390761c;

    public final void a(km2.m mVar, boolean z17) {
        km2.m mVar2;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e2;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e3;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#reportCurrentLive liveId:");
        sb6.append((mVar == null || (c10828x8f239b6e4 = mVar.f390662d) == null) ? null : java.lang.Long.valueOf(c10828x8f239b6e4.f150070e));
        sb6.append(" name:");
        sb6.append((mVar == null || (c10828x8f239b6e3 = mVar.f390662d) == null) ? null : c10828x8f239b6e3.M);
        sb6.append(" isHistoryLive:");
        sb6.append(z17);
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveHistoryManager", sb6.toString());
        java.lang.Long valueOf = (mVar == null || (c10828x8f239b6e2 = mVar.f390662d) == null) ? null : java.lang.Long.valueOf(c10828x8f239b6e2.f150070e);
        km2.x xVar = f390761c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, (xVar == null || (mVar2 = xVar.f390758b) == null || (c10828x8f239b6e = mVar2.f390662d) == null) ? null : java.lang.Long.valueOf(c10828x8f239b6e.f150070e))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveHistoryManager", "reportCurrentLive is equal. return");
        }
        km2.x xVar2 = f390761c;
        java.util.LinkedHashMap linkedHashMap = f390760b;
        if (xVar2 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - xVar2.f390757a;
            boolean z18 = currentTimeMillis > ((long) (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85424u3).mo141623x754a37bb()).r()).intValue() * 1000));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#reportCurrentLive pre live liveId:");
            km2.m mVar3 = xVar2.f390758b;
            sb7.append(mVar3.f390662d.f150070e);
            sb7.append(" name:");
            sb7.append(mVar3.f390662d.M);
            sb7.append(" stayTime:");
            sb7.append(currentTimeMillis);
            sb7.append(" toHistory=");
            sb7.append(z18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveHistoryManager", sb7.toString());
            if (z18) {
                linkedHashMap.remove(java.lang.Long.valueOf(mVar3.f390662d.f150070e));
                linkedHashMap.put(java.lang.Long.valueOf(mVar3.f390662d.f150070e), mVar3);
                java.util.Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    int size = linkedHashMap.size();
                    int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85433v3).mo141623x754a37bb()).r()).intValue();
                    if (size <= intValue) {
                        break;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveHistoryManager", "#reportCurrentLive historiesList.size=" + size + ", max=" + intValue + ". remove " + ((km2.m) entry.getValue()).f390662d.M);
                    it.remove();
                }
            }
        }
        f390761c = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveHistoryManager", "#reportCurrentLive finally histories size: " + linkedHashMap.size());
        if (mVar == null) {
            return;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        km2.m mVar4 = new km2.m(mVar.f390662d);
        mVar4.f390668m = true;
        f390761c = new km2.x(currentTimeMillis2, mVar4);
    }
}
