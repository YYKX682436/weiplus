package qw3;

/* loaded from: classes9.dex */
public class w0 extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448752e;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7) {
        this.f448752e = activityC17105xa1fb9be7;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7 = this.f448752e;
        double c17 = pw3.a.c(activityC17105xa1fb9be7.f238052m.m83183xfb85ada3(), "100");
        if (c17 > 0.0d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7.Y6(activityC17105xa1fb9be7);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitMoneyInputUI", "illegal money: %s", java.lang.Double.valueOf(c17));
            dp.a.m125853x26a183b(activityC17105xa1fb9be7, com.p314xaae8f345.mm.R.C30867xcad56011.aeb, 1).show();
        }
    }
}
