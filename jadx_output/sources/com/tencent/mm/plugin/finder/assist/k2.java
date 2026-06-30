package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.k2 f102306a = new com.tencent.mm.plugin.finder.assist.k2();

    public final void a(com.tencent.mm.plugin.finder.storage.FinderItem item) {
        java.lang.String nickname;
        java.lang.String headUrl;
        kotlin.jvm.internal.o.g(item, "item");
        d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
        i95.m c17 = i95.n0.c(b70.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.protocal.protobuf.FinderContact contact = item.getFeedObject().getContact();
        java.lang.String str = (contact == null || (headUrl = contact.getHeadUrl()) == null) ? "" : headUrl;
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = item.getFeedObject().getContact();
        java.lang.String str2 = (contact2 == null || (nickname = contact2.getNickname()) == null) ? "" : nickname;
        java.lang.String u17 = pm0.v.u(item.getId());
        java.lang.String nonceId = item.getObjectNonceId();
        java.lang.String key = com.tencent.mm.plugin.handoff.model.HandOff.Companion.a(7, 1);
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(key, "key");
        iVar.f6(new com.tencent.mm.plugin.handoff.model.HandOffFinderFeed(str, str2, u17, nonceId, 1, "", "", key));
    }

    public final void b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        db5.t7.i(context, i65.a.r(context, com.tencent.mm.R.string.mry), com.tencent.mm.R.raw.icons_outlined_colorful_handoff_success);
    }
}
