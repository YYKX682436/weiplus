package ir2;

/* loaded from: classes2.dex */
public abstract class c implements ir2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f375651d;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(ir2.c r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            java.lang.String r0 = "load end "
            java.lang.String r1 = "load begin "
            boolean r2 = r14 instanceof ir2.b
            if (r2 == 0) goto L17
            r2 = r14
            ir2.b r2 = (ir2.b) r2
            int r3 = r2.f375642h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f375642h = r3
            goto L1c
        L17:
            ir2.b r2 = new ir2.b
            r2.<init>(r13, r14)
        L1c:
            r7 = r2
            java.lang.Object r14 = r7.f375640f
            pz5.a r2 = pz5.a.f440719d
            int r3 = r7.f375642h
            r4 = 1
            java.lang.String r10 = "Finder.CgiLoaderSource"
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L36
            long r1 = r7.f375639e
            java.lang.Object r13 = r7.f375638d
            ir2.c r13 = (ir2.c) r13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)     // Catch: rm0.j -> L34
            goto L6d
        L34:
            r14 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: rm0.j -> L34
            r14.<init>(r1)     // Catch: rm0.j -> L34
            r14.append(r13)     // Catch: rm0.j -> L34
            java.lang.String r14 = r14.toString()     // Catch: rm0.j -> L34
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r14)     // Catch: rm0.j -> L34
            long r11 = c01.id.a()     // Catch: rm0.j -> L34
            az2.j r3 = r13.h()     // Catch: rm0.j -> L34
            r5 = 0
            r14 = 0
            r8 = 3
            r9 = 0
            r7.f375638d = r13     // Catch: rm0.j -> L34
            r7.f375639e = r11     // Catch: rm0.j -> L34
            r7.f375642h = r4     // Catch: rm0.j -> L34
            r4 = r5
            r6 = r14
            java.lang.Object r14 = rm0.h.a(r3, r4, r6, r7, r8, r9)     // Catch: rm0.j -> L34
            if (r14 != r2) goto L6c
            return r2
        L6c:
            r1 = r11
        L6d:
            com.tencent.mm.protobuf.f r14 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r14     // Catch: rm0.j -> L34
            long r3 = c01.id.a()     // Catch: rm0.j -> L34
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: rm0.j -> L34
            r5.<init>(r0)     // Catch: rm0.j -> L34
            r5.append(r13)     // Catch: rm0.j -> L34
            java.lang.String r0 = ": "
            r5.append(r0)     // Catch: rm0.j -> L34
            long r3 = r3 - r1
            r5.append(r3)     // Catch: rm0.j -> L34
            java.lang.String r0 = r5.toString()     // Catch: rm0.j -> L34
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)     // Catch: rm0.j -> L34
            ir2.a r13 = r13.f(r14)     // Catch: rm0.j -> L34
            goto Lc3
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "errType="
            r0.<init>(r1)
            int r1 = r14.f478957e
            r0.append(r1)
            java.lang.String r2 = " errCode="
            r0.append(r2)
            int r2 = r14.f478958f
            r0.append(r2)
            java.lang.String r3 = " fail:"
            r0.append(r3)
            java.lang.String r3 = r14.getLocalizedMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
            java.lang.String r14 = r14.f478959g
            if (r14 != 0) goto Lbf
            java.lang.String r14 = ""
        Lbf:
            ir2.a r13 = r13.e(r1, r2, r14)
        Lc3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.c.g(ir2.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ir2.a0
    public java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return g(this, interfaceC29045xdcb5ca57);
    }

    public ir2.a e(int i17, int i18, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        ir2.a aVar = new ir2.a(null, false, null, false, 15, null);
        aVar.f375618g = i18;
        aVar.f375617f = i17;
        aVar.f375619h = errorMsg;
        return aVar;
    }

    public abstract ir2.a f(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar);

    public abstract az2.j h();
}
