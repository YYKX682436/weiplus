package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i f293999d;

    public e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i iVar) {
        this.f293999d = iVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/snackbar/SnackBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i iVar = this.f293999d;
            if (!iVar.f294005a.f293992d.isEmpty()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a = false;
                iVar.f294008d.postDelayed(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.d(this), 100L);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/snackbar/SnackBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
