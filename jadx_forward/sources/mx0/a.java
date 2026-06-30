package mx0;

/* loaded from: classes5.dex */
public abstract class a implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f413347d;

    /* renamed from: e, reason: collision with root package name */
    public volatile float f413348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f413349f;

    public a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f413347d = view;
        this.f413349f = true;
    }

    public void a(float f17) {
        if (this.f413349f) {
            if ((this.f413348e == f17) || !com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                return;
            }
            this.f413348e = f17;
            this.f413347d.animate().cancel();
            this.f413347d.animate().rotation(f17).setDuration(100L).start();
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f413349f) {
            android.view.View view = this.f413347d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/BaseVisiblePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/BaseVisiblePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
