package df2;

/* loaded from: classes3.dex */
public final class op implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f312527d;

    public op(df2.sp spVar) {
        this.f312527d = spVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var;
        android.view.ViewGroup J1;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        df2.sp spVar = this.f312527d;
        if (booleanValue) {
            spVar.c7("onCardVisibleLiveData", false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(spVar.f312886m, "[onCardVisibleLiveData] try show bubble");
        android.view.View view = spVar.f312887n;
        if (view != null) {
            int i17 = spVar.f312895v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$onViewMount$3$1", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$onViewMount$3$1", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (spVar.f312895v != 0 || (ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) spVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class)) == null || (J1 = ag0Var.J1()) == null) {
            return;
        }
        if (!J1.isShown()) {
            J1 = null;
        }
        if (J1 == null || spVar.b7(J1)) {
            return;
        }
        spVar.c7("onCardVisibleLiveData", false);
    }
}
