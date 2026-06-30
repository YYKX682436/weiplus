package ns4;

/* loaded from: classes8.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.la7 f421153d;

    public p3(r45.la7 la7Var) {
        this.f421153d = la7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateSubscriptionListEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        r45.la7 la7Var = this.f421153d;
        bundle.putString("appId", la7Var.f460816e.f466118d);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, la7Var.f460816e.f466120f);
        bundle.putString("query", la7Var.f460816e.f466119e);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean("withDownloadLoading", true);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, true, new ns4.o3());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateSubscriptionListEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
