package rt3;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final rt3.j f481073a = new rt3.j();

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(5:24|25|(1:27)|28|(1:30))|11|(1:13)|14|15|(1:20)(2:17|18)))|33|6|7|(0)(0)|11|(0)|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:10:0x002e, B:11:0x009e, B:13:0x00a6, B:14:0x00c1, B:25:0x003d, B:27:0x0050, B:28:0x0054), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, int r14, long r15, r45.h53 r17, java.lang.String r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt3.j.a(java.lang.String, int, long, r45.h53, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r17, int r18, int r19, vt3.n r20, boolean r21, java.lang.Long r22, com.p314xaae8f345.mm.p2495xc50a8b8b.g r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt3.j.b(int, int, int, vt3.n, boolean, java.lang.Long, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r9, java.lang.String r10, com.p314xaae8f345.mm.p2495xc50a8b8b.g r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof rt3.h
            if (r0 == 0) goto L13
            r0 = r12
            rt3.h r0 = (rt3.h) r0
            int r1 = r0.f481069f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f481069f = r1
            goto L18
        L13:
            rt3.h r0 = new rt3.h
            r0.<init>(r8, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.f481067d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f481069f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)     // Catch: rm0.j -> L28
            goto L89
        L28:
            r9 = move-exception
            goto L8c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i     // Catch: rm0.j -> L28
            r1.<init>()     // Catch: rm0.j -> L28
            r45.y51 r12 = new r45.y51     // Catch: rm0.j -> L28
            r12.<init>()     // Catch: rm0.j -> L28
            if (r10 == 0) goto L45
            r3 = 2
            r12.set(r3, r10)     // Catch: rm0.j -> L28
        L45:
            r10 = 0
            if (r9 == 0) goto L4a
            r9 = r2
            goto L4b
        L4a:
            r9 = r10
        L4b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: rm0.j -> L28
            r3 = 3
            r12.set(r3, r9)     // Catch: rm0.j -> L28
            if (r11 == 0) goto L59
            r9 = 4
            r12.set(r9, r11)     // Catch: rm0.j -> L28
        L59:
            com.tencent.mm.modelbase.l r9 = new com.tencent.mm.modelbase.l     // Catch: rm0.j -> L28
            r9.<init>()     // Catch: rm0.j -> L28
            r9.f152197a = r12     // Catch: rm0.j -> L28
            r45.z51 r11 = new r45.z51     // Catch: rm0.j -> L28
            r11.<init>()     // Catch: rm0.j -> L28
            r9.f152198b = r11     // Catch: rm0.j -> L28
            r11 = 21599(0x545f, float:3.0267E-41)
            r9.f152200d = r11     // Catch: rm0.j -> L28
            java.lang.String r11 = "/cgi-bin/micromsg-bin/findergetfavtemplatelist"
            r9.f152199c = r11     // Catch: rm0.j -> L28
            r9.f152201e = r10     // Catch: rm0.j -> L28
            r9.f152202f = r10     // Catch: rm0.j -> L28
            com.tencent.mm.modelbase.o r9 = r9.a()     // Catch: rm0.j -> L28
            r1.p(r9)     // Catch: rm0.j -> L28
            r9 = 10000(0x2710, double:4.9407E-320)
            r4 = 0
            r6 = 2
            r7 = 0
            r5.f481069f = r2     // Catch: rm0.j -> L28
            r2 = r9
            java.lang.Object r12 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: rm0.j -> L28
            if (r12 != r0) goto L89
            return r0
        L89:
            r45.z51 r12 = (r45.z51) r12     // Catch: rm0.j -> L28
            goto La0
        L8c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "getFavTemplateListRep error >> "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "MicroMsg.ImproveCameraMassCgiHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r9)
            r12 = 0
        La0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rt3.j.c(boolean, java.lang.String, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:17)(2:14|15)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof rt3.i
            if (r0 == 0) goto L13
            r0 = r11
            rt3.i r0 = (rt3.i) r0
            int r1 = r0.f481072f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f481072f = r1
            goto L18
        L13:
            rt3.i r0 = new rt3.i
            r0.<init>(r9, r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.f481070d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f481072f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Throwable -> L7f
            goto L78
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L7f
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i     // Catch: java.lang.Throwable -> L7f
            r1.<init>()     // Catch: java.lang.Throwable -> L7f
            com.tencent.mm.modelbase.l r11 = new com.tencent.mm.modelbase.l     // Catch: java.lang.Throwable -> L7f
            r11.<init>()     // Catch: java.lang.Throwable -> L7f
            r45.dp3 r3 = new r45.dp3     // Catch: java.lang.Throwable -> L7f
            r3.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L7f
            r4 = 2
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L7f
            r11.f152197a = r3     // Catch: java.lang.Throwable -> L7f
            r45.ep3 r10 = new r45.ep3     // Catch: java.lang.Throwable -> L7f
            r10.<init>()     // Catch: java.lang.Throwable -> L7f
            r11.f152198b = r10     // Catch: java.lang.Throwable -> L7f
            r10 = 11538(0x2d12, float:1.6168E-41)
            r11.f152200d = r10     // Catch: java.lang.Throwable -> L7f
            java.lang.String r10 = "/cgi-bin/micromsg-bin/findertemplategetresource"
            r11.f152199c = r10     // Catch: java.lang.Throwable -> L7f
            r11.f152201e = r8     // Catch: java.lang.Throwable -> L7f
            r11.f152202f = r8     // Catch: java.lang.Throwable -> L7f
            com.tencent.mm.modelbase.o r10 = r11.a()     // Catch: java.lang.Throwable -> L7f
            r1.p(r10)     // Catch: java.lang.Throwable -> L7f
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f481072f = r2     // Catch: java.lang.Throwable -> L7f
            r2 = r10
            java.lang.Object r11 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7f
            if (r11 != r0) goto L78
            return r0
        L78:
            r45.ep3 r11 = (r45.ep3) r11     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)     // Catch: java.lang.Throwable -> L7f
            goto L8a
        L7f:
            r10 = move-exception
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r10 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
        L8a:
            java.lang.Throwable r11 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r10)
            if (r11 != 0) goto L91
            goto L9b
        L91:
            java.lang.String r10 = "getTemplateResource cgi error"
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "MicroMsg.ImproveCameraMassCgiHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r11, r10, r0)
            r10 = 0
        L9b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rt3.j.d(int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
