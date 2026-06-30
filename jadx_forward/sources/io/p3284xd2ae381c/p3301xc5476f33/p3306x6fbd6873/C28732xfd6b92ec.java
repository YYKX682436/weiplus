package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.PlatformViewsControllerDelegator */
/* loaded from: classes15.dex */
public class C28732xfd6b92ec implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218 {

    /* renamed from: platformViewsController */
    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 f71851x15cba3b7;

    /* renamed from: platformViewsController2 */
    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b f71852xa3a8d35b;

    public C28732xfd6b92ec(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b) {
        this.f71851x15cba3b7 = c28724xcf987b97;
        this.f71852xa3a8d35b = c28730x2376f77b;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: attachAccessibilityBridge */
    public void mo138623x58b57ff2(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657) {
        this.f71851x15cba3b7.mo138623x58b57ff2(c28974x81a86657);
        this.f71852xa3a8d35b.mo138623x58b57ff2(c28974x81a86657);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: detachAccessibilityBridge */
    public void mo138634x212f07e4() {
        this.f71851x15cba3b7.mo138634x212f07e4();
        this.f71852xa3a8d35b.mo138634x212f07e4();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: getPlatformViewById */
    public android.view.View mo138639xbd854120(int i17) {
        return this.f71852xa3a8d35b.mo138639xbd854120(i17) != null ? this.f71852xa3a8d35b.mo138639xbd854120(i17) : this.f71851x15cba3b7.mo138639xbd854120(i17);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: usesVirtualDisplay */
    public boolean mo138654x756fc223(int i17) {
        return this.f71852xa3a8d35b.mo138639xbd854120(i17) != null ? this.f71852xa3a8d35b.mo138654x756fc223(i17) : this.f71851x15cba3b7.mo138654x756fc223(i17);
    }
}
