package xe2;

/* loaded from: classes3.dex */
public final class n0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f535420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535420c = new java.util.LinkedList();
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        java.util.LinkedList<r45.gw1> m75941xfb821914;
        df2.g gVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.dh1 dh1Var = new r45.dh1();
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 != null) {
                    try {
                        dh1Var.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveGuideInfoAppMsgInterceptor", "pb = " + pm0.b0.g(dh1Var));
        r45.fw1 fw1Var = (r45.fw1) dh1Var.m75936x14adae67(0);
        if (fw1Var == null || (m75941xfb821914 = fw1Var.m75941xfb821914(0)) == null) {
            return;
        }
        for (r45.gw1 gw1Var : m75941xfb821914) {
            java.lang.String m75945x2fec8307 = gw1Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.util.LinkedList linkedList = this.f535420c;
            if (linkedList.contains(m75945x2fec8307)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveGuideInfoAppMsgInterceptor", "msgId:" + m75945x2fec8307 + " already received");
            } else {
                linkedList.add(m75945x2fec8307);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveGuideInfoAppMsgInterceptor", "receive guidetype: " + gw1Var.m75939xb282bd08(1) + " text: " + gw1Var.m75945x2fec8307(2));
                int m75939xb282bd08 = gw1Var.m75939xb282bd08(1);
                gk2.e eVar = this.f526800a;
                if (m75939xb282bd08 == 2) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) ((mm2.x) eVar.a(mm2.x.class)).f411053f).e(gw1Var);
                } else if (m75939xb282bd08 == 3) {
                    byte[] mo14344x5f01b1f6 = gw1Var.mo14344x5f01b1f6();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.i5) eVar.a(mm2.i5.class)).f410673f;
                    r45.f52 f52Var = new r45.f52();
                    f52Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3));
                    f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(mo14344x5f01b1f6));
                    c14227x4262fb44.mo7808x76db6cb1(f52Var.mo14344x5f01b1f6());
                } else if (m75939xb282bd08 != 6) {
                    if (m75939xb282bd08 == 7) {
                        ((mm2.x6) eVar.a(mm2.x6.class)).f411079f.mo7808x76db6cb1(gw1Var);
                    } else if (m75939xb282bd08 == 8) {
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) ((om2.l) eVar.a(om2.l.class)).f427875g).e(gw1Var);
                    }
                } else if (zl2.r4.F1(eVar)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveGuideInfoAppMsgInterceptor", "dealWithMsgList: skip CreateLiveNotice bubble in co-live");
                } else if (zl2.r4.f555483a.w1()) {
                    dk2.ef efVar = dk2.ef.f314905a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
                    if (c14197x319b1b9e != null && (gVar = (df2.g) c14197x319b1b9e.m56798x25fe639c(df2.g.class)) != null && (j0Var = gVar.f311713p) != null) {
                        j0Var.mo7808x76db6cb1(gw1Var);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveGuideInfoAppMsgInterceptor", "dealWithMsgList: error, cannot bubble create live notice when not in anchor mode, isAssistant=" + ((mm2.c1) eVar.a(mm2.c1.class)).T);
                }
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20107};
    }
}
