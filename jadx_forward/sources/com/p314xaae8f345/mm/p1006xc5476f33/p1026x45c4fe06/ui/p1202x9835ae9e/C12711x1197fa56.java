package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionVerticalSortList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList */
/* loaded from: classes7.dex */
public final class C12711x1197fa56 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f171182m = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f171183h;

    /* renamed from: i, reason: collision with root package name */
    public xj1.x f171184i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment
    /* renamed from: getLayoutId */
    public int mo52909x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569550ei;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment
    /* renamed from: initView */
    public void mo52910x10010bd5() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395) this.f170902g.findViewById(android.R.id.list);
        this.f171183h = c22722xd3be5395;
        if (c22722xd3be5395 != null) {
            c22722xd3be5395.m82185x4578645(new xj1.p(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be53952 = this.f171183h;
        if (c22722xd3be53952 != null) {
            c22722xd3be53952.m82189xa7c1925a(new xj1.q(this));
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7436x8619eaa0);
        java.util.ArrayList parcelableArrayList = m7436x8619eaa0.getParcelableArrayList("KEY_SORT_DATA_LIST");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(parcelableArrayList);
        xj1.x xVar = new xj1.x(mo7430x19263085, parcelableArrayList);
        this.f171184i = xVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be53953 = this.f171183h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22722xd3be53953);
        xVar.f536355e = c22722xd3be53953;
        c22722xd3be53953.setAdapter((android.widget.ListAdapter) xVar);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78494xd9193382(0, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571831r3), new xj1.s(this), null, com.p314xaae8f345.mm.ui.fb.BLACK);
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = mo7430x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x192630852 : null;
        if (abstractActivityC21394xb3d2c0cf2 != null) {
            abstractActivityC21394xb3d2c0cf2.mo74406x9c8c0d33(new xj1.t(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        }
    }
}
