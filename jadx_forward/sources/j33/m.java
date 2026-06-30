package j33;

/* loaded from: classes2.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f378978d;

    /* renamed from: e, reason: collision with root package name */
    public final long f378979e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f378980f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f378981g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f378982h;

    public m(android.view.View view, boolean z17, long j17, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 4) != 0 ? 100L : j17;
        aVar = (i17 & 8) != 0 ? null : aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f378978d = z17;
        this.f378979e = j17;
        this.f378980f = aVar;
        this.f378981g = new java.lang.ref.WeakReference(view);
        this.f378982h = "MicroMsg.Album.AnimChangeVisibilityTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = (android.view.View) this.f378981g.get();
        java.lang.String str = this.f378982h;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doAnimUpdateViewVisibility: view null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("visible=");
        sb6.append(view.getVisibility() == 0);
        sb6.append(", alpha=");
        sb6.append(view.getAlpha());
        sb6.append(", toShow=");
        boolean z17 = this.f378978d;
        sb6.append(z17);
        sb6.append(", view=");
        sb6.append(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        long j17 = this.f378979e;
        if (!z17) {
            if (view.getVisibility() == 0) {
                view.animate().alpha(0.0f).setDuration(j17).withEndAction(new j33.k(view, this)).start();
                return;
            }
            return;
        }
        if (view.getVisibility() == 0) {
            if (!(view.getAlpha() == 0.0f)) {
                return;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/utils/AnimChangeVisibilityTask", "doAnimUpdateViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gallery/utils/AnimChangeVisibilityTask", "doAnimUpdateViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/utils/AnimChangeVisibilityTask", "doAnimUpdateViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gallery/utils/AnimChangeVisibilityTask", "doAnimUpdateViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j17);
        final yz5.a aVar = this.f378980f;
        duration.withEndAction(aVar != null ? new java.lang.Runnable(aVar) { // from class: j33.l

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f378977d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                this.f378977d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f378977d.mo152xb9724478();
            }
        } : null).start();
    }
}
