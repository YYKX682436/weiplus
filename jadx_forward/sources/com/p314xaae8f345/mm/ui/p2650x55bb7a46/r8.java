package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class r8 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f284177d;

    public r8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea) {
        this.f284177d = c21628xcedb13ea;
    }

    @Override // yb5.n
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f284177d;
        c21628xcedb13ea.N0();
        if (c21628xcedb13ea.mo78409x676b27cd() instanceof wn.s) {
            ((wn.s) c21628xcedb13ea.mo78409x676b27cd()).l6();
        }
        if (c21628xcedb13ea.f39298x5262fd1e || !c21628xcedb13ea.m78668x4e2d2008()) {
            c21628xcedb13ea.d1();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78658x28280f95 = c21628xcedb13ea.m78658x28280f95();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "scrollToFinishActivity, Scrolling %B, hasTranslucent %B, hasCallPopOut %B", java.lang.Boolean.valueOf(m78658x28280f95.f292974v), java.lang.Boolean.valueOf(m78658x28280f95.f292972t), java.lang.Boolean.valueOf(m78658x28280f95.f292973u));
        if (m78658x28280f95.a()) {
            return;
        }
        if (!m78658x28280f95.C) {
            m78658x28280f95.e(0.0f);
        } else if (m78658x28280f95.f292961f == 0) {
            m78658x28280f95.e(0.0f);
        }
        m78658x28280f95.f292974v = true;
        m78658x28280f95.f292973u = false;
        int width = m78658x28280f95.f292964i.getWidth() + m78658x28280f95.f292967o.getIntrinsicWidth() + 10;
        ii5.c cVar = m78658x28280f95.f292965m;
        cVar.f373184v = m78658x28280f95.f292964i;
        cVar.f373165c = -1;
        cVar.i(width, 0, 0, 0, 260L);
        m78658x28280f95.invalidate();
        al5.f3 f3Var = m78658x28280f95.I;
        if (f3Var != null) {
            f3Var.mo2294xc398a7b3();
        }
        boolean z17 = !m78658x28280f95.C;
        if (!m78658x28280f95.f292965m.f373187y) {
            al5.a3.a(true, 0, z17);
        }
        m78658x28280f95.F = true;
    }
}
