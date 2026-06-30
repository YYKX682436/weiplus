package th;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: l, reason: collision with root package name */
    public static final th.o f500795l = new th.o();

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f500800e;

    /* renamed from: f, reason: collision with root package name */
    public qh.f0 f500801f;

    /* renamed from: g, reason: collision with root package name */
    public rh.o2 f500802g;

    /* renamed from: a, reason: collision with root package name */
    public final android.util.DisplayMetrics f500796a = new android.util.DisplayMetrics();

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f500797b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseBooleanArray f500798c = new android.util.SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public m3.d f500799d = new m3.d(java.lang.Integer.valueOf(android.os.Process.myPid()), c(wh.m.s()));

    /* renamed from: h, reason: collision with root package name */
    public boolean f500803h = false;

    /* renamed from: i, reason: collision with root package name */
    public wh.s f500804i = new wh.s();

    /* renamed from: j, reason: collision with root package name */
    public wh.t0 f500805j = new th.a(this);

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f500806k = new th.b(this);

    public static void a(th.o oVar, android.widget.TextView textView, int i17) {
        oVar.getClass();
        textView.setTextColor(textView.getResources().getColor(i17 == 2 ? com.p314xaae8f345.mm.R.C30859x5a72f63.alo : i17 == 1 ? com.p314xaae8f345.mm.R.C30859x5a72f63.aln : com.p314xaae8f345.mm.R.C30859x5a72f63.all));
    }

    public static java.lang.String c(java.lang.String str) {
        return str.contains(":") ? str.substring(str.lastIndexOf(":") + 1) : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
    }

    public void b() {
        android.view.View view = this.f500800e;
        if (view != null) {
            ((android.view.WindowManager) view.getContext().getApplicationContext().getSystemService("window")).removeView(this.f500800e);
            this.f500800e = null;
        }
    }
}
