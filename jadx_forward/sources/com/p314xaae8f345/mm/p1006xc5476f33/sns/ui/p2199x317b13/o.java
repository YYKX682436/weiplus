package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public final class o implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f250925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q f250926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n f250928d;

    public o(r45.g92 g92Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q qVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar) {
        this.f250925a = g92Var;
        this.f250926b = qVar;
        this.f250927c = view;
        this.f250928d = nVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$4$1");
        r45.g92 finderShareObject = this.f250925a;
        int i17 = finderShareObject.m75939xb282bd08(13) == 1 ? 1 : 2;
        p52.c cVar = p52.h.f433549a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        if (!cVar.c(j17, str, map, i17)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderShareObject, "$finderShareObject");
            r45.nw1 nw1Var = (r45.nw1) finderShareObject.m75936x14adae67(24);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q qVar = this.f250926b;
            if (!qVar.H(finderShareObject, nw1Var)) {
                if (!qVar.G(finderShareObject.m75945x2fec8307(1), this.f250927c, this.f250928d.i())) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Qj(j17, str, cVar.h(map, i17), kz5.b0.c(26236), false);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$4$1");
    }
}
