package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class i50 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 f216233g;

    public i50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var) {
        this.f216233g = m50Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        int i18 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var = this.f216233g;
        if (i18 != m50Var.f216659f || com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e != m50Var.f216660g) {
            m50Var.Q6("TOUCH");
            m50Var.f216659f = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
            m50Var.f216660g = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var2 = this.f216233g;
        if (m50Var2.f216662i > 0 && (ev6 instanceof ec2.f)) {
            ec2.f fVar = (ec2.f) ev6;
            boolean z17 = false;
            int i19 = fVar.f332492d;
            if (i19 == 1) {
                m50Var2.f216667q = false;
                long j17 = fVar.f332498j;
                m50Var2.f216666p = j17;
                if (m50Var2.f216668r) {
                    m50Var2.P6(m50Var2.f216665o == j17 ? 1 : 0, false, j17, m50Var2.f216663m, m50Var2.f216664n, false);
                }
                m50Var.f216668r = false;
                m50Var.f216665o = -1L;
                m50Var.Q6("VIDEO_REAL_PLAY");
            } else if (i19 == 2) {
                m50Var2.f216657d++;
            } else if (i19 == 3) {
                m50Var2.f216663m = fVar.f332496h;
                m50Var2.f216664n = fVar.f332497i;
            }
            int i27 = m50Var.f216657d;
            int i28 = m50Var.f216662i;
            if (1 <= i28 && i28 < i27) {
                z17 = true;
            }
            if (z17 && m50Var.f216661h > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var3 = this.f216233g;
                if (currentTimeMillis - m50Var3.f216658e >= m50Var3.f216661h) {
                    m50Var3.f216667q = true;
                    int i29 = m50Var3.f216663m + 1;
                    m50Var3.f216663m = i29;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50.O6(m50Var3, fVar.f332498j, i29, m50Var3.f216664n, false);
                    m50Var.f216665o = fVar.f332498j;
                    m50Var.Q6("pausePlay");
                }
            }
            if (i19 == 17) {
                m50Var.f216668r = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var4 = this.f216233g;
            if (m50Var4.f216667q || i19 != 17) {
                return;
            }
            m50Var4.P6(0, false, m50Var4.f216666p, m50Var4.f216663m, m50Var4.f216664n, true);
        }
    }
}
