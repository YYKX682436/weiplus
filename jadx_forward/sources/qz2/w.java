package qz2;

/* loaded from: classes9.dex */
public class w implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 f449452d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000) {
        this.f449452d = activityC15524xc77ba000;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000 = this.f449452d;
        if (i17 == 0) {
            activityC15524xc77ba000.f218546i.b(activityC15524xc77ba000, "0", 1);
            return;
        }
        if (i17 != -1) {
            if (i17 != -3) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000.f218540o;
                activityC15524xc77ba000.U6(str, i17);
                return;
            } else {
                activityC15524xc77ba000.f218543f = false;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = activityC15524xc77ba000.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
                }
                db5.e1.C(activityC15524xc77ba000, str, "", activityC15524xc77ba000.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575162l14), activityC15524xc77ba000.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), false, new qz2.a0(activityC15524xc77ba000, i17), new qz2.b0(activityC15524xc77ba000, i17));
                return;
            }
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000.f218540o;
        activityC15524xc77ba000.getClass();
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (currentTimeMillis - activityC15524xc77ba000.f218545h > 1) {
            activityC15524xc77ba000.f218545h = currentTimeMillis;
            activityC15524xc77ba000.f218541d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f_e);
            activityC15524xc77ba000.f218541d.setTextColor(activityC15524xc77ba000.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            activityC15524xc77ba000.f218541d.setVisibility(4);
            if (activityC15524xc77ba000.f218544g == null) {
                activityC15524xc77ba000.f218544g = android.view.animation.AnimationUtils.loadAnimation(activityC15524xc77ba000.mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559324bk);
            }
            activityC15524xc77ba000.f218541d.startAnimation(activityC15524xc77ba000.f218544g);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new qz2.x(activityC15524xc77ba000), activityC15524xc77ba000.f218544g.getDuration());
        }
    }
}
