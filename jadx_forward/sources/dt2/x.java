package dt2;

/* loaded from: classes3.dex */
public final class x implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f324743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f324744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dt2.a0 f324745f;

    public x(int i17, byte[] bArr, dt2.a0 a0Var) {
        this.f324743d = i17;
        this.f324744e = bArr;
        this.f324745f = a0Var;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "Live_Replay_Sei";
    }

    @Override // java.lang.Runnable
    public void run() {
        ao0.b a17;
        dk2.rg rgVar;
        je2.y yVar;
        je2.y yVar2;
        int i17 = this.f324743d;
        if (i17 != 242 && i17 != 243 && i17 != 100) {
            zl2.r4.f555483a.M2("FinderLiveReplayerWidget", "handleSeiMessage seiType:" + i17);
            return;
        }
        byte[] bArr = this.f324744e;
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                java.lang.String str = new java.lang.String(bArr, r26.c.f450398a);
                int P = r26.n0.P(str, "\\0", 0, false, 6, null);
                if (P != -1 && P == str.length() - 2) {
                    str = str.substring(0, P);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
                }
                if (r26.n0.B(str, "TencentStreamSEI", false)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", "handleSeiMessage final seiMessage:".concat(str));
                try {
                    cl0.g gVar = new cl0.g(str);
                    int optInt = gVar.optInt("wxT");
                    if (optInt != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.mo15082x48bce8a4("d"))) {
                        hn0.u uVar = hn0.u.f363970e;
                        boolean z18 = pm0.v.z(optInt, 4);
                        dt2.a0 a0Var = this.f324745f;
                        if (z18) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("live_cdn_sei_msg", gVar.mo15082x48bce8a4("d"));
                            dk2.rg rgVar2 = a0Var.f324692b;
                            if (rgVar2 != null && (yVar2 = (je2.y) ((ws2.x0) rgVar2).f530687a.e(je2.y.class)) != null) {
                                yVar2.s6(18, bundle);
                            }
                        } else {
                            hn0.u uVar2 = hn0.u.f363970e;
                            if (pm0.v.z(optInt, 16)) {
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                bundle2.putString("live_cdn_sei_msg", gVar.mo15082x48bce8a4("d"));
                                bundle2.putString("live_link_mic_info_in_anchor_sei_msg", gVar.mo15082x48bce8a4("m"));
                                bundle2.putString("LIVE_LINK_MIC_INFO_FULL_SEI_MSG", str);
                                dk2.rg rgVar3 = a0Var.f324692b;
                                if (rgVar3 != null && (yVar = (je2.y) ((ws2.x0) rgVar3).f530687a.e(je2.y.class)) != null) {
                                    yVar.s6(20, bundle2);
                                }
                            } else {
                                hn0.u uVar3 = hn0.u.f363970e;
                                if (pm0.v.z(optInt, 32)) {
                                    java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("d");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                                    if (mo15082x48bce8a4.length() <= 0) {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        mo15082x48bce8a4 = null;
                                    }
                                    if (mo15082x48bce8a4 != null && (a17 = ao0.c.f94057a.a(mo15082x48bce8a4)) != null && (rgVar = a0Var.f324692b) != null) {
                                        ((ws2.x0) rgVar).a(a17.f94047a, a17.f94048b, a17.f94049c, a17.f94050d, a17.f94051e, a17.f94052f, a17.f94053g, a17.f94054h, a17.f94055i, a17.f94056j);
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveReplayerWidget", "handleSeiMessage Exception:" + e17.getMessage() + " seiMessage:" + str);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", "handleSeiMessage seiData:" + bArr);
    }
}
