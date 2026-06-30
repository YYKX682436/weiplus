package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class t9 extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.w("LoaderStateStore", "onEnterBackground");
        com.tencent.mm.plugin.finder.feed.model.x9 x9Var = com.tencent.mm.plugin.finder.feed.model.y9.f108486g;
        if (x9Var.b()) {
            x9Var.a().a();
        } else {
            com.tencent.mm.plugin.finder.feed.model.y9.f108487h.clear();
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
