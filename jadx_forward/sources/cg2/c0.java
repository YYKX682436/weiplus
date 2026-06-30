package cg2;

/* loaded from: classes3.dex */
public final class c0 extends yp.p {

    /* renamed from: d, reason: collision with root package name */
    public static final cg2.z f122624d = new cg2.z(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f122625e = jz5.h.b(cg2.y.f122679d);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f122626a;

    /* renamed from: b, reason: collision with root package name */
    public we2.p f122627b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f122628c;

    public c0(android.content.Context context, we2.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f122626a = context;
        this.f122627b = pVar;
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
        android.view.View inflate = android.view.LayoutInflater.from(this.f122626a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_a, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        cg2.a aVar = new cg2.a(inflate);
        com.p314xaae8f345.mm.ui.bk.r0(aVar.f122602e.getPaint(), 0.8f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedTextDanmakuRender", "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return aVar;
    }
}
