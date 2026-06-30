package rl2;

/* loaded from: classes3.dex */
public final class w extends be2.j {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f478751e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f478752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l75.k0 db6) {
        super(db6, ce2.n.f122319p, "FinderLiveVideoDefinitionInfo", dm.t4.f321616g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = ce2.n.f122319p;
        this.f478751e = db6;
        this.f478752f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(zl2.q4.f555466a.E() ? 5 : 100);
    }

    @Override // be2.j
    public void D0(long j17, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478752f;
        r2Var.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        zl2.r4.f555483a.M2("FinderLiveVideoDefinitionStorage", "updateDefinition liveId:" + j17 + ",level:" + i17 + ",cache size:" + r2Var.m77804x35e001());
    }

    @Override // be2.j
    public void y0() {
        ce2.n nVar;
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478752f;
        java.util.Set<java.util.Map.Entry> p17 = r2Var.p();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "entrySet(...)");
        for (java.util.Map.Entry entry : p17) {
            java.lang.Object key = entry.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
            long longValue = ((java.lang.Number) key).longValue();
            java.lang.Object value = entry.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            int intValue = ((java.lang.Number) value).intValue();
            java.lang.String concat = "SELECT * FROM FinderLiveVideoDefinitionInfo where FinderLiveVideoDefinitionInfo.liveId=".concat(pm0.v.u(longValue));
            l75.k0 k0Var = this.f478751e;
            android.database.Cursor f17 = k0Var.f(concat, null, 2);
            boolean z19 = true;
            if (f17.moveToNext()) {
                nVar = new ce2.n();
                nVar.mo9015xbf5d97fd(f17);
                z18 = nVar.f68447x7cb069b8 != intValue;
                nVar.f68447x7cb069b8 = intValue;
                z17 = false;
            } else {
                ce2.n nVar2 = new ce2.n();
                nVar2.f68448x41d5e0c = longValue;
                nVar2.f68447x7cb069b8 = intValue;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionStorage", "create new video definition info:" + nVar2);
                nVar = nVar2;
                z17 = true;
                z18 = false;
            }
            f17.close();
            if (z18) {
                z19 = mo11260x413cb2b4(nVar);
            } else if (!z17 || k0Var.l("FinderLiveVideoDefinitionInfo", "liveId", nVar.mo9763xeb27878e()) <= 0) {
                z19 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionStorage", "saveCache " + nVar.f68448x41d5e0c + ',' + nVar.f68447x7cb069b8 + ",needReplay:" + z18 + ", needInsert:" + z17 + ", result:" + z19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionStorage", "saveDefinition finish size:" + r2Var.m77804x35e001() + '!');
    }

    @Override // be2.j
    public int z0(long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478752f;
        java.lang.Integer num = (java.lang.Integer) r2Var.get(java.lang.Long.valueOf(j17));
        int intValue = num == null ? -1 : num.intValue();
        zl2.r4.f555483a.M2("FinderLiveVideoDefinitionStorage", "selectDefinition liveId:" + j17 + ",level:" + intValue + ",cache size:" + r2Var.m77804x35e001());
        return intValue;
    }
}
