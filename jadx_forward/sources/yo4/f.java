package yo4;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f545737d;

    public f(yo4.p pVar) {
        this.f545737d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f545737d.f545819q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
