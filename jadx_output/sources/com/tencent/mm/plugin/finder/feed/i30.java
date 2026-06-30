package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes4.dex */
public final class i30 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.j30 f106987d;

    public i30(com.tencent.mm.plugin.finder.feed.j30 j30Var) {
        this.f106987d = j30Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.feed.j30 j30Var = this.f106987d;
        if (j30Var.f107080c) {
            j30Var.f107081d = null;
            j30Var.f107080c = false;
            ((com.tencent.mm.plugin.finder.feed.h7) j30Var.f107078a).b(1, -1, null, j30Var.f107079b, null);
        }
        return false;
    }
}
