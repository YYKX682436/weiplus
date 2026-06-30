package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class ka implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255567d;

    public ka(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255567d = activityC18639xf6f98078;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        bi4.o0 o0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255567d;
        java.lang.String str3 = null;
        if (!activityC18639xf6f98078.c7().isEnabled()) {
            activityC18639xf6f98078.R5(null);
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC18639xf6f98078.c1(activityC18639xf6f98078.i7().getText().toString());
        p52.c cVar = p52.h.f433549a;
        if (p52.h.f433552d != null) {
            ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).getClass();
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            if (zl2.r4.f555483a.w1()) {
                p52.h.f433553e++;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", "5");
                zy2.ac acVar = (zy2.ac) i95.n0.c(zy2.ac.class);
                ml2.z4 z4Var = ml2.z4.f409895m;
                java.lang.String jSONObject2 = jSONObject.toString();
                ((ml2.l0) acVar).getClass();
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, z4Var, jSONObject2, null, 4, null);
            } else {
                p52.h.f433553e++;
                ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).Fk(p52.h.f433552d, ml2.j5.f409165g, kz5.q0.f395534d);
            }
        }
        bi4.h0 h0Var = activityC18639xf6f98078.f255126n2;
        if (h0Var != null && (o0Var = ((sj4.v0) h0Var).f490432e) != null) {
            str3 = o0Var.g();
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "2")) {
            m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
            jz5.l[] lVarArr = new jz5.l[3];
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p52.h.B;
            java.lang.Object obj2 = concurrentHashMap.get("share_scene");
            java.lang.String str4 = "";
            if (obj2 == null || (str = obj2.toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("share_scene", str);
            java.lang.Object obj3 = concurrentHashMap.get("live_id");
            if (obj3 == null || (str2 = obj3.toString()) == null) {
                str2 = "";
            }
            lVarArr[1] = new jz5.l("liveid", str2);
            java.lang.Object obj4 = concurrentHashMap.get("feed_id");
            if (obj4 != null && (obj = obj4.toString()) != null) {
                str4 = obj;
            }
            lVarArr[2] = new jz5.l("feedid", str4);
            ((b92.y0) i0Var).Bi(false, kz5.c1.i(lVarArr));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
