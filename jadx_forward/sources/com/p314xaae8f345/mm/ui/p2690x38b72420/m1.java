package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes12.dex */
public class m1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.n1 f288555d;

    public m1(com.p314xaae8f345.mm.ui.p2690x38b72420.n1 n1Var) {
        this.f288555d = n1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2690x38b72420.n1 n1Var = this.f288555d;
        if (itemId == 0) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901 activityC22294xac144901 = n1Var.f288569d;
            java.lang.String str = (java.lang.String) activityC22294xac144901.f287896g.get(activityC22294xac144901.f287893d.getSelectedItemPosition());
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901 activityC22294xac1449012 = n1Var.f288569d;
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str, activityC22294xac1449012, null);
            return;
        }
        if (itemId == 1) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901 activityC22294xac1449013 = n1Var.f288569d;
            int i19 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901.f287892o;
            activityC22294xac1449013.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.g(c5303xc75d2f73, 6, (java.lang.String) activityC22294xac1449013.f287896g.get(activityC22294xac1449013.f287893d.getSelectedItemPosition()));
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87856i = activityC22294xac1449013;
            c4Var.f87860m = 46;
            c5303xc75d2f73.e();
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901 activityC22294xac1449014 = n1Var.f288569d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = activityC22294xac1449014.f287893d;
        if (c22506x89e75b89 == null || activityC22294xac1449014.f287900n == null) {
            i18 = -1;
        } else {
            activityC22294xac1449014.f287899m = true;
            int selectedItemPosition = c22506x89e75b89.getSelectedItemPosition();
            if (selectedItemPosition >= 0 && selectedItemPosition < activityC22294xac1449014.f287893d.getCount()) {
                java.util.ArrayList arrayList = activityC22294xac1449014.f287900n.f288659d;
                if (arrayList != null) {
                    arrayList.remove(selectedItemPosition);
                }
                activityC22294xac1449014.f287900n.notifyDataSetChanged();
            }
            i18 = activityC22294xac1449014.f287900n.getCount();
        }
        if (i18 == 0) {
            n1Var.f288569d.U6();
        }
    }
}
