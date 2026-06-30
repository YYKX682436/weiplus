package cw2;

/* loaded from: classes2.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c f305222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz2.a f305223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.h8 f305224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c, kz2.a aVar, cw2.h8 h8Var) {
        super(1);
        this.f305222d = c15181x7c9d924c;
        this.f305223e = aVar;
        this.f305224f = h8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da daVar = (cw2.da) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c = this.f305222d;
        c15181x7c9d924c.m61328xab353f7e(daVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) c15181x7c9d924c.m61316x4ed8f404().F()).X6(daVar);
        if (daVar != null) {
            daVar.s(c15181x7c9d924c.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String(), c15181x7c9d924c.getPlayerItemScene());
            daVar.mo56698x4ee17f0a().setTag(com.p314xaae8f345.mm.R.id.ua9, "nearby-live-preview-view-tag");
            daVar.mo56703x2f6c317e(this.f305223e);
            cw2.h8 h8Var = this.f305224f;
            h8Var.f305284g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = h8Var.f305278a;
            c15181x7c9d924c.m61316x4ed8f404().D(c14989xf862ae88.m59124x87980ca());
            boolean isNeverStart = daVar.getIsNeverStart();
            mn2.g4 g4Var = h8Var.f305280c;
            if (isNeverStart || daVar.getIsPreloadedView()) {
                ym5.a1.f(new cw2.a3(c15181x7c9d924c, "neverStart or preloadedView"));
                daVar.n(g4Var, h8Var.f305283f, c14989xf862ae88);
                daVar.mo56715xe9d735dd(c15181x7c9d924c.lifecycle);
                daVar.mo56711xe5cb79eb(false);
            }
            c15181x7c9d924c.c(daVar, g4Var, h8Var.f305282e);
        }
        return jz5.f0.f384359a;
    }
}
