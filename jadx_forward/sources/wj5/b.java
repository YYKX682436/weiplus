package wj5;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f528309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj5.c f528310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.t4 f528311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528312g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f528313h;

    public b(int i17, wj5.c cVar, db5.t4 t4Var, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d dVar, android.view.View view) {
        this.f528309d = i17;
        this.f528310e = cVar;
        this.f528311f = t4Var;
        this.f528312g = dVar;
        this.f528313h = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert$bindLongClickMenu$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.f478885v = new wj5.a(this.f528313h);
        int i17 = this.f528309d;
        wj5.c cVar = this.f528310e;
        db5.t4 t4Var = this.f528311f;
        int[] iArr = this.f528312g.f291461d;
        rVar.g(view, i17, 0L, cVar, t4Var, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert$bindLongClickMenu$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
