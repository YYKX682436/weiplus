package sr2;

/* loaded from: classes5.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f493059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f493060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f493061f;

    public c1(yz5.a aVar, boolean z17, sr2.o1 o1Var) {
        this.f493059d = aVar;
        this.f493060e = z17;
        this.f493061f = o1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkExtendItemVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f493059d.mo152xb9724478();
        if (this.f493060e && (aVar = this.f493061f.f493191i) != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkExtendItemVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
