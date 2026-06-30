package bg2;

/* loaded from: classes10.dex */
public final class e2 extends tc2.c implements tc2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        zy2.a8 liveFeedDecorator;
        r45.xn1 xn1Var;
        r45.up1 up1Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
        if (finderLivePlayView == null || (liveFeedDecorator = finderLivePlayView.getLiveFeedDecorator()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.uf ufVar = (com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator;
        com.tencent.mm.plugin.finder.feed.kf kfVar = ufVar.f109168n;
        kfVar.getClass();
        kfVar.K = resp;
        r45.wz1 wz1Var = (r45.wz1) resp.getCustom(4);
        if (wz1Var != null) {
        }
        r45.hc1 hc1Var = kfVar.K;
        if (hc1Var != null && (up1Var = (r45.up1) hc1Var.getCustom(68)) != null) {
            kfVar.f107198l = pm0.v.A(up1Var.getLong(0), 16384);
        }
        r45.ic1 ic1Var = (r45.ic1) resp.getCustom(85);
        if (ic1Var == null || (xn1Var = (r45.xn1) ic1Var.getCustom(6)) == null) {
            return;
        }
        ufVar.f109174t = xn1Var;
        km2.q qVar = (km2.q) ufVar.f109175u.get(ufVar.f109163i.f477334a);
        if (qVar != null) {
            qVar.f309187r = ufVar.f109174t;
        }
        ufVar.t(true);
    }
}
