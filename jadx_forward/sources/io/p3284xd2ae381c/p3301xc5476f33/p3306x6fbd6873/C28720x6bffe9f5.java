package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.PlatformViewRegistryImpl */
/* loaded from: classes15.dex */
public class C28720x6bffe9f5 implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 {

    /* renamed from: viewFactories */
    private final java.util.Map<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12> f71796x8cf4f603 = new java.util.HashMap();

    /* renamed from: getFactory */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 m138697xfcb86cd4(java.lang.String str) {
        return this.f71796x8cf4f603.get(str);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635
    /* renamed from: registerViewFactory */
    public boolean mo138696x7b3a4002(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 abstractC28718x54958c12) {
        if (this.f71796x8cf4f603.containsKey(str)) {
            return false;
        }
        this.f71796x8cf4f603.put(str, abstractC28718x54958c12);
        return true;
    }
}
