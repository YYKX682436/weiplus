package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes9.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f254619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt0.e f254620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e f254621c;

    public o(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, rt0.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e activityC18569xd8e35e1e) {
        this.f254619a = u3Var;
        this.f254620b = eVar;
        this.f254621c = activityC18569xd8e35e1e;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.Map d17;
        java.lang.String str;
        ot0.q v17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f254619a.dismiss();
        int i17 = fVar.f152149b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e activityC18569xd8e35e1e = this.f254621c;
        if (i17 == 0 && fVar.f152148a == 0) {
            rt0.e eVar = this.f254620b;
            if (eVar.f480912d == 3 && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(eVar.f480913e, "content", null)) != null && (str = (java.lang.String) d17.get(".content")) != null && (v17 = ot0.q.v(str)) != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6954xf592e33a c6954xf592e33a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6954xf592e33a();
                c6954xf592e33a.f142606d = 2L;
                c6954xf592e33a.f142607e = 2L;
                c6954xf592e33a.f142608f = 3L;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e.f254329t;
                c6954xf592e33a.f142609g = c6954xf592e33a.b("requestID", java.lang.String.valueOf(activityC18569xd8e35e1e.U6()), true);
                c6954xf592e33a.f142610h = c6954xf592e33a.b("requestResource", v17.f430207k, true);
                c6954xf592e33a.k();
            }
        } else {
            java.lang.String str2 = fVar.f152150c;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e.f254329t;
            android.widget.TextView textView = (android.widget.TextView) activityC18569xd8e35e1e.findViewById(com.p314xaae8f345.mm.R.id.dhj);
            textView.setVisibility(0);
            if (str2 == null) {
                str2 = activityC18569xd8e35e1e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571923tn);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
            }
            textView.setText(str2);
        }
        return jz5.f0.f384359a;
    }
}
