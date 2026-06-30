package qw3;

/* loaded from: classes9.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448741d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7) {
        this.f448741d = activityC17105xa1fb9be7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7 = this.f448741d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC17105xa1fb9be7.f238060u.getLayoutParams();
        if (activityC17105xa1fb9be7.f238063x.isShown()) {
            layoutParams.width = activityC17105xa1fb9be7.f238063x.getRight() + i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 8);
        } else {
            layoutParams.width = activityC17105xa1fb9be7.f238061v.getRight() + i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 8);
        }
        layoutParams.height = i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 36);
        activityC17105xa1fb9be7.f238060u.setLayoutParams(layoutParams);
        if (activityC17105xa1fb9be7.f238063x.isShown()) {
            activityC17105xa1fb9be7.f238061v.setMaxWidth((((activityC17105xa1fb9be7.f238059t.getWidth() - i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 20)) - i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 8)) - i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 12)) - i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 16));
        } else {
            activityC17105xa1fb9be7.f238061v.setMaxWidth(((activityC17105xa1fb9be7.f238059t.getWidth() - i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 20)) - i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 8)) - i65.a.b(activityC17105xa1fb9be7.mo55332x76847179(), 12));
        }
    }
}
