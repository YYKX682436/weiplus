package yx0;

/* loaded from: classes5.dex */
public final class s4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f549172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(yx0.b8 b8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549171d = b8Var;
        this.f549172e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.s4(this.f549171d, this.f549172e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx0.s4 s4Var = (yx0.s4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x00c8, TRY_ENTER, TryCatch #0 {all -> 0x00c8, blocks: (B:3:0x0025, B:18:0x004a, B:19:0x0053, B:20:0x0059, B:21:0x0062, B:22:0x006b, B:23:0x0074, B:24:0x007d, B:25:0x0086, B:27:0x00a9, B:28:0x00ae, B:31:0x00ac, B:32:0x008f, B:33:0x0098), top: B:2:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:3:0x0025, B:18:0x004a, B:19:0x0053, B:20:0x0059, B:21:0x0062, B:22:0x006b, B:23:0x0074, B:24:0x007d, B:25:0x0086, B:27:0x00a9, B:28:0x00ae, B:31:0x00ac, B:32:0x008f, B:33:0x0098), top: B:2:0x0025 }] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            yx0.b8 r11 = r10.f549171d
            boolean r0 = r10.f549172e
            java.util.concurrent.locks.ReentrantLock r1 = yx0.b8.f548704c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "doReleaseCore. state: "
            r1.<init>(r2)
            yx0.v r2 = r11.f548725s
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.ShootComposingCorePlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.util.concurrent.locks.ReentrantLock r1 = r11.f548726t
            r1.lock()
            yx0.v r2 = r11.f548725s     // Catch: java.lang.Throwable -> Lc8
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> Lc8
            r3 = 0
            if (r2 == 0) goto La1
            r4 = 1
            if (r2 == r4) goto L98
            r5 = 3
            if (r2 == r5) goto L8f
            switch(r2) {
                case 5: goto L8f;
                case 6: goto L86;
                case 7: goto L7d;
                case 8: goto L74;
                case 9: goto L6b;
                case 10: goto L62;
                case 11: goto L59;
                case 12: goto L53;
                case 13: goto L8f;
                case 14: goto L43;
                case 15: goto L3e;
                case 16: goto L39;
                default: goto L37;
            }
        L37:
            goto La7
        L39:
            r1.unlock()
            goto Lc5
        L3e:
            r1.unlock()
            goto Lc5
        L43:
            if (r0 != 0) goto L4a
            r1.unlock()
            goto Lc5
        L4a:
            yx0.o1 r2 = new yx0.o1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L53:
            java.lang.String r2 = "APP_MaasCoreRelease"
            r11.W(r2, r4)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L59:
            yx0.n1 r2 = new yx0.n1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L62:
            yx0.m1 r2 = new yx0.m1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L6b:
            yx0.l1 r2 = new yx0.l1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L74:
            yx0.k1 r2 = new yx0.k1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L7d:
            yx0.i1 r2 = new yx0.i1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L86:
            yx0.j1 r2 = new yx0.j1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L8f:
            yx0.h1 r2 = new yx0.h1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        L98:
            yx0.g1 r2 = new yx0.g1     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lc8
            p3325xe03a0797.p3326xc267989b.l.f(r3, r2, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            goto La7
        La1:
            if (r0 != 0) goto La7
            r1.unlock()
            goto Lc5
        La7:
            if (r0 == 0) goto Lac
            yx0.v r2 = yx0.v.f549241v     // Catch: java.lang.Throwable -> Lc8
            goto Lae
        Lac:
            yx0.v r2 = yx0.v.f549240u     // Catch: java.lang.Throwable -> Lc8
        Lae:
            r11.q0(r2)     // Catch: java.lang.Throwable -> Lc8
            kotlinx.coroutines.y0 r4 = r11.L     // Catch: java.lang.Throwable -> Lc8
            r5 = 0
            r6 = 0
            yx0.f1 r7 = new yx0.f1     // Catch: java.lang.Throwable -> Lc8
            r7.<init>(r11, r0, r3)     // Catch: java.lang.Throwable -> Lc8
            r8 = 3
            r9 = 0
            kotlinx.coroutines.r2 r0 = p3325xe03a0797.p3326xc267989b.l.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lc8
            r11.f548727u = r0     // Catch: java.lang.Throwable -> Lc8
            r1.unlock()
        Lc5:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        Lc8:
            r11 = move-exception
            r1.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.s4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
