package ns4;

/* loaded from: classes8.dex */
public final class v0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421198d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f421198d = activityC19066x54c41420;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.ek0 ek0Var = (r45.ek0) obj;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.f260681v;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421198d;
        activityC19066x54c41420.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "gotoWeCoinFetchResultUI, info " + ek0Var);
        if (ek0Var != null) {
            activityC19066x54c41420.finish();
            ms4.n nVar = activityC19066x54c41420.f260687i;
            if (nVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            nVar.P6(21);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05();
            if (activityC19066x54c41420.f260687i == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            c19099x8d444f05.f261211h = r4.f412610q;
            c19099x8d444f05.f261214m = "CNY";
            c19099x8d444f05.E = ek0Var.f455108d;
            c19099x8d444f05.F = ek0Var.f455109e;
            android.content.Intent intent = new android.content.Intent(activityC19066x54c41420.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19065x55609b3.class);
            intent.putExtra("key_orders", c19099x8d444f05);
            ms4.n nVar2 = activityC19066x54c41420.f260687i;
            if (nVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            intent.putExtra("wecoin_fetch_result_kv_data", nVar2.f412613t);
            ms4.n nVar3 = activityC19066x54c41420.f260687i;
            if (nVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            intent.putExtra("WECOIN_FETCH_RESULT_BIZ_TYPE", nVar3.f412602f);
            intent.putExtra("WECOIN_ENCASH_RESULT_PAGE_INFO", ek0Var.mo14344x5f01b1f6());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC19066x54c41420, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "gotoWeCoinFetchResultUI", "(Lcom/tencent/mm/protocal/protobuf/EncashResultPageInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC19066x54c41420.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC19066x54c41420, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "gotoWeCoinFetchResultUI", "(Lcom/tencent/mm/protocal/protobuf/EncashResultPageInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ns4.m1 m1Var = (ns4.m1) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.f260681v.get();
        if (m1Var != null) {
        }
    }
}
