package s61;

/* loaded from: classes15.dex */
public class s implements r61.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 f484921a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69) {
        this.f484921a = activityC11376x2afd0f69;
    }

    @Override // r61.l0
    /* renamed from: notifyDataSetChanged */
    public void mo161929xced61ae5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69 = this.f484921a;
        int i17 = activityC11376x2afd0f69.f154678s;
        if (i17 == 2) {
            activityC11376x2afd0f69.f154675p.setText(activityC11376x2afd0f69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgg, java.lang.Integer.valueOf(activityC11376x2afd0f69.f154668f.getCount())));
        } else if (i17 == 1) {
            activityC11376x2afd0f69.f154675p.setText(activityC11376x2afd0f69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgh));
        } else {
            activityC11376x2afd0f69.f154675p.setText(activityC11376x2afd0f69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgg, java.lang.Integer.valueOf(activityC11376x2afd0f69.f154668f.getCount())));
        }
        if (activityC11376x2afd0f69.f154668f.d()) {
            if (activityC11376x2afd0f69.f154678s != 1 && activityC11376x2afd0f69.f154675p.getVisibility() == 0 && activityC11376x2afd0f69.f154674o != null) {
                activityC11376x2afd0f69.f154675p.setVisibility(8);
                activityC11376x2afd0f69.f154674o.setVisibility(0);
            }
        } else if (activityC11376x2afd0f69.f154678s != 1 && activityC11376x2afd0f69.f154675p.getVisibility() == 8 && activityC11376x2afd0f69.f154674o != null) {
            activityC11376x2afd0f69.f154675p.setVisibility(0);
            activityC11376x2afd0f69.f154674o.setVisibility(8);
        }
        if (activityC11376x2afd0f69.f154668f.c() <= 0 || activityC11376x2afd0f69.f154678s == 1) {
            activityC11376x2afd0f69.f154671i.setText(activityC11376x2afd0f69.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571204h, activityC11376x2afd0f69.f154668f.getCount(), java.lang.Integer.valueOf(activityC11376x2afd0f69.f154668f.getCount())));
        } else {
            activityC11376x2afd0f69.f154671i.setText(activityC11376x2afd0f69.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571203g, activityC11376x2afd0f69.f154668f.c(), java.lang.Integer.valueOf(activityC11376x2afd0f69.f154668f.c())));
        }
    }
}
