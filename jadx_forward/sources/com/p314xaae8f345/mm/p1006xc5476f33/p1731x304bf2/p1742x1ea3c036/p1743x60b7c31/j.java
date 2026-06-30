package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221213e = "JsApiCheckPCWechatOnline";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f221214f = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;

    @Override // sd.c
    public java.lang.String b() {
        return "checkPCWechatOnline";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        boolean z17;
        java.lang.String str2 = this.f221213e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "invokeInMM!");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            if (q5Var != null) {
                q5Var.a("checkPCWechatOnline:fail. empty params", null);
                return;
            }
            return;
        }
        boolean z18 = true;
        if (e17.has("target")) {
            java.lang.String optString = e17.optString("target");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            this.f221214f = optString;
            if ((optString.length() == 0) || (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, com.p159x477cd522.p160x333422.C1461x7397cc93.f4740x7b3b2e63) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, "ohos") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, com.p159x477cd522.p160x333422.C1461x7397cc93.f4736x45158d4))) {
                if (q5Var != null) {
                    q5Var.a("checkPCWechatOnline:fail. target params is not null and illegal", null);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "target type:%s", this.f221214f);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((com.p314xaae8f345.mm.p957x53236a1b.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class))).Ai();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6 v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6) it.next();
            int i17 = v6Var.f170341c;
            long j17 = v6Var.f170340b;
            if ((f(38) && i17 == 38 && j17 >= 4066640128L) || ((f(37) && i17 == 37 && j17 >= 4065591552L) || ((f(43) && i17 == 43 && j17 >= 4071883008L) || (f(39) && i17 == 39 && j17 >= 4067688704L)))) {
                z17 = true;
                break;
            }
        }
        z17 = false;
        if (!z17) {
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z18 = false;
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6 v6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6) it6.next();
                int i18 = v6Var2.f170341c;
                long j18 = v6Var2.f170340b;
                if ((f(14) && i18 == 14 && j18 >= 318898176) || (f(15) && i18 == 15 && j18 >= 1661009920)) {
                    break;
                }
            }
        }
        if (z18) {
            if (q5Var != null) {
                q5Var.a(null, null);
            }
        } else if (q5Var != null) {
            q5Var.a("checkPCWechatOnline:fail. no support platform online", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public final boolean f(int i17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18)) {
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb) && (i17 == 38 || i17 == 14)) {
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, com.p159x477cd522.p160x333422.C1461x7397cc93.f4740x7b3b2e63) && (i17 == 37 || i17 == 15)) {
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, "ohos") && i17 == 43) {
            return true;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221214f, com.p159x477cd522.p160x333422.C1461x7397cc93.f4736x45158d4) && i17 == 39;
    }
}
