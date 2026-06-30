package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class r6 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f169289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f169290e;

    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.Runnable runnable) {
        this.f169290e = o6Var;
        this.f169289d = runnable;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.DESTROYED == bVar) {
            this.f169289d.run();
        }
    }
}
