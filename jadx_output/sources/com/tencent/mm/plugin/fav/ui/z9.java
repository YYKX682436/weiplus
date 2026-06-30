package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f101675d;

    public z9(com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f101675d = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "do refresh job");
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101675d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar.c();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
        if (cVar2 != null) {
            cVar2.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
    }
}
