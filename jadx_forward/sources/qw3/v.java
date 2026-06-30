package qw3;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448747d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        this.f448747d = activityC17101x8420a569;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448747d;
        if (!z17) {
            activityC17101x8420a569.f238011e.m83173x1e821d71().m75915x984ee11e(activityC17101x8420a569.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aew));
        } else if (activityC17101x8420a569.f238011e.m83169xe7297452().getText() == null || activityC17101x8420a569.f238011e.m83169xe7297452().getText().length() <= 0) {
            activityC17101x8420a569.f238011e.m83173x1e821d71().m75915x984ee11e(activityC17101x8420a569.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aew));
        }
    }
}
