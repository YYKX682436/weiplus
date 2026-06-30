package za3;

/* loaded from: classes15.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f552463a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f552464b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f552465c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f552466d = true;

    /* renamed from: e, reason: collision with root package name */
    public final int f552467e = android.graphics.Color.parseColor("#44FEBB");

    /* renamed from: f, reason: collision with root package name */
    public final int f552468f = android.graphics.Color.parseColor("#FFFFFF");

    /* renamed from: g, reason: collision with root package name */
    public final int f552469g = android.graphics.Color.parseColor("#E54646");

    /* renamed from: h, reason: collision with root package name */
    public final int f552470h = android.graphics.Color.parseColor("#FFC90C");

    /* renamed from: i, reason: collision with root package name */
    public boolean f552471i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f552472j = false;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f552473k = "";

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f552474l = new za3.h0(this, android.os.Looper.getMainLooper());

    public i0(android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f552464b = context;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f552463a = textView;
        textView.invalidate();
        this.f552465c = new java.util.ArrayList();
        java.util.Iterator it = va3.j0.Ui().b(str).iterator();
        while (it.hasNext()) {
            this.f552465c.add((java.lang.String) it.next());
        }
        b(false);
    }

    public static void a(za3.i0 i0Var, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = i0Var.f552474l;
        n3Var.mo50303x856b99f0(1);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        if (z17) {
            n3Var.mo50311x7ab51103(obtain, 100L);
        } else {
            n3Var.mo50308x2936bf5f(obtain);
        }
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f552474l;
        n3Var.mo50303x856b99f0(2);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 2;
        obtain.obj = java.lang.Integer.valueOf(this.f552465c.size());
        this.f552465c.size();
        if (z17) {
            n3Var.mo50311x7ab51103(obtain, 100L);
        } else {
            n3Var.mo50308x2936bf5f(obtain);
        }
    }
}
