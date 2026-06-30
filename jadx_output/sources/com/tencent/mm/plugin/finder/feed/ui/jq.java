package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class jq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        super(0);
        this.f110205d = selectLocalFileRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteCacheFile: curUploadingPath=");
        com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI = this.f110205d;
        sb6.append(selectLocalFileRouterUI.f109637o);
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", sb6.toString());
        if ((selectLocalFileRouterUI.f109637o.length() > 0) && r26.n0.D(selectLocalFileRouterUI.f109637o, com.tencent.mm.plugin.finder.assist.e9.f102143l, false, 2, null)) {
            com.tencent.mm.vfs.w6.h(selectLocalFileRouterUI.f109637o);
        }
        return jz5.f0.f302826a;
    }
}
