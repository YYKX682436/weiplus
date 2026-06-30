package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f173079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 f173080f;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var, int i17, boolean z17) {
        this.f173080f = u3Var;
        this.f173078d = i17;
        this.f173079e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var = this.f173080f;
        int i18 = u3Var.f173215o;
        if (u3Var.isShown()) {
            u3Var.f173215o = this.f173078d;
        } else {
            u3Var.f173215o = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r3 r3Var = u3Var.f173214n;
        if (r3Var == null || i18 == (i17 = u3Var.f173215o) || this.f173079e) {
            return;
        }
        r3Var.a(i17);
    }
}
