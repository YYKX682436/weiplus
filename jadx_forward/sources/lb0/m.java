package lb0;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f399215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f399216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f399217f;

    public m(db5.g3 g3Var, yz5.a aVar, int i17) {
        this.f399215d = g3Var;
        this.f399216e = aVar;
        this.f399217f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/util/ShareTipsUtil$showTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f399215d.f293588d.dismiss();
        this.f399216e.mo152xb9724478();
        lb0.q.f399221a.c(this.f399217f);
        yj0.a.h(this, "com/tencent/mm/feature/openway/util/ShareTipsUtil$showTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
