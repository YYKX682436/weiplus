package m31;

/* loaded from: classes9.dex */
public final class y1 implements h31.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca f404773a;

    public y1(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca) {
        this.f404773a = activityC11168xbe8821ca;
    }

    public void a(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        int i19 = com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.f153407u;
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca = this.f404773a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubscribeMsgRequestProxyUI", "subscribeMsgRequest onError bizUsername: %s, action: %d, errCode: %d, errMsg: %s", activityC11168xbe8821ca.V6(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC11168xbe8821ca.f153409e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.T6(this.f404773a, i18, errMsg, true, null, 8, null);
    }

    public void b(boolean z17, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        int i17 = com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.f153407u;
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca = this.f404773a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "onGetSubscribeListSuccess bizUsername: %s, %d, showDialog: %b", activityC11168xbe8821ca.V6(), java.lang.Integer.valueOf(result.f153318h.size()), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC11168xbe8821ca.f153409e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC11168xbe8821ca.f153411g = h31.s.b(activityC11168xbe8821ca.f153411g);
        if (activityC11168xbe8821ca.U6() == 1 || !z17) {
            com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.T6(this.f404773a, 0, "", false, null, 12, null);
        }
    }

    public void c(com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        int i17 = com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.f153407u;
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca = this.f404773a;
        java.lang.String V6 = activityC11168xbe8821ca.V6();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = result.f153318h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "onSubscribeMsgSuccess bizUsername: %s, %d", V6, java.lang.Integer.valueOf(arrayList.size()));
        activityC11168xbe8821ca.f153411g = h31.s.b(activityC11168xbe8821ca.f153411g);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("key_result_data", arrayList);
        bundle.putString("key_result_ext_data", result.f153333z);
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.T6(this.f404773a, 0, "", false, bundle, 4, null);
    }
}
