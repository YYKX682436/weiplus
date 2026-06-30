package rg5;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.o f476792d;

    public m(rg5.o oVar) {
        this.f476792d = oVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/findmore/entry/FinderLiveEntryPreferenceMgr$updateFinderLiveEntry$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).getClass();
            ae2.in inVar = ae2.in.f85221a;
            boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85253d1).mo141623x754a37bb()).r()).intValue() == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareService", "checkTouchPreloadLiveSquare: switchOn=" + z17);
            if (z17) {
                ys5.e eVar = ys5.e.f546791f;
                i95.m c17 = i95.n0.c(ys5.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ys5.f.D6((ys5.f) c17, eVar, 0.0f, null, 6, null);
            }
            rg5.g[] gVarArr = rg5.g.f476786d;
            this.f476792d.h(2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("LiveMentionEntrance");
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/findmore/entry/FinderLiveEntryPreferenceMgr$updateFinderLiveEntry$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
