package mm1;

/* loaded from: classes11.dex */
public final class b0 implements rv.j2, p3325xe03a0797.p3326xc267989b.y0 {

    /* renamed from: i, reason: collision with root package name */
    public static um1.a f410168i;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f410169m;

    /* renamed from: n, reason: collision with root package name */
    public static bw5.x2 f410170n;

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f410171d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f410172e;

    /* renamed from: f, reason: collision with root package name */
    public pi0.l1 f410173f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f410174g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f410175h;

    static {
        new mm1.q(null);
        f410169m = jz5.h.b(mm1.p.f410218d);
        f410170n = bw5.x2.BizAudioEnterScene_Unknown;
    }

    public b0() {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f410171d = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null));
        this.f410172e = "";
        this.f410174g = "BizAudioRouter";
        jz5.h.b(mm1.z.f410266d);
        this.f410175h = jz5.h.b(new mm1.u(this));
        tm1.h hVar = tm1.h.f502003a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioController", "initBizAudioPlayTaskController");
        hVar.b();
        ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).getClass();
        if (mm1.o.f410216e) {
            return;
        }
        mm1.o.f410216e = true;
        int i17 = jm4.j1.f381926d;
        p3380x6a61f93.p3381xf512d0a5.C30438x21b32f33.m168991x21b18cb5(mm1.o.f410215d);
    }

    public static java.lang.Object g(mm1.b0 b0Var, pi0.l1 l1Var, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, java.lang.Long l17, android.os.Bundle bundle, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        java.lang.Long l18 = (i17 & 4) != 0 ? null : l17;
        android.os.Bundle bundle2 = (i17 & 8) != 0 ? null : bundle;
        b0Var.getClass();
        if (bundle2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBizStyle extras, count: ");
            sb6.append(bundle2.size());
            sb6.append(", keys: ");
            java.util.Set<java.lang.String> keySet = bundle2.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "keySet(...)");
            sb6.append(kz5.n0.g0(keySet, ", ", null, null, 0, null, null, 62, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", sb6.toString());
            bundle2.remove("key_listen_sync_item_type");
            bundle2.remove("key_enter_tab");
            bundle2.remove("key_red_dot_buffer");
            bundle2.remove("key_active_ext_info");
            bundle2.remove("key_discover_entrance_reddot");
            android.os.Parcel obtain = android.os.Parcel.obtain();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
            bundle2.writeToParcel(obtain, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "showBizStyle extras after, count: " + bundle2.size() + ", size: " + obtain.dataSize());
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new mm1.a0(bundle2, b0Var, l1Var, context, c10716x931597c6, l18, null), 3, null);
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof mm1.r
            if (r0 == 0) goto L13
            r0 = r11
            mm1.r r0 = (mm1.r) r0
            int r1 = r0.f410226i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410226i = r1
            goto L18
        L13:
            mm1.r r0 = new mm1.r
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f410224g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f410226i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f410221d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lb5
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            long r4 = r0.f410223f
            boolean r10 = r0.f410222e
            java.lang.Object r2 = r0.f410221d
            mm1.b0 r2 = (mm1.b0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L71
        L41:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "MicroMsg.BizAudioRouter"
            java.lang.String r2 = "cancelDelayTerminal"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r2)
            jz5.g r11 = r9.f410175h
            jz5.n r11 = (jz5.n) r11
            java.lang.Object r11 = r11.mo141623x754a37bb()
            fv.k r11 = (fv.k) r11
            r11.b()
            pi0.l1 r11 = r9.f410173f
            if (r11 != 0) goto Lb8
            r0.f410221d = r9
            r0.f410222e = r10
            r0.f410223f = r5
            r0.f410226i = r4
            java.lang.Object r11 = r9.c(r0)
            if (r11 != r1) goto L6f
            return r1
        L6f:
            r2 = r9
            r4 = r5
        L71:
            r6 = r11
            pi0.l1 r6 = (pi0.l1) r6
            r2.f410173f = r6
            java.lang.String r7 = r2.f410174g
            r6.b(r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            jz5.l r7 = new jz5.l
            java.lang.String r8 = "coldBootInPlayer"
            r7.<init>(r8, r10)
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r4)
            jz5.l r4 = new jz5.l
            java.lang.String r5 = "coldBootClickTime"
            r4.<init>(r5, r10)
            java.lang.Integer r10 = new java.lang.Integer
            r5 = 0
            r10.<init>(r5)
            jz5.l r5 = new jz5.l
            java.lang.String r8 = "coldBootScene"
            r5.<init>(r8, r10)
            jz5.l[] r10 = new jz5.l[]{r7, r4, r5}
            java.util.Map r10 = kz5.c1.k(r10)
            r0.f410221d = r11
            r0.f410226i = r3
            java.lang.String r3 = "audio_player"
            java.lang.Object r10 = r2.f(r6, r3, r10, r0)
            if (r10 != r1) goto Lb4
            return r1
        Lb4:
            r10 = r11
        Lb5:
            r11 = r10
            pi0.l1 r11 = (pi0.l1) r11
        Lb8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mm1.b0.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "biz_audio", kz5.n0.t0(kz5.c0.i(new sy5.e(), new vm1.x0(), new vm1.p(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null), new vm1.i(), new vm1.n(), new vm1.j(), new lx.v5(), new com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1246xd2ae381c.p1247xc5476f33.C12828xfc1a82b2()), ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).nj()), false, null, 24, null);
    }

    public void d(android.content.Context context, android.os.Bundle bundle, bw5.x2 enterScene, qk.a aVar, il4.e eVar, java.lang.Boolean bool, yz5.a aVar2, bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "goToBizAudioFlutterActivity, enterScene: " + enterScene);
        int i17 = enterScene == bw5.x2.BizAudioEnterScene_Unknown ? f410170n.f116464d : enterScene.f116464d;
        boolean z17 = eVar != null ? eVar.f373661y : false;
        tm1.i.f502012a = z17;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o.f299294b.g(z17);
        p3325xe03a0797.p3326xc267989b.l.d(this, null, null, new mm1.w(this, i17, bool, aVar, z17, context, bundle, enterScene, lp0Var, aVar2, null), 3, null);
    }

    public void e(il4.e ext, java.util.List contexts) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contexts, "contexts");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : contexts) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.j((bw5.v70) obj);
            lp0Var.g("ting_" + i17);
            arrayList.add(lp0Var);
            i17 = i18;
        }
        bw5.o50 o50Var = new bw5.o50();
        o50Var.i("1018");
        o50Var.j(2);
        o50Var.k(16);
        bw5.pp0 pp0Var = new bw5.pp0();
        bw5.op0 op0Var = new bw5.op0();
        op0Var.f112720e.addAll(contexts);
        op0Var.f112721f[2] = true;
        pp0Var.f113322o = op0Var;
        pp0Var.E[9] = true;
        ((b66.i) tm1.h.f502003a.a()).e();
        if (kz5.n0.Z(arrayList) != null) {
            ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).aj((bw5.lp0) kz5.n0.X(arrayList), arrayList, o50Var, pp0Var, ext);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "playAndOpenFocusUpdateWithContexts fail: tingItemList.first is empty!");
        }
        p3325xe03a0797.p3326xc267989b.l.d(this, null, null, new mm1.y(this, "1018", pp0Var, null), 3, null);
    }

    public final java.lang.Object f(pi0.l1 l1Var, java.lang.String str, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", "pushWithDefaultParams, routeName: " + str + ", params: " + map);
        java.util.Map l17 = kz5.c1.l(new jz5.l("enableMiniProgram", 1), new jz5.l("isWechatUser", 1), new jz5.l("audioNew", java.lang.Boolean.TRUE), new jz5.l("reset_home", 0), new jz5.l("player_expand", 0));
        if (map == null) {
            map = kz5.q0.f395534d;
        }
        l17.putAll(map);
        java.lang.Object o17 = l1Var.o(str, l17, interfaceC29045xdcb5ca57);
        return o17 == pz5.a.f440719d ? o17 : jz5.f0.f384359a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF93115e() {
        return this.f410171d;
    }
}
