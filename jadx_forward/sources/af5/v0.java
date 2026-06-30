package af5;

/* loaded from: classes11.dex */
public final class v0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b f86182d;

    public v0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b) {
        this.f86182d = c22094xdaed490b;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = this.f86182d;
        java.lang.Integer num = null;
        if (c22094xdaed490b.selectableLayout != null && (h17 = c22094xdaed490b.m80120x9909cadb().h(e17.getX(), e17.getY())) != null) {
            jf5.j0 j0Var = (jf5.j0) ((jf5.f0) h17.f384366d);
            java.lang.Integer d17 = j0Var.d(((java.lang.Number) h17.f384367e).intValue());
            if (d17 != null) {
                num = d17;
            } else {
                java.lang.CharSequence c17 = j0Var.c();
                android.text.Spanned spanned = c17 instanceof android.text.Spanned ? (android.text.Spanned) c17 : null;
                if (spanned != null) {
                    jf5.k[] kVarArr = (jf5.k[]) spanned.getSpans(0, c17.length(), jf5.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVarArr);
                    int length = kVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            kVar = null;
                            break;
                        }
                        kVar = kVarArr[i17];
                        v11.s sVar2 = kVar.f381009a;
                        if (sVar2 == null ? false : jf5.k0.f(sVar2)) {
                            break;
                        }
                        i17++;
                    }
                    if (kVar != null && (sVar = kVar.f381009a) != null) {
                        num = java.lang.Integer.valueOf((sVar.f513993c + sVar.f513994d) / 2);
                    }
                }
            }
        }
        int intValue = num != null ? num.intValue() : -1;
        v11.t m48328xa0ab20ce = c22094xdaed490b.m48328xa0ab20ce();
        if (m48328xa0ab20ce != null && (lVar = m48328xa0ab20ce.f514000i) != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(intValue));
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
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/MarkdownNativeMvvmView$gestureDetector$2$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
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
