package qw3;

/* loaded from: classes9.dex */
public class d0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        super(false);
        this.f448682d = activityC17101x8420a569;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448682d;
        activityC17101x8420a569.mo48674x36654fab();
        activityC17101x8420a569.f238012f.e();
        java.lang.String m83183xfb85ada3 = activityC17101x8420a569.f238012f.m83183xfb85ada3();
        if (!activityC17101x8420a569.N || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83183xfb85ada3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569.V6(activityC17101x8420a569);
            return;
        }
        java.lang.String m83178x233c8fe9 = activityC17101x8420a569.f238012f.m83178x233c8fe9();
        activityC17101x8420a569.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by cardNo");
        if (activityC17101x8420a569.K != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "cancel pre scene");
            activityC17101x8420a569.m83092xd92c7189(activityC17101x8420a569.K);
        }
        activityC17101x8420a569.N = false;
        ow3.f fVar = new ow3.f(m83183xfb85ada3, m83178x233c8fe9);
        activityC17101x8420a569.K = fVar;
        activityC17101x8420a569.m83099x5406100e(fVar, true);
    }
}
