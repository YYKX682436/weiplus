package yc2;

/* loaded from: classes2.dex */
public final class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yc2.l f542366a;

    public j(yc2.l lVar) {
        this.f542366a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        yc2.l lVar = this.f542366a;
        xc2.p0 p0Var = lVar.f534695b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var != null ? p0Var.f534777f : null;
        in5.s0 s0Var = lVar.f534694a;
        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
        if (abstractC14490x69736cb5 == null || context == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRecommendCPSComponentEventHandler", "[onBindView], feedId=" + ((java.lang.Object) jz5.x.a(abstractC14490x69736cb5.mo2128x1ed62e84())) + ", lite app callback, actionName:" + str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "FinderGameJoinClickAcceptAction")) {
            return false;
        }
        pf5.u uVar = pf5.u.f435469a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.b(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a17).V6();
        p012xc85e97e9.p093xedfae76a.c1 a18 = uVar.e(zy2.b6.class).a(xc2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        xc2.k0.f7((xc2.k0) a18, kz5.b0.c(abstractC14490x69736cb5.getFeedObject()), V6.m75939xb282bd08(5), V6, 0, null, null, 56, null);
        return false;
    }
}
