package oh3;

@j95.b
/* loaded from: classes8.dex */
public final class i extends i95.w implements p90.k {
    public void Ai(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo, r45.f03 showInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showInfo, "showInfo");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6697x2d0b403f c6697x2d0b403f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6697x2d0b403f();
        c6697x2d0b403f.f140340d = c6697x2d0b403f.b("RedDotTipsUuid", ctrlInfo.f65882x5364c75d, true);
        c6697x2d0b403f.f140341e = ctrlInfo.m55856xfb85f7b0();
        c6697x2d0b403f.f140342f = c6697x2d0b403f.b("RedDotShowInfoPath", showInfo.f455425i, true);
        c6697x2d0b403f.f140343g = c6697x2d0b403f.b("RedDotShowInfoParentPath", showInfo.f455426m, true);
        c6697x2d0b403f.f140344h = showInfo.f455420d;
        c6697x2d0b403f.f140345i = showInfo.f455421e;
        c6697x2d0b403f.f140346j = c6697x2d0b403f.b("RedDotShowInfoTitle", showInfo.f455422f, true);
        c6697x2d0b403f.f140347k = i17;
        c6697x2d0b403f.f140348l = java.lang.System.currentTimeMillis();
        c6697x2d0b403f.f140349m = ctrlInfo.f65879x2261f6f2;
        c6697x2d0b403f.f140350n = c6697x2d0b403f.b("RedDotShowInfoIconUrl", showInfo.f455423g, true);
        c6697x2d0b403f.f140351o = 0L;
        c6697x2d0b403f.f140352p = c6697x2d0b403f.b("ReportExtInfo", ctrlInfo.f65874xb5f7102a.f470032t, true);
        c6697x2d0b403f.o();
        c6697x2d0b403f.k();
    }

    public void wi(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotReportService", "[exposeMyTab] action=" + i17 + " hasRedDot=" + z17);
        if (z17) {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("MyTab");
            r45.f03 I0 = nk6.I0("MyTab");
            if (L0 == null || I0 == null) {
                return;
            }
            ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(i17, L0, I0);
        }
    }
}
