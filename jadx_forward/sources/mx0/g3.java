package mx0;

/* loaded from: classes5.dex */
public final class g3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f413523d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.z f413524e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f413525f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 f413526g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f413527h;

    /* renamed from: i, reason: collision with root package name */
    public int f413528i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f413529m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f413530n;

    /* renamed from: o, reason: collision with root package name */
    public final int f413531o;

    /* renamed from: p, reason: collision with root package name */
    public long f413532p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f413533q;

    public g3(android.widget.RelativeLayout layout, mx0.z controller, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f413523d = layout;
        this.f413524e = controller;
        this.f413525f = aVar;
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.lok);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f413526g = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303) findViewById;
        this.f413527h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f413528i = 9999000;
        this.f413530n = true;
        this.f413531o = 1000;
        this.f413532p = -1L;
    }

    public final void a() {
        this.f413523d.setEnabled(false);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = this.f413526g;
        c10973x5ab09303.m47281xbc91ffe0(false);
        c10973x5ab09303.setAlpha(0.7f);
    }

    public final void b(boolean z17) {
        this.f413526g.m47272xc0c9abea(z17);
    }

    public final void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "updateMaxRecordDuration >> " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f413533q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
        int i18 = c16993xacc19624.f237218w + 500;
        if (i17 <= i18) {
            i18 = i17;
        }
        this.f413528i = i18;
        this.f413526g.m47278x658e55c5(i17);
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        this.f413523d.setVisibility(0);
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        this.f413523d.setVisibility(4);
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = this.f413526g;
        c10973x5ab09303.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", "hideLoadingProgressBar");
        android.view.View view = c10973x5ab09303.f151036f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/RecordButton", "hideLoadingProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/RecordButton", "hideLoadingProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c10973x5ab09303.m47281xbc91ffe0(true);
        c10973x5ab09303.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", "reset");
        c10973x5ab09303.c();
        c10973x5ab09303.b();
        c10973x5ab09303.e();
        int visibility = c10973x5ab09303.getVisibility();
        c10973x5ab09303.f();
        c10973x5ab09303.setVisibility(visibility);
        this.f413527h.mo50302x6b17ad39(null);
        if (this.f413529m) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.h(c10973x5ab09303.getContext(), "android.permission.RECORD_AUDIO");
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f413526g.setVisibility(i17);
        if (this.f413530n) {
            this.f413523d.bringToFront();
        }
    }
}
