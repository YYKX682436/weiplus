package my3;

/* loaded from: classes8.dex */
public final class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f414347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414348e;

    public m(my3.q qVar, java.lang.String str) {
        this.f414347d = qVar;
        this.f414348e = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString("licence") : null;
        java.lang.String string2 = bundle != null ? bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030) : null;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string);
        my3.q qVar = this.f414347d;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "get licence fail.");
            qVar.Ri(fy3.i.f348779e);
            qVar.fj(0, 3);
            return;
        }
        qVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "getOAuthTicket deviceId:%s json:%s", string2, string);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "getOAuthTicket deviceId:%s json:%s", string2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(string));
        }
        try {
            cl0.g gVar2 = new cl0.g(string);
            int mo15080xc3ca103c = gVar2.mo15080xc3ca103c("product_id", 0);
            int mo15080xc3ca103c2 = gVar2.mo15080xc3ca103c("key_version", 0);
            java.lang.String mo15083x48bce8a4 = gVar2.mo15083x48bce8a4("device_sn", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15083x48bce8a4, "optString(...)");
            java.lang.String mo15083x48bce8a42 = gVar2.mo15083x48bce8a4("device_signature", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15083x48bce8a42, "optString(...)");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                qVar.fj(0, 4);
                return;
            }
            if (gm0.j1.d().f152297d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "dispatcher null");
                qVar.fj(0, 6);
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.GetIlinkDeviceOauthTicketHelper", "setAuthInfo productId:" + mo15080xc3ca103c + " deviceSn:" + mo15083x48bce8a4 + " deviceId:" + string2 + " deviceSignature:" + mo15083x48bce8a42);
            r45.eh3 eh3Var = new r45.eh3();
            r45.fy3 fy3Var = new r45.fy3();
            fy3Var.f456262g = mo15080xc3ca103c2;
            try {
                gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(android.util.Base64.decode(mo15083x48bce8a42, 0));
            } catch (java.lang.IllegalArgumentException unused) {
                gVar = null;
            }
            fy3Var.f456261f = gVar;
            fy3Var.f456260e = mo15083x48bce8a4;
            fy3Var.f456259d = mo15080xc3ca103c;
            eh3Var.f455012d = fy3Var;
            int length = string2.length();
            int i17 = length / 2;
            byte[] bArr = new byte[i17];
            for (int i18 = 0; i18 < length; i18 += 2) {
                bArr[i18 / 2] = (byte) ((java.lang.Character.digit(string2.charAt(i18), 16) << 4) + java.lang.Character.digit(string2.charAt(i18 + 1), 16));
            }
            eh3Var.f455013e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, i17);
            p3325xe03a0797.p3326xc267989b.l.d(qVar.f414356f, null, null, new my3.h(eh3Var, qVar, this.f414348e, null), 3, null);
        } catch (java.lang.Exception unused2) {
            qVar.fj(0, 5);
        }
    }
}
