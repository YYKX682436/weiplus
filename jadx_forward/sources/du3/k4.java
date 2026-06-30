package du3;

/* loaded from: classes.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.C17004x9215385c f325176d;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.C17004x9215385c c17004x9215385c) {
        this.f325176d = c17004x9215385c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m67945xe50c0629;
        m67945xe50c0629 = this.f325176d.m67945xe50c0629();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m67945xe50c0629, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveRecordEditPhotoPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m67945xe50c0629.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m67945xe50c0629, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveRecordEditPhotoPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
