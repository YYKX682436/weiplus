package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class tg implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c f211413d;

    public tg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c activityC15066x6f77678c) {
        this.f211413d = activityC15066x6f77678c;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingInfoUI", "modifyMpIdentity onModifyResult: ret = " + ret.m75939xb282bd08(1));
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c activityC15066x6f77678c = this.f211413d;
        if (m75939xb282bd08 != 0) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC15066x6f77678c.m79336x8b97809d()).h("settings_mp_identity_switch");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15066x6f77678c.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c.f210254p;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17).O(activityC15066x6f77678c.V6(mo55332x76847179));
            db5.t7.m123883x26a183b(activityC15066x6f77678c, activityC15066x6f77678c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9b), 0).show();
        } else {
            g92.b bVar = g92.b.f351302e;
            ya2.b2 b2Var = activityC15066x6f77678c.f210256e;
            java.lang.String str = b2Var != null ? b2Var.f69347xdec927b : null;
            if (str == null) {
                str = "";
            }
            m92.b j37 = g92.a.j3(bVar, str, false, 2, null);
            int i18 = j37 != null ? j37.f68698x26b1b2e8 : 0;
            int i19 = req.m75939xb282bd08(21) == 1 ? 16777216 | i18 : (-16777217) & i18;
            ya2.b2 b2Var2 = activityC15066x6f77678c.f210256e;
            java.lang.String str2 = b2Var2 != null ? b2Var2.f69347xdec927b : null;
            m92.c cVar = new m92.c(str2 != null ? str2 : "");
            cVar.f68698x26b1b2e8 = i19;
            bVar.C(cVar, m92.j.f406530o);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("NEED_REFRESH_CONTACT", true);
            intent.putExtra("ACCOUNT_USERNAME", activityC15066x6f77678c.f210255d);
            activityC15066x6f77678c.setResult(-1, intent);
        }
        az2.f fVar = activityC15066x6f77678c.f210259h;
        if (fVar != null) {
            fVar.b();
        }
    }
}
