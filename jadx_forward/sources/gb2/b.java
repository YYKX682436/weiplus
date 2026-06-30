package gb2;

/* loaded from: classes2.dex */
public final class b extends by1.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String key) {
        super(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // by1.f, by1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof gb2.a
            if (r0 == 0) goto L13
            r0 = r13
            gb2.a r0 = (gb2.a) r0
            int r1 = r0.f351538h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f351538h = r1
            goto L18
        L13:
            gb2.a r0 = new gb2.a
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f351536f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f351538h
            r3 = 2
            r4 = 1
            java.lang.String r5 = "Finder.FinderStreamLoaderTask"
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f351535e
            db2.c3 r0 = (db2.c3) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto La6
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            long r6 = r0.f351534d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L56
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            long r6 = android.os.SystemClock.uptimeMillis()
            java.lang.String r13 = "requestCache: start"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r13)
            r0.f351534d = r6
            r0.f351538h = r4
            java.lang.Object r13 = by1.f.f(r12, r0)
            if (r13 != r1) goto L56
            return r1
        L56:
            db2.c3 r13 = (db2.c3) r13
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "requestCache: value = "
            r2.<init>(r4)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r2)
            if (r13 == 0) goto La7
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            lb2.j r2 = r2.F2()
            java.lang.Object r2 = r2.r()
            java.lang.Number r2 = (java.lang.Number) r2
            long r8 = r2.longValue()
            long r10 = android.os.SystemClock.uptimeMillis()
            long r10 = r10 - r6
            long r8 = r8 - r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "requestCache: loading delay = "
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r2)
            r4 = 0
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto La7
            r0.f351535e = r13
            r0.f351538h = r3
            java.lang.Object r0 = p3325xe03a0797.p3326xc267989b.k1.b(r8, r0)
            if (r0 != r1) goto La5
            return r1
        La5:
            r0 = r13
        La6:
            r13 = r0
        La7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gb2.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
