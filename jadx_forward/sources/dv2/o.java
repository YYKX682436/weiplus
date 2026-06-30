package dv2;

/* loaded from: classes2.dex */
public final class o implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.v f325445d;

    public o(dv2.v vVar) {
        this.f325445d = vVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        dv2.i iVar = dv2.i.f325399f;
        if (i17 != 1) {
            iVar = dv2.i.f325398e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowAggregationTabUIC", "onPageSelected: position=" + i17 + " -> " + iVar);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f325445d.f325492w).k(iVar);
    }
}
