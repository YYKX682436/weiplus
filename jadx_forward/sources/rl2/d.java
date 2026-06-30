package rl2;

/* loaded from: classes3.dex */
public final class d extends be2.c {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f478722e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f478723f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f478724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, ce2.c.f122307v, "FinderLiveChargeInfo", dm.l4.f319762m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = ce2.c.f122307v;
        this.f478722e = db6;
        this.f478724g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(zl2.q4.f555466a.E() ? 5 : 600);
    }

    @Override // be2.c
    public boolean D0(long j17) {
        if (!this.f478723f) {
            z0();
        }
        rl2.c cVar = (rl2.c) this.f478724g.get(java.lang.Long.valueOf(j17));
        return cVar != null && cVar.f478721e == 1;
    }

    @Override // be2.c
    public void J0() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f478724g;
        java.util.Set<java.util.Map.Entry> p17 = r2Var.p();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "entrySet(...)");
        for (java.util.Map.Entry entry : p17) {
            java.lang.Object key = entry.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
            long longValue = ((java.lang.Number) key).longValue();
            java.lang.Object value = entry.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            P0(longValue, (rl2.c) value);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeInfoStorage", "saveChargeInfo finish size:" + r2Var.m77804x35e001() + '!');
    }

    @Override // be2.c
    public void L0(long j17) {
        if (!this.f478723f) {
            z0();
        }
        rl2.c cVar = (rl2.c) this.f478724g.get(java.lang.Long.valueOf(j17));
        if (cVar == null) {
        } else if (cVar.f478720d != 1) {
            cVar.f478721e = 1;
        }
        java.lang.Object obj = this.f478724g.get(java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        P0(j17, (rl2.c) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeInfoStorage", "setInvalid liveId:" + j17 + ",cache size:" + this.f478724g.m77804x35e001());
    }

    public final void P0(long j17, rl2.c cVar) {
        ce2.c cVar2;
        boolean z17;
        boolean z18;
        java.lang.String concat = "SELECT * FROM FinderLiveChargeInfo where FinderLiveChargeInfo.liveId=".concat(pm0.v.u(j17));
        l75.k0 k0Var = this.f478722e;
        android.database.Cursor f17 = k0Var.f(concat, null, 2);
        boolean z19 = true;
        if (f17.moveToNext()) {
            cVar2 = new ce2.c();
            cVar2.mo9015xbf5d97fd(f17);
            int i17 = cVar2.f67321x39777277;
            int i18 = cVar.f478718b;
            z18 = (i17 == i18 && cVar2.f67322xc366d2b2 == cVar.f478719c && cVar2.f67325x1b6db3f2 == cVar.f478720d && cVar2.f67323xe9629fb2 == cVar.f478721e) ? false : true;
            cVar2.f67321x39777277 = i18;
            cVar2.f67322xc366d2b2 = cVar.f478719c;
            cVar2.f67325x1b6db3f2 = cVar.f478720d;
            cVar2.f67323xe9629fb2 = cVar.f478721e;
            z17 = false;
        } else {
            ce2.c cVar3 = new ce2.c();
            cVar3.f67324x41d5e0c = j17;
            cVar3.f67321x39777277 = cVar.f478718b;
            cVar3.f67322xc366d2b2 = cVar.f478719c;
            cVar3.f67325x1b6db3f2 = cVar.f478720d;
            cVar3.f67323xe9629fb2 = cVar.f478721e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeInfoStorage", "create new charge info:" + cVar3);
            cVar2 = cVar3;
            z17 = true;
            z18 = false;
        }
        f17.close();
        if (z18) {
            z19 = mo11260x413cb2b4(cVar2);
        } else if (!z17 || k0Var.l("FinderLiveChargeInfo", "liveId", cVar2.mo9763xeb27878e()) <= 0) {
            z19 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeInfoStorage", "saveCache " + cVar2.f67324x41d5e0c + ",liveTime:" + cVar2.f67321x39777277 + ",replay:" + cVar2.f67322xc366d2b2 + ",payForLive:" + cVar2.f67325x1b6db3f2 + ",invalid:" + cVar2.f67323xe9629fb2 + ", needReplace:" + z18 + ",needInsert:" + z17 + ",result:" + z19);
    }

    @Override // be2.c
    public boolean y0(long j17) {
        if (!this.f478723f) {
            z0();
        }
        rl2.c cVar = (rl2.c) this.f478724g.get(java.lang.Long.valueOf(j17));
        return cVar != null && cVar.f478720d == 1;
    }

    @Override // be2.c
    public void z0() {
        boolean isEmpty = this.f478724g.p().isEmpty();
        if (isEmpty) {
            android.database.Cursor f17 = this.f478722e.f("SELECT * FROM FinderLiveChargeInfo", null, 2);
            while (f17.moveToNext()) {
                ce2.c cVar = new ce2.c();
                cVar.mo9015xbf5d97fd(f17);
                long j17 = cVar.f67324x41d5e0c;
                rl2.c cVar2 = new rl2.c(j17, cVar.f67321x39777277, cVar.f67322xc366d2b2, cVar.f67325x1b6db3f2, cVar.f67323xe9629fb2);
                this.f478724g.put(java.lang.Long.valueOf(j17), cVar2);
                zl2.r4.f555483a.M2("FinderLiveChargeInfoStorage", "initChargeInfo " + cVar2);
            }
            f17.close();
        }
        this.f478723f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeInfoStorage", "initChargeInfo: " + c01.z1.r() + ", isEmpty:" + isEmpty + ", cache size:" + this.f478724g.m77804x35e001());
    }
}
