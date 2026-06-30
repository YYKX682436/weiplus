package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class n2 implements com.tencent.mm.plugin.fav.ui.dc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.o2 f101286a;

    public n2(com.tencent.mm.plugin.fav.ui.o2 o2Var) {
        this.f101286a = o2Var;
    }

    @Override // com.tencent.mm.plugin.fav.ui.dc
    public void a() {
        com.tencent.mm.plugin.fav.ui.o2 o2Var = this.f101286a;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = o2Var.f101314f.f101332a.f100335o;
        if (cVar != null) {
            cVar.c();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.m2(this));
            o2Var.f101314f.f101332a.Z6(6, 0, false);
        }
    }
}
