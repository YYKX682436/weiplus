package qe;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f443535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f443536e;

    public w0(qe.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        this.f443536e = d1Var;
        this.f443535d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding setCallback ");
        qe.d1 d1Var = this.f443536e;
        if (d1Var.f443461a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding mContextId != null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) this.f443535d.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding v8Addon is null");
            return;
        }
        d1Var.f443468h = new com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2();
        com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2 c22926xf62a1aa2 = d1Var.f443468h;
        if (c22926xf62a1aa2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding mWcwssNative = null");
            return;
        }
        if (d1Var.f443466f) {
            d1Var.f443461a = c22926xf62a1aa2.m83414xf02c0f9b(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            d1Var.f443461a = c22926xf62a1aa2.m83414xf02c0f9b(l0Var.L(), l0Var.G(), 0L);
        }
        d1Var.f443462b = d1Var.f443468h.m83415x6c4ebec7(d1Var.f443470j, d1Var.f443469i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding setCallback mContextId:%s,mInitCallBack:%d", d1Var.f443461a, java.lang.Integer.valueOf(d1Var.f443462b));
    }
}
