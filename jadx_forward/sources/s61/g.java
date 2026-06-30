package s61;

/* loaded from: classes15.dex */
public class g implements r61.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 f484884a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669) {
        this.f484884a = activityC11375x7be2c669;
    }

    @Override // r61.l0
    /* renamed from: notifyDataSetChanged */
    public void mo161929xced61ae5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669 = this.f484884a;
        int i17 = activityC11375x7be2c669.f154661t;
        if (i17 == 2) {
            activityC11375x7be2c669.f154657p.setText(activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg8, java.lang.Integer.valueOf(activityC11375x7be2c669.f154650f.getCount())));
        } else if (i17 == 1) {
            activityC11375x7be2c669.f154657p.setText(activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg9));
        } else {
            activityC11375x7be2c669.f154657p.setText(activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg8, java.lang.Integer.valueOf(activityC11375x7be2c669.f154650f.getCount())));
        }
        if (activityC11375x7be2c669.f154650f.d()) {
            if (activityC11375x7be2c669.f154661t != 1 && activityC11375x7be2c669.f154657p.getVisibility() == 0 && activityC11375x7be2c669.f154656o != null) {
                activityC11375x7be2c669.f154657p.setVisibility(8);
                activityC11375x7be2c669.f154656o.setVisibility(0);
            }
        } else if (activityC11375x7be2c669.f154661t != 1 && activityC11375x7be2c669.f154657p.getVisibility() == 8 && activityC11375x7be2c669.f154656o != null) {
            activityC11375x7be2c669.f154657p.setVisibility(0);
            activityC11375x7be2c669.f154656o.setVisibility(8);
        }
        if (activityC11375x7be2c669.f154650f.c() <= 0 || activityC11375x7be2c669.f154661t == 1) {
            activityC11375x7be2c669.f154653i.setText(activityC11375x7be2c669.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571205i, activityC11375x7be2c669.f154650f.getCount(), java.lang.Integer.valueOf(activityC11375x7be2c669.f154650f.getCount())));
        } else {
            activityC11375x7be2c669.f154653i.setText(activityC11375x7be2c669.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571202f, activityC11375x7be2c669.f154650f.c(), java.lang.Integer.valueOf(activityC11375x7be2c669.f154650f.c())));
        }
    }
}
