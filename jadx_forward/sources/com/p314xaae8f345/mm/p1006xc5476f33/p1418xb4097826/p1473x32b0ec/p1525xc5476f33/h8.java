package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class h8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194317p;

    /* renamed from: q, reason: collision with root package name */
    public te2.j0 f194318q;

    /* renamed from: r, reason: collision with root package name */
    public te2.k0 f194319r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194317p = statusMonitor;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        te2.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7 h7Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 27) {
            te2.j0 j0Var = this.f194318q;
            if (j0Var != null) {
                ((te2.p1) j0Var).y();
                return;
            }
            tn0.w0 f17 = dk2.ef.f314905a.f();
            if (f17 != null) {
                f17.F0();
                return;
            }
            return;
        }
        if (ordinal == 115) {
            java.lang.String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_MUSIC_ID") : null;
            dk2.p Z6 = ((mm2.c1) P0(mm2.c1.class)).Z6();
            if (string == null) {
                string = "";
            }
            jz5.l b17 = Z6.b(string);
            java.lang.Object obj = b17.f384366d;
            dk2.vg vgVar = (dk2.vg) obj;
            if (vgVar != null) {
                te2.j0 j0Var2 = this.f194318q;
                if (j0Var2 != null) {
                    ((te2.p1) j0Var2).m(vgVar, ((java.lang.Number) b17.f384367e).intValue(), false);
                }
                te2.d4 d4Var = te2.d4.f499481a;
                boolean a86 = ((mm2.c1) P0(mm2.c1.class)).a8();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                d4Var.c(a86, 2, (dk2.vg) obj, true, false);
                return;
            }
            return;
        }
        if (ordinal == 116) {
            te2.j0 j0Var3 = this.f194318q;
            if (j0Var3 != null) {
                ((te2.p1) j0Var3).s(((te2.p1) j0Var3).f499830r);
                return;
            }
            return;
        }
        switch (ordinal) {
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45661x609425dd /* 91 */:
                if (bundle != null) {
                    java.lang.String string2 = bundle.getString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID");
                    te2.j0 j0Var4 = this.f194318q;
                    if (j0Var4 != null) {
                        ((te2.p1) j0Var4).s(string2);
                    }
                } else {
                    te2.j0 j0Var5 = this.f194318q;
                    if (j0Var5 != null) {
                        te2.j0.N4(j0Var5, null, 1, null);
                    }
                }
                if (dk2.ef.f314905a.x()) {
                    ll2.e.b(ll2.e.f400666a, "anchorlive.bottom.music.bgmusic", false, false, 6, null);
                    return;
                } else {
                    ll2.e.b(ll2.e.f400666a, "startlive.bottom.music.bgmusic", false, false, 6, null);
                    return;
                }
            case 92:
                te2.j0 j0Var6 = this.f194318q;
                if (j0Var6 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "onMusicAdded");
                    pm0.v.X(new te2.v0((te2.p1) j0Var6, 0));
                    return;
                }
                return;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45660xcb53804c /* 93 */:
                te2.j0 j0Var7 = this.f194318q;
                if (j0Var7 != null && (k0Var = ((te2.p1) j0Var7).f499823h) != null && (h7Var = ((te2.q1) k0Var).f499884m) != null) {
                    h7Var.g0(false, null);
                }
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m8.class));
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        te2.j0 j0Var = this.f194318q;
        if (j0Var != null) {
            ((te2.p1) j0Var).mo979x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        if (this.f194318q == null || this.f194319r == null) {
            gk2.e S0 = S0();
            android.view.ViewGroup viewGroup = this.f446856d;
            this.f194318q = new te2.p1(viewGroup, S0, this.f194317p, this);
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f194319r = new te2.q1(viewGroup, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, S0(), this.f194318q);
        }
        te2.j0 j0Var = this.f194318q;
        if (j0Var != null) {
            te2.k0 k0Var = this.f194319r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
            ((te2.p1) j0Var).mo56536x3b13c504(k0Var);
        }
        te2.j0 j0Var2 = this.f194318q;
        if (j0Var2 != null) {
            te2.p1 p1Var = (te2.p1) j0Var2;
            p1Var.f499819d.post(new te2.o0(p1Var));
        }
    }
}
