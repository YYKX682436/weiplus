package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class q4 implements com.tencent.mm.plugin.fav.ui.dc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.r4 f101352a;

    public q4(com.tencent.mm.plugin.fav.ui.r4 r4Var) {
        this.f101352a = r4Var;
    }

    @Override // com.tencent.mm.plugin.fav.ui.dc
    public void a() {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f101352a.f101373f.f101434a.f100400n;
        if (cVar != null) {
            cVar.c();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.p4(this));
        }
    }
}
