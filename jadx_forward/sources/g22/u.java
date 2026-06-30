package g22;

/* loaded from: classes11.dex */
public final class u extends p012xc85e97e9.p087x9da2e250.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f349403d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f349404e;

    /* renamed from: f, reason: collision with root package name */
    public final int f349405f;

    /* renamed from: g, reason: collision with root package name */
    public final int f349406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activity, int i17, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener pageChangedListener, com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d pager, boolean z17, yz5.l fragmentRequest) {
        super(activity.mo7595x9cdc264(), 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageChangedListener, "pageChangedListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pager, "pager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentRequest, "fragmentRequest");
        this.f349403d = z17;
        this.f349404e = fragmentRequest;
        this.f349405f = 2;
        this.f349406g = 1;
        pager.mo79164x6cab2c8d(this);
        pager.mo79170x2d3430b4(pageChangedListener);
        pager.m80844x940d026a(i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f349403d ? this.f349405f : this.f349406g;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
        return (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) this.f349404e.mo146xb9724478(java.lang.Integer.valueOf(i17));
    }
}
