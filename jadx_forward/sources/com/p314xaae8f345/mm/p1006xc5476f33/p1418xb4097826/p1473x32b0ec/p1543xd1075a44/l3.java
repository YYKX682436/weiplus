package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class l3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f200420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f200422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 f200423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f200424h;

    public l3(r45.h32 h32Var, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var, android.widget.TextView textView) {
        this.f200420d = h32Var;
        this.f200421e = str;
        this.f200422f = c19792x256d2725;
        this.f200423g = b4Var;
        this.f200424h = textView;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.nw1 m76794xd0557130;
        if (menuItem.getItemId() == 4) {
            r45.h32 h32Var = this.f200420d;
            h32Var.set(1, 1);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f409105g;
            java.lang.String str = this.f200421e;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f200422f;
            long m75942xfb822ef2 = (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0);
            ml2.q1 q1Var = ml2.q1.f409345e;
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("notice_type", 1);
            c50.c1.l9(c1Var, i5Var, str, m75942xfb822ef2, 0, "temp_30", null, null, null, null, m75945x2fec8307, null, m75945x2fec83072, jSONObject.toString(), 0L, 0, null, 58848, null);
            java.lang.String str2 = this.f200421e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var = this.f200423g;
            r45.h32 h32Var2 = this.f200420d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m3.a(str2, b4Var, h32Var2, this.f200424h, h32Var2, 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var2 = this.f200423g;
            db5.t7.i(b4Var2.f199353a.getContext(), b4Var2.f199353a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
    }
}
