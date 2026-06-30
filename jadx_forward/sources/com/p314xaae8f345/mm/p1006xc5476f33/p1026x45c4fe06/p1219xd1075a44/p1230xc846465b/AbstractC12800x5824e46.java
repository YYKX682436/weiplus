package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView */
/* loaded from: classes7.dex */
public abstract class AbstractC12800x5824e46 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k0 f173415b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c2 f173416c2;

    public AbstractC12800x5824e46(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract void g1();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: getAdapter */
    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19();

    /* renamed from: getCount */
    public abstract int mo53619x7444f759();

    /* renamed from: getOnItemClickListener */
    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h0 mo53620x536a1ab4();

    /* renamed from: getRefreshListener */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k0 m53621x85048279() {
        return this.f173415b2;
    }

    /* renamed from: getSceneFactory */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c2 m53622x9e8ccd54() {
        return this.f173416c2;
    }

    /* renamed from: setDataQuery */
    public abstract void mo53623x4553a4fc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.i0 i0Var);

    /* renamed from: setOnItemClickListener */
    public abstract void mo53624xa1aeda28(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h0 h0Var);

    /* renamed from: setRefreshListener */
    public void m53625xbbdb1bed(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k0 k0Var) {
        this.f173415b2 = k0Var;
    }

    /* renamed from: setSceneFactory */
    public void m53626xd4d5c860(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c2 c2Var) {
        this.f173416c2 = c2Var;
    }

    public AbstractC12800x5824e46(android.content.Context context) {
        super(context, null);
    }
}
