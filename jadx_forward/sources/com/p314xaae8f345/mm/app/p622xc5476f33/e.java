package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class e implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.p622xc5476f33.d f135176d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f135177e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f135179g;

    /* renamed from: h, reason: collision with root package name */
    public final int f135180h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f135181i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f135182m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f135183n;

    /* renamed from: p, reason: collision with root package name */
    public final android.os.Bundle f135185p;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f135184o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f135178f = null;

    public e(android.content.Context context, int i17, java.lang.String str, android.os.Bundle bundle, com.p314xaae8f345.mm.app.p622xc5476f33.d dVar) {
        this.f135177e = context;
        this.f135176d = dVar;
        this.f135180h = i17;
        this.f135181i = str;
        this.f135185p = bundle;
    }

    public final void a(boolean z17, r45.nx5 nx5Var) {
        com.p314xaae8f345.mm.app.p622xc5476f33.d dVar = this.f135176d;
        if (dVar != null) {
            com.p314xaae8f345.mm.app.p622xc5476f33.q qVar = (com.p314xaae8f345.mm.app.p622xc5476f33.q) dVar;
            qVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandler", "finishCheckTag");
            r35.m3 m3Var = qVar.f135205a;
            com.p314xaae8f345.mm.app.p622xc5476f33.s sVar = qVar.f135209e;
            if (nx5Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandler", "handleSpanClick, response is null");
                ((java.util.concurrent.ConcurrentHashMap) sVar.f135212e).remove(m3Var.e());
                return;
            }
            android.content.Context context = this.f135177e;
            sVar.f135214g = context;
            sVar.f135213f.f135123a = context;
            sVar.f135211d.put(m3Var.e(), nx5Var);
            qVar.f135209e.c(nx5Var, (com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.TopicSpanHandler) qVar.f135206b, qVar.f135207c, qVar.f135205a, qVar.f135208d);
            ((java.util.concurrent.ConcurrentHashMap) sVar.f135212e).remove(m3Var.e());
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof xk.a) || m1Var.mo808xfb85f7b0() != 4790) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AddContact", "not expected scene,  type = " + m1Var.mo808xfb85f7b0());
            return;
        }
        if (this.f135179g) {
            java.lang.Runnable runnable = this.f135183n;
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f135178f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f135178f = null;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f135182m);
        gm0.j1.n().f354821b.q(4790, this);
        if (i17 != 0 || i18 != 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                db5.e1.s(this.f135177e, str, "");
            }
            a(false, null);
        } else {
            r45.nx5 nx5Var = (r45.nx5) ((xk.a) m1Var).f536451e.f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "[dealSuccess] disablePopups = " + nx5Var.f463266p);
            a(true, nx5Var);
        }
    }
}
