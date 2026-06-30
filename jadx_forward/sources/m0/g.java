package m0;

/* loaded from: classes14.dex */
public final class g implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.w f403999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f404000e;

    public g(m0.w wVar, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f403999d = wVar;
        this.f404000e = y0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z.v2 v2Var;
        z.v2 v2Var2;
        c0.m interaction = (c0.m) obj;
        boolean z17 = interaction instanceof c0.r;
        p3325xe03a0797.p3326xc267989b.y0 scope = this.f404000e;
        m0.w wVar = this.f403999d;
        if (z17) {
            wVar.e((c0.r) interaction, scope);
        } else if (interaction instanceof c0.s) {
            wVar.g(((c0.s) interaction).f118477a);
        } else if (interaction instanceof c0.q) {
            wVar.g(((c0.q) interaction).f118475a);
        } else {
            wVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interaction, "interaction");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
            m0.d0 d0Var = wVar.f404056d;
            d0Var.getClass();
            boolean z18 = interaction instanceof c0.i;
            java.util.List list = d0Var.f403991d;
            if (z18) {
                ((java.util.ArrayList) list).add(interaction);
            } else if (interaction instanceof c0.j) {
                ((java.util.ArrayList) list).remove(((c0.j) interaction).f118468a);
            } else if (interaction instanceof c0.d) {
                ((java.util.ArrayList) list).add(interaction);
            } else if (interaction instanceof c0.e) {
                ((java.util.ArrayList) list).remove(((c0.e) interaction).f118462a);
            } else if (interaction instanceof c0.b) {
                ((java.util.ArrayList) list).add(interaction);
            } else if (interaction instanceof c0.c) {
                ((java.util.ArrayList) list).remove(((c0.c) interaction).f118461a);
            } else if (interaction instanceof c0.a) {
                ((java.util.ArrayList) list).remove(((c0.a) interaction).f118460a);
            }
            c0.m mVar = (c0.m) kz5.n0.k0(list);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var.f403992e, mVar)) {
                z.i0 i0Var = z.i0.f550229a;
                if (mVar != null) {
                    n0.e5 e5Var = d0Var.f403989b;
                    float f17 = z18 ? ((m0.j) e5Var.mo128745x754a37bb()).f404010c : interaction instanceof c0.d ? ((m0.j) e5Var.mo128745x754a37bb()).f404009b : interaction instanceof c0.b ? ((m0.j) e5Var.mo128745x754a37bb()).f404008a : 0.0f;
                    z.v2 v2Var3 = m0.x.f404057a;
                    if (!(mVar instanceof c0.i)) {
                        if (mVar instanceof c0.d) {
                            z.h0 h0Var = z.j0.f550237a;
                            v2Var2 = new z.v2(45, 0, i0Var, 2, null);
                        } else if (mVar instanceof c0.b) {
                            z.h0 h0Var2 = z.j0.f550237a;
                            v2Var2 = new z.v2(45, 0, i0Var, 2, null);
                        }
                        p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new m0.b0(d0Var, f17, v2Var2, null), 3, null);
                    }
                    v2Var2 = m0.x.f404057a;
                    p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new m0.b0(d0Var, f17, v2Var2, null), 3, null);
                } else {
                    c0.m mVar2 = d0Var.f403992e;
                    z.v2 v2Var4 = m0.x.f404057a;
                    if ((mVar2 instanceof c0.i) || (mVar2 instanceof c0.d) || !(mVar2 instanceof c0.b)) {
                        v2Var = m0.x.f404057a;
                    } else {
                        z.h0 h0Var3 = z.j0.f550237a;
                        v2Var = new z.v2(150, 0, i0Var, 2, null);
                    }
                    p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new m0.c0(d0Var, v2Var, null), 3, null);
                }
                d0Var.f403992e = mVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
