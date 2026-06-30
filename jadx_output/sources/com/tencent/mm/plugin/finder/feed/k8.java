package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public interface k8 {
    static /* synthetic */ void Q1(com.tencent.mm.plugin.finder.feed.k8 k8Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, int i17, r45.qt2 qt2Var, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFollow");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            qt2Var = null;
        }
        k8Var.n0(baseFinderFeed, z17, i17, qt2Var);
    }

    db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var);

    default boolean A3() {
        return false;
    }

    db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, in5.s0 s0Var, yz5.a aVar);

    cw2.f8 H1();

    db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, in5.s0 s0Var);

    default com.tencent.mm.plugin.finder.view.FinderLikeDrawer W3() {
        return null;
    }

    void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var);

    db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var);

    default java.lang.String b2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        return "";
    }

    db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var);

    boolean d0();

    default boolean e0() {
        return false;
    }

    androidx.recyclerview.widget.y2 e2();

    com.tencent.mm.ui.MMActivity getActivity();

    com.tencent.mm.plugin.finder.view.f5 j2();

    void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, int i17, r45.qt2 qt2Var);

    default void o0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var);

    void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed);

    default com.tencent.mm.plugin.finder.view.FinderLikeDrawer s6() {
        return null;
    }

    void u2(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var);

    db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17);

    default boolean z5() {
        return false;
    }

    db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var);
}
