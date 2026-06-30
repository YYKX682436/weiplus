package um2;

/* loaded from: classes3.dex */
public final class j6 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f510381d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f510382e;

    public j6(um2.x5 pluginLayout, java.lang.String tag, gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f510381d = tag;
        this.f510382e = new java.lang.ref.WeakReference(pluginLayout);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var;
        boolean z17;
        um2.x5 x5Var = (um2.x5) this.f510382e.get();
        if (x5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f510381d, "VisitorTimerCallbackImpl onTimerExpired curPluginLayout is empty!");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = x5Var.f510598q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = x5Var.f510608t0;
        if (khVar != null && khVar.w0() == 0) {
            if (((mm2.c1) x5Var.c(mm2.c1.class)).f410315b4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = x5Var.f510595p;
                if (!(nd0Var != null && nd0Var.w0() == 0)) {
                    return true;
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean z18 = ((mm2.e1) x5Var.c(mm2.e1.class)).b7() && ((mm2.c1) x5Var.c(mm2.c1.class)).T1 > 0 && ((om2.l) x5Var.c(om2.l.class)).f427876h;
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (r4Var.f2(x5Var.f101142a)) {
                linkedList.add(new jz5.l(6, null));
            } else if (((mm2.e1) x5Var.c(mm2.e1.class)).t7()) {
                linkedList.add(new jz5.l(3, null));
            } else {
                jz5.l lVar = new jz5.l(2, null);
                jz5.l lVar2 = new jz5.l(3, null);
                jz5.l lVar3 = new jz5.l(4, null);
                linkedList.add(lVar);
                boolean z19 = ((mm2.o4) x5Var.c(mm2.o4.class)).z7() && ((mm2.c1) x5Var.c(mm2.c1.class)).R4;
                boolean z27 = ((mm2.c1) x5Var.c(mm2.c1.class)).T;
                boolean z28 = ((mm2.n0) x5Var.c(mm2.n0.class)).f410806r;
                if (((mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) x5Var.c(mm2.g1.class)).f410611s).mo144003x754a37bb()).f411119j || z27 || z28 || z19) {
                    linkedList.add(lVar2);
                }
                if (((mm2.c1) x5Var.c(mm2.c1.class)).f410395p3 && ((mm2.c1) x5Var.c(mm2.c1.class)).m7() && (((mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) x5Var.c(mm2.g1.class)).f410611s).mo144003x754a37bb()).f411119j || r4Var.F0(((mm2.e1) x5Var.c(mm2.e1.class)).f410521r) > 0)) {
                    linkedList.add(lVar3);
                }
                if (z18) {
                    linkedList.add(new jz5.l(7, null));
                    if (linkedList.size() >= 4) {
                        linkedList.remove(lVar);
                    }
                }
                z17 = false;
                khVar.A1(linkedList, z17, z17);
            }
            z17 = false;
            khVar.A1(linkedList, z17, z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var2 = x5Var.H;
        if ((v6Var2 != null && v6Var2.w0() == 0) && (v6Var = x5Var.H) != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u6(v6Var, ((mm2.c1) x5Var.c(mm2.c1.class)).J1));
        }
        if (ag0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = ag0Var.B;
            if (e30Var.f446856d.getVisibility() == 0) {
                long j17 = ((mm2.c1) ag0Var.P0(mm2.c1.class)).J1;
                e30Var.getClass();
                e30Var.f446856d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r20(e30Var, j17));
            }
        }
        if (((mm2.c1) x5Var.c(mm2.c1.class)).f410430v2 > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - ((mm2.c1) x5Var.c(mm2.c1.class)).f410430v2;
            if (elapsedRealtime >= km2.n.f390681q && ((mm2.c1) x5Var.c(mm2.c1.class)).a8()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f510381d, "visitor join time:" + ((mm2.c1) x5Var.c(mm2.c1.class)).f410430v2 + ",watch live duration:" + elapsedRealtime + '!');
                ((mm2.c1) x5Var.c(mm2.c1.class)).K9(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                long m75942xfb822ef2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                am.ia iaVar = c5445x963cab3.f135785g;
                iaVar.f88451a = m75942xfb822ef2;
                iaVar.f88452b = 21;
                c5445x963cab3.e();
                return true;
            }
        }
        return true;
    }
}
