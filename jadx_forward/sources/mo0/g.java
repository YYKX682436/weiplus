package mo0;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 f411794d;

    public g(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 c10851x9baaeea1) {
        this.f411794d = c10851x9baaeea1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 c10851x9baaeea1 = this.f411794d;
        android.widget.ImageView imageView = c10851x9baaeea1.f150156d;
        if (imageView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/live/core/view/LiveVideoViewCompatCover$hideCoverImage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/live/core/view/LiveVideoViewCompatCover$hideCoverImage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView2 = c10851x9baaeea1.f150156d;
        if (imageView2 != null) {
            imageView2.setAlpha(0.0f);
        }
        android.widget.ImageView imageView3 = c10851x9baaeea1.f150156d;
        if (imageView3 != null) {
            pm0.v.B(imageView3);
        }
    }
}
