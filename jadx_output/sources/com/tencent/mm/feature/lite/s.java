package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.t f67262d;

    public s(com.tencent.mm.feature.lite.t tVar) {
        this.f67262d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        q80.f0 f0Var = this.f67262d.f67268d;
        if (f0Var != null) {
            f0Var.fail();
        }
    }
}
