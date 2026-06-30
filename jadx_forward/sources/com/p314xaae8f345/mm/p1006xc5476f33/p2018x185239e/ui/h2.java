package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class h2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f239265a;

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h2 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h2 h2Var;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h2.class) {
            h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g2.f239252a;
        }
        return h2Var;
    }

    public boolean a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceControlLogic", "finishRemitLargeMoneyUI()，scene %s", java.lang.Integer.valueOf(i17));
        android.content.Context context = (android.content.Context) this.f239265a.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            return false;
        }
        if (!(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17140xfc6f7677)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceControlLogic", "is RemittanceLargeMoneyUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17140xfc6f7677 activityC17140xfc6f7677 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17140xfc6f7677) context;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_close_scene", i17);
        activityC17140xfc6f7677.setResult(-1, intent);
        activityC17140xfc6f7677.finish();
        return true;
    }

    public void c(android.content.Context context) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = context != null ? context.getClass().getSimpleName() : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceControlLogic", "attach() %s", objArr);
        this.f239265a = new java.lang.ref.WeakReference(context);
    }

    public boolean d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceControlLogic", "showSafeProgress()");
        android.content.Context context = (android.content.Context) this.f239265a.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            return false;
        }
        if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2) || !(context instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e)) {
            return false;
        }
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) context).m83138x296ea477();
        return true;
    }
}
