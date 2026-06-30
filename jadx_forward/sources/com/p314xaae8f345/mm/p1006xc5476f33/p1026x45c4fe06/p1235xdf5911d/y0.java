package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class y0<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.y0 f173880d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.y0();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("callbackId");
        int i18 = bundle.getInt("response_Code");
        java.lang.String string = bundle.getString("response_key");
        java.lang.String str = "";
        if (string == null) {
            string = "";
        }
        boolean z17 = true;
        if (string.length() > 0) {
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.j1.f173747h;
            jz5.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.j1.f173747h;
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            str = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).getString(string, "");
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb2).remove(string);
        } else {
            java.lang.String string2 = bundle.getString("response");
            if (string2 != null) {
                str = string2;
            }
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWxAssistantService", "callbackByAppBrandProcess: responseInMM is null or empty");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t5 t5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t5) ((java.util.HashMap) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class))).f173850d.f173876d).mo141623x754a37bb()).remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "callbackByAppBrandProcess: callbackId: " + i17 + " callback:" + t5Var);
        if (t5Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12577x28e18c9d c12577x28e18c9d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12577x28e18c9d(i18, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.e eVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.c) t5Var).f173702a;
            eVar.getClass();
            eVar.f173708e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.f.f173711g;
            yz5.l lVar = eVar.f173704a;
            if (lVar != null) {
                lVar.mo146xb9724478(c12577x28e18c9d);
            }
        }
    }
}
