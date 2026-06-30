package yf2;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.z f543349d;

    public y(yf2.z zVar) {
        this.f543349d = zVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostButtonController$setupClickListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        yf2.z zVar = this.f543349d;
        if (zVar.f543356p) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostButtonController$setupClickListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            android.widget.TextView textView = zVar.f543354n;
            if (textView != null) {
                textView.setAlpha(0.7f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = zVar.f543355o;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setAlpha(0.7f);
            }
        } else if (action == 1 || action == 3) {
            android.widget.TextView textView2 = zVar.f543354n;
            if (textView2 != null) {
                textView2.setAlpha(1.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = zVar.f543355o;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setAlpha(1.0f);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostButtonController$setupClickListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
