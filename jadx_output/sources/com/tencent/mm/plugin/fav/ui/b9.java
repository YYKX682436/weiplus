package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class b9 implements com.tencent.mm.plugin.fav.ui.dc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100522a;

    public b9(com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f100522a = daVar;
    }

    @Override // com.tencent.mm.plugin.fav.ui.dc
    public final void a() {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100522a;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar.c();
        ym5.a1.f(new com.tencent.mm.plugin.fav.ui.a9(daVar));
    }
}
