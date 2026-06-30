package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 f239480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 f239482f;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var) {
        this.f239480d = z0Var;
        this.f239481e = h3Var;
        this.f239482f = n2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemSubChannelLinearLayout clicked, type: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var = this.f239480d;
        sb6.append(z0Var.f238602a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f238621t)) {
            j17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.f239266t.a().getLong("TRANS_SELECTED_SHOP_" + z0Var.f238602a, 0L);
        } else {
            j17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.f239266t.a().getLong("TRANS_SELECTED_SHOP_" + z0Var.f238602a + '_' + z0Var.f238621t, 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var = this.f239481e;
        int E = h3Var.E(z0Var, j17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("confirmBtnText", h3Var.f239268d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq));
        jSONObject.put("cancelBtnText", h3Var.f239268d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, z0Var.f238620s.f238340c);
        java.util.ArrayList sub_recv_channel_list = z0Var.f238620s.f238341d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub_recv_channel_list, "sub_recv_channel_list");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(sub_recv_channel_list, 10));
        java.util.Iterator it = sub_recv_channel_list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) it.next()).f238334b);
        }
        jSONObject.put("list", new org.json.JSONArray((java.util.Collection) arrayList2));
        jSONObject.put("preSelectIndex", new org.json.JSONArray((java.util.Collection) kz5.b0.c(java.lang.Integer.valueOf(E))));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r2(h3Var, this.f239482f, z0Var);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite5902f97ca32a59d74355fc2e32843e79@pay");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "pages/home/home");
        bundle.putString("query", jSONObject2);
        bundle.putBoolean("isHalfScreen", true);
        bundle.putBoolean("forbidRightGesture", true);
        bundle.putDouble("heightPercent", 0.99d);
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(h3Var.f239268d, bundle, true, false, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s2());
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
