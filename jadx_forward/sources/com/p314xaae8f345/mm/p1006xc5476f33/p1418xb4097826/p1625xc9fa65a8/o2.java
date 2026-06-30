package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 f207332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f207333e;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 q2Var, r45.e21 e21Var) {
        this.f207332d = q2Var;
        this.f207333e = e21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 q2Var = this.f207332d;
        q2Var.getClass();
        r45.e21 e21Var = this.f207333e;
        if (e21Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) e21Var.m75936x14adae67(15);
            android.content.Context context = q2Var.f207356a;
            if (c19786x6a1e2862 != null) {
                int m76503x92bc3c07 = c19786x6a1e2862.m76503x92bc3c07();
                if (m76503x92bc3c07 == 1) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
                    if (c19782x23db1cfa == null || (str2 = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                        str2 = "";
                    }
                    sb6.append(str2);
                    sb6.append(':');
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
                    java.lang.String sb7 = sb6.toString();
                    xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                    p0Var.f534783l = sb7;
                    xc2.y2.P(xc2.y2.f534876a, q2Var.f207356a, p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, false, null, 0.0f, 56, null);
                } else if (m76503x92bc3c07 == 2) {
                    xc2.y2.f534876a.I(context, new xc2.p0(c19786x6a1e2862), null);
                }
            } else {
                c19786x6a1e2862 = null;
            }
            if (c19786x6a1e2862 == null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
                if (c19782x23db1cfa2 == null || (str = c19782x23db1cfa2.m76197x6c03c64c()) == null) {
                    str = "";
                }
                sb8.append(str);
                sb8.append(':');
                sb8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
                java.lang.String sb9 = sb8.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                android.content.Context context2 = q2Var.f207356a;
                java.lang.String m75945x2fec8307 = e21Var.m75945x2fec8307(9);
                java.lang.String str3 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                java.lang.String m75945x2fec83072 = e21Var.m75945x2fec8307(10);
                i0Var.ll(context2, str3, m75945x2fec83072 == null ? "" : m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, sb9);
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String str4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
                java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("TopicId", "");
                    jSONObject.put("TopicName", "");
                } catch (java.lang.Throwable unused) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HotSearchInfoDialog", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:59 action:1 eid:link_miniprogram udf_kv:" + jSONObject);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21875, Ri, str4, 59, 1, valueOf, "link_miniprogram", jSONObject.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
