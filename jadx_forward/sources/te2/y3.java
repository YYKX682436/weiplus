package te2;

/* loaded from: classes3.dex */
public final class y3 {
    public y3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(long j17) {
        ce2.k kVar;
        rl2.j jVar = (rl2.j) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148529t).mo141623x754a37bb();
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLuckyMoneyStorage", "initCache: liveId:" + j17);
        android.database.Cursor f17 = jVar.f478732e.f("SELECT * FROM FinderLiveLuckyMoneyInfo where FinderLiveLuckyMoneyInfo.liveId=".concat(pm0.v.u(j17)), null, 2);
        if (f17.moveToNext()) {
            kVar = new ce2.k();
            kVar.mo9015xbf5d97fd(f17);
        } else {
            kVar = null;
        }
        r45.kz1 kz1Var = new r45.kz1();
        byte[] bArr = kVar != null ? kVar.f68046xb8b7e867 : null;
        if (bArr != null) {
            try {
                kz1Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet());
        java.util.LinkedList m75941xfb821914 = kz1Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getOpenedIdList(...)");
        synchronizedSet.addAll(m75941xfb821914);
        jVar.f478733f.put(java.lang.Long.valueOf(j17), synchronizedSet);
        f17.close();
    }
}
