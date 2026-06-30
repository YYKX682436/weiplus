package xx0;

/* loaded from: classes5.dex */
public final class f0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f539428d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f539429e;

    /* renamed from: f, reason: collision with root package name */
    public final xx0.i f539430f;

    /* renamed from: g, reason: collision with root package name */
    public final xx0.j f539431g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f539432h;

    public f0(p3325xe03a0797.p3326xc267989b.y0 scope, java.util.List tabs, xx0.i dataProvider, xx0.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabs, "tabs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataProvider, "dataProvider");
        this.f539428d = scope;
        this.f539429e = tabs;
        this.f539430f = dataProvider;
        this.f539431g = jVar;
        this.f539432h = new java.util.LinkedHashMap();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        xx0.d0 d0Var = ((xx0.e0) any).f539421a;
        synchronized (d0Var) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3325xe03a0797.p3326xc267989b.r2 r2Var = d0Var.f539415m;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                d0Var.f539415m = null;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
        container.removeView(d0Var);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f539429e.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object any) {
        xx0.d0 d0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        xx0.e0 e0Var = any instanceof xx0.e0 ? (xx0.e0) any : null;
        if (e0Var == null || (d0Var = e0Var.f539421a) == null) {
            return -2;
        }
        long m176151x752dddba = d0Var.m176151x752dddba();
        java.util.Iterator it = this.f539429e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((vt3.r) it.next()).f521572a == m176151x752dddba) {
                break;
            }
            i17++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer num = valueOf.intValue() >= 0 ? valueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        return ((vt3.r) this.f539429e.get(i17)).f521573b;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) this.f539432h).get(java.lang.Long.valueOf(((vt3.r) this.f539429e.get(i17)).f521572a));
        if (e0Var == null) {
            android.content.Context context = container.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e0Var = new xx0.e0(new xx0.d0(context, this.f539428d, (vt3.r) this.f539429e.get(i17), this.f539430f, this.f539431g));
            this.f539432h.put(java.lang.Long.valueOf(((vt3.r) this.f539429e.get(i17)).f521572a), e0Var);
        }
        container.addView(e0Var.f539421a);
        xx0.d0 d0Var = e0Var.f539421a;
        synchronized (d0Var) {
            d0Var.f539412g.setVisibility(0);
            d0Var.f539413h.setVisibility(8);
            d0Var.f539415m = p3325xe03a0797.p3326xc267989b.l.d(d0Var.f539409d, null, null, new xx0.w(d0Var, null), 3, null);
        }
        return e0Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, ((xx0.e0) any).f539421a);
    }
}
