package vh0;

/* loaded from: classes.dex */
public final class t1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f518500d;

    public t1(android.view.View view) {
        this.f518500d = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.view.View view2 = this.f518500d;
        if (action == 0) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.og7);
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(linearLayout.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.co6);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
            }
        } else if (action == 1) {
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.og7);
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundColor(linearLayout2.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.co6);
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(c22699x3dcdb3522.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
