package yl2;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: g */
    public static final yl2.j f544540g = new yl2.j(null);

    /* renamed from: a */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f544541a;

    /* renamed from: b */
    public int f544542b;

    /* renamed from: c */
    public long f544543c;

    /* renamed from: d */
    public final int f544544d;

    /* renamed from: e */
    public boolean f544545e;

    /* renamed from: f */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 f544546f;

    public g1(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f context, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f544541a = context;
        this.f544542b = i17;
        this.f544543c = j17;
        this.f544544d = 5000;
        this.f544545e = true;
        this.f544546f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f, context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L, null, 8, null);
    }

    public static java.lang.Object e(yl2.g1 g1Var, java.lang.String str, r45.qp1 qp1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            qp1Var = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        g1Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "gotoFaceVerify " + str + ", skipIntermediatePage=" + z17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("LIVE_HELP_TYPE", 1);
        intent.putExtra("FACE_VERIFY_URL", str);
        intent.putExtra("SKIP_INTERMEDIATE_PAGE", z17);
        if (qp1Var != null) {
            intent.putExtra("LIVE_ERROR_PAGE", qp1Var.mo14344x5f01b1f6());
        }
        java.lang.Class<?> a17 = jz2.x0.f384287a.a();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = g1Var.f544541a;
        intent.setClass(activityC21401x6ce6f73f, a17);
        ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f.m78751x5dc77fb5(intent)).f279410a = new yl2.f0(rVar);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public static /* synthetic */ java.lang.Object r(yl2.g1 g1Var, int i17, int i18, r45.qp1 qp1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 2;
        }
        if ((i19 & 4) != 0) {
            qp1Var = null;
        }
        return g1Var.q(i17, i18, qp1Var, interfaceC29045xdcb5ca57);
    }

    public static /* synthetic */ java.lang.Object t(yl2.g1 g1Var, yl2.k kVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            kVar = null;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return g1Var.s(kVar, z17, interfaceC29045xdcb5ca57);
    }

    public final boolean a() {
        boolean z17;
        boolean a17 = hl2.a.f363632a.a();
        r45.i22 a18 = dk2.ya.f315919a.a();
        boolean z18 = false;
        java.lang.String m75945x2fec8307 = a18 != null ? a18.m75945x2fec8307(0) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            java.lang.String m75945x2fec83072 = a18 != null ? a18.m75945x2fec8307(1) : null;
            if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                java.lang.String m75945x2fec83073 = a18 != null ? a18.m75945x2fec8307(2) : null;
                if (!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0)) {
                    z17 = true;
                    android.content.Intent intent = new android.content.Intent();
                    intent.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
                    boolean I0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(this.f544541a, intent, false, false);
                    if (a17 && z17 && I0) {
                        z18 = true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "[CTID] canUseCTIDAuth(PostHelper): switch=" + a17 + ", paramsValid=" + z17 + ", installed=" + I0 + ", result=" + z18);
                    return z18;
                }
            }
        }
        z17 = false;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
        boolean I02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(this.f544541a, intent2, false, false);
        if (a17) {
            z18 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "[CTID] canUseCTIDAuth(PostHelper): switch=" + a17 + ", paramsValid=" + z17 + ", installed=" + I02 + ", result=" + z18);
        return z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r12, java.lang.String r13, boolean r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.b(int, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean c(yl2.k kVar) {
        return (kVar != null && kVar.f544567a == 0) && kVar.f544569c != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(yl2.k r25) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.d(yl2.k):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, int r6, boolean r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof yl2.h0
            if (r0 == 0) goto L13
            r0 = r8
            yl2.h0 r0 = (yl2.h0) r0
            int r1 = r0.f544553f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f544553f = r1
            goto L18
        L13:
            yl2.h0 r0 = new yl2.h0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f544551d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f544553f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r0.f544553f = r3
            java.lang.Object r8 = r4.g(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            jz5.l r8 = (jz5.l) r8
            if (r8 == 0) goto L40
            goto L41
        L40:
            r3 = 0
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.f(java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0152 A[PHI: r13
  0x0152: PHI (r13v10 java.lang.Object) = (r13v7 java.lang.Object), (r13v1 java.lang.Object) binds: [B:24:0x014f, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r10, int r11, boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.g(java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(android.content.Intent intent, r45.j01 j01Var, boolean z17) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", this.f544542b);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", this.f544543c);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Kj(this.f544541a, j01Var, intent, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(yl2.m r7, boolean r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yl2.k0
            if (r0 == 0) goto L13
            r0 = r9
            yl2.k0 r0 = (yl2.k0) r0
            int r1 = r0.f544572f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f544572f = r1
            goto L18
        L13:
            yl2.k0 r0 = new yl2.k0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f544570d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f544572f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L6f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L86
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L96
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "handleAuthRequirement: precheckType="
            r9.<init>(r2)
            int r2 = r7.f544577a
            r9.append(r2)
            java.lang.String r2 = ", skipIntermediatePage="
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "Finder.FinderLivePostHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            r9 = -1
            int r2 = r7.f544577a
            if (r2 == r9) goto L89
            java.lang.String r7 = r7.f544578b
            if (r2 == r5) goto L7d
            r0.f544572f = r3
            java.lang.Object r9 = r6.f(r7, r2, r8, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L7a
            yl2.h r7 = yl2.h.f544547d
            goto Laa
        L7a:
            yl2.h r7 = yl2.h.f544548e
            goto Laa
        L7d:
            r0.f544572f = r4
            java.lang.Object r7 = r6.f(r7, r2, r8, r0)
            if (r7 != r1) goto L86
            return r1
        L86:
            yl2.h r7 = yl2.h.f544549f
            goto Laa
        L89:
            yl2.q r7 = r7.f544579c
            if (r7 == 0) goto La8
            r0.f544572f = r5
            java.lang.Object r9 = r6.l(r7, r8, r0)
            if (r9 != r1) goto L96
            return r1
        L96:
            jz5.l r9 = (jz5.l) r9
            java.lang.Object r7 = r9.f384366d
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La5
            yl2.h r7 = yl2.h.f544547d
            goto Laa
        La5:
            yl2.h r7 = yl2.h.f544548e
            goto Laa
        La8:
            yl2.h r7 = yl2.h.f544548e
        Laa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.i(yl2.m, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    public final java.lang.Object j(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 != -200018) {
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f544541a;
            switch (i17) {
                case -200012:
                    break;
                case -200011:
                    java.lang.Object r17 = r(this, 3, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, null, interfaceC29045xdcb5ca57, 4, null);
                    return r17 == pz5.a.f440719d ? r17 : f0Var;
                case -200010:
                    db5.t7.m123883x26a183b(activityC21401x6ce6f73f, activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4k), 0).show();
                    return f0Var;
                case -200009:
                    db5.t7.m123883x26a183b(activityC21401x6ce6f73f, activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572994d53), 0).show();
                    return f0Var;
                default:
                    db5.t7.m123883x26a183b(activityC21401x6ce6f73f, activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcd), 0).show();
                    return f0Var;
            }
        }
        java.lang.Object r18 = r(this, 0, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, null, interfaceC29045xdcb5ca57, 5, null);
        return r18 == pz5.a.f440719d ? r18 : f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r12 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(r45.qc6 r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof yl2.l0
            if (r0 == 0) goto L13
            r0 = r12
            yl2.l0 r0 = (yl2.l0) r0
            int r1 = r0.f544576f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f544576f = r1
            goto L18
        L13:
            yl2.l0 r0 = new yl2.l0
            r0.<init>(r10, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.f544574d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f544576f
            java.lang.String r8 = "Finder.FinderLivePostHelper"
            r9 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Lc0
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L93
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.String r12 = r11.m75945x2fec8307(r3)
            com.tencent.mm.ui.MMFragmentActivity r1 = r10.f544541a
            r4 = 0
            if (r12 == 0) goto L56
            int r6 = r12.length()
            if (r6 <= 0) goto L4f
            r6 = r3
            goto L50
        L4f:
            r6 = r4
        L50:
            if (r6 == 0) goto L53
            goto L54
        L53:
            r12 = r9
        L54:
            if (r12 != 0) goto L5d
        L56:
            r12 = 2131781047(0x7f1065b7, float:1.9193697E38)
            java.lang.String r12 = r1.getString(r12)
        L5d:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r12)
            r45.qp1 r6 = new r45.qp1
            r6.<init>()
            r7 = 2131781048(0x7f1065b8, float:1.9193699E38)
            java.lang.String r1 = r1.getString(r7)
            r6.set(r2, r1)
            r6.set(r3, r12)
            java.lang.String r11 = r11.m75945x2fec8307(r4)
            if (r11 != 0) goto L7a
            java.lang.String r11 = ""
        L7a:
            int r12 = r11.length()
            if (r12 <= 0) goto L81
            r4 = r3
        L81:
            if (r4 == 0) goto La9
            r4 = 0
            r12 = 4
            r7 = 0
            r5.f544576f = r3
            r1 = r10
            r2 = r11
            r3 = r6
            r6 = r12
            java.lang.Object r12 = e(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L93
            return r0
        L93:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 != 0) goto La8
            java.lang.String r11 = "#startLive skipRealnameCheck face verify failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r11)
            yl2.x r11 = new yl2.x
            r12 = 10002(0x2712, float:1.4016E-41)
            r11.<init>(r12)
            return r11
        La8:
            return r9
        La9:
            java.lang.String r11 = "#startLive skipRealnameCheck spam_jump_url is empty, show error page"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r11)
            r11 = 0
            r3 = 10002(0x2712, float:1.4016E-41)
            r12 = 1
            r7 = 0
            r5.f544576f = r2
            r1 = r10
            r2 = r11
            r4 = r6
            r6 = r12
            java.lang.Object r12 = r(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto Lc0
            return r0
        Lc0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.k(r45.qc6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(yl2.s r17, boolean r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.l(yl2.s, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object o(yl2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        java.lang.String str2 = kVar != null ? kVar.f544568b : null;
        boolean z17 = str2 == null || str2.length() == 0;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f544541a;
        if (z17) {
            str = activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5_);
        } else if (kVar == null || (str = kVar.f544568b) == null) {
            str = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC21401x6ce6f73f);
        u1Var.g(str);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        u1Var.a(true);
        u1Var.e(new yl2.u0(rVar));
        u1Var.q(false);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.lang.Object p(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f544541a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC21401x6ce6f73f, 1, true);
        k0Var.q(activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oyi), 17);
        k0Var.f293405n = new yl2.v0(1, this, 2);
        k0Var.f293414s = new yl2.w0(1, nVar, 2);
        k0Var.f293387d = new yl2.x0(nVar);
        k0Var.v();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.lang.Object q(int i17, int i18, r45.qp1 qp1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "showErrPage type:" + i17 + ", errCode:" + i18);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("LIVE_HELP_TYPE", i17);
        if (qp1Var != null) {
            intent.putExtra("LIVE_ERROR_PAGE", qp1Var.mo14344x5f01b1f6());
        }
        java.lang.Class<?> a17 = jz2.x0.f384287a.a();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f544541a;
        intent.setClass(activityC21401x6ce6f73f, a17);
        ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f.m78751x5dc77fb5(intent)).f279410a = new yl2.c1(rVar, i18);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0038. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0749 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0617 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(yl2.k r40, boolean r41, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r42) {
        /*
            Method dump skipped, instructions count: 2816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.s(yl2.k, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(yl2.p r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yl2.f1
            if (r0 == 0) goto L13
            r0 = r6
            yl2.f1 r0 = (yl2.f1) r0
            int r1 = r0.f544533f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f544533f = r1
            goto L18
        L13:
            yl2.f1 r0 = new yl2.f1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f544531d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f544533f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            int r5 = r5.f544588a
            r0.f544533f = r3
            java.lang.Object r5 = r4.j(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            yl2.x r5 = new yl2.x
            r6 = 10003(0x2713, float:1.4017E-41)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.g1.u(yl2.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ g1(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, int i17, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(activityC21401x6ce6f73f, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? java.lang.System.currentTimeMillis() : j17);
    }
}
