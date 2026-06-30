package xe2;

/* loaded from: classes3.dex */
public final class w0 extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:15:0x004d, B:21:0x006b, B:23:0x0077, B:24:0x007d, B:26:0x0087, B:27:0x008d, B:29:0x0097, B:30:0x00a0, B:32:0x00ac, B:33:0x00b2, B:35:0x00bc, B:36:0x00c0, B:39:0x00c6, B:48:0x0063, B:18:0x005e), top: B:14:0x004d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:15:0x004d, B:21:0x006b, B:23:0x0077, B:24:0x007d, B:26:0x0087, B:27:0x008d, B:29:0x0097, B:30:0x00a0, B:32:0x00ac, B:33:0x00b2, B:35:0x00bc, B:36:0x00c0, B:39:0x00c6, B:48:0x0063, B:18:0x005e), top: B:14:0x004d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:15:0x004d, B:21:0x006b, B:23:0x0077, B:24:0x007d, B:26:0x0087, B:27:0x008d, B:29:0x0097, B:30:0x00a0, B:32:0x00ac, B:33:0x00b2, B:35:0x00bc, B:36:0x00c0, B:39:0x00c6, B:48:0x0063, B:18:0x005e), top: B:14:0x004d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:15:0x004d, B:21:0x006b, B:23:0x0077, B:24:0x007d, B:26:0x0087, B:27:0x008d, B:29:0x0097, B:30:0x00a0, B:32:0x00ac, B:33:0x00b2, B:35:0x00bc, B:36:0x00c0, B:39:0x00c6, B:48:0x0063, B:18:0x005e), top: B:14:0x004d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:15:0x004d, B:21:0x006b, B:23:0x0077, B:24:0x007d, B:26:0x0087, B:27:0x008d, B:29:0x0097, B:30:0x00a0, B:32:0x00ac, B:33:0x00b2, B:35:0x00bc, B:36:0x00c0, B:39:0x00c6, B:48:0x0063, B:18:0x005e), top: B:14:0x004d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c A[SYNTHETIC] */
    @Override // we2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.LinkedList r11) {
        /*
            r10 = this;
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            gk2.e r1 = r10.f526800a
            java.lang.String r2 = "LiveMsgGameSysNotifyInterceptor"
            java.lang.String r3 = "msgList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r3)
            java.util.Iterator r11 = r11.iterator()
        Lf:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto Ld8
            java.lang.Object r3 = r11.next()
            r45.ch1 r3 = (r45.ch1) r3
            r45.ni1 r4 = new r45.ni1
            r4.<init>()
            r5 = 4
            com.tencent.mm.protobuf.g r3 = r3.m75934xbce7f2f(r5)
            r5 = 0
            if (r3 == 0) goto L2d
            byte[] r3 = r3.g()
            goto L2e
        L2d:
            r3 = r5
        L2e:
            java.lang.String r6 = "safeParser"
            java.lang.String r7 = ""
            if (r3 != 0) goto L36
        L34:
            r4 = r5
            goto L43
        L36:
            r4.mo11468x92b714fd(r3)     // Catch: java.lang.Exception -> L3a
            goto L43
        L3a:
            r3 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r6, r7, r3)
            goto L34
        L43:
            if (r4 == 0) goto Lf
            r3 = 0
            int r8 = r4.m75939xb282bd08(r3)
            r9 = 1
            if (r8 == r9) goto Lf
            r45.rb r8 = new r45.rb     // Catch: java.lang.Exception -> Ld0
            r8.<init>()     // Catch: java.lang.Exception -> Ld0
            java.lang.String r4 = r4.m75945x2fec8307(r9)     // Catch: java.lang.Exception -> Ld0
            byte[] r4 = android.util.Base64.decode(r4, r3)     // Catch: java.lang.Exception -> Ld0
            if (r4 != 0) goto L5e
        L5c:
            r8 = r5
            goto L6b
        L5e:
            r8.mo11468x92b714fd(r4)     // Catch: java.lang.Exception -> L62
            goto L6b
        L62:
            r4 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> Ld0
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r6, r7, r4)     // Catch: java.lang.Exception -> Ld0
            goto L5c
        L6b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld0
            r4.<init>()     // Catch: java.lang.Exception -> Ld0
            java.lang.String r6 = "3dInfo, uid: "
            r4.append(r6)     // Catch: java.lang.Exception -> Ld0
            if (r8 == 0) goto L7c
            java.lang.String r6 = r8.m75945x2fec8307(r3)     // Catch: java.lang.Exception -> Ld0
            goto L7d
        L7c:
            r6 = r5
        L7d:
            r4.append(r6)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r6 = ", content: "
            r4.append(r6)     // Catch: java.lang.Exception -> Ld0
            if (r8 == 0) goto L8c
            java.lang.String r6 = r8.m75945x2fec8307(r9)     // Catch: java.lang.Exception -> Ld0
            goto L8d
        L8c:
            r6 = r5
        L8d:
            r4.append(r6)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r6 = ", jumpInfo: "
            r4.append(r6)     // Catch: java.lang.Exception -> Ld0
            if (r8 == 0) goto L9f
            r6 = 2
            com.tencent.mm.protobuf.f r6 = r8.m75936x14adae67(r6)     // Catch: java.lang.Exception -> Ld0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r6     // Catch: java.lang.Exception -> Ld0
            goto La0
        L9f:
            r6 = r5
        La0:
            r4.append(r6)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)     // Catch: java.lang.Exception -> Ld0
            if (r8 == 0) goto Lb1
            java.lang.String r4 = r8.m75945x2fec8307(r3)     // Catch: java.lang.Exception -> Ld0
            goto Lb2
        Lb1:
            r4 = r5
        Lb2:
            androidx.lifecycle.c1 r6 = r1.a(r0)     // Catch: java.lang.Exception -> Ld0
            mm2.c1 r6 = (mm2.c1) r6     // Catch: java.lang.Exception -> Ld0
            r45.rb r6 = r6.f410309a3     // Catch: java.lang.Exception -> Ld0
            if (r6 == 0) goto Lc0
            java.lang.String r5 = r6.m75945x2fec8307(r3)     // Catch: java.lang.Exception -> Ld0
        Lc0:
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)     // Catch: java.lang.Exception -> Ld0
            if (r4 != 0) goto Lf
            androidx.lifecycle.c1 r4 = r1.a(r0)     // Catch: java.lang.Exception -> Ld0
            mm2.c1 r4 = (mm2.c1) r4     // Catch: java.lang.Exception -> Ld0
            r4.f410309a3 = r8     // Catch: java.lang.Exception -> Ld0
            goto Lf
        Ld0:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r4, r7, r3)
            goto Lf
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.w0.d(java.util.LinkedList):void");
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20052};
    }
}
