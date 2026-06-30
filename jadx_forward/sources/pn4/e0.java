package pn4;

/* loaded from: classes14.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f438611a = java.nio.ByteBuffer.allocate(0);

    /* renamed from: b, reason: collision with root package name */
    public final u26.w f438612b = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);

    /* renamed from: c, reason: collision with root package name */
    public boolean f438613c;

    /* renamed from: d, reason: collision with root package name */
    public int f438614d;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0068 -> B:12:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(byte[] r10, int r11, int r12, boolean r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e0.a(byte[], int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextTransToVoiceStream.BufferHolder", "markFinished");
        this.f438613c = true;
        u26.y0 y0Var = this.f438612b;
        ((u26.o) y0Var).e(java.lang.Boolean.TRUE);
        u26.x0.a(y0Var, null, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|5c|27|(1:29))|12|13|14))|35|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r7 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(byte[] r6, int r7, int r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof pn4.d0
            if (r0 == 0) goto L13
            r0 = r9
            pn4.d0 r0 = (pn4.d0) r0
            int r1 = r0.f438603g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f438603g = r1
            goto L18
        L13:
            pn4.d0 r0 = new pn4.d0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f438601e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f438603g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r8 = r0.f438600d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L2a
            goto La7
        L2a:
            r6 = move-exception
            goto Lad
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.String r9 = "MicroMsg.TextTransToVoiceStream.BufferHolder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "putBuffer() called with: byteArray = "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r4 = ", offset = "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = ", dataLen = "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r2)
            monitor-enter(r5)
            java.nio.ByteBuffer r9 = r5.f438611a     // Catch: java.lang.Throwable -> Lbc
            int r9 = r9.capacity()     // Catch: java.lang.Throwable -> Lbc
            int r2 = r7 + r8
            if (r9 >= r2) goto L83
            java.nio.ByteBuffer r9 = r5.f438611a     // Catch: java.lang.Throwable -> Lbc
            int r9 = r9.capacity()     // Catch: java.lang.Throwable -> Lbc
            int r9 = r9 * 2
            int r9 = java.lang.Math.max(r9, r2)     // Catch: java.lang.Throwable -> Lbc
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r9)     // Catch: java.lang.Throwable -> Lbc
            java.nio.ByteBuffer r2 = r5.f438611a     // Catch: java.lang.Throwable -> Lbc
            r2.clear()     // Catch: java.lang.Throwable -> Lbc
            java.nio.ByteBuffer r2 = r5.f438611a     // Catch: java.lang.Throwable -> Lbc
            r9.put(r2)     // Catch: java.lang.Throwable -> Lbc
            r5.f438611a = r9     // Catch: java.lang.Throwable -> Lbc
        L83:
            java.nio.ByteBuffer r9 = r5.f438611a     // Catch: java.lang.Throwable -> Lbc
            r9.position(r7)     // Catch: java.lang.Throwable -> Lbc
            java.nio.ByteBuffer r7 = r5.f438611a     // Catch: java.lang.Throwable -> Lbc
            r9 = 0
            r7.put(r6, r9, r8)     // Catch: java.lang.Throwable -> Lbc
            int r6 = r5.f438614d     // Catch: java.lang.Throwable -> Lbc
            int r6 = r6 + r8
            r5.f438614d = r6     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r5)
            kotlin.Result$Companion r6 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L2a
            u26.w r6 = r5.f438612b     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2a
            r0.f438600d = r8     // Catch: java.lang.Throwable -> L2a
            r0.f438603g = r3     // Catch: java.lang.Throwable -> L2a
            u26.o r6 = (u26.o) r6     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r6.t(r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto La7
            return r1
        La7:
            jz5.f0 r6 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L2a
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r6)     // Catch: java.lang.Throwable -> L2a
            goto Lb6
        Lad:
            kotlin.Result$Companion r7 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r6 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r6)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r6)
        Lb6:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            return r6
        Lbc:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e0.c(byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
