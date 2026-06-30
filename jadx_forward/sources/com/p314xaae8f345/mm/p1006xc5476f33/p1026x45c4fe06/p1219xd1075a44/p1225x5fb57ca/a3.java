package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 f172817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172819f;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var, int i17, int i18) {
        this.f172817d = b3Var;
        this.f172818e = i17;
        this.f172819f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = this.f172817d;
        b3Var.getClass();
        int i18 = this.f172818e;
        if (i18 < 0 || (i17 = this.f172819f) < 0 || i18 > i17) {
            return;
        }
        try {
            b3Var.f172899w.setSelection(i18, i17);
        } catch (java.lang.Exception unused) {
        }
    }
}
