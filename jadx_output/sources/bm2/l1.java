package bm2;

/* loaded from: classes3.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f22059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.o1 f22060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f22062g;

    public l1(dk2.zf zfVar, bm2.o1 o1Var, int i17, bm2.h1 h1Var) {
        this.f22059d = zfVar;
        this.f22060e = o1Var;
        this.f22061f = i17;
        this.f22062g = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.h1 h1Var = this.f22062g;
        int i17 = this.f22061f;
        dk2.zf zfVar = this.f22059d;
        bm2.o1 o1Var = this.f22060e;
        if (zfVar != null) {
            com.tencent.mars.xlog.Log.i(o1Var.f22179i, "onLikeIconClickListener: topComment,content:" + zfVar.j() + ",position:" + i17);
            yz5.q qVar = o1Var.f22182o;
            if (qVar != null) {
                kotlin.jvm.internal.o.d(view);
                qVar.invoke(zfVar, view, h1Var);
            }
        } else {
            com.tencent.mars.xlog.Log.w(o1Var.f22179i, "onLikeIconClickListener: OnClick IndexOutOfBounds! position:" + i17 + " commentList.size:" + o1Var.f22180m.size() + " view:" + h1Var.itemView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
