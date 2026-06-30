package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public class b implements com.tencent.mm.plugin.expansions.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expansions.f f99741a;

    public b(com.tencent.mm.plugin.expansions.f fVar) {
        this.f99741a = fVar;
    }

    @Override // com.tencent.mm.plugin.expansions.e
    public void onSuccess(java.lang.String str) {
        com.tencent.mm.plugin.expansions.h0 c17 = com.tencent.mm.plugin.expansions.h0.c();
        com.tencent.mm.plugin.expansions.f fVar = this.f99741a;
        fVar.f99749e = c17;
        fVar.f99748d.countDown();
    }
}
