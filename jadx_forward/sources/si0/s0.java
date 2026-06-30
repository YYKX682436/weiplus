package si0;

/* loaded from: classes4.dex */
public final class s0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f489698d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f489698d = c17933xe8d1b226;
    }

    public static final void a(si0.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, bw5.nk0 nk0Var) {
        s0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nk0Var.f112247g, "getIncludeFriends(...)");
        if (!r3.isEmpty()) {
            c19806x4c372b7.f38967x15579d0d |= 512;
        } else {
            c19806x4c372b7.f38967x15579d0d &= -513;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nk0Var.f112245e, "getIncludeLabels(...)");
        if (!r3.isEmpty()) {
            c19806x4c372b7.f38967x15579d0d |= 512;
        } else {
            c19806x4c372b7.f38967x15579d0d &= -513;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nk0Var.f112253p, "getExcludeFriends(...)");
        if (!r3.isEmpty()) {
            c19806x4c372b7.f38967x15579d0d |= 2;
        } else {
            c19806x4c372b7.f38967x15579d0d &= -3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nk0Var.f112251n, "getExcludeLabels(...)");
        if (!r3.isEmpty()) {
            c19806x4c372b7.f38967x15579d0d |= 1024;
        } else {
            c19806x4c372b7.f38967x15579d0d &= -1025;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nk0Var.f112249i, "getInteractFriends(...)");
        if (!r3.isEmpty()) {
            c19806x4c372b7.f38967x15579d0d |= 4096;
        } else {
            c19806x4c372b7.f38967x15579d0d &= -4097;
        }
        cj0.a aVar = cj0.a.f123386a;
        java.util.ArrayList f17 = aVar.f(nk0Var);
        ca4.e1 e1Var = ca4.f1.f121430a;
        c19806x4c372b7.f38975x1f0e1eca = e1Var.v(f17);
        c19806x4c372b7.f38976xa7abf065 = nk0Var.f112247g.size();
        c19806x4c372b7.f38971xffe88d2 = new java.util.LinkedList<>(aVar.g(nk0Var));
        c19806x4c372b7.f38972xbc148b5d = nk0Var.f112245e.size();
        c19806x4c372b7.f38960xc6d7bd1d = e1Var.v(aVar.a(nk0Var));
        c19806x4c372b7.f38961xa0d74df2 = nk0Var.f112253p.size();
        c19806x4c372b7.f38958xbe522252 = new java.util.LinkedList<>(aVar.b(nk0Var));
        c19806x4c372b7.f38959xf984e1dd = nk0Var.f112251n.size();
        c19806x4c372b7.f38995x9ed6b7fa = e1Var.v(aVar.i(nk0Var));
        c19806x4c372b7.f38994x3b843533 = nk0Var.f112249i.size();
    }

    public static final void b(si0.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        s0Var.getClass();
        c19806x4c372b7.f38960xc6d7bd1d.clear();
        c19806x4c372b7.f38961xa0d74df2 = 0;
        c19806x4c372b7.f38958xbe522252.clear();
        c19806x4c372b7.f38959xf984e1dd = 0;
        c19806x4c372b7.f38975x1f0e1eca.clear();
        c19806x4c372b7.f38976xa7abf065 = 0;
        c19806x4c372b7.f38971xffe88d2.clear();
        c19806x4c372b7.f38972xbc148b5d = 0;
        c19806x4c372b7.f38995x9ed6b7fa.clear();
        c19806x4c372b7.f38994x3b843533 = 0;
        c19806x4c372b7.f38967x15579d0d &= -5639;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c.Companion.m92024x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c
    /* renamed from: onChangeSnsVisibilitySuccCallback */
    public void mo92022xbeb218c2(java.lang.String str, byte[] bArr) {
        if (str == null || bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlatformChangeVisibilityDelegateImpl", "onChangeSnsVisibilitySuccCallback >> error");
            return;
        }
        bw5.nk0 mo11468x92b714fd = new bw5.nk0().mo11468x92b714fd(bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "onChangeSnsVisibilitySuccCallback >> snsId: ".concat(str));
        cj0.a aVar = cj0.a.f123386a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        aVar.l("MicroMsg.PlatformChangeVisibilityDelegateImpl", mo11468x92b714fd);
        ((ku5.t0) ku5.t0.f394148d).g(new si0.r0(this, mo11468x92b714fd, str));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24844x577d878c.Companion.m92024x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
