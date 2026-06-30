package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class xi0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g t30Var;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        if (!((mm2.o4) P0(mm2.o4.class)).B1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged, visitorMicReplayEnablePopup is false");
            return;
        }
        r45.q12 q12Var = ((mm2.e1) P0(mm2.e1.class)).f410522s;
        java.lang.Integer valueOf = q12Var != null ? java.lang.Integer.valueOf(q12Var.m75939xb282bd08(0)) : null;
        if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged,skip, liveMode: " + valueOf);
            return;
        }
        boolean Q6 = mm2.g0.Q6((mm2.g0) P0(mm2.g0.class), null, 1, null);
        if (Q6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged,skip, isCharge: " + Q6);
            return;
        }
        boolean z76 = ((mm2.o4) P0(mm2.o4.class)).z7();
        dk2.qf qfVar = ((mm2.o4) P0(mm2.o4.class)).A1;
        if (qfVar.f315521y) {
            qfVar.f315510n = ((mm2.e1) P0(mm2.e1.class)).R6();
            int U6 = ((mm2.e1) P0(mm2.e1.class)).U6();
            qfVar.f315511o = U6;
            if (qfVar.f315510n != qfVar.f315508i || U6 != qfVar.f315509m) {
                qfVar.f315507h = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", "haveChangeLiveMode, curLiveMode: " + qfVar.f315510n + ", curLiveSubMode: " + qfVar.f315511o);
            }
        }
        if (z76 != qfVar.f315521y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", "onMicUserChanged, isCurrentConnectingMic: " + z76);
            if (z76) {
                qfVar.f315506g = ((mm2.o4) P0(mm2.o4.class)).C1;
                qfVar.f315503d = java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                km2.q qVar = ((mm2.o4) P0(mm2.o4.class)).S;
                qfVar.f315504e = qVar != null ? qVar.f390708f : null;
                qfVar.f315505f = java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f410516m);
                qfVar.f315508i = ((mm2.e1) P0(mm2.e1.class)).R6();
                int U62 = ((mm2.e1) P0(mm2.e1.class)).U6();
                qfVar.f315509m = U62;
                qfVar.f315510n = qfVar.f315508i;
                qfVar.f315511o = U62;
                qfVar.f315507h = false;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                qfVar.f315522z = currentTimeMillis;
                r45.of1 I7 = ((mm2.c1) P0(mm2.c1.class)).I7();
                qfVar.A = I7.m75945x2fec8307(1);
                qfVar.B = I7.m75939xb282bd08(2);
                qfVar.C = I7.m75945x2fec8307(0);
                boolean z17 = ((mm2.d) P0(mm2.d.class)).f410475f;
                if (z17) {
                    str = ((mm2.d) P0(mm2.d.class)).f410477h;
                    str2 = ((mm2.d) P0(mm2.d.class)).f410478i;
                } else {
                    km2.q a76 = ((mm2.o4) P0(mm2.o4.class)).a7();
                    str = a76.f390706d;
                    str2 = a76.f390704b;
                }
                qfVar.E = str;
                qfVar.D = str2;
                boolean booleanValue = ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.o4) P0(mm2.o4.class)).H).mo144003x754a37bb()).booleanValue();
                qfVar.F = booleanValue;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", "isCurrentConnectingMic is true, curTime: " + currentTimeMillis + ",selfMicUser:" + I7.m75945x2fec8307(1) + ' ' + I7.m75939xb282bd08(2) + ", isPurchaseMic: " + booleanValue + ",isBizMode: " + z17 + ",nickname: " + str + ", headUrl: " + str2 + ",beginLiveMode: " + qfVar.f315508i + ", beginLiveSubMode: " + qfVar.f315509m);
            }
            if (!z76) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                long j17 = qfVar.f315522z;
                int i17 = qfVar.f315506g;
                boolean z18 = qfVar.F;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", "isCurrentConnectingMic is false, curTime: " + currentTimeMillis2 + ", visitorLastConnectingMicTime: " + j17 + ", minMicDuration: " + i17 + ", isPurchaseMic: " + z18);
                if ((currentTimeMillis2 - j17 > ((long) java.lang.Math.max(i17, 30000))) && !z18) {
                    mm2.o4 o4Var = (mm2.o4) P0(mm2.o4.class);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showVisitorMicReplay, visitorMicReplayData: ");
                    dk2.qf qfVar2 = o4Var.A1;
                    sb6.append(qfVar2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorReplayPlugin", sb6.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40 d40Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30.f201249d, qfVar2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi0(this));
                    boolean z19 = qfVar2.f315507h;
                    android.view.ViewGroup viewGroup = this.f446856d;
                    if (!z19 && qfVar2.f315510n == 2 && qfVar2.f315511o == 8) {
                        android.content.Context context = viewGroup.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        t30Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h20(context, d40Var);
                    } else {
                        android.content.Context context2 = viewGroup.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        t30Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t30(context2, d40Var);
                    }
                    t30Var.w();
                }
                qfVar.f315522z = 0L;
            }
            qfVar.f315521y = z76;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 == 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }
}
