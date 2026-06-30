package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.s7 f102538a = new com.tencent.mm.plugin.finder.assist.s7();

    public boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
        return ((j37 != null ? j37.field_extFlag : 0) & 262144) != 0;
    }

    public boolean b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        i95.m c17 = i95.n0.c(l40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int dh6 = l40.e.dh((l40.e) c17, context, null, 2, null);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R0).getValue()).r()).intValue();
        if (intValue == 1) {
            isTeenMode = true;
        } else if (intValue == 2) {
            dh6 = 1;
        } else if (intValue == 3) {
            dh6 = 4;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderSwitchApi", "showFinderEntryAtWxMe teenMode:" + isTeenMode + ", state:" + dh6);
        if (isTeenMode) {
            return false;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("finder");
        boolean z17 = xy2.c.e(context).length() > 0;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.S0).getValue()).r()).intValue() == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSwitchApi", "ME_FINDER_ENTRY_INDEPENDENCE_SWITCH hasCreatedIdentity:" + z17);
            return z17;
        }
        if (dh6 == 1 || dh6 == 4 || dh6 == 5) {
            return false;
        }
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Z0).getValue()).r()).intValue();
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.T0).getValue()).r()).intValue() == 1;
        boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U0).getValue()).r()).intValue() == 1;
        boolean z27 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V0).getValue()).r()).intValue() == 1;
        boolean a17 = a(context);
        boolean z28 = (c01.z1.j() & 34359738368L) != 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderSwitchApi", "[showFinderEntryAtWxMe] enable:" + intValue2 + ", switchA:" + z18 + ", switchB:" + z19 + ", switchC:" + z27 + ", showFinderAtWxProfile:" + a17 + " hasCreatedIdentity:" + z17 + " isCloseInFindMorePage:" + z28);
        if (intValue2 != 0) {
            return intValue2 == 1 && z17 && !z28;
        }
        if (z18) {
            return true;
        }
        return z19 && z27 && a17;
    }

    public boolean c() {
        boolean vk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V0).getValue()).r()).intValue() == 1;
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        boolean v07 = I1 != null ? I1.v0() : false;
        com.tencent.mars.xlog.Log.i("Finder.FinderSwitchApi", "showFinderEntrySetting hasFinderAccount" + vk6 + ", switch:" + z17 + ", accountLimited: " + v07);
        return vk6 && z17 && !v07;
    }

    public boolean d(zy2.nb nbVar, zy2.nb nbVar2) {
        java.util.HashMap hashMap = com.tencent.mm.plugin.finder.assist.q7.f102487a;
        com.tencent.mm.plugin.finder.assist.r7 r7Var = new com.tencent.mm.plugin.finder.assist.r7(nbVar);
        java.lang.Integer num = (java.lang.Integer) com.tencent.mm.plugin.finder.assist.q7.f102487a.get(1);
        if (num == null) {
            num = 0;
        }
        if (c01.id.e() - num.intValue() > com.tencent.mm.plugin.finder.assist.q7.f102488b) {
            new db2.s1(kz5.b0.c(1)).l().K(new com.tencent.mm.plugin.finder.assist.p7(nbVar2, 1, r7Var));
        }
        return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, 0) == 1;
    }
}
