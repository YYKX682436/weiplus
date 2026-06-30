package qn2;

/* loaded from: classes3.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.z f446708d;

    public v(qn2.z zVar) {
        this.f446708d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn2.z zVar = this.f446708d;
        zVar.K0(8);
        qo0.c.a(zVar.f446753p, qo0.b.f446937q3, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
