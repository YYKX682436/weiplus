package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dt {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.dt f106586a = new com.tencent.mm.plugin.finder.feed.dt();

    public final boolean a(int i17) {
        bs2.b0 b0Var;
        db2.c3 c3Var;
        java.util.LinkedList list;
        bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(i17);
        return (R6 == null || (b0Var = R6.f23925s) == null || (c3Var = b0Var.f23806b) == null || (list = c3Var.getList(1)) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public final boolean b(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H5).getValue()).r()).intValue() != 1) {
                return false;
            }
        } else if (i17 == 3) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F5).getValue()).r()).intValue() != 1) {
                return false;
            }
        } else {
            if (i17 != 4) {
                return false;
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var3 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.D5).getValue()).r()).intValue() != 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.I5).getValue()).r()).intValue() != 1) {
                return false;
            }
        } else if (i17 == 3) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G5).getValue()).r()).intValue() != 1) {
                return false;
            }
        } else {
            if (i17 != 4) {
                return false;
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var3 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E5).getValue()).r()).intValue() != 1) {
                return false;
            }
        }
        return true;
    }
}
