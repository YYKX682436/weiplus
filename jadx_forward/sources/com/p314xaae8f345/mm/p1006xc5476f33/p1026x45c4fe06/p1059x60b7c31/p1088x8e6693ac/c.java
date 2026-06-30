package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.b f162473h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f162474i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.a.f162465d);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f162475d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162476e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f162477f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd f162478g;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 businessViewRuntime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessViewRuntime, "businessViewRuntime");
        this.f162475d = businessViewRuntime;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs openBusinessViewExtraArgs = businessViewRuntime.u0().D.f158864p;
        this.f162476e = openBusinessViewExtraArgs != null && openBusinessViewExtraArgs.f158869d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98.OpenBusinessViewExtraArgs openBusinessViewExtraArgs2 = businessViewRuntime.u0().D.f158864p;
        this.f162477f = openBusinessViewExtraArgs2 != null && openBusinessViewExtraArgs2.f158870e;
        mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.BusinessViewEmbeddingPage$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPaused */
            public final void m50917x53a16fed() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd sdVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vc vcVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c.this;
                if (!cVar.f162477f || (sdVar = cVar.f162478g) == null || (vcVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd) sdVar).f172492c) == null) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11526xd10e8bbe) vcVar).f156370a.g0(false);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResumed */
            public final void m50918x91113ef8() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd sdVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wc wcVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c.this;
                if (!cVar.f162477f || (sdVar = cVar.f162478g) == null || (wcVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd) sdVar).f172491b) == null) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11525xd10e8bbd) wcVar).f156369a.j0();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 Cf() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(this.f162475d.f156336n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public void Cg(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f162478g = host;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd) host;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(wdVar.f172490a.f156336n) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(wdVar.f172490a.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HIDE);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public boolean D0() {
        return this.f162477f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public void Q5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd sdVar = this.f162478g;
        iz5.a.g(null, sdVar == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sdVar, host));
        this.f162478g = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.d(this.f162475d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h0.DetachFromStack);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public boolean S1() {
        return this.f162476e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    /* renamed from: bringToFront */
    public void mo50929xffe5a7c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd sdVar = this.f162478g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sdVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd) sdVar).f172490a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c11510xdd90c2f2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f162475d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
        u07.f128806p0 = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).u2(u07, o6Var.l2());
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td other = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (other instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162475d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c) other).f162475d)) {
                return 0;
            }
        }
        return hashCode() - other.hashCode();
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        p012xc85e97e9.p093xedfae76a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x2) this.f162475d.P).f173904d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(oVar, "getLifecycle(...)");
        return oVar;
    }

    /* renamed from: toString */
    public java.lang.String m50930x9616526c() {
        return "BusinessViewEmbeddingPage(" + this.f162475d + ')';
    }
}
