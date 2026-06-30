package rx4;

/* loaded from: classes8.dex */
public final class u0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482813d;

    /* renamed from: e, reason: collision with root package name */
    public int f482814e;

    /* renamed from: f, reason: collision with root package name */
    public int f482815f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f482816g;

    /* renamed from: h, reason: collision with root package name */
    public rx4.w0 f482817h;

    /* renamed from: i, reason: collision with root package name */
    public float f482818i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f482819m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f482820n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f482821o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f482822p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f482813d = "FTSNativeTeachRecommendBoxUIC";
        this.f482818i = 1.0f;
        this.f482819m = new java.util.ArrayList();
        this.f482820n = new java.util.LinkedHashMap();
    }

    public final java.util.Map T6() {
        java.lang.String str;
        java.util.Map map = this.f482820n;
        if (map.size() <= 0) {
            return null;
        }
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = java.lang.Long.valueOf(java.lang.Math.min(((java.lang.Number) next).longValue(), ((java.lang.Number) it.next()).longValue()));
        }
        long longValue = ((java.lang.Number) next).longValue();
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f482815f);
        sb6.append("|39|");
        rx4.w0 w0Var = this.f482817h;
        if (w0Var == null || (str = w0Var.f482850d) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        lVarArr[0] = new jz5.l("itemid", sb6.toString());
        lVarArr[1] = new jz5.l("item_exptime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - longValue));
        return kz5.c1.k(lVarArr);
    }

    public final void U6(org.json.JSONArray jSONArray, boolean z17) {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] fillRecommendBox isCache=");
        sb6.append(z17);
        sb6.append(", data.len=");
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f482813d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        jz5.f0 f0Var = null;
        if (jSONArray != null) {
            int i17 = 0;
            while (true) {
                boolean z18 = true;
                if (!(i17 < jSONArray.length())) {
                    obj = null;
                    break;
                }
                obj = jSONArray.get(i17);
                i17++;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                if (((org.json.JSONObject) obj).optInt("type") != 39) {
                    z18 = false;
                }
                if (z18) {
                    break;
                }
            }
            if (obj != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[hitest] fillRecommendBox found type=39, items=");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("items");
                sb8.append(optJSONArray != null ? optJSONArray.length() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
                this.f482816g = z17;
                android.app.Activity context = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                this.f482817h = new rx4.w0(jSONObject, ((rx4.h2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class)).i7());
                pm0.v.X(new rx4.t0(this));
                if (!z17) {
                    try {
                        org.json.JSONArray optJSONArray2 = ((org.json.JSONObject) obj).optJSONArray("items");
                        if (optJSONArray2 != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            c75.c.d(optJSONArray2, new rx4.l0(arrayList));
                            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:FINDER_REC_QUERY_PERMANENT_KEY", new org.json.JSONArray((java.util.Collection) arrayList).toString());
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            pm0.v.X(new rx4.m0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.mo739xfd763ae1(bundle);
        this.f482818i = m158354x19263085().getResources().getDisplayMetrics().density;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f568087s23);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((rx4.h2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class)).E || (findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cgz)) == null) {
                return;
            }
            float f17 = 16;
            float f18 = this.f482818i;
            findViewById.setPadding((int) (f17 * f18), 0, (int) (f17 * f18), (int) (10 * f18));
        }
    }
}
