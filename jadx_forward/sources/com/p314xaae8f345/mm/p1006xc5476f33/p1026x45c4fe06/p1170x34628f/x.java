package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 {

    /* renamed from: J, reason: collision with root package name */
    public final qi1.d f168772J;
    public boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        qi1.d dVar = new qi1.d(new android.content.MutableContextWrapper(context));
        this.f168772J = dVar;
        qi1.a aVar = qi1.a.f445012d;
        if (T()) {
            dVar.m160175x609ab971(false);
            dVar.m160176xcd835f96(aVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void N(int i17, int i18) {
        if (T()) {
            try {
                mo120188x874abeed(i17, i18);
            } finally {
                this.B = true;
            }
        }
        if (this.K) {
            java.lang.String msg = "setAppBrandWebViewContentsSize width:" + i17 + " height:" + i18;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getPageView */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo52157xaf156f4a() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWrapperView */
    public android.view.View mo14669x50cdf8a2() {
        android.view.View mo14669x50cdf8a2 = super.mo14669x50cdf8a2();
        qi1.d dVar = this.f168772J;
        if (dVar.getChildAt(0) != mo14669x50cdf8a2) {
            dVar.removeAllViews();
            dVar.addView(mo14669x50cdf8a2);
            dVar.setLayoutParams(new p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams(-1, -1));
        }
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (getContext() instanceof android.content.MutableContextWrapper) {
            android.content.MutableContextWrapper mutableContextWrapper = (android.content.MutableContextWrapper) getContext();
            if (mutableContextWrapper.getBaseContext() != context) {
                mutableContextWrapper.setBaseContext(context);
            }
        }
        android.content.Context context2 = this.f168772J.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.content.MutableContextWrapper");
        ((android.content.MutableContextWrapper) context2).setBaseContext(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandWebViewContentsSizeLogEnabled */
    public void mo52161x9ae7be9(boolean z17) {
        this.K = z17;
    }

    /* renamed from: setContentsMaxVisibleHeightProvider */
    public final void m52244x8616ac02(qi1.b bVar) {
        if (T()) {
            this.f168772J.m160177xda08b054(bVar);
        }
    }

    /* renamed from: setFixSizeEnable */
    public final void m52245x2b7b6197(boolean z17) {
        qi1.a aVar = qi1.a.f445012d;
        if (T()) {
            qi1.d dVar = this.f168772J;
            dVar.m160175x609ab971(z17);
            dVar.m160176xcd835f96(aVar);
        }
    }
}
