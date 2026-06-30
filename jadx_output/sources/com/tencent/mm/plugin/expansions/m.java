package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public class m implements l30.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expansions.n f99764a;

    public m(com.tencent.mm.plugin.expansions.n nVar) {
        this.f99764a = nVar;
    }

    @Override // l30.g
    public void a(z95.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsGlobal", "#onSuccess, expansions is ready");
        this.f99764a.f99768d.apply(1);
    }
}
