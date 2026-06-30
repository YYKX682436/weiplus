package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class qr extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f190379a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr f190380b;

    public qr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar) {
        this.f190380b = xrVar;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f190379a || i17 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f190380b;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = xrVar.f192628d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a17).Z6(-1);
        if (Z6 != null) {
            fc2.i iVar = new fc2.i(Z6);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = xrVar.f192632h;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            iVar.mo481x4d79408f(c1163xf1deaba4, 5);
        }
        this.f190379a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190380b.f192629e, "onRequestLoadMore");
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.or(this.f190380b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f190380b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xrVar.f192629e, "[onLoadMoreEnd] reason=" + reason);
        boolean z17 = reason.f545054f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = xrVar.f192632h;
        if (!z17) {
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            if (c1163xf1deaba4.getChildCount() > 0) {
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                android.view.View childAt = c1163xf1deaba4.getChildAt(c1163xf1deaba4.getChildCount() - 1);
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c1163xf1deaba4.m0(childAt);
                java.lang.Integer valueOf = m07 != null ? java.lang.Integer.valueOf(m07.m8185xcdaf1228()) : null;
                if (childAt.getHeight() > 0 && ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8))) {
                    int height = xrVar.m130335x893a2f6f().getDisplayMetrics().heightPixels - childAt.getHeight();
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = xrVar.f192631g;
                    if (c22801x87cbdc00 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                        throw null;
                    }
                    c22801x87cbdc00.m82558x809b0de(height / 3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xrVar.f192629e, "extraOverScrollFooterDx=" + height);
                }
            }
        }
        if (reason.f545057i && reason.f545054f) {
            if (c1163xf1deaba4 != null) {
                xrVar.j(c1163xf1deaba4, true);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
        }
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f190380b.f192630f;
        if (krVar.f188767h) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pr(this.f190380b));
        } else if (krVar.f188768i && krVar.m().m56387xe6796cde().isEmpty()) {
            this.f190380b.f192630f.m().mo56155xd210094c();
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f190380b;
        if (xrVar.f192630f.f188767h) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = xrVar.f192632h;
        if (c1163xf1deaba4 != null) {
            zy2.zb.Kh(zbVar, c1163xf1deaba4, ml2.x1.f409735f, "1", ml2.y.f409775g, 0, 0L, 0, 112, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
    }
}
