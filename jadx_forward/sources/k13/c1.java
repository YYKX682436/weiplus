package k13;

/* loaded from: classes3.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f384733e;

    public c1(k13.l1 l1Var, int i17) {
        this.f384732d = l1Var;
        this.f384733e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f384732d.f384769n;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(this.f384733e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$smoothScrollTo$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$smoothScrollTo$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
