package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class p1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f206199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f206200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f206201e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, java.lang.String str, int i17, boolean z17, boolean z18) {
        this.f206197a = s1Var;
        this.f206198b = str;
        this.f206199c = i17;
        this.f206200d = z17;
        this.f206201e = z18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206197a;
            kk.l lVar = s1Var.f206254e;
            java.lang.String str = this.f206198b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(str);
            if (l2Var != null) {
                l2Var.B = (r45.c32) ((r45.qu0) fVar.f152151d).m75936x14adae67(1);
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = s1Var.f206251b;
            boolean z17 = this.f206201e;
            boolean z18 = this.f206200d;
            int i17 = this.f206199c;
            if (i17 == 1) {
                s1Var.n(str, z18, z17);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkp));
                i95.m c17 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.i5 i5Var = ml2.i5.f409104f;
                java.lang.String str2 = this.f206198b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9((c50.c1) c17, i5Var, str2, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i17 == 2) {
                s1Var.n(str, z18, z17);
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.h(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.i5 i5Var2 = ml2.i5.f409105g;
                java.lang.String str3 = this.f206198b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                java.lang.String valueOf2 = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("notice_type", 2);
                c50.c1.l9((c50.c1) c18, i5Var2, str3, 0L, 0, valueOf2, null, null, null, null, null, null, null, jSONObject2.toString(), 0L, 0, null, 61408, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
