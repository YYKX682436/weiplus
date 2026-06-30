package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class u3 implements wd0.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 f243128a;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 activityC17395x33991581) {
        this.f243128a = activityC17395x33991581;
    }

    @Override // wd0.g2
    public void a(wd0.m2 param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 activityC17395x33991581 = this.f243128a;
        activityC17395x33991581.getIntent().putExtra("verify_result", param.f526285a);
        android.content.Intent intent = activityC17395x33991581.getIntent();
        zt5.s sVar = param.f526287c;
        intent.putExtra("fingerprint_id", sVar != null ? sVar.f557154b : null);
        if (activityC17395x33991581.f241748d) {
            return;
        }
        activityC17395x33991581.f241748d = true;
        if (param.f526285a != 0 || param.f526287c == null) {
            activityC17395x33991581.setResult(0, activityC17395x33991581.getIntent());
            activityC17395x33991581.finish();
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17395x33991581.mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = activityC17395x33991581.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9d);
        e4Var.f293313g = 2;
        e4Var.f293311e = false;
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC17395x33991581), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.t3(activityC17395x33991581, e4Var.c(), null), 2, null);
    }
}
