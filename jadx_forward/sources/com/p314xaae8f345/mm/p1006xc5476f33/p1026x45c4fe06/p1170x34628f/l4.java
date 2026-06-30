package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f168385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168387g;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, java.lang.String str, boolean z17, java.lang.String str2) {
        this.f168387g = i3Var;
        this.f168384d = str;
        this.f168385e = z17;
        this.f168386f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f168387g.z(this.f168384d, this.f168385e ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.RE_LAUNCH, null, this.f168386f);
    }
}
