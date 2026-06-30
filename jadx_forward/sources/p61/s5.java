package p61;

/* loaded from: classes14.dex */
public class s5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f433908d;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11373x393d8ccd activityC11373x393d8ccd) {
        this.f433908d = new java.lang.ref.WeakReference(activityC11373x393d8ccd);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11373x393d8ccd activityC11373x393d8ccd = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11373x393d8ccd) this.f433908d.get();
        if (activityC11373x393d8ccd != null && !activityC11373x393d8ccd.isFinishing()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) activityC11373x393d8ccd.findViewById(com.p314xaae8f345.mm.R.id.aim);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) activityC11373x393d8ccd.findViewById(com.p314xaae8f345.mm.R.id.ail);
            java.lang.String trim = c21486x59d05a04.getText().toString().trim();
            activityC11373x393d8ccd.f154633g = c21486x59d05a042.getText().toString().trim();
            try {
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(trim, 0L);
                activityC11373x393d8ccd.f154632f = V;
                if (V < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                    db5.e1.i(activityC11373x393d8ccd.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.aie, com.p314xaae8f345.mm.R.C30867xcad56011.aic);
                    return true;
                }
                if (activityC11373x393d8ccd.f154633g.equals("")) {
                    db5.e1.i(activityC11373x393d8ccd.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.aid, com.p314xaae8f345.mm.R.C30867xcad56011.aic);
                    return true;
                }
                activityC11373x393d8ccd.mo48674x36654fab();
                n61.b bVar = new n61.b(activityC11373x393d8ccd.f154632f, activityC11373x393d8ccd.f154633g, "", "", "", 1, activityC11373x393d8ccd.f154637n, activityC11373x393d8ccd.f154638o, false);
                gm0.j1.d().g(bVar);
                activityC11373x393d8ccd.f154631e = db5.e1.Q(activityC11373x393d8ccd.mo55332x76847179(), activityC11373x393d8ccd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aig), activityC11373x393d8ccd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ai8), true, true, new p61.r5(this, bVar));
                return true;
            } catch (java.lang.Exception unused) {
                db5.e1.i(activityC11373x393d8ccd.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.aie, com.p314xaae8f345.mm.R.C30867xcad56011.aic);
            }
        }
        return true;
    }
}
