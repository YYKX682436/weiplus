package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class n1 extends p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j {

    /* renamed from: resumeMode */
    public int f72727xdec89770;

    public n1(int i17) {
        super(0L, p3325xe03a0797.p3326xc267989b.p3330xd70c6594.n.f392152f);
        this.f72727xdec89770 = i17;
    }

    /* renamed from: cancelCompletedResult$kotlinx_coroutines_core */
    public abstract void mo144025xe76581e5(java.lang.Object obj, java.lang.Throwable th6);

    /* renamed from: getDelegate$kotlinx_coroutines_core */
    public abstract p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo144029xbf34f972();

    /* renamed from: getExceptionalResult$kotlinx_coroutines_core */
    public java.lang.Throwable mo144075xbd95b938(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.e0 e0Var = obj instanceof p3325xe03a0797.p3326xc267989b.e0 ? (p3325xe03a0797.p3326xc267989b.e0) obj : null;
        if (e0Var != null) {
            return e0Var.f391705a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSuccessfulResult$kotlinx_coroutines_core */
    public <T> T mo144076x244ff344(java.lang.Object obj) {
        return obj;
    }

    /* renamed from: handleFatalException */
    public final void m144077x85a173f3(java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th6 == null && th7 == null) {
            return;
        }
        if (th6 != null && th7 != null) {
            jz5.a.a(th6, th7);
        }
        if (th6 == null) {
            th6 = th7;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(th6);
        p3325xe03a0797.p3326xc267989b.u0.a(mo144029xbf34f972().mo48699x76847179(), new p3325xe03a0797.p3326xc267989b.b1("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r7 = (p3325xe03a0797.p3326xc267989b.r2) r7.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            jz5.f0 r0 = jz5.f0.f384359a
            kotlinx.coroutines.scheduling.k r1 = r13.f72738xa940486a
            kotlin.coroutines.Continuation r2 = r13.mo144029xbf34f972()     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) r2     // Catch: java.lang.Throwable -> Lb2
            kotlin.coroutines.Continuation<T> r3 = r2.continuation     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = r2.countOrElement     // Catch: java.lang.Throwable -> Lb2
            oz5.l r4 = r3.mo48699x76847179()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.c(r4, r2)     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.internal.l0 r5 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.f392056a     // Catch: java.lang.Throwable -> Lb2
            r6 = 0
            if (r2 == r5) goto L20
            kotlinx.coroutines.c4 r5 = p3325xe03a0797.p3326xc267989b.m0.c(r3, r4, r2)     // Catch: java.lang.Throwable -> Lb2
            goto L21
        L20:
            r5 = r6
        L21:
            oz5.l r7 = r3.mo48699x76847179()     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r13.mo144037x79a9fdc1()     // Catch: java.lang.Throwable -> La5
            java.lang.Throwable r9 = r13.mo144075xbd95b938(r8)     // Catch: java.lang.Throwable -> La5
            if (r9 != 0) goto L44
            int r10 = r13.f72727xdec89770     // Catch: java.lang.Throwable -> La5
            r11 = 1
            if (r10 == r11) goto L39
            r12 = 2
            if (r10 != r12) goto L38
            goto L39
        L38:
            r11 = 0
        L39:
            if (r11 == 0) goto L44
            kotlinx.coroutines.q2 r10 = p3325xe03a0797.p3326xc267989b.q2.f392104d     // Catch: java.lang.Throwable -> La5
            oz5.i r7 = r7.get(r10)     // Catch: java.lang.Throwable -> La5
            kotlinx.coroutines.r2 r7 = (p3325xe03a0797.p3326xc267989b.r2) r7     // Catch: java.lang.Throwable -> La5
            goto L45
        L44:
            r7 = r6
        L45:
            if (r7 == 0) goto L62
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> La5
            if (r10 != 0) goto L62
            java.util.concurrent.CancellationException r7 = r7.x()     // Catch: java.lang.Throwable -> La5
            r13.mo144025xe76581e5(r8, r7)     // Catch: java.lang.Throwable -> La5
            kotlin.Result$Companion r8 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)     // Catch: java.lang.Throwable -> La5
            r3.mo48700xdecd0e93(r7)     // Catch: java.lang.Throwable -> La5
            goto L7f
        L62:
            if (r9 == 0) goto L72
            kotlin.Result$Companion r7 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)     // Catch: java.lang.Throwable -> La5
            r3.mo48700xdecd0e93(r7)     // Catch: java.lang.Throwable -> La5
            goto L7f
        L72:
            kotlin.Result$Companion r7 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = r13.mo144076x244ff344(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)     // Catch: java.lang.Throwable -> La5
            r3.mo48700xdecd0e93(r7)     // Catch: java.lang.Throwable -> La5
        L7f:
            if (r5 == 0) goto L87
            boolean r3 = r5.k0()     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto L8a
        L87:
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(r4, r2)     // Catch: java.lang.Throwable -> Lb2
        L8a:
            r1.getClass()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)     // Catch: java.lang.Throwable -> L92
            goto L9d
        L92:
            r0 = move-exception
            kotlin.Result$Companion r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r0 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0)
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)
        L9d:
            java.lang.Throwable r0 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r0)
            r13.m144077x85a173f3(r6, r0)
            goto Lcf
        La5:
            r3 = move-exception
            if (r5 == 0) goto Lae
            boolean r5 = r5.k0()     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto Lb1
        Lae:
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(r4, r2)     // Catch: java.lang.Throwable -> Lb2
        Lb1:
            throw r3     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r2 = move-exception
            kotlin.Result$Companion r3 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> Lbd
            r1.getClass()     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lc8
        Lbd:
            r0 = move-exception
            kotlin.Result$Companion r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r0 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0)
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)
        Lc8:
            java.lang.Throwable r0 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r0)
            r13.m144077x85a173f3(r2, r0)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.n1.run():void");
    }

    /* renamed from: takeState$kotlinx_coroutines_core */
    public abstract java.lang.Object mo144037x79a9fdc1();
}
