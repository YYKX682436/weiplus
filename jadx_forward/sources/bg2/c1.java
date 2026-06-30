package bg2;

/* loaded from: classes2.dex */
public final class c1 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d1 f101492d;

    public c1(bg2.d1 d1Var) {
        this.f101492d = d1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        in5.s0 s0Var = this.f101492d.f498674d.f498682i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.f565793dk3) : null;
        if (p17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertGuideBubbleController$showGuideBubble$bubble$3", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertGuideBubbleController$showGuideBubble$bubble$3", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
