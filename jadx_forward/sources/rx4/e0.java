package rx4;

/* loaded from: classes8.dex */
public final class e0 extends wm3.a {

    /* renamed from: p, reason: collision with root package name */
    public static final rx4.t f482669p = new rx4.t(null);

    /* renamed from: d, reason: collision with root package name */
    public int f482670d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f482671e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f482672f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f482673g;

    /* renamed from: h, reason: collision with root package name */
    public rx4.h f482674h;

    /* renamed from: i, reason: collision with root package name */
    public final float f482675i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f482676m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f482677n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f482678o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f482675i = activity.getResources().getDisplayMetrics().density;
        this.f482676m = new java.util.ArrayList();
        this.f482677n = new java.util.ArrayList();
        this.f482678o = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ void X6(rx4.e0 e0Var, vu4.a aVar, rx4.i iVar, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            iVar = null;
        }
        if ((i17 & 4) != 0) {
            num = null;
        }
        e0Var.W6(aVar, iVar, num);
    }

    public static void Y6(rx4.e0 e0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        e0Var.getClass();
        pm0.v.X(new rx4.d0(e0Var, z17));
    }

    public final void T6() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rr7);
        if (viewGroup2 == null || (viewGroup = (android.view.ViewGroup) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.rqv)) == null) {
            return;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566754rr0);
        if (findViewById != null) {
            findViewById.setOnClickListener(new rx4.u(this));
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.rqw);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new rx4.v(this, viewGroup));
        }
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.rqz);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new rx4.w(this, viewGroup));
        }
        android.view.View findViewById4 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.rqy);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new rx4.x(this));
        }
    }

    public final void U6(rx4.i historyItem, int i17) {
        java.util.List list;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(historyItem, "historyItem");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:history14", ""));
            c75.b bVar = new c75.b(jSONArray);
            int i18 = 0;
            while (bVar.hasNext()) {
                java.lang.Object next = bVar.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next, "null cannot be cast to non-null type org.json.JSONObject");
                if (((org.json.JSONObject) next).optString("hotword").equals(historyItem.f482719b)) {
                    jSONArray.remove(i18);
                    z17 = true;
                } else {
                    i18++;
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:history14", jSONArray.toString());
            rx4.h hVar = this.f482674h;
            if (hVar == null || (list = hVar.f482694d) == null) {
                return;
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public final void V6(org.json.JSONArray jSONArray, boolean z17) {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] fillHistoryBox, isCache: ");
        sb6.append(z17);
        sb6.append(", datas.len: ");
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
        jz5.f0 f0Var = null;
        if (jSONArray != null) {
            int i17 = 0;
            while (true) {
                if (!(i17 < jSONArray.length())) {
                    obj = null;
                    break;
                }
                obj = jSONArray.get(i17);
                i17++;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                if (((org.json.JSONObject) obj).optInt("type") == 1001) {
                    break;
                }
            }
            if (obj != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", "[hitest] fillHistoryBox found type=1001");
                if (z17) {
                    this.f482671e = false;
                    this.f482672f = false;
                }
                this.f482673g = z17;
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                android.app.Activity context = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                this.f482674h = new rx4.h(jSONObject, ((rx4.h2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class)).i7());
                pm0.v.X(new rx4.d0(this, true));
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            pm0.v.X(new rx4.a0(this));
        }
    }

    public final void W6(vu4.a actionId, rx4.i iVar, java.lang.Integer num) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f482670d);
        sb6.append("|1001|");
        rx4.h hVar = this.f482674h;
        if (hVar == null || (str = hVar.f482693c) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        java.lang.String itemInfo = sb6.toString();
        if (iVar == null || num == null) {
            str2 = "";
        } else {
            java.lang.String[] strArr = new java.lang.String[9];
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(num.intValue() + 1);
            sb7.append('|');
            sb7.append(num.intValue() + 1);
            strArr[0] = sb7.toString();
            java.lang.String str3 = iVar.f482719b;
            strArr[1] = java.lang.String.valueOf(fp.s0.b(str3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            strArr[2] = "";
            strArr[3] = "1";
            if (iVar.f482724g) {
                str3 = iVar.f482725h;
            }
            strArr[4] = java.lang.String.valueOf(fp.s0.b(str3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(iVar.f482721d);
            sb8.append('_');
            sb8.append(iVar.f482722e);
            strArr[5] = sb8.toString();
            strArr[6] = "";
            strArr[7] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
            strArr[8] = "";
            str2 = kz5.n0.g0(kz5.c0.i(strArr), "|", null, null, 0, null, null, 62, null);
        }
        boolean z17 = this.f482673g;
        kz5.q0 extInfo = (16 & 16) != 0 ? kz5.q0.f395534d : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        rx4.h2 h2Var = (rx4.h2) a17;
        h2Var.a7();
        h2Var.q7(actionId, itemInfo, str2, z17, kz5.c1.l(new jz5.l("clickId", h2Var.f482716y)));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.mo739xfd763ae1(bundle);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rr7);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((rx4.h2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class)).E && (findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cgz)) != null) {
                float f17 = 16;
                float f18 = this.f482675i;
                findViewById.setPadding((int) (f17 * f18), 0, (int) (f17 * f18), (int) (10 * f18));
            }
        }
        T6();
    }
}
