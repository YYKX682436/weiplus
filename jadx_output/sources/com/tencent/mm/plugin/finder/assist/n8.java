package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.n8 f102408a = new com.tencent.mm.plugin.finder.assist.n8();

    /* renamed from: b, reason: collision with root package name */
    public static int f102409b;

    public final void a(r45.nd6 tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.String string = tag.getString(1);
        com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102573s.f102540b)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 10L);
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportPost");
            return;
        }
        if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.C.f102540b)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 11L);
            com.tencent.mm.plugin.finder.assist.p8 p8Var2 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportCancel");
            return;
        }
        if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102575u.f102540b)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 12L);
            b(tag);
            com.tencent.mm.plugin.finder.assist.p8 p8Var3 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportFailedCreateLive");
            return;
        }
        if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102578x.f102540b)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 13L);
            b(tag);
            com.tencent.mm.plugin.finder.assist.p8 p8Var4 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportFailedJoinLive");
            return;
        }
        if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102580z.f102540b)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 14L);
            com.tencent.mm.plugin.finder.assist.p8 p8Var5 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportFailedEnterRoom");
            return;
        }
        if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.B.f102540b)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 15L);
            com.tencent.mm.plugin.finder.assist.p8 p8Var6 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportFailedShareFeed");
        } else if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102576v.f102540b)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 16L);
            com.tencent.mm.plugin.finder.assist.p8 p8Var7 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportRecheckRealName");
        } else if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.D.f102540b)) {
            f102409b = 1;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 17L);
            com.tencent.mm.plugin.finder.assist.p8 p8Var8 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportSuccLive");
        }
    }

    public final void b(r45.nd6 nd6Var) {
        com.tencent.mm.protobuf.g byteString = nd6Var.getByteString(4);
        if (byteString != null) {
            r45.l84 l84Var = new r45.l84();
            try {
                l84Var.parseFrom(byteString.g());
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                l84Var = null;
            }
            if (l84Var != null) {
                int integer = l84Var.getInteger(1);
                if (integer == -100038) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 40L);
                    return;
                }
                switch (integer) {
                    case -200018:
                    case -200017:
                        break;
                    default:
                        switch (integer) {
                            case -200013:
                                break;
                            case -200012:
                            case -200011:
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 41L);
                                return;
                            case -200010:
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 44L);
                                return;
                            case -200009:
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 43L);
                                return;
                            default:
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 45L);
                                return;
                        }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 42L);
            }
        }
    }
}
