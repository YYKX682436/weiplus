package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class xe implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.ui.xe f110733a = new com.tencent.mm.plugin.finder.feed.ui.xe();

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        boolean z17 = false;
        if (k0Var != null && (jf0Var = (com.tencent.mm.plugin.finder.live.plugin.jf0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.jf0.class)) != null && jf0Var.w0() == 0) {
            z17 = true;
        }
        return z17 ? kz5.b1.e(new jz5.l("page_type", 1)) : kz5.q0.f314001d;
    }
}
