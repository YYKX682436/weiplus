package sc2;

/* loaded from: classes2.dex */
public final class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487723e;

    public r3(in5.s0 s0Var, xc2.p0 p0Var) {
        this.f487722d = s0Var;
        this.f487723e = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FeedJumperCnyWishPagObserver$bindCnyPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = this.f487722d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        xc2.y2.i(y2Var, context, this.f487723e, 0, this.f487722d, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCnyWishPagObserver$bindCnyPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
