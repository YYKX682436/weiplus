package zo2;

/* loaded from: classes2.dex */
public class c extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f556380i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6, java.util.List fragments) {
        super(fm6, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.f556380i = fragments;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f556380i.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f556380i.get(i17);
    }
}
