package if1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f372610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if1.l f372611e;

    public k(if1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2) {
        this.f372611e = lVar;
        this.f372610d = lVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if1.l lVar = this.f372611e;
        if (lVar.f372614e) {
            android.view.View view = lVar.f372624r;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!n3.x0.b(view)) {
                if (if1.l.f372612t == null || !if1.l.f372612t.equals(this.f372611e.f372624r)) {
                    return;
                }
                if1.l.f372612t = null;
                return;
            }
            if1.r c17 = if1.s.c(this.f372611e.f372624r);
            if (java.lang.Math.abs(this.f372611e.f372616g.f372627b - c17.f372627b) > 1.0f || java.lang.Math.abs(this.f372611e.f372616g.f372628c - c17.f372628c) > 1.0f || ((java.util.HashMap) this.f372611e.f372613d).size() != 1) {
                return;
            }
            if1.l lVar2 = this.f372611e;
            float abs = java.lang.Math.abs(lVar2.f372622p.f372627b - lVar2.f372623q.f372627b);
            if1.l lVar3 = this.f372611e;
            if (abs <= lVar3.f372619m) {
                float abs2 = java.lang.Math.abs(lVar3.f372622p.f372628c - lVar3.f372623q.f372628c);
                if1.l lVar4 = this.f372611e;
                if (abs2 <= lVar4.f372619m) {
                    float f17 = lVar4.f372622p.f372627b;
                    float f18 = this.f372611e.f372623q.f372627b;
                    float f19 = this.f372611e.f372622p.f372628c;
                    float f27 = this.f372611e.f372623q.f372628c;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f372611e.f372618i.f(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, ""));
                        jSONObject.put("touch", this.f372611e.f372622p.a());
                    } catch (org.json.JSONException unused) {
                    }
                    if (!this.f372611e.f372618i.d("disableScroll", false)) {
                        if1.l lVar5 = this.f372611e;
                        lVar5.f372620n = android.view.MotionEvent.obtain(lVar5.f372621o);
                        this.f372611e.f372620n.setAction(0);
                        this.f372611e.f372618i.j("fakeDownEvent", true);
                        this.f372611e.f372624r.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f372611e.f372624r.setDuplicateParentStateEnabled(false);
                        if1.l lVar6 = this.f372611e;
                        lVar6.a(lVar6.f372624r, android.view.MotionEvent.obtain(lVar6.f372620n));
                    }
                    if1.l lVar7 = this.f372611e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar8 = this.f372610d;
                    if1.m mVar = new if1.m();
                    java.lang.String jSONObject2 = jSONObject.toString();
                    lVar7.getClass();
                    lVar8.d(mVar.k(), jSONObject2, null);
                    return;
                }
            }
            float f28 = this.f372611e.f372622p.f372627b;
            float f29 = this.f372611e.f372623q.f372627b;
            float f37 = this.f372611e.f372622p.f372628c;
            float f38 = this.f372611e.f372623q.f372628c;
        }
    }
}
