package os3;

/* loaded from: classes8.dex */
public class i2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.j2 f429640d;

    public i2(os3.j2 j2Var) {
        this.f429640d = j2Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        os3.j2 j2Var = this.f429640d;
        android.view.View view2 = j2Var.f429655e.f236422n;
        if (view2 != null && view2 != view && view2.isSelected()) {
            j2Var.f429655e.f236422n.setSelected(false);
            j2Var.f429655e.f236422n = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = j2Var.f429655e;
        c16936x21d2caed.f236422n = view;
        if (c16936x21d2caed.f236417f != null && motionEvent.getAction() == 0) {
            j2Var.f429654d.setSelected(!r12.isSelected());
            j2Var.f429655e.f236417f.setVisibility(0);
            j2Var.f429655e.f236417f.requestFocus();
            ((android.view.inputmethod.InputMethodManager) j2Var.f429655e.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
        }
        android.view.GestureDetector gestureDetector = j2Var.f429655e.f236421m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
