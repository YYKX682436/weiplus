package vr3;

/* loaded from: classes10.dex */
public class z implements vr3.e0, im5.b, yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f521194d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f521195e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f521196f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f521197g;

    /* renamed from: h, reason: collision with root package name */
    public int f521198h;

    /* renamed from: i, reason: collision with root package name */
    public long f521199i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f521200m;

    /* renamed from: n, reason: collision with root package name */
    public cs3.f f521201n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f521202o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f521203p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f521204q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f521205r;

    public z(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f521194d = context;
        this.f521195e = z17;
        this.f521196f = "";
        this.f521197g = new java.util.ArrayList();
        this.f521203p = true;
        this.f521204q = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public final int a(cs3.f fVar) {
        int i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = fVar.g().m82555x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m82555x4905e9fa.getLayoutManager();
        if (mo7946xf939df19 == null || layoutManager == null) {
            i17 = 0;
        } else {
            int mo1894x7e414b06 = mo7946xf939df19.mo1894x7e414b06();
            i17 = 0;
            for (int i18 = 0; i18 < mo1894x7e414b06; i18++) {
                android.view.View mo7935xa188593e = layoutManager.mo7935xa188593e(i18);
                if (mo7935xa188593e != null) {
                    i17 += mo7935xa188593e.getMeasuredHeight();
                }
            }
        }
        android.widget.FrameLayout frameLayout = fVar.f303643h;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
        int measuredHeight = frameLayout.getMeasuredHeight();
        if (measuredHeight == 0) {
            android.widget.FrameLayout frameLayout2 = fVar.f303643h;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
                throw null;
            }
            measuredHeight = i65.a.f(frameLayout2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        }
        int i19 = i17 + measuredHeight;
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i27 = b17.x;
        int i28 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i28 >= i27) {
                i27 = i28;
            }
            i28 = i27;
        }
        android.content.Context context = this.f521194d;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(context);
        return java.lang.Math.max((int) (i28 * 0.25f), (((i28 - h17) - com.p314xaae8f345.mm.ui.bl.g(context)) - i19) + h17);
    }

    public void d() {
        if (!this.f521205r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f521205r = false;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f521204q;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).mo10668x2efc64();
        }
        copyOnWriteArraySet.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "set upContinue false");
        this.f521203p = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "set downContinue true");
        cs3.f fVar = this.f521201n;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 g17 = fVar != null ? fVar.g() : null;
        if (g17 != null) {
            g17.m82693x1501d518(true);
        }
        cs3.f fVar2 = this.f521201n;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = fVar2 != null ? fVar2.g().m82555x4905e9fa() : null;
        if (m82555x4905e9fa != null) {
            m82555x4905e9fa.mo7966xf161ffec(true);
        }
        cs3.f fVar3 = this.f521201n;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 g18 = fVar3 != null ? fVar3.g() : null;
        if (g18 != null) {
            g18.m82683xb165a19d(null);
        }
        this.f521201n = null;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.mm serviceInfo = (r45.mm) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceInfo, "serviceInfo");
        java.lang.String str = this.f521196f;
        long j17 = this.f521199i;
        android.content.Intent intent = this.f521200m;
        if (intent == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        gr3.e.d(str, 1100, j17, intent, 0, this.f521198h, 0, null, null, null, 0, 0, 4032, null);
        if (this.f521195e) {
            gr3.b.f356380a.b(0L, java.lang.Long.valueOf(intValue), 801L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f521198h, (r29 & 128) != 0 ? 0 : 0, (r29 & 256) != 0 ? 0 : 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "onClick serviceInfo.type:%d", java.lang.Integer.valueOf(serviceInfo.f462169e));
        ku5.u0 u0Var = ku5.t0.f394148d;
        vr3.x xVar = new vr3.x(serviceInfo, this, intValue, intValue2);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(xVar, 250L, false);
        cs3.f fVar = this.f521201n;
        if (fVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e h17 = fVar.h();
            if (h17.q()) {
                h17.n(true);
            }
        }
        return jz5.f0.f384359a;
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f521204q.add(aVar);
    }
}
