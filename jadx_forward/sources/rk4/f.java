package rk4;

/* loaded from: classes11.dex */
public final class f implements qk.j6 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f478170a = jz5.h.b(rk4.e.f478156d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f478171b = jz5.h.b(rk4.d.f478138d);

    public final rv.k2 A() {
        return (rv.k2) ((jz5.n) this.f478170a).mo141623x754a37bb();
    }

    @Override // qk.j6
    public int a() {
        ((mm1.f0) A()).getClass();
        return (int) tm1.h.f502003a.b().m();
    }

    @Override // qk.j6
    public bw5.lp0 b() {
        ((mm1.f0) A()).getClass();
        return ((b66.q) tm1.h.f502003a.b()).g();
    }

    @Override // qk.j6
    public void c(float f17) {
        ((mm1.f0) A()).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioServicesImpl", "setPlayRate " + f17);
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169700x21b814a1(((b66.q) tm1.h.f502003a.b()).m105978x2737f10(), f17);
    }

    @Override // qk.j6
    public int d() {
        ((mm1.f0) A()).getClass();
        return (int) tm1.h.f502003a.b().s();
    }

    @Override // qk.j6
    public boolean e(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        return ((mm1.f0) A()).Vi(id6);
    }

    @Override // qk.j6
    public java.lang.String f(int i17) {
        bw5.lp0 g17;
        mm1.f0 f0Var = (mm1.f0) A();
        f0Var.getClass();
        b66.n b17 = tm1.h.f502003a.b();
        if (!f0Var.Di() || (g17 = ((b66.q) b17).g()) == null) {
            return null;
        }
        return g17.b();
    }

    @Override // qk.j6
    public void g(bw5.o50 categoryItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItem, "categoryItem");
        ((mm1.f0) A()).getClass();
        b66.q qVar = (b66.q) tm1.h.f502003a.b();
        b66.a e17 = qVar.e();
        bw5.dr0 a17 = e17 != null ? ((b66.c) e17).a() : null;
        if (a17 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.b().b().c(), categoryItem.c())) {
            return;
        }
        java.lang.String c17 = categoryItem.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getCategoryId(...)");
        if (c17.length() > 0) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169674x21b10d0f(qVar.m105978x2737f10());
        }
    }

    @Override // qk.j6
    /* renamed from: getDuration */
    public int mo160353x51e8b0a() {
        ((mm1.f0) A()).getClass();
        return (int) tm1.h.f502003a.b().k();
    }

    @Override // qk.j6
    /* renamed from: getType */
    public qk.p9 mo160354xfb85f7b0() {
        return qk.p9.f445846e;
    }

    @Override // qk.j6
    public float h() {
        ((mm1.f0) A()).getClass();
        return tm1.h.f502003a.b().h();
    }

    @Override // qk.j6
    public qk.ia i() {
        return ((mm1.f0) A()).Ai();
    }

    @Override // qk.j6
    /* renamed from: isAvailable */
    public boolean mo160355x1a7eccbf() {
        return ((mm1.f0) A()).Di();
    }

    @Override // qk.j6
    public b66.z j() {
        ((mm1.f0) A()).getClass();
        return (b66.z) ((jz5.n) tm1.h.f502006d).mo141623x754a37bb();
    }

    @Override // qk.j6
    public void k(java.lang.String taskId, bw5.lp0 item, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        ((mm1.f0) A()).Zi(item, ext);
    }

    @Override // qk.j6
    public b66.j l() {
        ((mm1.f0) A()).getClass();
        return (b66.j) ((jz5.n) tm1.h.f502007e).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007d, code lost:
    
        if (java.lang.Character.digit((int) r8.charAt(0), 10) < 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // qk.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(qk.p9 r7, java.lang.String r8, bw5.v70 r9, java.lang.String r10) {
        /*
            r6 = this;
            jz5.g r0 = r6.f478171b
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            qk.p9 r0 = qk.p9.f445846e
            r2 = 1
            if (r7 != r0) goto L18
            return r2
        L18:
            if (r8 != 0) goto L1f
            if (r9 != 0) goto L1f
            if (r10 != 0) goto L1f
            return r1
        L1f:
            if (r9 == 0) goto L2e
            byte[] r7 = r9.mo14344x5f01b1f6()
            java.lang.String r0 = ""
            boolean r7 = p3380x6a61f93.p3382xf513feca.C30526x21b2a946.m169584x21b4b96a(r0, r7)
            if (r7 == 0) goto L2e
            return r2
        L2e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "isValidListenId "
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "TingFlutterPluginHelperImpl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            r0 = 0
            if (r7 == 0) goto L4b
        L49:
            r7 = r1
            goto L8e
        L4b:
            if (r8 == 0) goto L89
            r7 = 10
            r26.a.a(r7)
            int r3 = r8.length()
            if (r3 == 0) goto L89
            if (r3 == r2) goto L75
            char r4 = r8.charAt(r1)
            r5 = 45
            if (r4 != r5) goto L64
            r4 = r2
            goto L65
        L64:
            r4 = r1
        L65:
            if (r4 >= r3) goto L80
            char r5 = r8.charAt(r4)
            int r5 = java.lang.Character.digit(r5, r7)
            if (r5 >= 0) goto L72
            goto L89
        L72:
            int r4 = r4 + 1
            goto L65
        L75:
            char r3 = r8.charAt(r1)
            int r3 = java.lang.Character.digit(r3, r7)
            if (r3 >= 0) goto L80
            goto L89
        L80:
            java.math.BigInteger r3 = new java.math.BigInteger
            r26.a.a(r7)
            r3.<init>(r8, r7)
            goto L8a
        L89:
            r3 = r0
        L8a:
            if (r3 != 0) goto L8d
            goto L49
        L8d:
            r7 = r2
        L8e:
            if (r7 == 0) goto La0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            if (r9 == 0) goto L99
            byte[] r0 = r9.mo14344x5f01b1f6()
        L99:
            boolean r7 = p3380x6a61f93.p3382xf513feca.C30526x21b2a946.m169584x21b4b96a(r8, r0)
            if (r7 == 0) goto La0
            return r2
        La0:
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r10)
            if (r7 != 0) goto Lb0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10)
            boolean r7 = p3380x6a61f93.p3382xf513feca.C30526x21b2a946.m169585x21b94ad2(r10)
            if (r7 == 0) goto Lb0
            return r2
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.f.m(qk.p9, java.lang.String, bw5.v70, java.lang.String):boolean");
    }

    @Override // qk.j6
    public void n(boolean z17) {
        if (z17) {
            ((mm1.f0) A()).getClass();
            ((b66.i) tm1.h.f502003a.a()).d();
        } else {
            ((mm1.f0) A()).getClass();
            ((b66.i) tm1.h.f502003a.a()).e();
        }
    }

    @Override // qk.j6
    /* renamed from: next */
    public boolean mo160356x338af3() {
        ((mm1.f0) A()).getClass();
        b66.n b17 = tm1.h.f502003a.b();
        if (b17 == null) {
            return false;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169710x21b973ff(((b66.q) b17).m105978x2737f10());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (r8 != 4) goto L108;
     */
    @Override // qk.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject o(bw5.lp0 r8, float r9) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.f.o(bw5.lp0, float):org.json.JSONObject");
    }

    @Override // qk.j6
    public void p(boolean z17) {
    }

    @Override // qk.j6
    /* renamed from: pause */
    public boolean mo160357x65825f6() {
        ((mm1.f0) A()).getClass();
        b66.m.a(tm1.h.f502003a.b(), null, 1, null);
        return true;
    }

    @Override // qk.j6
    public boolean q(java.lang.String str) {
        return ((mm1.f0) A()).Ui(str);
    }

    @Override // qk.j6
    public void r(android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, bw5.o50 o50Var, android.os.Bundle bundle, bw5.ar0 enterScene, qk.a aVar, java.lang.Boolean bool, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        mm1.b0 b0Var = (mm1.b0) ((mm1.f0) A()).Bi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goToBizAudioPlayerActivity play: ");
        sb6.append(z17);
        sb6.append(", withFloatBall: ");
        sb6.append(eVar != null ? java.lang.Boolean.valueOf(eVar.f373640d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioRouter", sb6.toString());
        if (lp0Var != null && lp0Var.d() != null && !il4.l.m(lp0Var.d().f115722e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizAudioRouter", "goToBizAudioPlayerActivity not support listenType, title: %s, listenId: %s", rk4.j5.j(lp0Var), lp0Var.d().m13170xcc16feb8());
            return;
        }
        if (eVar != null) {
            eVar.f373652p = lp0Var != null ? lp0Var.b() : null;
        }
        boolean z18 = eVar != null ? eVar.f373661y : false;
        tm1.i.f502012a = z18;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o.f299294b.g(z18);
        p3325xe03a0797.p3326xc267989b.l.d(b0Var, null, null, new mm1.x(b0Var, lp0Var, eVar, context, bool, aVar, z18, bundle, z17, null, o50Var, aVar2, null), 3, null);
    }

    @Override // qk.j6
    /* renamed from: resume */
    public boolean mo160358xc84dc82d() {
        mm1.f0 f0Var = (mm1.f0) A();
        f0Var.getClass();
        b66.n task = tm1.h.f502003a.b();
        if (!f0Var.Ri()) {
            return false;
        }
        b66.m.b(task, null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        return true;
    }

    @Override // qk.j6
    public void s(boolean z17) {
        ((mm1.f0) A()).getClass();
        b66.n b17 = tm1.h.f502003a.b();
        if (b17 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169687x21b2a01f(((b66.q) b17).m105978x2737f10(), z17, true);
        }
    }

    @Override // qk.j6
    /* renamed from: seekTo */
    public boolean mo160359xc9fc1b13(long j17) {
        ((mm1.f0) A()).getClass();
        b66.n b17 = tm1.h.f502003a.b();
        if (b17 == null) {
            return false;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169685x21b226bd(((b66.q) b17).m105978x2737f10(), j17);
        return true;
    }

    @Override // qk.j6
    /* renamed from: stop */
    public boolean mo160360x360802() {
        ((mm1.f0) A()).getClass();
        b66.n b17 = tm1.h.f502003a.b();
        if (b17 == null) {
            return false;
        }
        ((b66.q) b17).m9898x360802();
        return true;
    }

    @Override // qk.j6
    public void t(int i17) {
        ((mm1.f0) A()).getClass();
        b66.n b17 = tm1.h.f502003a.b();
        if (b17 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169712x21b9fe69(((b66.q) b17).m105978x2737f10(), i17, true);
        }
    }

    @Override // qk.j6
    public boolean u() {
        return ((mm1.f0) A()).Ri();
    }

    @Override // qk.j6
    public android.content.Context v() {
        ((mm1.f0) A()).getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // qk.j6
    public void w(bw5.lp0 lp0Var, java.util.List list, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        ((mm1.f0) A()).aj(lp0Var, list, o50Var, pp0Var, ext);
    }

    @Override // qk.j6
    public bw5.cr0 x() {
        A().getClass();
        return null;
    }

    @Override // qk.j6
    public boolean y() {
        ((mm1.f0) A()).getClass();
        b66.n b17 = tm1.h.f502003a.b();
        if (b17 == null) {
            return false;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169711x21b9fe47(((b66.q) b17).m105978x2737f10());
        return true;
    }

    @Override // qk.j6
    public void z(java.lang.String listenId, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        mm1.f0 f0Var = (mm1.f0) A();
        f0Var.getClass();
        pm0.v.X(new mm1.e0(ext, listenId, f0Var));
    }
}
