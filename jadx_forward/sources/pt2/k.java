package pt2;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 f439784d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 abstractActivityC14960x21b59453) {
        this.f439784d = abstractActivityC14960x21b59453;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 abstractActivityC14960x21b59453 = this.f439784d;
        abstractActivityC14960x21b59453.f7().m80997xdc5215a6().d();
        abstractActivityC14960x21b59453.mo48674x36654fab();
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
