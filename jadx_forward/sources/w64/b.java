package w64;

/* loaded from: classes4.dex */
public class b extends v64.b {
    @Override // v64.b
    public /* bridge */ /* synthetic */ v64.c d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        w64.a e17 = e(c17933xe8d1b226, dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        return e17;
    }

    public w64.a e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdActionButtonClick", "the sns info or adxml is null!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return null;
        }
        int intValue2 = dVar != null ? ((java.lang.Integer) dVar.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)).intValue() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        if (intValue2 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo adCardActionBtnInfo = m70354x74235b3e.f38157x18416701;
            if (adCardActionBtnInfo != null) {
                c17702x544f64e9 = adCardActionBtnInfo.f38287xf7a0a3ac;
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 2) {
            s34.b1 b1Var = m70354x74235b3e.f38214xa4c418b3;
            if (b1Var != null) {
                c17702x544f64e9 = b1Var.f76698xf7a0a3ac;
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 3) {
            if (m70354x74235b3e.f38210x95847c91 != null) {
                c17702x544f64e9 = m70354x74235b3e.f38210x95847c91.f76695x5800ff2c.get(dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0).f76730xf7a0a3ac;
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 4) {
            if (m70354x74235b3e.f38210x95847c91 != null) {
                c17702x544f64e9 = m70354x74235b3e.f38210x95847c91.f76695x5800ff2c.get(dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0).f76729x155a1700.f76704x75b1d9b0;
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o m70118x88b11ac3 = m70354x74235b3e.m70118x88b11ac3();
            if (m70118x88b11ac3 != null) {
                c17702x544f64e9 = m70118x88b11ac3.f38342x5aeb90e;
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o m70118x88b11ac32 = m70354x74235b3e.m70118x88b11ac3();
            if (m70118x88b11ac32 != null) {
                c17702x544f64e9 = m70118x88b11ac32.f38343xb07ec9f5;
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 7 || intValue2 == 8) {
            if (m70346x10413e67 != null && !a84.b0.b(m70346x10413e67.f38072xb6139d47)) {
                intValue = dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0;
                if (m70346x10413e67.m70102x6a4a5724(intValue)) {
                    c17702x544f64e9 = m70346x10413e67.f38072xb6139d47.get(intValue);
                }
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 10) {
            c17702x544f64e9 = m70354x74235b3e.f38138xa11ce7c3;
        } else if (intValue2 == 13 || intValue2 == 14) {
            if (m70346x10413e67 != null && !a84.b0.b(m70346x10413e67.f38072xb6139d47) && m70346x10413e67.m70102x6a4a5724(0)) {
                c17702x544f64e9 = m70346x10413e67.f38072xb6139d47.get(0);
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 16 || intValue2 == 17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = m70354x74235b3e.f38182x86831750;
            if (nVar != null) {
                c17702x544f64e9 = nVar.f38341xd41fa323;
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 18) {
            if (m70354x74235b3e.m70151x59316745()) {
                c17702x544f64e9 = m70354x74235b3e.f38191xf4087299.d();
            }
            c17702x544f64e9 = null;
        } else if (intValue2 == 19 || intValue2 == 27) {
            if (m70354x74235b3e.m70151x59316745()) {
                intValue = dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0;
                java.util.List c17 = m70354x74235b3e.f38191xf4087299.c();
                if (intValue >= 0 && intValue < c17.size()) {
                    c17702x544f64e9 = ((v74.q) c17.get(intValue)).a();
                }
            }
            c17702x544f64e9 = null;
        } else {
            if (intValue2 == 22 && m70354x74235b3e.m70160x35b2ea06()) {
                c17702x544f64e9 = m70354x74235b3e.f38210x95847c91.f76694x80bfd259;
            }
            c17702x544f64e9 = null;
        }
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return null;
        }
        int i17 = c17702x544f64e9.f244104b;
        if (i17 == 8) {
            x64.g gVar = new x64.g(c17702x544f64e9);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return gVar;
        }
        if (i17 == 9) {
            x64.j jVar = new x64.j(c17702x544f64e9);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return jVar;
        }
        if (i17 == 10) {
            x64.l lVar = new x64.l(c17702x544f64e9);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return lVar;
        }
        if (i17 != 11) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return null;
        }
        x64.m mVar = new x64.m(c17702x544f64e9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        return mVar;
    }
}
