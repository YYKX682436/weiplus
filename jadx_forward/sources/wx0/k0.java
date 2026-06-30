package wx0;

/* loaded from: classes5.dex */
public final class k0 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public wx0.h0 f532035g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44 f532036h;

    /* renamed from: i, reason: collision with root package name */
    public volatile android.os.CountDownTimer f532037i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f532038m;

    /* renamed from: n, reason: collision with root package name */
    public wx0.g0 f532039n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(android.view.ViewGroup r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sideToolbar"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "rootView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r0 = 2131299152(0x7f090b50, float:1.8216297E38)
            android.view.View r0 = r3.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r2.<init>(r0)
            wx0.h0 r0 = wx0.h0.f532026d
            r2.f532035g = r0
            android.view.View r0 = r2.f413347d
            wx0.f0 r1 = new wx0.f0
            r1.<init>(r2, r3, r4)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.k0.<init>(android.view.ViewGroup, android.view.ViewGroup):void");
    }

    public final boolean b() {
        wx0.s0 m47303x63dc8ed6;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m47319x71e92c1d;
        mx0.g3 m47316xc93d195a;
        mx0.l m47302x7ff74ce5;
        mx0.g3 m47316xc93d195a2;
        mx0.g3 m47316xc93d195a3;
        this.f532038m = true;
        android.os.CountDownTimer countDownTimer = this.f532037i;
        if (countDownTimer == null) {
            return false;
        }
        countDownTimer.cancel();
        this.f532037i = null;
        wx0.g0 g0Var = this.f532039n;
        if (g0Var != null) {
            mx0.p4 p4Var = (mx0.p4) g0Var;
            int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.f151074d2;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = p4Var.f413745c;
            p3325xe03a0797.p3326xc267989b.l.d(c10977x8e40eced.getScope(), null, null, new mx0.o4(c10977x8e40eced, null), 3, null);
            m47303x63dc8ed6 = c10977x8e40eced.m47303x63dc8ed6();
            if (m47303x63dc8ed6.f532073m == wx0.m0.f532045d) {
                ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) m47303x63dc8ed6.f532071h).i1(false);
            }
            m47319x71e92c1d = c10977x8e40eced.m47319x71e92c1d();
            m47319x71e92c1d.removeView(p4Var.f413744b);
            m47316xc93d195a = c10977x8e40eced.m47316xc93d195a();
            m47316xc93d195a.b(false);
            c10977x8e40eced.R0();
            m47302x7ff74ce5 = c10977x8e40eced.m47302x7ff74ce5();
            m47302x7ff74ce5.c();
            m47316xc93d195a2 = c10977x8e40eced.m47316xc93d195a();
            m47316xc93d195a2.mo9066x6761d4f();
            m47316xc93d195a3 = c10977x8e40eced.m47316xc93d195a();
            m47316xc93d195a3.b(true);
        }
        return true;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (this.f532037i != null) {
            b();
            return true;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44 c10991xb30eef44 = this.f532036h;
        if (c10991xb30eef44 != null) {
            return c10991xb30eef44.a();
        }
        return false;
    }
}
