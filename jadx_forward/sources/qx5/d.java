package qx5;

/* loaded from: classes13.dex */
public class d extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final qx5.y f449020i;

    public d(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, qx5.y yVar) {
        super(abstractC1104xc1ad431d, 0);
        this.f449020i = yVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return 4;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        qx5.y yVar = this.f449020i;
        if (i17 == 0) {
            return new com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27826x7bb4b22f(yVar);
        }
        if (i17 == 1) {
            return new com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27829x77570dc3(yVar);
        }
        if (i17 == 2) {
            return new com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27827x7bb7673e(yVar);
        }
        if (i17 == 3) {
            return new com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27828xb1690eb4(yVar);
        }
        return null;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        if (i17 == 0) {
            return "内核调试";
        }
        if (i17 == 1) {
            return "插件调试";
        }
        if (i17 == 2) {
            return "调试信息";
        }
        if (i17 == 3) {
            return "初始日志";
        }
        return null;
    }
}
