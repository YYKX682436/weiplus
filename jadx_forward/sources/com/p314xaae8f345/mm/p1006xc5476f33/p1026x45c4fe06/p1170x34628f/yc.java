package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class yc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi1.a f168827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ad f168828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f168829f;

    public yc(pi1.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ad adVar, android.content.res.Configuration configuration) {
        this.f168827d = aVar;
        this.f168828e = adVar;
        this.f168829f = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xi1.g mo50261xee5260a9 = this.f168828e.f167945a.mo50261xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50261xee5260a9);
        this.f168827d.e(mo50261xee5260a9.mo51620x1ab1e3d4(), this.f168829f.orientation);
    }
}
