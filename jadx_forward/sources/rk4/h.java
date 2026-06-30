package rk4;

/* loaded from: classes11.dex */
public final class h implements qk.j6 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f478216a = jz5.h.b(rk4.g.f478201d);

    public final qk.g9 A() {
        return (qk.g9) ((jz5.n) this.f478216a).mo141623x754a37bb();
    }

    @Override // qk.j6
    public int a() {
        return ((rk4.z8) A()).Di();
    }

    @Override // qk.j6
    public bw5.lp0 b() {
        return ((rk4.z8) A()).uj();
    }

    @Override // qk.j6
    public void c(float f17) {
        ((rk4.z8) A()).yj(f17);
    }

    @Override // qk.j6
    public int d() {
        ((rk4.z8) A()).getClass();
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            return (int) ((jm4.h3) g3Var).s();
        }
        return 0;
    }

    @Override // qk.j6
    public boolean e(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        return ((rk4.z8) A()).oj(id6);
    }

    @Override // qk.j6
    public java.lang.String f(int i17) {
        return ((rk4.z8) A()).Vi(i17);
    }

    @Override // qk.j6
    public void g(bw5.o50 categoryItem) {
        jm4.z2 z2Var;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItem, "categoryItem");
        ((rk4.z8) A()).getClass();
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca7590552 = zk4.l.f555073c;
        bw5.dr0 a17 = (interfaceC26826xca7590552 == null || (z2Var = (jm4.z2) p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169369x21b488b2(((jm4.h3) interfaceC26826xca7590552).m105978x2737f10())) == null || (interfaceC26826xca759055 = (jm4.k3) p3380x6a61f93.p3381xf512d0a5.C30411x21b15b29.m168663x21b4ae47(((jm4.a3) z2Var).m105978x2737f10())) == null) ? null : ((b66.c) interfaceC26826xca759055).a();
        if (a17 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.b().b().c(), categoryItem.c()) || categoryItem.c().length() <= 0 || interfaceC26826xca7590552 == null) {
            return;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169674x21b10d0f(((b66.q) interfaceC26826xca7590552).m105978x2737f10());
    }

    @Override // qk.j6
    /* renamed from: getDuration */
    public int mo160353x51e8b0a() {
        return ((rk4.z8) A()).Ai();
    }

    @Override // qk.j6
    /* renamed from: getType */
    public qk.p9 mo160354xfb85f7b0() {
        return qk.p9.f445845d;
    }

    @Override // qk.j6
    public float h() {
        return ((rk4.z8) A()).h();
    }

    @Override // qk.j6
    public qk.ia i() {
        return ((rk4.z8) A()).Ri();
    }

    @Override // qk.j6
    /* renamed from: isAvailable */
    public boolean mo160355x1a7eccbf() {
        return ((rk4.z8) A()).fj();
    }

    @Override // qk.j6
    public b66.z j() {
        jm4.u2 a17 = jm4.w2.f381968d.a();
        if (a17 != null) {
            b66.g a18 = ((jm4.w2) a17).a(bw5.eq0.TingMusic);
            if (a18 != null) {
                return (b66.z) p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169644x21b1cc72(((b66.i) a18).m105978x2737f10());
            }
        }
        return null;
    }

    @Override // qk.j6
    public void k(java.lang.String taskId, bw5.lp0 item, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        ((rk4.z8) A()).qj(taskId, item, ext);
    }

    @Override // qk.j6
    public b66.j l() {
        int i17 = jm4.k5.f381928d;
        return (jm4.i5) p3380x6a61f93.p3381xf512d0a5.C30405x21b11ba7.m168602x21b0d463();
    }

    @Override // qk.j6
    public boolean m(qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        return true;
    }

    @Override // qk.j6
    public void n(boolean z17) {
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(z17);
    }

    @Override // qk.j6
    /* renamed from: next */
    public boolean mo160356x338af3() {
        ((rk4.z8) A()).getClass();
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = zk4.l.f555073c;
        if (interfaceC26826xca759055 == null) {
            return false;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169710x21b973ff(((b66.q) interfaceC26826xca759055).m105978x2737f10());
        return true;
    }

    @Override // qk.j6
    public org.json.JSONObject o(bw5.lp0 playingItem, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playingItem, "playingItem");
        return ((rk4.z8) A()).Ui(playingItem, f17);
    }

    @Override // qk.j6
    public void p(boolean z17) {
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(z17);
    }

    @Override // qk.j6
    /* renamed from: pause */
    public boolean mo160357x65825f6() {
        ((rk4.z8) A()).pj();
        return true;
    }

    @Override // qk.j6
    public boolean q(java.lang.String str) {
        return ((rk4.z8) A()).mj(str);
    }

    @Override // qk.j6
    public void r(android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, bw5.o50 o50Var, android.os.Bundle bundle, bw5.ar0 enterScene, qk.a aVar, java.lang.Boolean bool, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        ((rk4.k8) ((rk4.z8) A()).aj()).z(context, z17, lp0Var, eVar, o50Var, bundle, enterScene, aVar2);
    }

    @Override // qk.j6
    /* renamed from: resume */
    public boolean mo160358xc84dc82d() {
        return ((rk4.z8) A()).wj();
    }

    @Override // qk.j6
    public void s(boolean z17) {
        ((rk4.z8) A()).getClass();
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = zk4.l.f555073c;
        if (interfaceC26826xca759055 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169687x21b2a01f(((b66.q) interfaceC26826xca759055).m105978x2737f10(), z17, true);
        }
    }

    @Override // qk.j6
    /* renamed from: seekTo */
    public boolean mo160359xc9fc1b13(long j17) {
        return ((rk4.z8) A()).xj(j17);
    }

    @Override // qk.j6
    /* renamed from: stop */
    public boolean mo160360x360802() {
        return ((rk4.z8) A()).zj();
    }

    @Override // qk.j6
    public void t(int i17) {
        ((rk4.z8) A()).getClass();
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = zk4.l.f555073c;
        if (interfaceC26826xca759055 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169712x21b9fe69(((b66.q) interfaceC26826xca759055).m105978x2737f10(), i17, true);
        }
    }

    @Override // qk.j6
    public boolean u() {
        return ((rk4.z8) A()).ij();
    }

    @Override // qk.j6
    public android.content.Context v() {
        return ((rk4.z8) A()).bj();
    }

    @Override // qk.j6
    public void w(bw5.lp0 lp0Var, java.util.List list, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        ((rk4.z8) A()).rj(lp0Var, list, o50Var, pp0Var, ext);
    }

    @Override // qk.j6
    public bw5.cr0 x() {
        return ((rk4.z8) A()).vj();
    }

    @Override // qk.j6
    public boolean y() {
        ((rk4.z8) A()).getClass();
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = zk4.l.f555073c;
        if (interfaceC26826xca759055 == null) {
            return false;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169711x21b9fe47(((b66.q) interfaceC26826xca759055).m105978x2737f10());
        return true;
    }

    @Override // qk.j6
    public void z(java.lang.String listenId, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        ((rk4.z8) A()).sj(listenId, ext);
    }
}
