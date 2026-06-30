package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public final class c extends w65.g {

    /* renamed from: h, reason: collision with root package name */
    public final kq.a f152427h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p947xba6de98f.a f152428i;

    public c(kq.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f152427h = params;
        this.f152428i = new com.p314xaae8f345.mm.p947xba6de98f.a(this);
    }

    @Override // w65.g, w65.m
    public java.lang.String Z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = this.f152427h.f392702c;
        if (c16564xb55e1d5 != null) {
            java.lang.String str = c16564xb55e1d5.f231013d + '-' + c16564xb55e1d5.f231014e;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // w65.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p947xba6de98f.c.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w65.m other = (w65.m) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof com.p314xaae8f345.mm.p947xba6de98f.c)) {
            return 0;
        }
        this.f152427h.getClass();
        return 0;
    }

    @Override // w65.m
    public w65.p f0() {
        w65.p lVar;
        kq.a aVar = this.f152427h;
        int ordinal = aVar.f392709j.ordinal();
        if (ordinal == 0) {
            lVar = new w65.l(this.f524889e, this);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lVar = new w65.p(this.f524889e, this);
        }
        lVar.f524897c = aVar.f392705f;
        lVar.f524898d = aVar.f392704e;
        if (lVar instanceof w65.l) {
            ((w65.l) lVar).f524894e = aVar.f392707h;
        }
        return lVar;
    }

    @Override // w65.g, w65.m
    public void f1() {
        super.f1();
        kq.a aVar = this.f152427h;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = aVar.f392702c;
        if (c16564xb55e1d5 != null) {
            qi3.c0 c0Var = new qi3.c0();
            c0Var.f445212a = c16564xb55e1d5;
            c0Var.f445213b = aVar.f392704e;
            com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = aVar.f392706g;
            if ((n1Var != null ? n1Var.f152636a : null) == com.p314xaae8f345.mm.p947xba6de98f.m1.f152618q) {
                c0Var.f445214c = true;
            }
            jm.m mVar = (jm.m) ((qi3.w) i95.n0.c(qi3.w.class));
            mVar.getClass();
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) mVar.f381771m).mo141623x754a37bb(), null, new jm.k(c0Var, mVar, null), 1, null);
        }
    }

    @Override // w65.m
    public java.lang.String id() {
        kq.a aVar = this.f152427h;
        java.lang.String str = aVar.f392700a.f69601xaca5bdda;
        if (str == null || r26.n0.N(str)) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.String str3 = aVar.f392700a.f69601xaca5bdda;
        return str3 == null ? this.f524888d : str3;
    }

    @Override // w65.g, w65.m
    public void x() {
        super.x();
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(id());
    }

    @Override // w65.m
    public void z() {
        this.f152427h.getClass();
    }

    @Override // w65.m
    public java.lang.Class z1() {
        return this.f152427h.f392701b;
    }
}
