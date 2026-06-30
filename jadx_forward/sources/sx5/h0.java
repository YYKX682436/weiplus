package sx5;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f495268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f495269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f495270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495271g;

    public h0(sx5.a1 a1Var, double d17, double d18, boolean z17) {
        this.f495271g = a1Var;
        this.f495268d = d17;
        this.f495269e = d18;
        this.f495270f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = (int) this.f495268d;
        int i18 = (int) this.f495269e;
        sx5.a1 a1Var = this.f495271g;
        a1Var.u(i17, i18);
        if (!this.f495270f) {
            a1Var.f495208i.setBackgroundColor(0);
            a1Var.f495207h.setBackgroundColor(-16777216);
            return;
        }
        if (a1Var.m(a1Var.N)) {
            by5.c4.f("XWebNativeInterface", "onVideoEnterFullscreen, maybe live video");
            android.view.View view = a1Var.f495213p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a1Var.B.setVisibility(8);
        } else {
            android.view.View view2 = a1Var.f495213p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (a1Var.f495205f.m120171x1f05d274() && a1Var.r(a1Var.f495210m) == null && a1Var.s(a1Var.f495210m) == null) {
            by5.c4.f("XWebNativeInterface", "onVideoEnterFullscreen, xwalk kernel and video view has no surface view or texture view");
            a1Var.f495208i.setBackgroundColor(0);
            a1Var.w(new sx5.w(a1Var));
        } else {
            a1Var.f495208i.setBackgroundColor(-16777216);
            a1Var.f495207h.setBackgroundColor(0);
            a1Var.w(new sx5.w(a1Var));
        }
    }
}
