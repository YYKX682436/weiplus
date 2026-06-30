package c03;

/* loaded from: classes2.dex */
public abstract class i {
    public static final com.tencent.mm.plugin.finder.storage.FinderItem a(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo) {
        com.tencent.mm.protocal.protobuf.FinderObject b17 = b(megaVideoFeedInfo);
        if (b17 == null) {
            return null;
        }
        return com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(b17, 0);
    }

    public static final com.tencent.mm.protocal.protobuf.FinderObject b(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo) {
        byte[] finderObjectData = megaVideoFeedInfo != null ? megaVideoFeedInfo.getFinderObjectData() : null;
        if (finderObjectData == null) {
            return null;
        }
        if (finderObjectData.length == 0) {
            return null;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.parseFrom(finderObjectData);
        return finderObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r1 == null || r1.length() == 0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final so2.u1 c(com.tencent.mm.plugin.finder.storage.FinderItem r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r5, r0)
            so2.u1 r0 = new so2.u1
            r0.<init>(r5)
            ya2.b2 r1 = r0.getContact()
            r2 = 0
            if (r1 == 0) goto L2b
            ya2.b2 r1 = r0.getContact()
            if (r1 == 0) goto L1c
            java.lang.String r1 = r1.D0()
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r1 == 0) goto L28
            int r1 = r1.length()
            if (r1 != 0) goto L26
            goto L28
        L26:
            r1 = 0
            goto L29
        L28:
            r1 = 1
        L29:
            if (r1 == 0) goto L5e
        L2b:
            ya2.b2 r1 = new ya2.b2
            r1.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.getContact()
            if (r3 == 0) goto L3f
            java.lang.String r3 = r3.getUsername()
            goto L40
        L3f:
            r3 = r2
        L40:
            java.lang.String r4 = ""
            if (r3 != 0) goto L45
            r3 = r4
        L45:
            r1.field_username = r3
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.getContact()
            if (r5 == 0) goto L55
            java.lang.String r2 = r5.getNickname()
        L55:
            if (r2 != 0) goto L58
            goto L59
        L58:
            r4 = r2
        L59:
            r1.field_nickname = r4
            r0.a1(r1)
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c03.i.c(com.tencent.mm.plugin.finder.storage.FinderItem):so2.u1");
    }

    public static final so2.u1 d(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo) {
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = a(megaVideoFeedInfo);
        if (a17 == null) {
            return null;
        }
        return c(a17);
    }
}
