package sm2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f491113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491114e;

    public n(sm2.o4 o4Var) {
        this.f491114e = o4Var;
    }

    public final boolean a() {
        return this.f491113d;
    }

    public final void b(boolean z17) {
        this.f491113d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        qf2.v0 v0Var;
        boolean z17 = false;
        this.f491113d = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f491114e.f491143f, "getNewAnchorPkRunnable invoke");
        fm2.a aVar = this.f491114e.f101128c;
        if (aVar == null || (m57663xfb7e5820 = aVar.m57663xfb7e5820()) == null || (c14197x319b1b9e = m57663xfb7e5820.f390664f) == null || (v0Var = (qf2.v0) c14197x319b1b9e.m56798x25fe639c(qf2.v0.class)) == null) {
            return;
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.N0).mo141623x754a37bb()).r()).intValue() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "getNewAnchorPkInfoData x switch is close");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List<km2.q> list = ((mm2.o4) v0Var.m56788xbba4bfc0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
        synchronized (list) {
            for (km2.q qVar : list) {
                java.lang.String str = qVar.f390703a;
                if (str == null) {
                    str = "";
                }
                hashMap.put(str, qVar);
            }
        }
        java.util.List<km2.q> list2 = ((mm2.o4) v0Var.m56788xbba4bfc0(mm2.o4.class)).f410858t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserTempList>(...)");
        synchronized (list2) {
            for (km2.q qVar2 : list2) {
                java.lang.String str2 = qVar2.f390703a;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(str2, qVar2);
            }
        }
        java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            if (vVar != null && hashMap.get(vVar.f555939d) == null && !z17) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "getNewAnchorPkInfoData isNeedRequest: " + z17 + " anchorCacheMap: " + hashMap);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(v0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qf2.p0(v0Var, hashMap, null), 2, null);
        }
    }
}
