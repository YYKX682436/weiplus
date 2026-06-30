package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class k1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 f173054a;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var) {
        this.f173054a = h1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f173054a;
        ql1.a aVar = h1Var.f173005p;
        if (aVar != null) {
            if (!z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) aVar).e(h1Var, false, 0);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) aVar).e(h1Var, true, h1Var.f173001i);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5
    public int b() {
        return this.f173054a.f173001i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f173054a;
        ql1.a aVar = h1Var.f173005p;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) aVar).e(h1Var, i17 > 0, i17);
        }
        h1Var.f173001i = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5
    /* renamed from: getActivity */
    public android.app.Activity mo53487x19263085() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f173054a;
        java.lang.ref.WeakReference weakReference = h1Var.f173000h;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (android.app.Activity) h1Var.f173000h.get();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5
    /* renamed from: getContentView */
    public android.view.View mo53488xc2a54588() {
        return this.f173054a;
    }
}
