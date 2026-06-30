package jf2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.n f380896d;

    public d(jf2.n nVar) {
        this.f380896d = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$6$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30) this.f380896d;
        e30Var.getClass();
        e30Var.f199748t.dispatchTouchEvent(motionEvent);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$6$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
