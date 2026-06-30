package rk4;

/* loaded from: classes11.dex */
public final class m5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18708x5ac0f042 f478380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18708x5ac0f042 activityC18708x5ac0f042) {
        super(1);
        this.f478380d = activityC18708x5ac0f042;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a it = (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startMembershipSubscribe callback status: ");
        sb6.append(it.m93238x2fe4f2e8());
        sb6.append(", cancelled: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18708x5ac0f042 activityC18708x5ac0f042 = this.f478380d;
        sb6.append(activityC18708x5ac0f042.f256159e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipTransparentUI", sb6.toString());
        if (!activityC18708x5ac0f042.f256159e) {
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) activityC18708x5ac0f042.f256158d).mo141623x754a37bb();
            if (resultReceiver != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("key_result_status", (int) it.m93238x2fe4f2e8());
                resultReceiver.send(0, bundle);
            }
            activityC18708x5ac0f042.finish();
        }
        return jz5.f0.f384359a;
    }
}
