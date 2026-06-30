package tc4;

/* loaded from: classes4.dex */
public final class h implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f498880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f498881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc4.p f498882c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f498883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f498884e;

    public h(r45.g92 g92Var, tc4.a0 a0Var, xc4.p pVar, long j17, int i17) {
        this.f498880a = g92Var;
        this.f498881b = a0Var;
        this.f498882c = pVar;
        this.f498883d = j17;
        this.f498884e = i17;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        boolean z17;
        java.lang.Integer num;
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
        java.lang.String m75945x2fec8307 = this.f498880a.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "0";
        }
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(m75945x2fec8307, 0L);
        if (V != j17) {
            this.f498881b.x("MicroMsg.Improve.FinderLiveTimelineItem", "#checkLiveStatus.onLiveStatusCallback not match, return");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
            return;
        }
        this.f498880a.set(13, java.lang.Integer.valueOf(i17));
        r45.g92 g92Var = this.f498880a;
        boolean z18 = obj instanceof r45.l71;
        r45.l71 l71Var = z18 ? (r45.l71) obj : null;
        g92Var.set(24, l71Var != null ? (r45.nw1) l71Var.m75936x14adae67(1) : null);
        r45.a90 a90Var = this.f498882c.h1().f39014x86965dde;
        r45.g92 g92Var2 = a90Var != null ? a90Var.f451381s : null;
        if (g92Var2 != null) {
            r45.l71 l71Var2 = z18 ? (r45.l71) obj : null;
            g92Var2.set(24, l71Var2 != null ? (r45.nw1) l71Var2.m75936x14adae67(1) : null);
        }
        r45.nw1 nw1Var = (r45.nw1) this.f498880a.m75936x14adae67(24);
        r45.o52 o52Var = nw1Var != null ? (r45.o52) nw1Var.m75936x14adae67(28) : null;
        tc4.a0 a0Var = this.f498881b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkLiveStatus, thisLiveId:");
        sb6.append(this.f498883d);
        sb6.append(",liveID:");
        sb6.append(j17);
        sb6.append(",desc:");
        sb6.append(this.f498880a.m75945x2fec8307(4));
        sb6.append(",share liveStatus:");
        sb6.append(this.f498880a.m75939xb282bd08(13));
        sb6.append(", callback liveStatus:");
        sb6.append(i17);
        sb6.append(",purchaseInfo:[");
        sb6.append(o52Var != null ? java.lang.Boolean.valueOf(o52Var.m75933x41a8a7f2(1)) : null);
        sb6.append(',');
        if (o52Var != null) {
            z17 = false;
            num = java.lang.Integer.valueOf(o52Var.m75939xb282bd08(0));
        } else {
            z17 = false;
            num = null;
        }
        sb6.append(num);
        sb6.append(']');
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", sb6.toString());
        java.lang.String Jj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Jj(V);
        if (Jj.length() > 0) {
            z17 = true;
        }
        if (!z17) {
            Jj = null;
        }
        if (Jj != null) {
            this.f498880a.set(5, Jj);
        }
        if (this.f498884e == 1 && i17 == 2) {
            r45.a90 a90Var2 = this.f498882c.h1().f39014x86965dde;
            r45.g92 g92Var3 = a90Var2 != null ? a90Var2.f451381s : null;
            if (g92Var3 != null) {
                g92Var3.set(13, java.lang.Integer.valueOf(i17));
            }
            xc4.p pVar = this.f498882c;
            pVar.z0(pVar.h1().mo14344x5f01b1f6());
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            int W6 = com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(((zc4.h) a17).P6(zc4.g.class), this.f498882c, false, false, 4, null);
            this.f498881b.x("MicroMsg.Improve.FinderLiveTimelineItem", "checkLiveStatus, update finder live status to end!result:" + W6);
        }
        pm0.v.X(new tc4.g(this.f498881b, this.f498880a, obj, i17));
        tc4.a0 a0Var2 = this.f498881b;
        r45.g92 g92Var4 = this.f498880a;
        r45.nw1 nw1Var2 = (r45.nw1) g92Var4.m75936x14adae67(24);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean Y = a0Var2.Y(g92Var4, nw1Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (Y) {
            p52.c cVar = p52.h.f433549a;
            java.lang.String liveId = java.lang.String.valueOf(j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
            p52.h.C.remove(liveId);
        } else {
            sb4.z.h(p52.h.f433549a.a(java.lang.String.valueOf(j17)), i17 != 1 ? 2 : 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
    }
}
