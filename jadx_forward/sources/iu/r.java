package iu;

/* loaded from: classes12.dex */
public final class r extends iu.h {
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2 A[SYNTHETIC] */
    @Override // iu.h, gu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gu.j r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.r.a(gu.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // iu.h, gu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(gu.j r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof iu.o
            if (r0 == 0) goto L13
            r0 = r10
            iu.o r0 = (iu.o) r0
            int r1 = r0.f376264h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f376264h = r1
            goto L18
        L13:
            iu.o r0 = new iu.o
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f376262f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f376264h
            r3 = 45
            java.lang.String r4 = "MicroMsg.AppMsg.NestRecordSendApi"
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r6) goto L37
            java.lang.Object r9 = r0.f376261e
            gu.j r9 = (gu.j) r9
            java.lang.Object r0 = r0.f376260d
            iu.r r0 = (iu.r) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Lab
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            java.lang.Object r9 = r0.f376261e
            gu.j r9 = (gu.j) r9
            java.lang.Object r2 = r0.f376260d
            iu.r r2 = (iu.r) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L97
        L4b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            qi3.b0 r2 = r9.f357140a
            java.lang.String r2 = r2.id()
            r10.append(r2)
            java.lang.String r2 = " start upload attach "
            r10.append(r2)
            s15.h r2 = r9.f357142c
            int r7 = r2.f384955d
            int r7 = r7 + 3
            java.lang.String r7 = r2.m75945x2fec8307(r7)
            r10.append(r7)
            r10.append(r3)
            int r7 = r9.f357145f
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r10)
            s15.i0 r10 = r2.H()
            if (r10 == 0) goto L9c
            s15.w r10 = r10.j()
            if (r10 == 0) goto L9c
            r0.f376260d = r8
            r0.f376261e = r9
            r0.f376264h = r5
            java.lang.Object r10 = r8.s(r9, r10, r6, r0)
            if (r10 != r1) goto L96
            return r1
        L96:
            r2 = r8
        L97:
            qi3.i0 r10 = (qi3.i0) r10
            if (r10 != 0) goto Lae
            goto L9d
        L9c:
            r2 = r8
        L9d:
            r0.f376260d = r2
            r0.f376261e = r9
            r0.f376264h = r6
            java.lang.Object r10 = super.b(r9, r0)
            if (r10 != r1) goto Laa
            return r1
        Laa:
            r0 = r2
        Lab:
            qi3.i0 r10 = (qi3.i0) r10
            r2 = r0
        Lae:
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            qi3.b0 r1 = r9.f357140a
            java.lang.String r1 = r1.id()
            r0.append(r1)
            java.lang.String r1 = " end upload attach "
            r0.append(r1)
            s15.h r1 = r9.f357142c
            int r2 = r1.f384955d
            int r2 = r2 + 3
            java.lang.String r1 = r1.m75945x2fec8307(r2)
            r0.append(r1)
            r0.append(r3)
            int r9 = r9.f357145f
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.r.b(gu.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // iu.h
    public java.lang.String m() {
        return "MicroMsg.AppMsg.NestRecordSendApi";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(gu.j r23, s15.w r24, s15.w r25, int r26) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.r.r(gu.j, s15.w, s15.w, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(gu.j r19, s15.w r20, int r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            r18 = this;
            r0 = r22
            boolean r1 = r0 instanceof iu.p
            if (r1 == 0) goto L17
            r1 = r0
            iu.p r1 = (iu.p) r1
            int r2 = r1.f376272n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f376272n = r2
            r12 = r18
            goto L1e
        L17:
            iu.p r1 = new iu.p
            r12 = r18
            r1.<init>(r12, r0)
        L1e:
            java.lang.Object r0 = r1.f376270i
            pz5.a r13 = pz5.a.f440719d
            int r2 = r1.f376272n
            r14 = 1
            if (r2 == 0) goto L49
            if (r2 != r14) goto L41
            java.lang.Object r2 = r1.f376269h
            kotlin.jvm.internal.f0 r2 = (p3321xbce91901.jvm.p3324x21ffc6bd.f0) r2
            java.lang.Object r3 = r1.f376268g
            kotlin.jvm.internal.f0 r3 = (p3321xbce91901.jvm.p3324x21ffc6bd.f0) r3
            java.lang.Object r4 = r1.f376267f
            kotlin.jvm.internal.f0 r4 = (p3321xbce91901.jvm.p3324x21ffc6bd.f0) r4
            java.lang.Object r5 = r1.f376266e
            qi3.i0 r5 = (qi3.i0) r5
            java.lang.Object r1 = r1.f376265d
            gu.j r1 = (gu.j) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            goto L98
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L49:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            qi3.i0 r0 = new qi3.i0
            r2 = 0
            r0.<init>(r2)
            kotlin.jvm.internal.f0 r15 = new kotlin.jvm.internal.f0
            r15.<init>()
            kotlin.jvm.internal.f0 r11 = new kotlin.jvm.internal.f0
            r11.<init>()
            kotlin.jvm.internal.f0 r10 = new kotlin.jvm.internal.f0
            r10.<init>()
            iu.q r9 = new iu.q
            r16 = 0
            r2 = r9
            r3 = r20
            r4 = r19
            r5 = r18
            r6 = r21
            r7 = r15
            r8 = r11
            r17 = r9
            r9 = r10
            r14 = r10
            r10 = r0
            r12 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = r19
            r1.f376265d = r2
            r1.f376266e = r0
            r1.f376267f = r15
            r1.f376268g = r12
            r1.f376269h = r14
            r3 = 1
            r1.f376272n = r3
            r3 = r17
            java.lang.Object r1 = r3.mo146xb9724478(r1)
            if (r1 != r13) goto L93
            return r13
        L93:
            r5 = r0
            r1 = r2
            r3 = r12
            r2 = r14
            r4 = r15
        L98:
            java.util.Map r0 = r1.f357146g
            int r4 = r4.f391649d
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            java.lang.String r4 = "need_cdn_count"
            r0.put(r4, r6)
            java.util.Map r0 = r1.f357146g
            int r1 = r3.f391649d
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            java.lang.String r1 = "check_cdn_success"
            r0.put(r1, r3)
            int r1 = r2.f391649d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            java.lang.String r1 = "up_cdn_success"
            r0.put(r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.r.s(gu.j, s15.w, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
