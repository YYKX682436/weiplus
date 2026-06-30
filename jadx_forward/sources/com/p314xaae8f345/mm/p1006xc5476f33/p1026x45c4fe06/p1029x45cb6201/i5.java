package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f157123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j5 f157124e;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j5 j5Var, yz5.a aVar) {
        this.f157124e = j5Var;
        this.f157123d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f157123d.mo152xb9724478();
        java.lang.Runnable runnable = this.f157124e.f157143d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
