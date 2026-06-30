package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.ipcinvoker.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.h f47637a;

    public f(com.tencent.luggage.sdk.processes.h hVar) {
        this.f47637a = hVar;
    }

    @Override // com.tencent.mm.ipcinvoker.s0
    public final void a() {
        boolean l17 = this.f47637a.l();
        if (l17) {
            this.f47637a.a();
        }
        this.f47637a.f47641b.set(false);
        ((com.tencent.mm.plugin.appbrand.task.k) this.f47637a).f89083n = false;
        com.tencent.mars.xlog.Log.i("Luggage.LuggageMiniProgramProcess", "[%s] died, isAliveBefore[%b]", this.f47637a.i(), java.lang.Boolean.valueOf(l17));
    }
}
