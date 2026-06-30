package sc2;

/* loaded from: classes2.dex */
public final class i7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final sc2.i7 f487508d = new sc2.i7();

    public i7() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        android.view.View view = observer.f84676d;
        if (p0Var != null && view != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var.f534777f;
            if (abstractC14490x69736cb5 != null && hc2.o0.D(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "onPause feedId=".concat(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())));
            }
            p0Var.A = false;
            observer.x(view, p0Var);
        }
        return jz5.f0.f384359a;
    }
}
