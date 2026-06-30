package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class w7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.performance.a f90953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f90954e;

    public w7(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.performance.a aVar) {
        this.f90954e = o6Var;
        this.f90953d = aVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.performance.h.b(this.f90954e, this.f90953d);
        return true;
    }
}
