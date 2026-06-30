package bg2;

/* loaded from: classes2.dex */
public final class c6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc2.g f101517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f101518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(tc2.g gVar, bg2.q6 q6Var) {
        super(0);
        this.f101517d = gVar;
        this.f101518e = q6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final tc2.g gVar = this.f101517d;
        in5.s0 s0Var = gVar.f498682i;
        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
        if (abstractActivityC15087xee12defa == null) {
            return null;
        }
        final bg2.q6 q6Var = this.f101518e;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5682x83cc6446>(abstractActivityC15087xee12defa) { // from class: com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedExposedListener$2$1$1
            {
                this.f39173x3fe91575 = 1519392342;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5682x83cc6446 c5682x83cc6446) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5682x83cc6446 event = c5682x83cc6446;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                bg2.q6 q6Var2 = q6Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = q6Var2.f498674d.f498681h;
                am.yi yiVar = event.f136008g;
                if (!(abstractC14490x69736cb5 != null && yiVar.f89997a == abstractC14490x69736cb5.mo2128x1ed62e84())) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q6Var2.f101946e, "noInterested exposed, id:" + yiVar.f89997a);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = gVar.f498680g;
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.b6(q6Var2, null), 3, null);
                }
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.S1, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var2)), new jz5.l("feedId", bg2.q6.Y6(q6Var2)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
                return true;
            }
        };
    }
}
