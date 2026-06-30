package bm2;

/* loaded from: classes3.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f103619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.o1 f103620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f103622g;

    public m1(dk2.zf zfVar, bm2.o1 o1Var, int i17, bm2.h1 h1Var) {
        this.f103619d = zfVar;
        this.f103620e = o1Var;
        this.f103621f = i17;
        this.f103622g = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f103621f;
        dk2.zf zfVar = this.f103619d;
        bm2.o1 o1Var = this.f103620e;
        if (zfVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f103712i, "onChatButtonClickListener: topComment,content:" + zfVar.j() + ",position:" + i17);
            yz5.l lVar = o1Var.f103716p;
            if (lVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                lVar.mo146xb9724478(view);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(o1Var.f103712i, "onLikeIconClickListener: OnClick IndexOutOfBounds! position:" + i17 + " commentList.size:" + o1Var.f103713m.size() + " view:" + this.f103622g.f3639x46306858);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
