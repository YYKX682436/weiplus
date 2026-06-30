package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes13.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f90492a;

    /* renamed from: b, reason: collision with root package name */
    public long f90493b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.j2 f90494c;

    public k2(long j17, com.tencent.mm.plugin.appbrand.utils.j2 j2Var) {
        this.f90492a = j17;
        this.f90494c = j2Var;
    }

    public boolean a(java.lang.Object... objArr) {
        com.tencent.mm.plugin.appbrand.utils.j2 j2Var;
        if ((java.lang.System.currentTimeMillis() - this.f90493b < this.f90492a) || (j2Var = this.f90494c) == null) {
            return false;
        }
        boolean onAction = j2Var.onAction(objArr);
        if (onAction) {
            this.f90493b = java.lang.System.currentTimeMillis();
        }
        return onAction;
    }
}
