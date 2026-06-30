package tp4;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2339x72ce5378.C18824x3ddc8d91 f502686d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2339x72ce5378.C18824x3ddc8d91 c18824x3ddc8d91) {
        this.f502686d = c18824x3ddc8d91;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m72693x6d2fdb0f;
        m72693x6d2fdb0f = this.f502686d.m72693x6d2fdb0f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m72693x6d2fdb0f, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$loadCurrentPage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m72693x6d2fdb0f.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m72693x6d2fdb0f, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$loadCurrentPage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
