package rx4;

/* loaded from: classes8.dex */
public final class k0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482742d;

    /* renamed from: e, reason: collision with root package name */
    public int f482743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f482744f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f482745g;

    /* renamed from: h, reason: collision with root package name */
    public rx4.l f482746h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f482747i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f482748m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f482742d = "FTSNativeTeachHotspotBoxUIC";
        float f17 = activity.getResources().getDisplayMetrics().density;
        this.f482747i = new java.util.ArrayList();
        this.f482748m = new java.util.LinkedHashMap();
    }

    public static final void T6(rx4.k0 k0Var, vu4.a actionId, rx4.m mVar, int i17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(k0Var.f482743e);
        sb6.append("|42|");
        rx4.l lVar = k0Var.f482746h;
        if (lVar == null || (str = lVar.f482753b) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        java.lang.String itemInfo = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int i18 = i17 + 1;
        sb7.append(i18);
        sb7.append('|');
        sb7.append(i18);
        java.lang.String g07 = kz5.n0.g0(kz5.c0.i(sb7.toString(), mVar.f482763c, "", "1", fp.s0.b(mVar.f482762b, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), "", "", "finder_hot_video", ""), "|", null, null, 0, null, null, 62, null);
        boolean z17 = k0Var.f482744f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        android.app.Activity context = k0Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        rx4.h2 h2Var = (rx4.h2) a17;
        h2Var.a7();
        h2Var.q7(actionId, itemInfo, g07, z17, kz5.c1.l(new jz5.l("clickId", h2Var.f482716y)));
    }

    public final rx4.s2 U6(int i17) {
        java.util.List list;
        java.lang.String str;
        java.util.List list2;
        this.f482743e = i17;
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list3 = this.f482747i;
        int size = ((java.util.ArrayList) list3).size();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            rx4.m mVar = null;
            if (i19 >= size) {
                break;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            java.util.Map map = this.f482748m;
            if (!map.containsKey(valueOf)) {
                android.view.View view = (android.view.View) ((java.util.ArrayList) list3).get(i19);
                rx4.l lVar = this.f482746h;
                if (lVar != null && (list2 = lVar.f482755d) != null) {
                    mVar = (rx4.m) kz5.n0.a0(list2, i19);
                }
                if (mVar != null) {
                    view.getLocalVisibleRect(rect);
                    int i27 = rect.top;
                    if (i27 == 0 && rect.bottom - i27 >= view.getHeight() - 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        int i28 = i19 + 1;
                        sb6.append(i28);
                        sb6.append('|');
                        sb6.append(i28);
                        arrayList.add(kz5.n0.g0(kz5.c0.i(sb6.toString(), mVar.f482763c, "", "1", fp.s0.b(mVar.f482762b, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), "", "", "finder_hot_video", ""), "|", null, null, 0, null, null, 62, null));
                        map.put(java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    }
                }
            }
            i19++;
        }
        if (!(!arrayList.isEmpty())) {
            rx4.l lVar2 = this.f482746h;
            if (lVar2 != null && (list = lVar2.f482755d) != null) {
                i18 = ((java.util.ArrayList) list).size();
            }
            if (i18 > 0) {
                return new rx4.s2(vu4.a.f521771e, "", "", this.f482744f, null, 16, null);
            }
            return null;
        }
        vu4.a aVar = vu4.a.f521772f;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(i17);
        sb7.append("|42|");
        rx4.l lVar3 = this.f482746h;
        if (lVar3 == null || (str = lVar3.f482753b) == null) {
            str = "";
        }
        sb7.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        return new rx4.s2(aVar, sb7.toString(), kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null), this.f482744f, null, 16, null);
    }

    public final void V6(rx4.l lVar, boolean z17, boolean z18) {
        java.util.List list;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] fillHotspotBlock block.items=");
        sb6.append((lVar == null || (list = lVar.f482755d) == null) ? -1 : ((java.util.ArrayList) list).size());
        sb6.append(", isCache=");
        sb6.append(z17);
        sb6.append(", isTabMode=");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482742d, sb6.toString());
        this.f482744f = z17;
        this.f482746h = lVar;
        this.f482745g = z18;
        if (lVar != null) {
            pm0.v.X(new rx4.j0(this));
        } else {
            pm0.v.X(new rx4.f0(this));
        }
    }

    public final void W6(org.json.JSONArray jSONArray, boolean z17) {
        org.json.JSONObject jSONObject;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] fillHotspotBox isCache=");
        sb6.append(z17);
        sb6.append(", data.len=");
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f482742d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        jz5.f0 f0Var = null;
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i17 = 0;
            while (true) {
                if (i17 < length) {
                    jSONObject = jSONArray.optJSONObject(i17);
                    if (jSONObject != null && jSONObject.optInt("type") == 42) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    jSONObject = null;
                    break;
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[hitest] fillHotspotBox found type=42: ");
            sb8.append(jSONObject != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (jSONObject != null) {
                this.f482744f = z17;
                this.f482745g = false;
                this.f482746h = new rx4.l(jSONObject);
                pm0.v.X(new rx4.j0(this));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                pm0.v.X(new rx4.g0(this));
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            pm0.v.X(new rx4.h0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        pm0.v.X(new rx4.j0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
    }
}
