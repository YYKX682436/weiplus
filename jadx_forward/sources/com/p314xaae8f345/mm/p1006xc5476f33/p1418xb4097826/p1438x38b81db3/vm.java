package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class vm implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm f186333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186335e;

    public vm(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm wmVar, in5.s0 s0Var, java.lang.String str) {
        this.f186331a = h0Var;
        this.f186332b = i17;
        this.f186333c = wmVar;
        this.f186334d = s0Var;
        this.f186335e = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.c32 c32Var = (r45.c32) ((r45.qu0) fVar.f152151d).m75936x14adae67(1);
            this.f186331a.f391656d = c32Var;
            java.lang.String str = this.f186335e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm wmVar = this.f186333c;
            in5.s0 s0Var = this.f186334d;
            int i17 = this.f186332b;
            if (i17 == 1) {
                wmVar.n(s0Var, c32Var, str);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkp));
                i95.m c17 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f409104f;
                java.lang.String str2 = this.f186335e;
                android.content.Context context2 = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9(c1Var, i5Var, str2, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i17 == 2) {
                wmVar.n(s0Var, c32Var, str);
                android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.h(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                c50.c1 c1Var2 = (c50.c1) c18;
                ml2.i5 i5Var2 = ml2.i5.f409105g;
                java.lang.String str3 = this.f186335e;
                android.content.Context context4 = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf2 = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("notice_type", 2);
                c50.c1.l9(c1Var2, i5Var2, str3, 0L, 0, valueOf2, null, null, null, null, null, null, null, jSONObject2.toString(), 0L, 0, null, 61408, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
