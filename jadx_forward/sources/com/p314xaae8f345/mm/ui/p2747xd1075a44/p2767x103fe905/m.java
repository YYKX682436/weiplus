package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* loaded from: classes10.dex */
public class m implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n f294014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 f294015e;

    public m(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 c22721xaf9ba7f3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n nVar) {
        this.f294015e = c22721xaf9ba7f3;
        this.f294014d = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/snackbar/SnackContainer$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 4) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 c22721xaf9ba7f3 = this.f294015e;
            c22721xaf9ba7f3.removeCallbacks(c22721xaf9ba7f3.f293994f);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar = this.f294014d.f294020e;
            if (hVar != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a = false;
                hVar.mo50890xc39a57c1();
            }
            c22721xaf9ba7f3.startAnimation(c22721xaf9ba7f3.f293993e);
            java.util.Queue queue = c22721xaf9ba7f3.f293992d;
            if (!queue.isEmpty()) {
                ((java.util.LinkedList) queue).clear();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/snackbar/SnackContainer$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
