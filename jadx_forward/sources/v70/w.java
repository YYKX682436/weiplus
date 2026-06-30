package v70;

@j95.b
/* loaded from: classes12.dex */
public final class w extends jm0.o implements xs.d1 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f515158m = jz5.h.b(v70.s.f515152d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f515159n = jz5.h.b(v70.u.f515156d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f515160o = jz5.h.b(v70.v.f515157d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f515161p = jz5.h.b(v70.p.f515149d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f515162q = jz5.h.b(v70.q.f515150d);

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f515163r = jz5.h.b(v70.r.f515151d);

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(g80.o.class);
        set.add(e80.r.class);
        set.add(e80.f.class);
        set.add(d80.a.class);
        set.add(c80.e.class);
        set.add(x70.g.class);
        set.add(w70.b.class);
        set.add(w70.d.class);
        set.add(d80.c.class);
        set.add(z70.b.class);
        set.add(w70.f.class);
    }

    public void Zi(r70.b taskListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
        ((java.util.HashSet) ((jz5.n) this.f515158m).mo141623x754a37bb()).add(taskListener);
    }

    public final void aj(int i17, java.lang.String str) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", "computePHash fileNotExist:" + str);
        } else {
            if (((java.util.HashMap) ((jz5.n) this.f515163r).mo141623x754a37bb()).containsKey(java.lang.Integer.valueOf(i17))) {
                return;
            }
            ea0.f fVar = (ea0.f) i95.n0.c(ea0.f.class);
            v70.o oVar = new v70.o(i17, this);
            ((da0.e) fVar).getClass();
            wi3.l lVar = wi3.l.f527759a;
            p3325xe03a0797.p3326xc267989b.l.f(null, new wi3.h(str, oVar, null), 1, null);
        }
    }

    public java.lang.Object bj(l70.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return x70.g.f533948f.a().T6(dVar, interfaceC29045xdcb5ca57);
    }

    public l70.d cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, s70.c type, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        return x70.g.f533948f.a().U6(f9Var, type, z17);
    }

    public int fj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String j17;
        l15.f l17;
        if (f9Var == null || (j17 = f9Var.j()) == null) {
            return 0;
        }
        j15.d dVar = new j15.d();
        dVar.m126728xdc93280d(j17);
        l15.d r17 = dVar.r();
        return (r17 == null || (l17 = r17.l()) == null) ? f9Var.R : l17.j();
    }

    public s70.a hj(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        return new g80.p(talker, j17);
    }

    public final java.util.HashMap ij() {
        return (java.util.HashMap) ((jz5.n) this.f515160o).mo141623x754a37bb();
    }

    public void mj(r70.b taskListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
        ((java.util.HashSet) ((jz5.n) this.f515158m).mo141623x754a37bb()).remove(taskListener);
    }

    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j nj(r70.g params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        jm0.f fVar = jm0.g.f381799e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
        e80.f fVar2 = (e80.f) fVar.a(wVar, e80.f.class);
        fVar2.getClass();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, null, 6, null);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) fVar2.f331552g).mo141623x754a37bb(), null, new e80.e(params, fVar2, b17, null), 1, null);
        return b17;
    }

    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j oj(r70.g params, o70.l preBuildResultItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preBuildResultItem, "preBuildResultItem");
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
        if (!jm0.g.class.isAssignableFrom(e80.f.class)) {
            throw new java.lang.IllegalArgumentException(wVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(wVar.getViewModel(), new jm0.e(wVar)).a(e80.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        qi3.x.f445294a.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(preBuildResultItem.f424798a, preBuildResultItem.f424801d));
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, null, 6, null);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) ((e80.f) ((jm0.g) a17)).f331551f).mo141623x754a37bb(), null, new e80.c(params, preBuildResultItem, b17, null), 1, null);
        return b17;
    }

    public void pj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (!pt0.f0.f439742b1.h() && f9Var != null) {
            f9Var.R = i17;
            f9Var.f317711r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", downloadControlType: ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", sb6.toString());
    }

    public void qj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (!pt0.f0.f439742b1.h() && f9Var != null) {
            f9Var.Q = str;
            f9Var.f317711r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", expIdStr: ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", sb6.toString());
    }
}
