package df2;

/* loaded from: classes3.dex */
public final class rp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f312794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o35 f312795e;

    public rp(df2.sp spVar, r45.o35 o35Var) {
        this.f312794d = spVar;
        this.f312795e = o35Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.sp spVar = this.f312794d;
        java.lang.String str = spVar.f312886m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bubble click, giftId = ");
        r45.o35 o35Var = this.f312795e;
        r45.kv1 kv1Var = (r45.kv1) o35Var.m75936x14adae67(1);
        sb6.append(kv1Var != null ? kv1Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.kv1 kv1Var2 = (r45.kv1) o35Var.m75936x14adae67(1);
        if (kv1Var2 != null && (m75945x2fec8307 = kv1Var2.m75945x2fec8307(0)) != null) {
            java.lang.String str2 = m75945x2fec8307.length() > 0 ? m75945x2fec8307 : null;
            if (str2 != null) {
                qo0.b bVar = qo0.b.Z1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", str2);
                bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_IS_PKG", true);
                spVar.X6(bVar, bundle);
            }
        }
        df2.sp.a7(spVar);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
