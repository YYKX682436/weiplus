package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public class r implements l30.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expansions.s f99773a;

    public r(com.tencent.mm.plugin.expansions.s sVar) {
        this.f99773a = sVar;
    }

    @Override // l30.g
    public void a(z95.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsGlobal", "#onSuccess, expansions is ready");
        this.f99773a.f99774d.apply(java.lang.Boolean.TRUE);
    }
}
