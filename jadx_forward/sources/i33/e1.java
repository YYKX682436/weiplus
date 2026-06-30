package i33;

/* loaded from: classes10.dex */
public final class e1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369713f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f369714g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f369715h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f369716i;

    /* renamed from: m, reason: collision with root package name */
    public j33.m f369717m;

    /* renamed from: n, reason: collision with root package name */
    public final long f369718n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369713f = "MicroMsg.AlbumTimeHeaderUIC";
        this.f369715h = jz5.h.b(new i33.c1(this));
        this.f369716i = jz5.h.b(new i33.d1(this));
        this.f369718n = 150L;
    }

    @Override // i33.c
    public void V6(com.p314xaae8f345.mm.ui.q2 oldMode, com.p314xaae8f345.mm.ui.q2 newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMode, "oldMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        java.lang.String str = this.f369713f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onSelectModeChanged: oldMode=" + oldMode + ", newMode=" + newMode);
        if (oldMode == newMode) {
            return;
        }
        if (newMode != com.p314xaae8f345.mm.ui.q2.NORMAL) {
            this.f369714g = true;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = T6().mo7946xf939df19();
            X6(mo7946xf939df19 instanceof e33.b0 ? (e33.b0) mo7946xf939df19 : null);
            return;
        }
        this.f369714g = false;
        if (W6().getVisibility() == 0) {
            j33.m mVar = new j33.m(W6(), false, this.f369718n, null, 8, null);
            this.f369717m = mVar;
            mVar.run();
            this.f369717m = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hideNewTimeHeader: ");
        }
    }

    public final android.view.View W6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f369715h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void X6(e33.b0 b0Var) {
        java.lang.String str;
        if (this.f369714g) {
            if (W6().getVisibility() != 0) {
                if (this.f369717m == null) {
                    j33.m mVar = new j33.m(W6(), true, this.f369718n, null, 8, null);
                    this.f369717m = mVar;
                    mVar.run();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showNewTimeHeader: visible=");
                sb6.append(W6().getVisibility() == 0);
                sb6.append(", alpha=");
                sb6.append(W6().getAlpha());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f369713f, sb6.toString());
            }
            if (b0Var != null) {
                int w17 = U6().w();
                java.util.LinkedList linkedList = b0Var.f328672r;
                if (w17 < linkedList.size()) {
                    w17 = linkedList.size();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = b0Var.E(w17);
                if (E == null) {
                    str = "";
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(E.f219974s)) {
                    java.util.Date date = new java.util.Date(E.f219968m);
                    com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().getClass();
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.setTime(date);
                    str = b0Var.f328662e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bnd, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)));
                } else {
                    str = E.f219974s;
                }
            } else {
                str = null;
            }
            java.lang.String str2 = str != null ? str : "";
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f369716i).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb).setText(str2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f435481a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            i33.z0.Y6(z0Var, this, 0, 2, null);
        }
    }
}
