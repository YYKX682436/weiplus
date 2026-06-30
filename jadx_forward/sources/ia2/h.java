package ia2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f371458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.ref.WeakReference weakReference) {
        super(2);
        this.f371458d = weakReference;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "doRequestPoiStream: onSucceed latitude=" + floatValue + ", longitude=" + floatValue2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) this.f371458d.get();
        if (activityC13656x51707ca3 != null) {
            yz5.p pVar = activityC13656x51707ca3.N;
            if (pVar != null) {
            }
            ia2.n0 n0Var = activityC13656x51707ca3.f183315v;
            boolean z18 = false;
            if (n0Var != null) {
                java.util.Map map = n0Var.f371495p;
                if (!map.isEmpty()) {
                    java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) ((java.util.Map.Entry) it.next()).getValue()).m56387xe6796cde().isEmpty()) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                    z18 = true;
                }
            }
            activityC13656x51707ca3.W = z18;
        }
        return jz5.f0.f384359a;
    }
}
