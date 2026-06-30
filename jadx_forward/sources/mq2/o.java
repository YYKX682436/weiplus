package mq2;

/* loaded from: classes15.dex */
public final class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 f412291d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60) {
        this.f412291d = c14558x6dc32d60;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        bb5.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        mq2.h hVar = this.f412291d.f203629n;
        if (hVar != null && hVar != null && (gVar = hVar.f412270e) != null) {
            gVar.c(motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
