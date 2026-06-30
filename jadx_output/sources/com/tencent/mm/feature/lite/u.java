package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.v f67273d;

    public u(com.tencent.mm.feature.lite.v vVar) {
        this.f67273d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        q80.f0 f0Var = this.f67273d.f67276d;
        if (f0Var != null) {
            f0Var.fail();
        }
    }
}
