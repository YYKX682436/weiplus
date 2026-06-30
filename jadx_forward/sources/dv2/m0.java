package dv2;

/* loaded from: classes10.dex */
public final class m0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f325424d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f325425e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f325426f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325427g;

    /* renamed from: h, reason: collision with root package name */
    public int f325428h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f325429i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f325430m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f325424d = jz5.h.b(new dv2.e0(this));
        this.f325425e = jz5.h.b(new dv2.k0(this));
        this.f325426f = jz5.h.b(new dv2.i0(this));
        this.f325427g = jz5.h.b(dv2.j0.f325406d);
        this.f325429i = "";
    }

    public static final void O6(dv2.m0 m0Var, java.lang.Object obj) {
        m0Var.getClass();
        if (obj instanceof org.json.JSONObject) {
            try {
                int optInt = ((org.json.JSONObject) obj).optInt("warnFlag");
                java.lang.String optString = ((org.json.JSONObject) obj).optString("warningWording");
                m0Var.f325428h = ((org.json.JSONObject) obj).optInt("tagType");
                java.lang.String optString2 = ((org.json.JSONObject) obj).optString("tagSecKey");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                m0Var.f325429i = optString2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostAddTagUIC", "[finishSetWarningWording] warnFlag:" + optInt + " warningWording:" + optString + " tagType:" + m0Var.f325428h + " tagSecKey:" + m0Var.f325429i);
                boolean z17 = !r26.n0.N(m0Var.f325429i);
                jz5.g gVar = m0Var.f325425e;
                if (z17) {
                    ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(optString);
                } else {
                    ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(m0Var.R6());
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostAddTagUIC", java.lang.String.valueOf(e17.getMessage()));
            }
        }
    }

    public final m92.b P6() {
        return g92.a.j3(g92.b.f351302e, xy2.c.e(m158354x19263085()), false, 2, null);
    }

    public final java.util.Map Q6() {
        java.lang.String m76317x2a881cd1;
        java.util.Map l17 = kz5.c1.l(new jz5.l("tag_type", java.lang.Integer.valueOf(this.f325428h)));
        if (this.f325429i.length() > 0) {
            l17.put("tag_sec_key", this.f325429i);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 != null) {
            l17.put("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b7.m76275xbcc8608a()));
        }
        if (c19783xd9a946b7 != null && (m76317x2a881cd1 = c19783xd9a946b7.m76317x2a881cd1()) != null) {
            l17.put("post_id", m76317x2a881cd1);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jz5.g gVar = this.f325426f;
        sr2.y2 y2Var = (sr2.y2) ((jz5.n) gVar).mo141623x754a37bb();
        dv2.f0 f0Var = new dv2.f0(jSONObject);
        y2Var.getClass();
        f0Var.mo149xb9724478(y2Var.f493350x, y2Var.f493351y);
        java.lang.String str = ((sr2.y2) ((jz5.n) gVar).mo141623x754a37bb()).f493345s;
        if (str != null) {
            jSONObject.put("assetTime", java.lang.String.valueOf(java.lang.Long.parseLong(str) / 1000));
        }
        l17.put("poi_info", jSONObject);
        return l17;
    }

    public final java.lang.String R6() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.String m76523x98b23862;
        m92.b P6 = P6();
        java.lang.String str = null;
        r45.nc4 u07 = P6 != null ? P6.u0() : null;
        if (u07 != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) u07.m75936x14adae67(43)) != null && (m76523x98b23862 = c19786x6a1e2862.m76523x98b23862()) != null && (!r26.n0.N(m76523x98b23862))) {
            str = m76523x98b23862;
        }
        return str == null ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f575285ox2) : str;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 S6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) a17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        boolean z17;
        jz5.g gVar;
        int intExtra = m158359x1e885992().getIntExtra("KEY_ACTION_TYPE", 0);
        m92.b P6 = P6();
        r45.nc4 u07 = P6 != null ? P6.u0() : null;
        int m75939xb282bd08 = u07 != null ? u07.m75939xb282bd08(42) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isShowDeclareTagEntry] declareTagEntry:");
        sb6.append(m75939xb282bd08);
        sb6.append(", tagEntry is null:");
        sb6.append((u07 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) u07.m75936x14adae67(43) : null) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountExt", sb6.toString());
        if (m75939xb282bd08 != 0) {
            if ((u07 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) u07.m75936x14adae67(43) : null) != null) {
                z17 = true;
                gVar = this.f325424d;
                if (z17 || intExtra == 1) {
                    android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "<get-addTagView>(...)");
                hc2.p0.d(view2, "post_annotation_prompt", "view_exp", null, 4, null);
                android.view.View view3 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new dv2.h0(this));
                return;
            }
        }
        z17 = false;
        gVar = this.f325424d;
        if (z17) {
        }
        android.view.View view4 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        ((android.widget.TextView) ((jz5.n) this.f325425e).mo141623x754a37bb()).setText(R6());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f325424d = jz5.h.b(new dv2.e0(this));
        this.f325425e = jz5.h.b(new dv2.k0(this));
        this.f325426f = jz5.h.b(new dv2.i0(this));
        this.f325427g = jz5.h.b(dv2.j0.f325406d);
        this.f325429i = "";
    }
}
