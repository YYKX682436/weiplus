package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.y4 f108477d = new com.tencent.mm.plugin.finder.feed.model.y4();

    public y4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        so2.h1 h1Var = it instanceof so2.h1 ? (so2.h1) it : null;
        return java.lang.Boolean.valueOf(((h1Var == null || (feedObject = h1Var.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? 1 : liveInfo.getInteger(2)) != 1);
    }
}
