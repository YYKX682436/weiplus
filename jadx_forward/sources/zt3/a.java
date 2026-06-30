package zt3;

/* loaded from: classes10.dex */
public final class a extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f557109d;

    /* renamed from: e, reason: collision with root package name */
    public final bs0.j f557110e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f557111f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f557112g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f557113h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f557114i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f557115m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f557116n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f557117o;

    public a(p012xc85e97e9.p093xedfae76a.y owner, bs0.j cameraUsage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraUsage, "cameraUsage");
        this.f557109d = owner;
        this.f557110e = cameraUsage;
        this.f557111f = new java.util.HashMap();
        this.f557112g = new java.util.HashMap();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f557113h = hashMap;
        this.f557114i = new p012xc85e97e9.p093xedfae76a.j0();
        this.f557115m = new p012xc85e97e9.p093xedfae76a.j0();
        hashMap.put(10, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(11, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(12, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(13, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(14, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(15, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(16, new p012xc85e97e9.p093xedfae76a.j0());
        ((yy0.q7) ((pp0.n0) i95.n0.c(pp0.n0.class))).getClass();
        this.f557117o = py0.b.f440504a.a();
    }

    public static /* synthetic */ void U6(zt3.a aVar, int i17, int i18, android.os.Bundle bundle, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            bundle = null;
        }
        aVar.T6(i17, i18, bundle);
    }

    public static void V6(zt3.a aVar, int i17, boolean z17, android.os.Bundle bundle, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        boolean z27 = (i18 & 8) != 0 ? true : z18;
        boolean z28 = (i18 & 16) != 0 ? true : z19;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) aVar.f557112g.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.mo7808x76db6cb1(new zt3.c(i17, z17, bundle2, z27, z28));
    }

    public final int N6(int i17) {
        zt3.d dVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f557113h.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (dVar = (zt3.d) j0Var.mo3195x754a37bb()) == null) {
            return 4;
        }
        return dVar.f557126b;
    }

    public final boolean O6(int i17) {
        zt3.c cVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f557112g.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (cVar = (zt3.c) j0Var.mo3195x754a37bb()) == null) {
            return false;
        }
        return cVar.f557121b;
    }

    public final java.lang.Integer P6(int i17) {
        for (java.util.Map.Entry entry : this.f557111f.entrySet()) {
            if (((java.lang.Number) entry.getValue()).intValue() == i17) {
                return (java.lang.Integer) entry.getKey();
            }
        }
        return null;
    }

    public final void Q6(int i17, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f557113h.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.mo7806x9d92d11c(this.f557109d, observer);
    }

    public final void R6(p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f557115m.mo7806x9d92d11c(this.f557109d, observer);
    }

    public final void S6(int i17, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f557112g.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.mo7806x9d92d11c(this.f557109d, observer);
    }

    public final void T6(int i17, int i18, android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f557113h.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.mo7808x76db6cb1(new zt3.d(i17, i18, bundle));
    }

    public final void W6(int i17, boolean z17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (z17) {
            return;
        }
        db5.t7.m(context, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f574257hm1));
        V6(this, i17, false, null, false, false, 28, null);
    }

    public final void X6(ku3.n0 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f557114i.mo7808x76db6cb1(value);
    }
}
