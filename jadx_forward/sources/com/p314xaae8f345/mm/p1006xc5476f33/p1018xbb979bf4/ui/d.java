package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11486x99e55700 f156063d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11486x99e55700 activityC11486x99e55700) {
        this.f156063d = activityC11486x99e55700;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        i83.b bVar;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11486x99e55700 activityC11486x99e55700 = this.f156063d;
        if (activityC11486x99e55700.f155910d == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14199, 3);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14199, 4);
        }
        android.widget.Button button = activityC11486x99e55700.f155912f;
        if (button != null && button.isActivated() && activityC11486x99e55700.f155916m.m48726xfb85ada3().length() == 0) {
            activityC11486x99e55700.W6();
            return false;
        }
        android.widget.Button button2 = activityC11486x99e55700.f155911e;
        if (button2 != null && button2.isActivated() && activityC11486x99e55700.f155917n.m48726xfb85ada3().length() == 0) {
            activityC11486x99e55700.W6();
            return false;
        }
        if (activityC11486x99e55700.f155910d != 0 && activityC11486x99e55700.f155917n.m48726xfb85ada3().length() == 0 && activityC11486x99e55700.f155916m.m48726xfb85ada3().length() == 0) {
            activityC11486x99e55700.W6();
            return false;
        }
        if (activityC11486x99e55700.f155918o.m48726xfb85ada3().length() > 100) {
            db5.e1.G(activityC11486x99e55700, activityC11486x99e55700.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2m), activityC11486x99e55700.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, null);
            return false;
        }
        if (!activityC11486x99e55700.T6()) {
            android.widget.Button button3 = activityC11486x99e55700.f155912f;
            if ((button3 != null && button3.isActivated()) || ((bVar = activityC11486x99e55700.f155923t) != null && (str = bVar.f371168e) != null && str.equals("0"))) {
                if (!activityC11486x99e55700.f155920q.b()) {
                    db5.e1.G(activityC11486x99e55700, activityC11486x99e55700.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2v), activityC11486x99e55700.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, null);
                }
                if (!activityC11486x99e55700.f155922s.b()) {
                    db5.e1.G(activityC11486x99e55700, activityC11486x99e55700.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2j), activityC11486x99e55700.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, null);
                }
            }
            return true;
        }
        if (activityC11486x99e55700.f155912f.isActivated()) {
            activityC11486x99e55700.f155924u.f371168e = "0";
        } else if (activityC11486x99e55700.f155911e.isActivated()) {
            activityC11486x99e55700.f155924u.f371168e = "1";
        }
        i83.b bVar2 = activityC11486x99e55700.f155923t;
        if (bVar2 != null) {
            activityC11486x99e55700.f155924u.f371168e = bVar2.f371168e;
        }
        activityC11486x99e55700.f155924u.f371169f = activityC11486x99e55700.f155916m.m48726xfb85ada3();
        activityC11486x99e55700.f155924u.f371170g = activityC11486x99e55700.f155917n.m48726xfb85ada3();
        activityC11486x99e55700.f155924u.f371171h = activityC11486x99e55700.f155918o.m48726xfb85ada3();
        i83.b bVar3 = activityC11486x99e55700.f155924u;
        bVar3.f371167d = activityC11486x99e55700.f155910d;
        bVar3.f371175o = activityC11486x99e55700.f155920q.m48726xfb85ada3();
        activityC11486x99e55700.f155924u.f371173m = activityC11486x99e55700.f155921r.m48726xfb85ada3();
        activityC11486x99e55700.f155924u.f371172i = activityC11486x99e55700.f155922s.m48726xfb85ada3();
        activityC11486x99e55700.f155924u.f371178r = activityC11486x99e55700.f155919p.m48726xfb85ada3();
        c01.d9.e().g(new q71.r(activityC11486x99e55700.f155924u));
        c01.d9.e().a(bb1.d.f4183x366c91de, activityC11486x99e55700);
        if (activityC11486x99e55700.f155910d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddInvoiceUI", "modify save invoice " + activityC11486x99e55700.f155924u.toString());
            activityC11486x99e55700.f155925v = db5.e1.Q(activityC11486x99e55700, "", "", true, true, null);
        } else {
            activityC11486x99e55700.f155925v = db5.e1.Q(activityC11486x99e55700, "", "", true, true, null);
        }
        return true;
    }
}
