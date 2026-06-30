package if1;

/* loaded from: classes7.dex */
public class l implements android.view.View.OnTouchListener {

    /* renamed from: t, reason: collision with root package name */
    public static volatile android.view.View f372612t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f372613d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f372614e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f372615f;

    /* renamed from: g, reason: collision with root package name */
    public if1.r f372616g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f372617h;

    /* renamed from: i, reason: collision with root package name */
    public final c01.l2 f372618i;

    /* renamed from: m, reason: collision with root package name */
    public final float f372619m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.MotionEvent f372620n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.MotionEvent f372621o;

    /* renamed from: p, reason: collision with root package name */
    public final if1.r f372622p;

    /* renamed from: q, reason: collision with root package name */
    public final if1.r f372623q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f372624r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f372625s;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, c01.l2 l2Var) {
        iz5.a.d(null, lVar);
        iz5.a.d(null, l2Var);
        this.f372618i = l2Var;
        lVar.mo50260x9f1221c2();
        this.f372625s = lVar;
        this.f372619m = android.view.ViewConfiguration.get(lVar.mo50352x76847179()).getScaledTouchSlop();
        this.f372622p = new if1.r();
        this.f372623q = new if1.r();
        this.f372617h = new if1.k(this, lVar);
    }

    public final void a(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.Object parent = view.getParent();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            view.dispatchTouchEvent(motionEvent);
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        motionEvent.offsetLocation(-(viewGroup.getScrollX() - view.getX()), -(viewGroup.getScrollY() - view.getY()));
        a((android.view.View) parent, motionEvent);
    }

    public if1.r[] b(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
            if1.r rVar = (if1.r) ((java.util.HashMap) this.f372613d).get(java.lang.Integer.valueOf(motionEvent.getPointerId(i17)));
            if (rVar != null) {
                rVar.f372627b = motionEvent.getX(i17);
                rVar.f372628c = motionEvent.getY(i17);
                arrayList.add(rVar);
            }
        }
        if1.r[] rVarArr = new if1.r[arrayList.size()];
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            rVarArr[i18] = (if1.r) arrayList.get(i18);
        }
        return rVarArr;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, if1.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, java.lang.String str) {
        if (rVar == null || n5Var == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            jSONObject.put("touch", rVar.a());
        } catch (org.json.JSONException unused) {
        }
        lVar.d(n5Var.k(), jSONObject.toString(), null);
    }

    public final void d(android.view.View view, boolean z17, if1.r rVar) {
        this.f372624r = view;
        this.f372614e = z17;
        if (z17) {
            return;
        }
        c01.l2 l2Var = this.f372618i;
        l2Var.j("fakeDownEvent", false);
        l2Var.j("onLongClick", false);
        this.f372624r.removeCallbacks(this.f372617h);
        if1.r rVar2 = this.f372622p;
        rVar2.f372626a = -1;
        rVar2.f372627b = 0.0f;
        rVar2.f372628c = 0.0f;
        this.f372620n = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        if (r0 != 6) goto L99;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: if1.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
