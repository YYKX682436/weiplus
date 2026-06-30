package fc4;

/* loaded from: classes4.dex */
public final class j0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final db5.t4 f342704d;

    /* renamed from: e, reason: collision with root package name */
    public int f342705e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f342706f;

    /* renamed from: g, reason: collision with root package name */
    public xc4.p f342707g;

    /* renamed from: h, reason: collision with root package name */
    public final dd4.e0 f342708h;

    /* renamed from: i, reason: collision with root package name */
    public wd4.l1 f342709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342704d = new fc4.g0(this);
        this.f342705e = -1;
        this.f342706f = "";
        this.f342708h = new dd4.e0();
    }

    public static final /* synthetic */ java.lang.String O6(fc4.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLocalId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.lang.String str = j0Var.f342706f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLocalId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        return str;
    }

    public final java.lang.String P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        xc4.p pVar = this.f342707g;
        if (pVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return null;
        }
        r45.jj4 R0 = pVar.R0();
        if (R0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "getCurrentMaterialPath, media is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return null;
        }
        java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.o(pVar.W0(), pVar.R0());
        if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return o17;
        }
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), R0.f459388d) + ca4.z0.R(R0);
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "getCurrentMaterialPath, mediaPath is empty");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        return null;
    }

    public final void Q6() {
        wd4.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "showShareSheet");
        xc4.p pVar = this.f342707g;
        if (pVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return;
        }
        r45.jj4 R0 = pVar.R0();
        if (R0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return;
        }
        wd4.l1 l1Var = new wd4.l1(m80379x76847179(), 4);
        l1Var.b(pVar.c1(), R0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) == 0) {
            arrayList.add(1003);
        }
        j45.l.g("favorite");
        arrayList.add(1006);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSecondMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(1013);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) == 0) {
            java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.o(pVar.W0(), R0);
            if (!com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.m(pVar.W0());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pf5.o.TAG, "initSecondMenu get relocated video path: %s", o17);
            }
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(m158359x1e885992().getStringExtra("intent_thumbpath"));
            boolean z17 = !android.text.TextUtils.isEmpty(o17) && com.p314xaae8f345.mm.vfs.w6.j(o17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "config can forward sight, thumb existed %B, video existed %B", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(z17));
            if (j17 && z17) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                c5348xb8e1a564.f135674g.f87754c = pVar.W0();
                c5348xb8e1a564.e();
                if (c5348xb8e1a564.f135675h.f87869a) {
                    arrayList2.add(1008);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSecondMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        l1Var.n(arrayList, arrayList2, null);
        l1Var.l(this.f342704d);
        l1Var.k(fc4.h0.f342695d);
        l1Var.m();
        this.f342709i = l1Var;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2184x67fe93cb.ActivityC18194xa82f7027 activityC18194xa82f7027 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2184x67fe93cb.ActivityC18194xa82f7027) m158354x19263085;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC18194xa82f7027).a(fc4.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        fc4.j0 j0Var = (fc4.j0) a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.lang.String P6 = j0Var.P6();
        if (P6 == null || P6.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            gVar = null;
        } else {
            wd4.g gVar2 = new wd4.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.b(P6, "mp4"), bi1.g.SNS_VIDEO);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            gVar = gVar2;
        }
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandOpenMaterials_SnsFlexibleVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials");
        } else {
            java.lang.String P62 = j0Var.P6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsFlexibleVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + gVar);
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC18194xa82f7027), null, null, new wd4.q1(activityC18194xa82f7027, gVar, j0Var, P62, null), 3, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R6(java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "startDownload"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r8 instanceof fc4.i0
            if (r2 == 0) goto L1b
            r2 = r8
            fc4.i0 r2 = (fc4.i0) r2
            int r3 = r2.f342702g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f342702g = r3
            goto L20
        L1b:
            fc4.i0 r2 = new fc4.i0
            r2.<init>(r6, r8)
        L20:
            java.lang.Object r8 = r2.f342700e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f342702g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r7 = r2.f342699d
            java.lang.String r7 = (java.lang.String) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L53
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r7
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r2.f342699d = r7
            r2.f342702g = r5
            dd4.e0 r8 = r6.f342708h
            r4 = 30
            java.lang.Object r8 = r8.b(r4, r2)
            if (r8 != r3) goto L53
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L53:
            java.lang.String r8 = (java.lang.String) r8
            com.p314xaae8f345.mm.vfs.w6.c(r8, r7)
            boolean r7 = com.p314xaae8f345.mm.vfs.w6.j(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.j0.R6(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.Collection collection;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        r45.jj4 jj4Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        if (4097 == i17 && intent != null && -1 == i18) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            int i19 = 0;
            java.util.List g17 = new r26.t(",").g(stringExtra, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f395529d;
            java.util.ArrayList<java.lang.String> P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P1, "stringsToList(...)");
            for (java.lang.String str2 : P1) {
                if (this.f342705e == 0 && (k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f342706f)) != null) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6062xcd2adb6c c6062xcd2adb6c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6062xcd2adb6c();
                        java.lang.String T = ca4.z0.T(k17);
                        am.tv tvVar = c6062xcd2adb6c.f136344g;
                        tvVar.f89570a = T;
                        k17.m70363x51f8f990();
                        tvVar.getClass();
                        c6062xcd2adb6c.e();
                    } else {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6063x29d45c19 c6063x29d45c19 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6063x29d45c19();
                        java.lang.String T2 = ca4.z0.T(k17);
                        am.uv uvVar = c6063x29d45c19.f136345g;
                        uvVar.f89672a = T2;
                        k17.m70363x51f8f990();
                        uvVar.getClass();
                        c6063x29d45c19.e();
                    }
                }
                xc4.p pVar = this.f342707g;
                if (pVar != null && (h17 = pVar.h1()) != null && (a90Var = h17.f39014x86965dde) != null && (linkedList = a90Var.f451373h) != null && (jj4Var = (r45.jj4) kz5.n0.a0(linkedList, i19)) != null) {
                    java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.o(this.f342706f, jj4Var);
                    int S = ca4.z0.S(o17);
                    java.lang.String q17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.q(jj4Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineVideoActivity", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", str2, o17, q17, jj4Var.f459408x, java.lang.Integer.valueOf(jj4Var.A), java.lang.Integer.valueOf(S));
                    if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                        str = o17;
                    } else {
                        java.lang.String m17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.m(this.f342706f);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsOnlineVideoActivity", "shareSendVideo get relocated video path: %s", m17);
                        str = m17;
                    }
                    if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(q17) || !com.p314xaae8f345.mm.vfs.w6.j(str) || !com.p314xaae8f345.mm.vfs.w6.j(q17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsOnlineVideoActivity", "send video error");
                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.e()) {
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ihu), null, m158354x19263085(), null, null);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
                        return;
                    }
                    ((dk5.s5) tg3.t1.a()).nj(m158354x19263085(), str2, str, q17, 43, S, false, false, h17.f39040xbd345fc4, null);
                    wf0.q1 q1Var = (wf0.q1) i95.n0.c(wf0.q1.class);
                    xc4.p pVar2 = this.f342707g;
                    ((vf0.w1) q1Var).Ai(pVar2 != null ? pVar2.W0() : null);
                    if (stringExtra2 != null) {
                        ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str2);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, m158354x19263085(), null, null);
                }
                i19 = 0;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        this.f342705e = m158359x1e885992().getIntExtra("intent_from_scene", -1);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("intent_localid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f342706f = stringExtra;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        xc4.p a76 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).a7(this.f342706f);
        this.f342707g = a76;
        if (a76 != null) {
            dd4.e0 e0Var = this.f342708h;
            android.app.Activity m80379x76847179 = m80379x76847179();
            android.view.KeyEvent.Callback mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rpo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
            e0Var.d(m80379x76847179, (dd4.t0) mo144222x4ff8c0f0, a76);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        this.f342708h.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }
}
