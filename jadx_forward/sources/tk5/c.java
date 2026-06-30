package tk5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f501555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f501556b;

    public c(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fragmentManager, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentManager, "fragmentManager");
        this.f501555a = fragmentManager;
        this.f501556b = i17;
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closeAll() called backCount:");
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f501555a;
        sb6.append(abstractC1104xc1ad431d.m7670x180b2948());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAS.VASReplaceController", sb6.toString());
        while (abstractC1104xc1ad431d.m7670x180b2948() > 0 && b() != null) {
            abstractC1104xc1ad431d.m7705x96eafb01();
        }
        tk5.a b17 = b();
        if (b17 != null) {
            b17.G();
        }
        vk5.a.f519304a = 0;
        vk5.a.f519305b = null;
        vk5.a.f519306c = -1;
        vk5.a.f519307d = false;
    }

    public final tk5.a b() {
        tk5.a aVar;
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = this.f501555a.m7675x1626d96d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7675x1626d96d, "getFragments(...)");
        java.util.Iterator<T> it = m7675x1626d96d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p012xc85e97e9.p093xedfae76a.m1 m1Var = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it.next();
            aVar = m1Var instanceof tk5.a ? (tk5.a) m1Var : null;
            if (aVar != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.getG(), this)) {
                break;
            }
        }
        return aVar;
    }

    public final void c(tk5.a fragment, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        boolean z17 = !(b() != null);
        if (i17 != -1) {
            fragment.u().m7582xf54bcc03(null, i17);
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = this.f501555a.m7630xb2c12e75();
        if (!z17) {
            m7630xb2c12e75.l(com.p314xaae8f345.mm.R.C30854x2dc211.f559483g2, com.p314xaae8f345.mm.R.C30854x2dc211.f559482g1, com.p314xaae8f345.mm.R.C30854x2dc211.f559481g0, com.p314xaae8f345.mm.R.C30854x2dc211.f559484g3);
        }
        m7630xb2c12e75.k(this.f501556b, fragment.u(), null);
        if (!z17) {
            m7630xb2c12e75.c(null);
            m7630xb2c12e75.f92892p = true;
        }
        m7630xb2c12e75.e();
        fragment.M(this);
    }
}
