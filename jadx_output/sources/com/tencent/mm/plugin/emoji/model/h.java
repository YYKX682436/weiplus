package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes11.dex */
public final class h implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f97549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z12.w f97550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.model.l f97551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97552g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f97553h;

    public h(kotlin.jvm.internal.h0 h0Var, z12.w wVar, com.tencent.mm.plugin.emoji.model.l lVar, java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f97549d = h0Var;
        this.f97550e = wVar;
        this.f97551f = lVar;
        this.f97552g = str;
        this.f97553h = qVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.n().f273288b.q(413, (com.tencent.mm.modelbase.u0) this.f97549d.f310123d);
        z12.w wVar = this.f97550e;
        if (kotlin.jvm.internal.o.b(m1Var, wVar)) {
            kotlinx.coroutines.q qVar = this.f97553h;
            java.lang.String str2 = this.f97552g;
            com.tencent.mm.plugin.emoji.model.l lVar = this.f97551f;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.i(lVar.f97574c, "removeOne: " + str2 + " fail");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception())));
                return;
            }
            com.tencent.mars.xlog.Log.i(lVar.f97574c, "removeOne: " + str2 + " success");
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().b().L0(wVar.f469378f);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        }
    }
}
