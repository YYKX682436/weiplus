package wu3;

/* loaded from: classes.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f531308d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e) {
        this.f531308d = c17040x9d8b708e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f531308d.f237506o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$setShowAudioPanel$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$setShowAudioPanel$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
