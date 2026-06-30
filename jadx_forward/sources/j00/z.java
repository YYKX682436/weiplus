package j00;

/* loaded from: classes4.dex */
public final class z implements mh0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378488b;

    public z(java.lang.String str, yz5.l lVar) {
        this.f378487a = str;
        this.f378488b = lVar;
    }

    @Override // mh0.o
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "callAppPay resultCode:" + i17 + ", resultMsg:" + str);
        int i18 = i17 != 0 ? i17 != 2 ? 2 : 3 : 1;
        bw5.q8 q8Var = new bw5.q8();
        java.lang.String str2 = this.f378487a;
        q8Var.f113524d = str2;
        boolean[] zArr = q8Var.f113526f;
        zArr[1] = true;
        q8Var.f113525e = i18;
        zArr[2] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftFlutterPlugin", "handleAppPayResp, orderId:" + str2 + ", paymentAction:" + i18);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f378488b.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.ecs.C23635xf2489dd9(0L, "", q8Var.mo14344x5f01b1f6()))));
    }
}
