package dd4;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public xc4.p f310523a;

    /* renamed from: b, reason: collision with root package name */
    public dd4.t0 f310524b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f310525c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f310526d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18283xaceb32fa f310527e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1] */
    public e0() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f310527e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1
            {
                this.f39173x3fe91575 = 413312424;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 c6109xec0badb8) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6109xec0badb8 event = c6109xec0badb8;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ix ixVar = event.f136385g;
                int i17 = ixVar.f88513a;
                java.lang.String str = ixVar.f88516d;
                dd4.e0 e0Var = dd4.e0.this;
                xc4.p a17 = dd4.e0.a(e0Var);
                java.lang.String W0 = a17 != null ? a17.W0() : null;
                boolean z17 = false;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, W0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlexibleShareHelper", hashCode() + " menu local id[" + str + " cur:" + W0 + " opcode:" + i17 + ' ');
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = e0Var.f310526d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                    if (r2Var != null && r2Var.a()) {
                        z17 = true;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlexibleShareHelper", "repeat job,ignore");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                    } else {
                        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new dd4.a0(event, e0Var, null), 3, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                        e0Var.f310526d = d17;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                    }
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                return z17;
            }
        };
    }

    public static final /* synthetic */ xc4.p a(dd4.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        xc4.p pVar = e0Var.f310523a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        return pVar;
    }

    public final java.lang.Object b(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleResourceDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        xc4.p pVar = this.f310523a;
        if (pVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleResourceDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
            return "";
        }
        java.lang.Object c17 = c(i17, pVar.R0(), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleResourceDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        return c17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r9, r45.jj4 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r8 = this;
            java.lang.String r0 = "handleResourceDownload"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r11 instanceof dd4.z
            if (r2 == 0) goto L1b
            r2 = r11
            dd4.z r2 = (dd4.z) r2
            int r3 = r2.f310613f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f310613f = r3
            goto L20
        L1b:
            dd4.z r2 = new dd4.z
            r2.<init>(r8, r11)
        L20:
            java.lang.Object r11 = r2.f310611d
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f310613f
            java.lang.String r5 = ""
            r6 = 1
            java.lang.String r7 = "MicroMsg.FlexibleShareHelper"
            if (r4 == 0) goto L3e
            if (r4 != r6) goto L33
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r9
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            xc4.p r11 = r8.f310523a
            if (r11 != 0) goto L49
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        L49:
            java.lang.String r11 = r11.W0()
            java.lang.String r10 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.o(r11, r10)
            boolean r11 = com.p314xaae8f345.mm.vfs.w6.j(r10)
            if (r11 == 0) goto L6c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "fileExists:"
            r9.<init>(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r9)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        L6c:
            java.lang.String r10 = "requestFullDownload start"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r10)
            dd4.t0 r10 = r8.f310524b
            if (r10 == 0) goto L87
            r2.f310613f = r6
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r10 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) r10
            java.lang.Object r11 = r10.t(r9, r2)
            if (r11 != r3) goto L84
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L84:
            java.lang.String r11 = (java.lang.String) r11
            goto L88
        L87:
            r11 = 0
        L88:
            java.lang.String r9 = "requestFullDownload finish"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r9)
            boolean r9 = com.p314xaae8f345.mm.vfs.w6.j(r11)
            if (r9 != 0) goto Lac
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            java.lang.String r10 = " file not exist!"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r9)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        Lac:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dd4.e0.c(int, r45.jj4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(android.content.Context context, dd4.t0 downloader, xc4.p info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepare", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloader, "downloader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f310523a = info;
        this.f310525c = context;
        this.f310524b = downloader;
        mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepare", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        mo48814x2efc64();
        this.f310523a = null;
        this.f310525c = null;
        this.f310524b = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f310526d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f310526d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
    }
}
