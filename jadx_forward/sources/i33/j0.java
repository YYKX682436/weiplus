package i33;

/* loaded from: classes5.dex */
public final class j0 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f369737d;

    public j0(i33.t0 t0Var) {
        this.f369737d = t0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return this.f369737d.f369781g;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }
}
