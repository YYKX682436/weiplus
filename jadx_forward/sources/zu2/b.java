package zu2;

/* loaded from: classes2.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f557239d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vg0 f557240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f557239d = "Finder.ShareEcSourceUIC";
    }

    public final void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557239d, "registerInterceptor");
        ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).f534710g = new zu2.a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long longExtra = m158359x1e885992().getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_ec_source");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (longExtra != 0) {
            if (stringExtra.length() == 0) {
                return;
            }
            r45.vg0 vg0Var = new r45.vg0();
            vg0Var.set(0, java.lang.Long.valueOf(longExtra));
            vg0Var.set(1, stringExtra);
            this.f557240e = vg0Var;
            O6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate ecSourceReqStruct ");
            r45.vg0 vg0Var2 = this.f557240e;
            sb6.append(pm0.v.u(vg0Var2 != null ? vg0Var2.m75942xfb822ef2(0) : 0L));
            sb6.append(", ");
            r45.vg0 vg0Var3 = this.f557240e;
            sb6.append(vg0Var3 != null ? vg0Var3.m75945x2fec8307(1) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557239d, sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557239d, "unregisterInterceptor");
        ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).f534710g = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        O6();
    }
}
