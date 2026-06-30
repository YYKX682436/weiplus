package i53;

/* loaded from: classes8.dex */
public class w0 extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f370300i;

    public w0(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, java.util.ArrayList arrayList) {
        super(abstractC1104xc1ad431d, 0);
        this.f370300i = arrayList;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f370300i.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        java.util.ArrayList arrayList = this.f370300i;
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(i17 % arrayList.size());
    }
}
