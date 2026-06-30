package u;

/* loaded from: classes16.dex */
public final class p extends p012xc85e97e9.p087x9da2e250.app.e2 {
    public final java.util.List G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6, java.util.List fragments) {
        super(fm6, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.G = fragments;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.G.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SVPagerAdapter", "getItem position:" + i17);
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.G.get(i17);
    }
}
