package ni3;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419159d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9) {
        this.f419159d = c16559xedc507d9;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9 = this.f419159d;
        if (action == 0) {
            c16559xedc507d9.f231004w.mo50302x6b17ad39(null);
        } else if (motionEvent.getAction() == 1) {
            c16559xedc507d9.f231004w.mo50302x6b17ad39(null);
            c16559xedc507d9.f231004w.mo50297x7c4d7ca2(new ni3.k0(c16559xedc507d9), 3000L);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
