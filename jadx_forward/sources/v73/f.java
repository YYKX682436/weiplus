package v73;

/* loaded from: classes9.dex */
public class f implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 f515220a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344) {
        this.f515220a = activityC16099xbf243344;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7
    public void a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344 = this.f515220a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16099xbf243344.f223793d, "go to quata ui");
        if (u73.h.g()) {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27566xe4673800("card_id", activityC16099xbf243344.M);
            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("honeyPayModifyCreditUseCase", m27539xaf65a0fc, new v73.g(activityC16099xbf243344));
        } else {
            android.content.Intent intent = new android.content.Intent(activityC16099xbf243344, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16103x79357e65.class);
            intent.putExtra("key_max_credit_line", activityC16099xbf243344.N);
            intent.putExtra("key_min_credit_line", activityC16099xbf243344.P);
            intent.putExtra("key_card_no", activityC16099xbf243344.M);
            intent.putExtra("key_take_message", activityC16099xbf243344.K);
            intent.putExtra("key_title", activityC16099xbf243344.U);
            intent.putExtra("key_subtitle", activityC16099xbf243344.V);
            intent.putExtra("key_bottom_tips", activityC16099xbf243344.W);
            intent.putExtra("key_over_quota_tips", activityC16099xbf243344.X);
            activityC16099xbf243344.startActivityForResult(intent, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15191, 0, 0, 0, 1, 0, 0);
    }
}
