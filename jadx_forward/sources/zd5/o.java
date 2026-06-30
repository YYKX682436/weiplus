package zd5;

/* loaded from: classes8.dex */
public final class o extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f553236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6, java.util.ArrayList fragmentList) {
        super(fm6, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentList, "fragmentList");
        this.f553236i = fragmentList;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f553236i.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        java.lang.Object obj = this.f553236i.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj;
    }
}
