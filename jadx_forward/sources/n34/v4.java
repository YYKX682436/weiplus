package n34;

@j95.b
/* loaded from: classes4.dex */
public class v4 extends i95.w implements p94.s0 {
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 Ai(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parserFromXml", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 q17 = m21.y.q(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parserFromXml", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        return q17;
    }

    public void Bi(long j17, android.widget.ImageView imageView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = W0.m70371x485d7();
        if (m70371x485d7.f39014x86965dde.f451373h.size() > 0) {
            r45.jj4 jj4Var = (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(0);
            android.graphics.Bitmap s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().s(jj4Var);
            if (s17 != null) {
                imageView.setImageBitmap(s17);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().Z(W0.m70367x7525eefd(), jj4Var, imageView, i17, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
    }

    public boolean wi(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return false;
        }
        if (W0.m70371x485d7().f39014x86965dde.f451373h.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        return false;
    }
}
