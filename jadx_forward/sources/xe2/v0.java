package xe2;

/* loaded from: classes3.dex */
public final class v0 extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x05ed A[Catch: Exception -> 0x0684, TryCatch #5 {Exception -> 0x0684, blocks: (B:200:0x05ad, B:202:0x05b8, B:204:0x05bc, B:207:0x05c6, B:212:0x05cf, B:213:0x05d2, B:217:0x05ed, B:219:0x061a, B:221:0x0620, B:223:0x0626, B:225:0x0637, B:227:0x063b, B:228:0x0641, B:231:0x0649, B:232:0x064f, B:234:0x0655, B:235:0x065b, B:237:0x0661, B:238:0x0667, B:240:0x0675, B:243:0x067d, B:251:0x05e0, B:252:0x05c4, B:247:0x05da), top: B:199:0x05ad, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0916 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a19 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0995 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x09e7  */
    @Override // we2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.LinkedList r77) {
        /*
            Method dump skipped, instructions count: 2875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.v0.d(java.util.LinkedList):void");
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20004, 20005, 20018, 20026, 20028, 20029, 20039, 20099, 20093, 20094, 20095, 20104, 20102};
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.LinkedList r7) {
        /*
            r6 = this;
            java.lang.Class<c61.ac> r0 = c61.ac.class
            i95.m r0 = i95.n0.c(r0)
            c61.ac r0 = (c61.ac) r0
            b92.g1 r0 = (b92.g1) r0
            r0.getClass()
            boolean r0 = dk2.ef.f314917g
            if (r0 != 0) goto Led
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r2 = r7.hasNext()
            r3 = 1
            if (r2 == 0) goto L41
            java.lang.Object r2 = r7.next()
            r4 = r2
            r45.ch1 r4 = (r45.ch1) r4
            r5 = 20104(0x4e88, float:2.8172E-41)
            int[] r5 = new int[]{r5}
            int r3 = r4.m75939xb282bd08(r3)
            boolean r3 = kz5.z.F(r5, r3)
            if (r3 == 0) goto L1f
            r1.add(r2)
            goto L1f
        L41:
            r0.addAll(r1)
            r7 = 0
            java.lang.Object r0 = kz5.n0.a0(r0, r7)
            r45.ch1 r0 = (r45.ch1) r0
            if (r0 == 0) goto Led
            r45.ih1 r1 = new r45.ih1
            r1.<init>()
            r2 = 4
            com.tencent.mm.protobuf.g r0 = r0.m75934xbce7f2f(r2)
            r2 = 0
            if (r0 == 0) goto L5f
            byte[] r0 = r0.g()
            goto L60
        L5f:
            r0 = r2
        L60:
            if (r0 != 0) goto L64
        L62:
            r1 = r2
            goto L75
        L64:
            r1.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L68
            goto L75
        L68:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r1, r0)
            goto L62
        L75:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "checkAnchorInviteVisitorMic. inviteInfo:"
            r0.<init>(r4)
            if (r1 == 0) goto L87
            int r4 = r1.m75939xb282bd08(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L88
        L87:
            r4 = r2
        L88:
            r0.append(r4)
            java.lang.String r4 = ", invite_seat_id:"
            r0.append(r4)
            if (r1 == 0) goto L9b
            int r3 = r1.m75939xb282bd08(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L9c
        L9b:
            r3 = r2
        L9c:
            r0.append(r3)
            java.lang.String r3 = ", confirm_expired_time:"
            r0.append(r3)
            if (r1 == 0) goto Lb0
            r3 = 3
            long r3 = r1.m75942xfb822ef2(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto Lb1
        Lb0:
            r3 = r2
        Lb1:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "LiveMicLinkStateInterceptor"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            java.lang.Class<mm2.i5> r0 = mm2.i5.class
            gk2.e r3 = r6.f526800a
            androidx.lifecycle.c1 r0 = r3.a(r0)
            mm2.i5 r0 = (mm2.i5) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.f410673f
            r45.f52 r3 = new r45.f52
            r3.<init>()
            r4 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.set(r7, r4)
            com.tencent.mm.protobuf.g r7 = new com.tencent.mm.protobuf.g
            if (r1 == 0) goto Ldf
            byte[] r2 = r1.mo14344x5f01b1f6()
        Ldf:
            r7.<init>(r2)
            r1 = 2
            r3.set(r1, r7)
            byte[] r7 = r3.mo14344x5f01b1f6()
            r0.mo7808x76db6cb1(r7)
        Led:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.v0.h(java.util.LinkedList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.LinkedList r7) {
        /*
            r6 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        Le:
            boolean r2 = r7.hasNext()
            r3 = 1
            if (r2 == 0) goto L30
            java.lang.Object r2 = r7.next()
            r4 = r2
            r45.ch1 r4 = (r45.ch1) r4
            r5 = 20102(0x4e86, float:2.8169E-41)
            int[] r5 = new int[]{r5}
            int r3 = r4.m75939xb282bd08(r3)
            boolean r3 = kz5.z.F(r5, r3)
            if (r3 == 0) goto Le
            r1.add(r2)
            goto Le
        L30:
            r0.addAll(r1)
            r7 = 0
            java.lang.Object r0 = kz5.n0.a0(r0, r7)
            r45.ch1 r0 = (r45.ch1) r0
            if (r0 == 0) goto La8
            r45.qh1 r1 = new r45.qh1
            r1.<init>()
            r2 = 4
            com.tencent.mm.protobuf.g r0 = r0.m75934xbce7f2f(r2)
            r2 = 0
            if (r0 == 0) goto L4e
            byte[] r0 = r0.g()
            goto L4f
        L4e:
            r0 = r2
        L4f:
            if (r0 != 0) goto L53
        L51:
            r1 = r2
            goto L64
        L53:
            r1.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L57
            goto L64
        L57:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r1, r0)
            goto L51
        L64:
            if (r1 == 0) goto La8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkPkToast notify_scene: "
            r0.<init>(r2)
            int r2 = r1.m75939xb282bd08(r7)
            r0.append(r2)
            java.lang.String r2 = " msg: "
            r0.append(r2)
            java.lang.String r2 = r1.m75945x2fec8307(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "LiveMicLinkStateInterceptor"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            int r0 = r1.m75939xb282bd08(r7)
            r2 = 2
            if (r0 != r2) goto La8
            java.lang.String r0 = r1.m75945x2fec8307(r3)
            if (r0 == 0) goto L9e
            int r0 = r0.length()
            if (r0 != 0) goto L9d
            goto L9e
        L9d:
            r3 = r7
        L9e:
            if (r3 != 0) goto La8
            xe2.u0 r7 = new xe2.u0
            r7.<init>(r1)
            pm0.v.X(r7)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.v0.i(java.util.LinkedList):void");
    }
}
