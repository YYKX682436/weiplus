package gf;

/* loaded from: classes7.dex */
public class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc implements ni1.b {
    public final java.util.Set H;
    public final com.p314xaae8f345.p2936x80def495.InterfaceC25570x528f558e I;

    public d0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        super(bVar);
        this.H = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.I = new gf.c0(this);
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void A() {
        gf.a2 f07 = f0();
        if (f07 != null) {
            f07.s();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb S(android.content.Context context) {
        return new gf.a2(this, context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i T() {
        return new gf.u0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ob U() {
        return new gf.v0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a
    public boolean Z() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, ni1.d
    public boolean a(int i17, java.lang.String str) {
        if (F() == null || !((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50262x39e05d35()) {
            return true;
        }
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().a(i17, str);
        return true;
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean b() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc
    /* renamed from: b0 */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd S(android.content.Context context) {
        return new gf.a2(this, context);
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void c(xi1.g gVar) {
        if (f0() != null) {
            f0().F(gVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (F() != null && ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50262x39e05d35()) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().e(str, str2, ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50260x9f1221c2());
            if (!android.text.TextUtils.isEmpty(str) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vd.f168718a.contains(str)) {
                e(str, str2, ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50260x9f1221c2());
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        if (F() == null || ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3() == null || !((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().mo50262x39e05d35()) {
            return true;
        }
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().S0(str, str2, i17, ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50260x9f1221c2());
        return true;
    }

    public com.p314xaae8f345.p2936x80def495.C25587x226dda3 g0() {
        if (F() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageRendererSkylineImpl", "getSkylineRuntime fail, component is null");
            return null;
        }
        if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageRendererSkylineImpl", "getService fail, component is null");
            return null;
        }
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = (com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().z1(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe.class);
        if (c3955x2d990bfe != null) {
            return c3955x2d990bfe.f129241d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageRendererSkylineImpl", "getService fail, extension is null");
        return null;
    }

    public final void h0() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F();
        if (bVar != null) {
            android.util.Pair c17 = ((com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) bVar.v3().z1(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe.class)).c();
            g0().m95866xf761936f(((com.p314xaae8f345.p2936x80def495.EnumC25558x9d00a2c8) c17.second).getValue(), ((java.lang.Boolean) c17.first).booleanValue());
        }
        g0().m95863x3d8100e8(df.h.f311011i.get());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final gf.a2 f0() {
        return (gf.a2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd) this.f167905g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean j(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        try {
            h0();
            return super.j(str, wdVar);
        } finally {
            df.w1 t17 = f0().t();
            if (t17 != null) {
                ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).j2();
                t17.s();
                t17.y(new df.k1(t17));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void m() {
        super.m();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc, re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void u(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        super.u(map, wdVar);
        map.put("renderer", "skyline");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void z(android.view.View view) {
        super.z(view);
        view.addOnAttachStateChangeListener(new gf.b0(this, view));
    }
}
