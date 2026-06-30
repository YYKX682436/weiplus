package qw3;

/* loaded from: classes9.dex */
public class g0 extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448692e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        this.f448692e = activityC17101x8420a569;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "click next btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448692e;
        activityC17101x8420a569.mo48674x36654fab();
        activityC17101x8420a569.mo48632xd46dd964();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569.W6(activityC17101x8420a569)) {
            return;
        }
        java.lang.String m83183xfb85ada3 = activityC17101x8420a569.f238011e.m83183xfb85ada3();
        java.lang.String m83183xfb85ada32 = activityC17101x8420a569.f238012f.m83183xfb85ada3();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83183xfb85ada3) || m83183xfb85ada3.trim().isEmpty() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83183xfb85ada32) || m83183xfb85ada32.trim().isEmpty() || activityC17101x8420a569.F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitBankcardInputUI", "args is empty, payeeName: %s, bankCardNo: %s, bankcard: %s", m83183xfb85ada3, m83183xfb85ada32, activityC17101x8420a569.F);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "onRealClick() ifGetOperation:%s waitingGetOperation:%s ifAutoNext:%s", java.lang.Boolean.valueOf(activityC17101x8420a569.R), java.lang.Boolean.valueOf(activityC17101x8420a569.S), java.lang.Boolean.valueOf(activityC17101x8420a569.T));
        if (activityC17101x8420a569.R) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569.X6(activityC17101x8420a569)) {
                if (activityC17101x8420a569.I) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "from record goto next direct");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569.Y6(activityC17101x8420a569);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04 c17098x7cd03d04 = activityC17101x8420a569.F;
                java.lang.String str = c17098x7cd03d04.f237988e;
                java.lang.String str2 = c17098x7cd03d04.f237987d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "do check bank bind: %s %s", str, str2);
                activityC17101x8420a569.m83098x5406100e(new ow3.d(m83183xfb85ada3, m83183xfb85ada32, str, str2));
                return;
            }
            return;
        }
        activityC17101x8420a569.T = true;
        activityC17101x8420a569.U = m83183xfb85ada3;
        activityC17101x8420a569.V = m83183xfb85ada32;
        android.app.Dialog dialog = activityC17101x8420a569.D;
        if (dialog != null) {
            dialog.show();
        } else {
            activityC17101x8420a569.D = db5.e1.Q(activityC17101x8420a569, activityC17101x8420a569.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), activityC17101x8420a569.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), true, true, new qw3.f0(this));
        }
        if (activityC17101x8420a569.S) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "do operation");
        activityC17101x8420a569.S = true;
        activityC17101x8420a569.m83099x5406100e(new ow3.i(), false);
    }
}
