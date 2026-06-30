package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s f173179b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r f173180a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r(null);

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        if (fbVar == null) {
            return;
        }
        this.f173180a.f173173a.delete(fbVar.hashCode());
        try {
            fbVar.mo14669x50cdf8a2().setFocusable(true);
            fbVar.mo14669x50cdf8a2().setFocusableInTouchMode(true);
            fbVar.mo14662xc2a54588().setFocusable(true);
            fbVar.mo14662xc2a54588().setFocusableInTouchMode(true);
        } catch (java.lang.NullPointerException unused) {
        }
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        if (fbVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r rVar = this.f173180a;
        rVar.f173173a.put(fbVar.hashCode(), rVar.f173173a.get(fbVar.hashCode(), 0) + 1);
        try {
            fbVar.mo14669x50cdf8a2().setFocusable(false);
            fbVar.mo14669x50cdf8a2().setFocusableInTouchMode(false);
            fbVar.mo14662xc2a54588().setFocusable(false);
            fbVar.mo14662xc2a54588().setFocusableInTouchMode(false);
            if (fbVar.mo14669x50cdf8a2() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) fbVar.mo14669x50cdf8a2()).setDescendantFocusability(393216);
            }
        } catch (java.lang.NullPointerException unused) {
        }
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        if (fbVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r rVar = this.f173180a;
        int i17 = rVar.f173173a.get(fbVar.hashCode(), 0) - 1;
        if (i17 <= 0) {
            a(fbVar);
        } else {
            rVar.f173173a.put(fbVar.hashCode(), i17);
        }
    }
}
