package w82;

/* loaded from: classes3.dex */
public class g1 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f525402d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505) {
        this.f525402d = viewOnClickListenerC13625xe5fb4505;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525402d;
        if (!viewOnClickListenerC13625xe5fb4505.d()) {
            viewOnClickListenerC13625xe5fb4505.I.c(500L, 500L);
            viewOnClickListenerC13625xe5fb4505.m55415x1d620e25(false);
        }
        viewOnClickListenerC13625xe5fb4505.i(i17);
        if (viewOnClickListenerC13625xe5fb4505.f183116x) {
            viewOnClickListenerC13625xe5fb4505.f183098J.c(4000L, 4000L);
        }
    }

    @Override // m34.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525402d;
        if (viewOnClickListenerC13625xe5fb4505.f183102g.mo69311xc00617a4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC13625xe5fb4505.f183099d, "VideoPlay: pausePlay()");
            viewOnClickListenerC13625xe5fb4505.f183102g.mo69313x65825f6();
        }
        viewOnClickListenerC13625xe5fb4505.f183098J.d();
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
