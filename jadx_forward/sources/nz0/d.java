package nz0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final nz0.d f423029a = new nz0.d();

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(5:21|22|(1:24)|25|(1:27))|11|12|(1:17)(2:14|15)))|30|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof nz0.a
            if (r0 == 0) goto L13
            r0 = r11
            nz0.a r0 = (nz0.a) r0
            int r1 = r0.f423022f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f423022f = r1
            goto L18
        L13:
            nz0.a r0 = new nz0.a
            r0.<init>(r9, r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.f423020d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f423022f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Throwable -> L9d
            goto L96
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L9d
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            com.tencent.mm.modelbase.l r11 = new com.tencent.mm.modelbase.l     // Catch: java.lang.Throwable -> L9d
            r11.<init>()     // Catch: java.lang.Throwable -> L9d
            r45.fp3 r3 = new r45.fp3     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            r4 = 2008004(0x1ea3c4, float:2.813813E-39)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L9d
            r6 = 2
            r3.set(r6, r4)     // Catch: java.lang.Throwable -> L9d
            int r4 = tq5.i.f502802a     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L59
            r4 = 2014500(0x1ebd24, float:2.822916E-39)
            tq5.i.f502802a = r4     // Catch: java.lang.Throwable -> L9d
        L59:
            int r4 = tq5.i.f502802a     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L9d
            r6 = 3
            r3.set(r6, r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9d
            r4 = 5
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L9d
            r11.f152197a = r3     // Catch: java.lang.Throwable -> L9d
            r45.gp3 r10 = new r45.gp3     // Catch: java.lang.Throwable -> L9d
            r10.<init>()     // Catch: java.lang.Throwable -> L9d
            r11.f152198b = r10     // Catch: java.lang.Throwable -> L9d
            r10 = 6995(0x1b53, float:9.802E-42)
            r11.f152200d = r10     // Catch: java.lang.Throwable -> L9d
            java.lang.String r10 = "/cgi-bin/micromsg-bin/findertemplategetsquare"
            r11.f152199c = r10     // Catch: java.lang.Throwable -> L9d
            r11.f152201e = r8     // Catch: java.lang.Throwable -> L9d
            r11.f152202f = r8     // Catch: java.lang.Throwable -> L9d
            com.tencent.mm.modelbase.o r10 = r11.a()     // Catch: java.lang.Throwable -> L9d
            r1.p(r10)     // Catch: java.lang.Throwable -> L9d
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f423022f = r2     // Catch: java.lang.Throwable -> L9d
            r2 = r10
            java.lang.Object r11 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9d
            if (r11 != r0) goto L96
            return r0
        L96:
            r45.gp3 r11 = (r45.gp3) r11     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)     // Catch: java.lang.Throwable -> L9d
            goto La8
        L9d:
            r10 = move-exception
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r10 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
        La8:
            java.lang.Throwable r11 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r10)
            if (r11 != 0) goto Laf
            goto Lb9
        Laf:
            java.lang.String r10 = "getTemplateList cgi error"
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "MicroMsg.Maas.TemplateCgiHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r11, r10, r0)
            r10 = 0
        Lb9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nz0.d.a(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:17)(2:14|15)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof nz0.b
            if (r0 == 0) goto L13
            r0 = r10
            nz0.b r0 = (nz0.b) r0
            int r1 = r0.f423025f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f423025f = r1
            goto L18
        L13:
            nz0.b r0 = new nz0.b
            r0.<init>(r9, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f423023d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f423025f
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L80
            goto L79
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L80
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i     // Catch: java.lang.Throwable -> L80
            r1.<init>()     // Catch: java.lang.Throwable -> L80
            com.tencent.mm.modelbase.l r10 = new com.tencent.mm.modelbase.l     // Catch: java.lang.Throwable -> L80
            r10.<init>()     // Catch: java.lang.Throwable -> L80
            r45.dp3 r3 = new r45.dp3     // Catch: java.lang.Throwable -> L80
            r3.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L80
            r6 = 2
            r3.set(r6, r4)     // Catch: java.lang.Throwable -> L80
            r10.f152197a = r3     // Catch: java.lang.Throwable -> L80
            r45.ep3 r3 = new r45.ep3     // Catch: java.lang.Throwable -> L80
            r3.<init>()     // Catch: java.lang.Throwable -> L80
            r10.f152198b = r3     // Catch: java.lang.Throwable -> L80
            r3 = 11538(0x2d12, float:1.6168E-41)
            r10.f152200d = r3     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = "/cgi-bin/micromsg-bin/findertemplategetresource"
            r10.f152199c = r3     // Catch: java.lang.Throwable -> L80
            r10.f152201e = r8     // Catch: java.lang.Throwable -> L80
            r10.f152202f = r8     // Catch: java.lang.Throwable -> L80
            com.tencent.mm.modelbase.o r10 = r10.a()     // Catch: java.lang.Throwable -> L80
            r1.p(r10)     // Catch: java.lang.Throwable -> L80
            r3 = 0
            r10 = 0
            r6 = 3
            r7 = 0
            r5.f423025f = r2     // Catch: java.lang.Throwable -> L80
            r2 = r3
            r4 = r10
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L80
            if (r10 != r0) goto L79
            return r0
        L79:
            r45.ep3 r10 = (r45.ep3) r10     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L80
            goto L8b
        L80:
            r10 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r10 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
        L8b:
            java.lang.Throwable r0 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r10)
            if (r0 != 0) goto L92
            goto L9c
        L92:
            java.lang.String r10 = "getTemplateResource cgi error"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r2 = "MicroMsg.Maas.TemplateCgiHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r10, r1)
            r10 = 0
        L9c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nz0.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(5:21|22|(1:24)(1:28)|25|(1:27))|11|12|(1:17)(2:14|15)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, int r11, boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof nz0.c
            if (r0 == 0) goto L13
            r0 = r13
            nz0.c r0 = (nz0.c) r0
            int r1 = r0.f423028f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f423028f = r1
            goto L18
        L13:
            nz0.c r0 = new nz0.c
            r0.<init>(r9, r13)
        L18:
            r5 = r0
            java.lang.Object r13 = r5.f423026d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f423028f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)     // Catch: java.lang.Throwable -> L9b
            goto L94
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            kotlin.Result$Companion r13 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L9b
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            com.tencent.mm.modelbase.l r13 = new com.tencent.mm.modelbase.l     // Catch: java.lang.Throwable -> L9b
            r13.<init>()     // Catch: java.lang.Throwable -> L9b
            r45.ho3 r3 = new r45.ho3     // Catch: java.lang.Throwable -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L9b
            r4 = 2
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L9b
            r10 = 2008004(0x1ea3c4, float:2.813813E-39)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r4 = 4
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L9b
            r11 = 5
            r3.set(r11, r10)     // Catch: java.lang.Throwable -> L9b
            if (r12 == 0) goto L60
            r10 = r2
            goto L61
        L60:
            r10 = r8
        L61:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r11 = 7
            r3.set(r11, r10)     // Catch: java.lang.Throwable -> L9b
            r13.f152197a = r3     // Catch: java.lang.Throwable -> L9b
            r45.io3 r10 = new r45.io3     // Catch: java.lang.Throwable -> L9b
            r10.<init>()     // Catch: java.lang.Throwable -> L9b
            r13.f152198b = r10     // Catch: java.lang.Throwable -> L9b
            r10 = 6963(0x1b33, float:9.757E-42)
            r13.f152200d = r10     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = "/cgi-bin/micromsg-bin/findertemplategetspecific"
            r13.f152199c = r10     // Catch: java.lang.Throwable -> L9b
            r13.f152201e = r8     // Catch: java.lang.Throwable -> L9b
            r13.f152202f = r8     // Catch: java.lang.Throwable -> L9b
            com.tencent.mm.modelbase.o r10 = r13.a()     // Catch: java.lang.Throwable -> L9b
            r1.p(r10)     // Catch: java.lang.Throwable -> L9b
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f423028f = r2     // Catch: java.lang.Throwable -> L9b
            r2 = r10
            java.lang.Object r13 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            if (r13 != r0) goto L94
            return r0
        L94:
            r45.io3 r13 = (r45.io3) r13     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r13)     // Catch: java.lang.Throwable -> L9b
            goto La6
        L9b:
            r10 = move-exception
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r10 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
        La6:
            java.lang.Throwable r11 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r10)
            if (r11 != 0) goto Lad
            goto Lb7
        Lad:
            java.lang.String r10 = "getTemplateSpecific cgi error"
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r13 = "MicroMsg.Maas.TemplateCgiHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r13, r11, r10, r12)
            r10 = 0
        Lb7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nz0.d.c(java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
