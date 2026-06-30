package c61;

/* loaded from: classes11.dex */
public final class da implements com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f120475d;

    public da() {
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.z0.c(b17, null);
        this.f120475d = b17;
        jz5.h.b(c61.w9.f120920d);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(2:3|(7:5|6|7|(1:(1:(1:(12:12|13|14|15|16|17|18|19|20|(1:22)|23|24)(2:38|39))(2:40|41))(2:83|84))(2:85|(1:(2:88|(1:91)(2:90|84))(2:92|(1:95)(2:94|41)))(4:96|56|(1:58)(1:81)|(6:67|68|69|(1:71)(1:77)|72|(1:75)(9:74|16|17|18|19|20|(0)|23|24))(4:62|(1:64)|65|66)))|42|(1:82)(1:46)|(10:55|56|(0)(0)|(1:60)|67|68|69|(0)(0)|72|(0)(0))(4:50|(1:52)|53|54)))|100|6|7|(0)(0)|42|(1:44)|82|(1:48)|55|56|(0)(0)|(0)|67|68|69|(0)(0)|72|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0244, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0245, code lost:
    
        r4 = r1;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02c6, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(c61.da r27, java.lang.String r28, boolean r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.da.a(c61.da, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: getAvatarInfo */
    public void mo14246xd633fd9d(java.lang.String username, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f120475d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new c61.x9(this, username, z17, callback, null), 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: getDisplayName */
    public java.lang.String mo14247x40021d37(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(username);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getDisplayName(...)");
        return e17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: getRecentForwardUserInfo */
    public void mo14248x5d4bab6d(long j17, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList Ui = ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).Ui();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = Ui.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            o25.m2 m2Var = (o25.m2) it.next();
            if (i17 >= j17) {
                break;
            }
            arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24636x2cf85f35(m2Var.f424093a, m2Var.f424094b));
            i17++;
        }
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: getSelfUsername */
    public java.lang.String mo14249xaa3e42b8() {
        java.lang.String r17 = c01.z1.r();
        return r17 == null ? "" : r17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: getUin */
    public java.lang.String mo14250xb5887524() {
        java.lang.String j17 = gm0.j1.b().j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getUinString(...)");
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: getUserInfo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14251x6bf3248f(java.lang.String r13, boolean r14, yz5.l r15) {
        /*
            r12 = this;
            java.lang.String r0 = "username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            java.lang.String r0 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r0)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            r2 = 1
            com.tencent.mm.storage.z3 r1 = r1.n(r13, r2)
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            com.tencent.mm.storage.z3 r0 = r0.n(r13, r2)
            java.lang.Class<kv.a0> r3 = kv.a0.class
            i95.m r3 = i95.n0.c(r3)     // Catch: java.lang.Exception -> Lba
            kv.a0 r3 = (kv.a0) r3     // Catch: java.lang.Exception -> Lba
            com.tencent.mm.feature.avatar.w r3 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r3     // Catch: java.lang.Exception -> Lba
            r3.getClass()     // Catch: java.lang.Exception -> Lba
            com.tencent.mm.modelavatar.z r3 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai()     // Catch: java.lang.Exception -> Lba
            java.lang.String r4 = r3.j(r13, r14)     // Catch: java.lang.Exception -> Lba
            int r5 = r4.length()     // Catch: java.lang.Exception -> Lba
            if (r5 != 0) goto L4b
            r5 = r2
            goto L4c
        L4b:
            r5 = 0
        L4c:
            if (r5 != 0) goto L54
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r4)     // Catch: java.lang.Exception -> Lba
            if (r4 != 0) goto L5b
        L54:
            java.lang.String r14 = r3.j(r13, r14)     // Catch: java.lang.Exception -> Lba
            com.p314xaae8f345.mm.vfs.w6.j(r14)     // Catch: java.lang.Exception -> Lba
        L5b:
            java.lang.Class<tg3.v0> r14 = tg3.v0.class
            i95.m r14 = i95.n0.c(r14)     // Catch: java.lang.Exception -> Lba
            tg3.v0 r14 = (tg3.v0) r14     // Catch: java.lang.Exception -> Lba
            sg3.a r14 = (sg3.a) r14     // Catch: java.lang.Exception -> Lba
            r14.getClass()     // Catch: java.lang.Exception -> Lba
            java.lang.String r6 = c01.a2.e(r13)     // Catch: java.lang.Exception -> Lba
            if (r1 == 0) goto L75
            int r14 = r1.I     // Catch: java.lang.Exception -> Lba
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Exception -> Lba
            goto L76
        L75:
            r14 = 0
        L76:
            if (r14 != 0) goto L79
            goto L83
        L79:
            int r1 = r14.intValue()     // Catch: java.lang.Exception -> Lba
            if (r1 != r2) goto L83
            java.lang.String r14 = "male"
        L81:
            r7 = r14
            goto L94
        L83:
            if (r14 != 0) goto L86
            goto L90
        L86:
            int r14 = r14.intValue()     // Catch: java.lang.Exception -> Lba
            r1 = 2
            if (r14 != r1) goto L90
            java.lang.String r14 = "female"
            goto L81
        L90:
            java.lang.String r14 = "unknown"
            goto L81
        L94:
            java.lang.String r14 = t41.g.a(r0)     // Catch: java.lang.Exception -> Lba
            if (r14 != 0) goto L9c
            java.lang.String r14 = ""
        L9c:
            r9 = r14
            boolean r8 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(r13)     // Catch: java.lang.Exception -> Lba
            com.tencent.pigeon.mm_foundation.UserInfoResponse r14 = new com.tencent.pigeon.mm_foundation.UserInfoResponse     // Catch: java.lang.Exception -> Lba
            r5 = 0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)     // Catch: java.lang.Exception -> Lba
            r10 = 2
            r11 = 0
            r3 = r14
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lba
            java.lang.Object r13 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r14)     // Catch: java.lang.Exception -> Lba
            kotlin.Result r13 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r13)     // Catch: java.lang.Exception -> Lba
            r15.mo146xb9724478(r13)     // Catch: java.lang.Exception -> Lba
            goto Lcc
        Lba:
            r13 = move-exception
            kotlin.Result$Companion r14 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r13 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r13)
            java.lang.Object r13 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r13)
            kotlin.Result r13 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r13)
            r15.mo146xb9724478(r13)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.da.mo14251x6bf3248f(java.lang.String, boolean, yz5.l):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: isLogin */
    public boolean mo14252x7b0e9c5f() {
        return gm0.j1.a();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: isOverseaUser */
    public boolean mo14253xb8365dc() {
        return c01.e2.a0();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: isTeenMode */
    public boolean mo14254x74219ae7() {
        return ((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9.Companion.m91078x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f120475d = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9.Companion.m91078x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f120475d, null, 1, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24561xcf557d9
    /* renamed from: removeForwardUser */
    public void mo14255xdb37fd0c(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24636x2cf85f35 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).fj(info.m91348x6bf53a6c());
    }
}
