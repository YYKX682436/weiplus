package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class ih implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15069x5667c8cb f210900d;

    public ih(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15069x5667c8cb activityC15069x5667c8cb) {
        this.f210900d = activityC15069x5667c8cb;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.yh2 req = (r45.yh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingMsgUI", "[onModifyResult] retCode=" + ret.m75939xb282bd08(1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15069x5667c8cb activityC15069x5667c8cb = this.f210900d;
        android.app.Dialog dialog = activityC15069x5667c8cb.f210267d;
        if (dialog != null) {
            dialog.dismiss();
        }
        activityC15069x5667c8cb.f210267d = null;
        if (ret.m75939xb282bd08(1) != 0) {
            db5.t7.m123883x26a183b(activityC15069x5667c8cb, activityC15069x5667c8cb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eo9), 0).show();
        }
    }
}
