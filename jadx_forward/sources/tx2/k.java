package tx2;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final tx2.k f504135a = new tx2.k();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r22, r45.h32 r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.k.a(android.content.Context, r45.h32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r19, r45.h32 r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.k.b(android.content.Context, r45.h32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r6, r45.h32 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof tx2.h
            if (r0 == 0) goto L13
            r0 = r8
            tx2.h r0 = (tx2.h) r0
            int r1 = r0.f504106h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f504106h = r1
            goto L18
        L13:
            tx2.h r0 = new tx2.h
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f504104f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f504106h
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r6 = r0.f504103e
            r7 = r6
            r45.h32 r7 = (r45.h32) r7
            java.lang.Object r6 = r0.f504102d
            android.content.Context r6 = (android.content.Context) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L63
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Class<zy2.b6> r8 = zy2.b6.class
            i95.m r8 = i95.n0.c(r8)
            zy2.b6 r8 = (zy2.b6) r8
            r2 = 10
            com.tencent.mm.protobuf.f r2 = r7.m75936x14adae67(r2)
            r45.q65 r2 = (r45.q65) r2
            if (r2 == 0) goto L53
            com.tencent.mm.protobuf.g r2 = r2.m75934xbce7f2f(r3)
            goto L54
        L53:
            r2 = 0
        L54:
            r0.f504102d = r6
            r0.f504103e = r7
            r0.f504106h = r4
            c61.l7 r8 = (c61.l7) r8
            java.lang.Object r8 = r8.kk(r6, r2, r4, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            r45.zc5 r8 = (r45.zc5) r8
            if (r8 != 0) goto L9e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#getProduct product is null noticeId="
            r0.<init>(r1)
            java.lang.String r1 = r7.m75945x2fec8307(r3)
            r0.append(r1)
            java.lang.String r1 = " introduction="
            r0.append(r1)
            r1 = 3
            java.lang.String r7 = r7.m75945x2fec8307(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "LiveNoticeClickLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            android.content.res.Resources r7 = r6.getResources()
            r0 = 2131763255(0x7f102037, float:1.915761E38)
            java.lang.String r7 = r7.getString(r0)
            r0 = 0
            android.widget.Toast r6 = db5.t7.m123883x26a183b(r6, r7, r0)
            r6.show()
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.k.c(android.content.Context, r45.h32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r9, int r10, r45.h32 r11, yz5.p r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.k.d(android.content.Context, int, r45.h32, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Context r26, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r27) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.k.e(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
