package b33;

/* loaded from: classes2.dex */
public final class q extends p012xc85e97e9.p087x9da2e250.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f99217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6, java.util.List fragments) {
        super(fm6, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.f99217d = fragments;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f99217d.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabPickerAdapter", "FragmentPagerAdapter getItem position:" + i17);
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f99217d.get(i17);
    }
}
