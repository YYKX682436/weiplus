package tb5;

/* loaded from: classes12.dex */
public final class l0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f498600d;

    /* renamed from: e, reason: collision with root package name */
    public final tb5.j0 f498601e;

    /* renamed from: f, reason: collision with root package name */
    public tb5.k0 f498602f;

    public l0(java.lang.String tag, android.widget.AbsListView.OnScrollListener onScrollListener, tb5.j0 listener, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        onScrollListener = (i17 & 2) != 0 ? null : onScrollListener;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f498600d = onScrollListener;
        this.f498601e = listener;
        this.f498602f = tb5.k0.f498596d;
    }

    public final void a(android.view.View view, int i17) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.util.Objects.toString(this.f498602f);
        }
        tb5.j0 j0Var = this.f498601e;
        if (i17 != 0 && this.f498602f == tb5.k0.f498596d) {
            this.f498602f = tb5.k0.f498597e;
            j0Var.getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(j0Var);
        } else if (i17 == 0 && this.f498602f == tb5.k0.f498597e) {
            this.f498602f = tb5.k0.f498596d;
            j0Var.f();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f498600d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i17, i18, i19);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f498600d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i17);
        }
        a(absListView, i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        a(recyclerView, i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }
}
