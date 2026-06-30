package on2;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 f428441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f428442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f428443f;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 c1Var, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f428441d = c1Var;
        this.f428442e = lVar;
        this.f428443f = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f428441d.q();
        this.f428442e.mo146xb9724478(this.f428443f.f391656d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
