package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class m5 implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.q2 f90512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f90513b;

    public m5(com.tencent.mm.plugin.appbrand.utils.q2 q2Var, boolean z17) {
        this.f90512a = q2Var;
        this.f90513b = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this.f90512a.a(str, true ^ this.f90513b);
    }
}
