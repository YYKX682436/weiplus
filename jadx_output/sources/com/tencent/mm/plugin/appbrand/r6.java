package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class r6 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f87757e;

    public r6(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.Runnable runnable) {
        this.f87757e = o6Var;
        this.f87756d = runnable;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.DESTROYED == bVar) {
            this.f87756d.run();
        }
    }
}
