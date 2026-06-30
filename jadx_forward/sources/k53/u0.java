package k53;

/* loaded from: classes8.dex */
public class u0 {

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f385927k = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_WEEK) + "haowan/";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f385928a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f385929b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5.C15868x12159658 f385930c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385931d;

    /* renamed from: e, reason: collision with root package name */
    public p33.l f385932e;

    /* renamed from: f, reason: collision with root package name */
    public k53.s0 f385933f;

    /* renamed from: g, reason: collision with root package name */
    public long f385934g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f385935h = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 f385936i = new k53.p0(this);

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 f385937j = new k53.r0(this);

    public u0(android.content.Context context, android.view.View view) {
        this.f385928a = context;
        this.f385929b = view;
        this.f385930c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5.C15868x12159658) view.findViewById(com.p314xaae8f345.mm.R.id.f565554cq2);
    }

    public final void a(p33.l lVar, k53.s0 s0Var) {
        if (lVar == null) {
            return;
        }
        this.f385935h = false;
        this.f385932e = lVar;
        this.f385933f = s0Var;
        if (!lVar.f433135d) {
            if (s0Var != null) {
                s0Var.a(new k53.t0(this, lVar));
                return;
            }
            return;
        }
        android.view.View view = this.f385929b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "prepareShare", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;Lcom/tencent/mm/plugin/game/media/preview/VideoShareWrapper$PrepareCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "prepareShare", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;Lcom/tencent/mm/plugin/game/media/preview/VideoShareWrapper$PrepareCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r53.f.l().m77784x795fa299(new k53.n0(this, lVar));
    }

    public void b() {
        this.f385935h = true;
        android.view.View view = this.f385929b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "stopShare", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "stopShare", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().f(this.f385931d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this.f385936i);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 m0Var = this.f385937j;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f264471e;
        if (copyOnWriteArraySet != null && m0Var != null) {
            copyOnWriteArraySet.remove(m0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.VideoShareWrapper", "cancel share task ret:%b, localId:%s", java.lang.Boolean.valueOf(f17), this.f385931d);
    }
}
