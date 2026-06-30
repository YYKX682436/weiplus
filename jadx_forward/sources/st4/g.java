package st4;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f494148a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f494149b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f494150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a f494151d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a activityC19181xc87129a) {
        this.f494151d = activityC19181xc87129a;
    }

    public void a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a activityC19181xc87129a = this.f494151d;
        this.f494148a = activityC19181xc87129a.f262766d.n();
        this.f494149b = activityC19181xc87129a.f262767e.n();
        boolean n17 = activityC19181xc87129a.f262768f.n();
        this.f494150c = n17;
        if (!activityC19181xc87129a.f262774o || n17) {
            activityC19181xc87129a.f262770h.setVisibility(4);
        } else {
            activityC19181xc87129a.f262770h.setVisibility(0);
            activityC19181xc87129a.f262770h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.khq);
        }
        if (activityC19181xc87129a.f262773n) {
            if (!this.f494148a) {
                activityC19181xc87129a.f262769g.setVisibility(0);
                activityC19181xc87129a.f262769g.setTextColor(activityC19181xc87129a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
                activityC19181xc87129a.f262769g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kh9);
            } else {
                if (!activityC19181xc87129a.f262775p.containsKey(activityC19181xc87129a.f262766d.m83183xfb85ada3()) || activityC19181xc87129a.f262776q.contains(activityC19181xc87129a.f262766d.m83183xfb85ada3())) {
                    activityC19181xc87129a.m83099x5406100e(new rt4.b(activityC19181xc87129a.f262766d.m83183xfb85ada3()), false);
                    activityC19181xc87129a.f262776q.add(activityC19181xc87129a.f262766d.m83183xfb85ada3());
                    activityC19181xc87129a.f262769g.setVisibility(0);
                    activityC19181xc87129a.f262769g.setTextColor(activityC19181xc87129a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
                    activityC19181xc87129a.f262769g.setText(activityC19181xc87129a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kgp));
                    z17 = true;
                    if (this.f494148a || !this.f494149b || !this.f494150c || z17) {
                        activityC19181xc87129a.f262771i.setEnabled(false);
                    } else {
                        activityC19181xc87129a.f262771i.setEnabled(true);
                        return;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87 c19178xda56ba87 = (com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87) activityC19181xc87129a.f262775p.get(activityC19181xc87129a.f262766d.m83183xfb85ada3());
                activityC19181xc87129a.f262769g.setVisibility(0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19178xda56ba87.f262761d)) {
                    activityC19181xc87129a.f262769g.setTextColor(activityC19181xc87129a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
                    activityC19181xc87129a.f262769g.setText(c19178xda56ba87.f262763f);
                    this.f494148a = false;
                } else {
                    activityC19181xc87129a.f262769g.setTextColor(activityC19181xc87129a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
                    activityC19181xc87129a.f262769g.setText(c19178xda56ba87.f262763f);
                }
            }
        }
        z17 = false;
        if (this.f494148a) {
        }
        activityC19181xc87129a.f262771i.setEnabled(false);
    }
}
