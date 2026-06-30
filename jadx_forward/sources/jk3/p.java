package jk3;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381634d;

    public p(jk3.v vVar) {
        this.f381634d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk3.v vVar = this.f381634d;
        ak3.c cVar = vVar.f381644d;
        if (cVar != null) {
            if ((cVar != null ? cVar.mo2159xc2a54588() : null) != null) {
                ak3.c cVar2 = vVar.f381644d;
                android.view.View mo2159xc2a54588 = cVar2 != null ? cVar2.mo2159xc2a54588() : null;
                if (mo2159xc2a54588 == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo2159xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/multitask/helper/PageMultiTaskHelper$finishPage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo2159xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo2159xc2a54588, "com/tencent/mm/plugin/multitask/helper/PageMultiTaskHelper$finishPage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
