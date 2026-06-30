package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class yx {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sx f202011f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sx(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f202012a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f202013b;

    /* renamed from: c, reason: collision with root package name */
    public gk2.e f202014c;

    /* renamed from: d, reason: collision with root package name */
    public kn0.r f202015d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f202016e;

    public yx(android.content.Context context, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f202012a = context;
        this.f202013b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xx.f201921d);
        this.f202014c = buContext;
    }

    public final void a(boolean z17) {
        kn0.i iVar;
        kn0.g gVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resolutionChange result:");
        sb6.append(z17);
        sb6.append(",modifyVideoDefinition:");
        sb6.append(this.f202016e);
        sb6.append(",showLevel:");
        kn0.r rVar = this.f202015d;
        sb6.append(rVar != null ? java.lang.Integer.valueOf(rVar.f391130b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", sb6.toString());
        if (this.f202016e) {
            int i17 = 0;
            this.f202016e = false;
            if (z17) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                kn0.r rVar2 = this.f202015d;
                int i18 = rVar2 != null ? rVar2.f391130b : 0;
                gk2.e eVar = this.f202014c;
                if (eVar != null && (iVar = ((mm2.e1) eVar.a(mm2.e1.class)).f410523t) != null && (gVar = iVar.f391091b) != null) {
                    i17 = gVar.a();
                }
                r0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("from_birate", i18);
                jSONObject.put("to_birate", i17);
                ml2.r0.hj(r0Var, ml2.b4.P, null, 0L, jSONObject.toString(), null, null, null, null, 244, null);
            }
            if (((java.lang.Boolean) ((jz5.n) this.f202013b).mo141623x754a37bb()).booleanValue()) {
                android.content.Context context = this.f202012a;
                if (z17) {
                    db5.t7.h(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egw));
                } else {
                    db5.t7.g(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egu));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.b(boolean, int):void");
    }
}
