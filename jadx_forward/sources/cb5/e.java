package cb5;

/* loaded from: classes5.dex */
public class e extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f121887m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f121888n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f121889o;

    /* renamed from: p, reason: collision with root package name */
    public final e01.c f121890p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f121891q;

    public e(android.content.Context context, e01.c cVar) {
        super(context);
        this.f121887m = null;
        this.f121888n = null;
        this.f121889o = false;
        this.f121890p = null;
        this.f121891q = "";
        this.f121890p = cVar;
        ((ku5.t0) ku5.t0.f394148d).q(new cb5.d(this));
    }

    public static void l(cb5.e eVar, int i17) {
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = eVar.f121891q;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(eVar.f121890p != e01.c.Main ? 1 : 0);
        g0Var.d(14439, objArr);
        g0Var.mo68477x336bdfd8(633L, i17, 1L, false);
    }

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570118xv;
    }

    @Override // s35.b
    public void h(android.view.View view) {
    }

    @Override // s35.b
    public boolean i() {
        ((ku5.t0) ku5.t0.f394148d).q(new cb5.d(this));
        return super.i();
    }

    @Override // s35.b
    public void k(int i17) {
        super.k(i17);
        if (!this.f484377i) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingMonitoredBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View findViewById = this.f484376h.findViewById(com.p314xaae8f345.mm.R.id.jqb);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/banner/ChattingMonitoredBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/banner/ChattingMonitoredBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
