package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class h implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m f107899d;

    public h(com.tencent.mm.plugin.finder.feed.model.m mVar) {
        this.f107899d = mVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        com.tencent.mm.plugin.finder.feed.model.m mVar = this.f107899d;
        if (i17 == 1000) {
            com.tencent.mm.plugin.finder.feed.model.m.a(mVar, it);
            return true;
        }
        if (i17 == 1003) {
            com.tencent.mm.plugin.finder.feed.model.m.a(mVar, it);
            return true;
        }
        if (i17 != 1001) {
            return true;
        }
        java.lang.Object obj = it.obj;
        jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
        com.tencent.mm.plugin.finder.feed.model.m.b(mVar, lVar != null ? (java.util.ArrayList) lVar.f302833d : null, 15);
        com.tencent.mm.plugin.finder.feed.model.m.b(mVar, lVar != null ? (java.util.ArrayList) lVar.f302834e : null, 16);
        return true;
    }
}
