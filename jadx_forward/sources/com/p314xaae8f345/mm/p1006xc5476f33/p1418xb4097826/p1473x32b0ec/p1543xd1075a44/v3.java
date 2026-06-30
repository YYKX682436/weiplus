package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class v3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f201562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f201563c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 f201564d;

    public v3(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var) {
        this.f201561a = i17;
        this.f201562b = c0Var;
        this.f201563c = textView;
        this.f201564d = b4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f201562b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var = this.f201564d;
            android.widget.TextView textView = this.f201563c;
            int i17 = this.f201561a;
            if (i17 == 1) {
                c0Var.f391645d = true;
                textView.setTextColor(b4Var.f199353a.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77920x41d15e22));
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkl);
                textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d3x);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nko));
                i95.m c17 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.i5 i5Var = ml2.i5.f409104f;
                java.lang.String str = b4Var.f199354b.Y().f492179a;
                ml2.q1 q1Var = ml2.q1.f409345e;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9((c50.c1) c17, i5Var, str, 0L, 0, "temp_30", null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i17 == 2) {
                c0Var.f391645d = false;
                textView.setTextColor(b4Var.f199353a.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkj);
                textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a_5);
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.h(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.i5 i5Var2 = ml2.i5.f409105g;
                java.lang.String str2 = b4Var.f199354b.Y().f492179a;
                ml2.q1 q1Var2 = ml2.q1.f409345e;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("notice_type", 2);
                c50.c1.l9((c50.c1) c18, i5Var2, str2, 0L, 0, "temp_30", null, null, null, null, null, null, null, jSONObject2.toString(), 0L, 0, null, 61408, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
