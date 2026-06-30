package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.h0 f197873d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ce2.k kVar;
        boolean z17;
        rl2.j jVar = (rl2.j) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148529t).mo141623x754a37bb();
        for (java.util.Map.Entry entry : jVar.f478733f.entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            java.util.Set set = (java.util.Set) entry.getValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLuckyMoneyStorage", "saveCacheInternal: liveId:" + longValue);
            java.lang.String concat = "SELECT * FROM FinderLiveLuckyMoneyInfo where FinderLiveLuckyMoneyInfo.liveId=".concat(pm0.v.u(longValue));
            l75.k0 k0Var = jVar.f478732e;
            android.database.Cursor f17 = k0Var.f(concat, null, 2);
            boolean z18 = true;
            if (f17.moveToNext()) {
                kVar = new ce2.k();
                kVar.mo9015xbf5d97fd(f17);
                z17 = false;
            } else {
                ce2.k kVar2 = new ce2.k();
                kVar2.f68045x41d5e0c = pm0.v.u(longValue);
                kVar2.f68046xb8b7e867 = new r45.kz1().mo14344x5f01b1f6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLuckyMoneyStorage", "create new luckyMoneyInfo:" + kVar2);
                kVar = kVar2;
                z17 = true;
            }
            r45.kz1 kz1Var = new r45.kz1();
            byte[] bArr = kVar.f68046xb8b7e867;
            if (bArr != null) {
                try {
                    kz1Var.mo11468x92b714fd(bArr);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            kz1Var.m75941xfb821914(1).addAll(set);
            kVar.f68046xb8b7e867 = kz1Var.mo14344x5f01b1f6();
            f17.close();
            if (!z17) {
                z18 = jVar.mo11260x413cb2b4(kVar);
            } else if (k0Var.l("FinderLiveLuckyMoneyInfo", "liveId", kVar.mo9763xeb27878e()) <= 0) {
                z18 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLuckyMoneyStorage", "saveCache result:" + z18);
        }
        return jz5.f0.f384359a;
    }
}
