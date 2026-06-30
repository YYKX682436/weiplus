package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.g0 f67151d;

    public f0(com.tencent.mm.feature.lite.g0 g0Var) {
        this.f67151d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        q80.f0 f0Var = this.f67151d.f67154b;
        if (f0Var != null) {
            f0Var.fail();
        }
    }
}
