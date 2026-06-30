package tt2;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503514f;

    public p0(tt2.e1 e1Var, ut2.s3 s3Var, int i17) {
        this.f503512d = e1Var;
        this.f503513e = s3Var;
        this.f503514f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.q qVar = this.f503512d.f503427y;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            qVar.mo147xb9724478(this.f503513e, view, java.lang.Integer.valueOf(this.f503514f));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
