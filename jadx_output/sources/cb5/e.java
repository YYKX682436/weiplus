package cb5;

/* loaded from: classes5.dex */
public class e extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f40354m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f40355n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40356o;

    /* renamed from: p, reason: collision with root package name */
    public final e01.c f40357p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f40358q;

    public e(android.content.Context context, e01.c cVar) {
        super(context);
        this.f40354m = null;
        this.f40355n = null;
        this.f40356o = false;
        this.f40357p = null;
        this.f40358q = "";
        this.f40357p = cVar;
        ((ku5.t0) ku5.t0.f312615d).q(new cb5.d(this));
    }

    public static void l(cb5.e eVar, int i17) {
        eVar.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = eVar.f40358q;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(eVar.f40357p != e01.c.Main ? 1 : 0);
        g0Var.d(14439, objArr);
        g0Var.idkeyStat(633L, i17, 1L, false);
    }

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.f488585xv;
    }

    @Override // s35.b
    public void h(android.view.View view) {
    }

    @Override // s35.b
    public boolean i() {
        ((ku5.t0) ku5.t0.f312615d).q(new cb5.d(this));
        return super.i();
    }

    @Override // s35.b
    public void k(int i17) {
        super.k(i17);
        if (!this.f402844i) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMonitoredBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View findViewById = this.f402843h.findViewById(com.tencent.mm.R.id.jqb);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/banner/ChattingMonitoredBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/banner/ChattingMonitoredBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
