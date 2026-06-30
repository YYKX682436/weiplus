package lh;

/* loaded from: classes12.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb f400134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb) {
        super(0);
        this.f400134d = c4627xadd9bddb;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accStatsPower ");
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb = this.f400134d;
        sb6.append(c4627xadd9bddb.getAccName());
        sb6.append(": ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("accStatsMeta ");
        sb7.append(c4627xadd9bddb.getAccName());
        sb7.append(": count=");
        sb7.append(c4627xadd9bddb.getAccCount());
        sb7.append(",pidJiffies=");
        sb7.append(c4627xadd9bddb.getAccPidJiffies());
        sb7.append(",uidJiffies=");
        sb7.append(c4627xadd9bddb.getAccUidJiffies());
        sb7.append("");
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.Double>> entry : c4627xadd9bddb.m40791x3b9a4a45().entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Map<java.lang.String, java.lang.Double> value = entry.getValue();
            if (r26.i0.A(key, "power-", false, 2, null)) {
                java.lang.String substring = key.substring(r26.n0.L(key, "power-", 0, false, 6, null) + 6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                for (java.util.Map.Entry<java.lang.String, java.lang.Double> entry2 : value.entrySet()) {
                    java.lang.String key2 = entry2.getKey();
                    double doubleValue = entry2.getValue().doubleValue();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key2, "power")) {
                        sb6.append(i17 == 0 ? "" : ",");
                        sb6.append(substring);
                        sb6.append("Power=");
                        sb6.append(uh.i.p(doubleValue, 2));
                    } else {
                        sb7.append(",");
                        sb7.append(substring);
                        sb7.append(ri.i.a(key2));
                        sb7.append("=");
                        sb7.append((long) doubleValue);
                    }
                }
            }
            i17++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", sb7.toString());
        return jz5.f0.f384359a;
    }
}
