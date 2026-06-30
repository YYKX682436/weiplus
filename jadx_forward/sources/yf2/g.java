package yf2;

/* loaded from: classes3.dex */
public final class g implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f543227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f543228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.o f543229f;

    public g(mm2.n0 n0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yf2.o oVar) {
        this.f543227d = n0Var;
        this.f543228e = c0Var;
        this.f543229f = oVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean O6 = this.f543227d.O6();
        if (this.f543228e.f391645d && !O6) {
            boolean z17 = this.f543227d.f410807s;
            this.f543227d.f410807s = false;
            mm2.m0 m0Var = this.f543227d.f410808t;
            mm2.n0 n0Var = this.f543227d;
            mm2.m0 m0Var2 = mm2.m0.f410763d;
            n0Var.getClass();
            n0Var.f410808t = m0Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveController", "co-live invitation invalidated, skipToast=" + z17 + ", reason=" + m0Var + ", restore last mode + reopen camera");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f543229f.f543289m;
            if (u3Var != null) {
                if (!u3Var.isShowing()) {
                    u3Var = null;
                }
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
            this.f543229f.f543289m = null;
            if (!z17) {
                int i17 = yf2.f.f543220a[m0Var.ordinal()] == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574998oo4 : com.p314xaae8f345.mm.R.C30867xcad56011.omc;
                android.content.Context O62 = this.f543229f.O6();
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O62);
                e4Var.f293309c = this.f543229f.O6().getString(i17);
                e4Var.c();
            }
            mm2.s1 s1Var = (mm2.s1) this.f543229f.m56788xbba4bfc0(mm2.s1.class);
            r45.q12 q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb();
            if (q12Var != null && q12Var.m75939xb282bd08(0) == 5) {
                r45.q12 P6 = s1Var.P6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f410919f, "[restoreToLastNonCoLiveMode] CoLive -> mode=" + P6.m75939xb282bd08(0) + '/' + P6.m75939xb282bd08(1));
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).f410601f).k(P6);
                ((mm2.e1) s1Var.m147920xbba4bfc0(mm2.e1.class)).n7(P6);
            }
            mm2.c1 c1Var = (mm2.c1) this.f543229f.m56788xbba4bfc0(mm2.c1.class);
            if (c1Var.l7()) {
                c1Var.D8(0);
            }
            yf2.o oVar = this.f543229f;
            qo0.b bVar = qo0.b.f446923n5;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true);
            oVar.X6(bVar, bundle);
        }
        this.f543228e.f391645d = O6;
        return jz5.f0.f384359a;
    }
}
