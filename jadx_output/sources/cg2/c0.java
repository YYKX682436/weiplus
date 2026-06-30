package cg2;

/* loaded from: classes3.dex */
public final class c0 extends yp.p {

    /* renamed from: d, reason: collision with root package name */
    public static final cg2.z f41091d = new cg2.z(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f41092e = jz5.h.b(cg2.y.f41146d);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f41093a;

    /* renamed from: b, reason: collision with root package name */
    public we2.p f41094b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f41095c;

    public c0(android.content.Context context, we2.p pVar) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f41093a = context;
        this.f41094b = pVar;
    }

    @Override // yp.p, yp.a
    public boolean a(wp.a aVar) {
        return aVar instanceof cg2.x;
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0182  */
    @Override // yp.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r27, yp.o r28, wp.i r29) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg2.c0.l(int, yp.o, wp.i):void");
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f41093a).inflate(com.tencent.mm.R.layout.e_a, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        cg2.a aVar = new cg2.a(inflate);
        com.tencent.mm.ui.bk.r0(aVar.f41069e.getPaint(), 0.8f);
        com.tencent.mars.xlog.Log.i("LiveFeedTextDanmakuRender", "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return aVar;
    }
}
