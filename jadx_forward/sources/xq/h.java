package xq;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f537512d;

    public h(xq.m mVar) {
        this.f537512d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.f fVar;
        xq.m mVar = this.f537512d;
        xq.c cVar = mVar.f537532k;
        if (cVar == null || cVar.f537506d == null || (fVar = mVar.f537539r) == null) {
            return;
        }
        java.lang.String msgTalker = mVar.f537523b;
        long j17 = mVar.f537524c;
        java.lang.String animKey = mVar.f537522a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animKey, "animKey");
        xq.p pVar = ((xq.o) fVar).f537541a.f537547f;
        if (pVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ma) pVar).f281028a;
            java.lang.String str = taVar.f281506e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayScreenEffect: msgTalker:");
            sb6.append(msgTalker);
            sb6.append(" msg:");
            sb6.append(j17);
            sb6.append(", ");
            xq.d dVar = cVar.f537506d;
            jz5.f0 f0Var = null;
            sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f537507b) : null);
            sb6.append(", ");
            xq.d dVar2 = cVar.f537506d;
            sb6.append(dVar2 != null ? java.lang.Integer.valueOf(dVar2.f537508c) : null);
            sb6.append(", ");
            sb6.append(animKey);
            sb6.append(' ');
            sb6.append(cVar.f537504b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (taVar.f281507f) {
                return;
            }
            kh5.h m07 = taVar.m0();
            java.lang.String emojiKey = cVar.f537504b;
            m07.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiKey, "emojiKey");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEChattingMgr", "[ME] playEmojiEffect msgId = " + j17 + ", emoji = (" + animKey + ", " + emojiKey + ')');
            wp0.b b17 = mh5.a.b(msgTalker, j17, animKey, emojiKey, true, true, m07.f389604h, m07.f389605i);
            if (b17 != null) {
                java.lang.String r17 = m07.f389604h.r();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getReportSessionId(...)");
                java.lang.String a17 = b17.a(1, r17);
                jc3.j0 j0Var = m07.f529908f;
                if (j0Var != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6725xb1b08174 c6725xb1b08174 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6725xb1b08174();
                    c6725xb1b08174.f140628f = currentTimeMillis;
                    c6725xb1b08174.f140627e = 7;
                    c6725xb1b08174.k();
                    rc3.w0 w0Var = (rc3.w0) j0Var;
                    w0Var.A();
                    w0Var.k("MagicEmojiSent", a17);
                    m07.g1();
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MEChattingMgr", "[ME] playEmojiEffect without biz...");
                }
            }
        }
    }
}
