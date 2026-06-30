package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d a(android.content.Intent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "intent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "TAB_LIST"
            java.util.ArrayList r0 = r9.getIntegerArrayListExtra(r0)
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L12:
            java.lang.String r1 = "BIZ_SCENE"
            r2 = 0
            int r1 = r9.getIntExtra(r1, r2)
            java.lang.String r3 = "EXT_BUFF"
            byte[] r3 = r9.getByteArrayExtra(r3)
            com.tencent.mm.protocal.protobuf.FinderObject r4 = new com.tencent.mm.protocal.protobuf.FinderObject
            r4.<init>()
            java.lang.String r5 = "LAST_SELECTED_OBJECT"
            byte[] r5 = r9.getByteArrayExtra(r5)
            r6 = 0
            if (r5 != 0) goto L2f
        L2d:
            r4 = r6
            goto L40
        L2f:
            r4.mo11468x92b714fd(r5)     // Catch: java.lang.Exception -> L33
            goto L40
        L33:
            r4 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r7 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r7, r5, r4)
            goto L2d
        L40:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "createGalleryConfig, bizScene:"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = ", tabList size:"
            r5.append(r6)
            int r6 = r0.size()
            r5.append(r6)
            java.lang.String r6 = ", extBuff:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Finder.FinderGalleryConfig"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r5)
            r5 = 1
            if (r1 == r5) goto Lc3
            r5 = 2
            if (r1 == r5) goto Lb8
            r5 = 3
            if (r1 == r5) goto Lad
            r5 = 6
            if (r1 == r5) goto L8c
            r9 = 7
            if (r1 == r9) goto L81
            com.tencent.mm.plugin.finder.gallery.m r9 = new com.tencent.mm.plugin.finder.gallery.m
            com.tencent.mm.plugin.finder.gallery.a r2 = new com.tencent.mm.plugin.finder.gallery.a
            r2.<init>(r0, r1, r3, r4)
            r9.<init>(r2)
            goto Lcd
        L81:
            com.tencent.mm.plugin.finder.gallery.v r9 = new com.tencent.mm.plugin.finder.gallery.v
            com.tencent.mm.plugin.finder.gallery.a r2 = new com.tencent.mm.plugin.finder.gallery.a
            r2.<init>(r0, r1, r3, r4)
            r9.<init>(r2)
            goto Lcd
        L8c:
            com.tencent.mm.plugin.finder.gallery.a r5 = new com.tencent.mm.plugin.finder.gallery.a
            r5.<init>(r0, r1, r3, r4)
            java.lang.String r0 = "MINI_DURATION"
            int r0 = r9.getIntExtra(r0, r2)
            long r0 = (long) r0
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            r5.f192879e = r0
            java.lang.String r0 = "MAX_DURATION"
            int r9 = r9.getIntExtra(r0, r2)
            long r0 = (long) r9
            long r0 = r0 * r3
            r5.f192880f = r0
            com.tencent.mm.plugin.finder.gallery.y r9 = new com.tencent.mm.plugin.finder.gallery.y
            r9.<init>(r5)
            goto Lcd
        Lad:
            com.tencent.mm.plugin.finder.gallery.g0 r9 = new com.tencent.mm.plugin.finder.gallery.g0
            com.tencent.mm.plugin.finder.gallery.a r2 = new com.tencent.mm.plugin.finder.gallery.a
            r2.<init>(r0, r1, r3, r4)
            r9.<init>(r2)
            goto Lcd
        Lb8:
            com.tencent.mm.plugin.finder.gallery.e0 r9 = new com.tencent.mm.plugin.finder.gallery.e0
            com.tencent.mm.plugin.finder.gallery.a r2 = new com.tencent.mm.plugin.finder.gallery.a
            r2.<init>(r0, r1, r3, r4)
            r9.<init>(r2)
            goto Lcd
        Lc3:
            com.tencent.mm.plugin.finder.gallery.n0 r9 = new com.tencent.mm.plugin.finder.gallery.n0
            com.tencent.mm.plugin.finder.gallery.a r2 = new com.tencent.mm.plugin.finder.gallery.a
            r2.<init>(r0, r1, r3, r4)
            r9.<init>(r2)
        Lcd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b.a(android.content.Intent):com.tencent.mm.plugin.finder.gallery.d");
    }
}
