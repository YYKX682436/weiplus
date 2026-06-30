package gx0;

/* loaded from: classes5.dex */
public final class g7 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357986a;

    public g7(gx0.w8 w8Var) {
        this.f357986a = w8Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.MainComposingUIC", "openReeditLiteApp: failed to open LiteApp!");
        gx0.w8 w8Var = this.f357986a;
        p3325xe03a0797.p3326xc267989b.y0 m158345xefc66565 = w8Var.m158345xefc66565();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new gx0.f7(w8Var, null), 2, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        byte[] mo14344x5f01b1f6;
        byte[] mo14344x5f01b1f62;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.MainComposingUIC", "openReeditLiteApp: success to open LiteApp!");
        r45.mi0 mi0Var = this.f357986a.v7().f150890v;
        if (mi0Var != null && (mo14344x5f01b1f62 = mi0Var.mo14344x5f01b1f6()) != null) {
            gu0.l2.f357295b = mo14344x5f01b1f62;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "openReeditLiteApp: saved effectEditInfoBytes(" + mo14344x5f01b1f62.length + " bytes) to SessionManager");
        }
        r45.ab4 ab4Var = this.f357986a.v7().f150889u;
        if (ab4Var != null && (mo14344x5f01b1f6 = ab4Var.mo14344x5f01b1f6()) != null) {
            gu0.l2.f357296c = mo14344x5f01b1f6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "openReeditLiteApp: saved localCreateTemplateInfoBytes(" + mo14344x5f01b1f6.length + " bytes) to SessionManager");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f357986a.m158354x19263085();
        if (!(m158354x19263085 instanceof android.app.Activity)) {
            m158354x19263085 = null;
        }
        if (m158354x19263085 != null) {
            m158354x19263085.finish();
        }
    }
}
