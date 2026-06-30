package af5;

/* loaded from: classes11.dex */
public final class v0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4649d;

    public v0(com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        this.f4649d = markdownNativeMvvmView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        yz5.l lVar;
        jz5.l h17;
        jf5.k kVar;
        v11.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = this.f4649d;
        java.lang.Integer num = null;
        if (markdownNativeMvvmView.selectableLayout != null && (h17 = markdownNativeMvvmView.getSelectableLayout$app_release().h(e17.getX(), e17.getY())) != null) {
            jf5.j0 j0Var = (jf5.j0) ((jf5.f0) h17.f302833d);
            java.lang.Integer d17 = j0Var.d(((java.lang.Number) h17.f302834e).intValue());
            if (d17 != null) {
                num = d17;
            } else {
                java.lang.CharSequence c17 = j0Var.c();
                android.text.Spanned spanned = c17 instanceof android.text.Spanned ? (android.text.Spanned) c17 : null;
                if (spanned != null) {
                    jf5.k[] kVarArr = (jf5.k[]) spanned.getSpans(0, c17.length(), jf5.k.class);
                    kotlin.jvm.internal.o.d(kVarArr);
                    int length = kVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            kVar = null;
                            break;
                        }
                        kVar = kVarArr[i17];
                        v11.s sVar2 = kVar.f299476a;
                        if (sVar2 == null ? false : jf5.k0.f(sVar2)) {
                            break;
                        }
                        i17++;
                    }
                    if (kVar != null && (sVar = kVar.f299476a) != null) {
                        num = java.lang.Integer.valueOf((sVar.f432460c + sVar.f432461d) / 2);
                    }
                }
            }
        }
        int intValue = num != null ? num.intValue() : -1;
        v11.t viewModel = markdownNativeMvvmView.getViewModel();
        if (viewModel != null && (lVar = viewModel.f432467i) != null) {
            lVar.invoke(java.lang.Integer.valueOf(intValue));
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
