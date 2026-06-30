package i53;

/* loaded from: classes8.dex */
public class z1 extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f370336i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.a2 f370337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(i53.a2 a2Var, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, java.util.LinkedList linkedList) {
        super(abstractC1104xc1ad431d, 0);
        this.f370337m = a2Var;
        this.f370336i = linkedList;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f370336i.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15910x98b51341((p33.e0) this.f370336i.get(i17), i17, this.f370337m.f370042t);
    }
}
