package dt;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5146xcc9c5522 c5146xcc9c5522 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5146xcc9c5522) abstractC20979x809547d1;
        if (com.p314xaae8f345.mm.app.w7.f135435o == 0 && gm0.j1.d().f152304n && gm0.j1.b().n() && c01.id.c() - com.p314xaae8f345.mm.app.w7.f135436p > 60000) {
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec.class);
            android.content.Intent putExtra = intent.addFlags(268435456).addFlags(67108864).putExtra("key_errType", c5146xcc9c5522.f135496g.f87827a);
            am.c cVar = c5146xcc9c5522.f135496g;
            putExtra.putExtra("key_errCode", cVar.f87828b).putExtra("key_errMsg", cVar.f87829c);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfAccountExpiredEvent", "(Lcom/tencent/mm/autogen/events/AccountExpiredEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerProfile", "callbackOfAccountExpiredEvent", "(Lcom/tencent/mm/autogen/events/AccountExpiredEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.app.w7.f135436p = c01.id.c();
        }
        qk.g9 bj6 = i95.n0.c(qk.i9.class) != null ? ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj() : null;
        if (bj6 != null) {
            rk4.z8 z8Var = (rk4.z8) bj6;
            if (z8Var.nj()) {
                rk4.k5.e("TingServicesImpl stop play onAccountReleased", null);
                z8Var.zj();
            }
        }
        try {
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            if (r0Var != null) {
                ((is.f) r0Var).Ai(c01.z1.r());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "clearNoPwdInfo err: %s", e17.getMessage());
        }
        try {
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            if (j1Var == null) {
                return true;
            }
            ((vd0.v1) j1Var).Zi(c01.z1.r());
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "resetUserInfo err: %s", e18.getMessage());
            return true;
        }
    }
}
