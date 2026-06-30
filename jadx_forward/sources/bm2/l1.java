package bm2;

/* loaded from: classes3.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f103592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.o1 f103593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f103595g;

    public l1(dk2.zf zfVar, bm2.o1 o1Var, int i17, bm2.h1 h1Var) {
        this.f103592d = zfVar;
        this.f103593e = o1Var;
        this.f103594f = i17;
        this.f103595g = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.h1 h1Var = this.f103595g;
        int i17 = this.f103594f;
        dk2.zf zfVar = this.f103592d;
        bm2.o1 o1Var = this.f103593e;
        if (zfVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f103712i, "onLikeIconClickListener: topComment,content:" + zfVar.j() + ",position:" + i17);
            yz5.q qVar = o1Var.f103715o;
            if (qVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                qVar.mo147xb9724478(zfVar, view, h1Var);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(o1Var.f103712i, "onLikeIconClickListener: OnClick IndexOutOfBounds! position:" + i17 + " commentList.size:" + o1Var.f103713m.size() + " view:" + h1Var.f3639x46306858);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
