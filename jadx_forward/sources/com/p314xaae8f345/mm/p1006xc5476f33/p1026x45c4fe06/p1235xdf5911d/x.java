package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wxassistant/x;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (str = bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) == null) {
            str = "";
        }
        int i17 = bundle != null ? bundle.getInt("state") : 0;
        boolean z17 = bundle != null ? bundle.getBoolean("dismissTask") : false;
        boolean z18 = bundle != null ? bundle.getBoolean("keepSession") : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5 u5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class);
        if (u5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) u5Var;
            u0Var.getClass();
            if (!z18) {
                u0Var.f173855o.add(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3.f173669e.getClass();
            java.util.Iterator it = ((kz5.h) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3.f173673i).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3) obj2).f173674d == i17) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3 b3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3) obj2;
            if (b3Var == null) {
                b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3.f173670f;
            }
            for (java.lang.String str2 : u0Var.Ai(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str2);
                if (b17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWxAssistantService", "interruptBySessionIdInAppBrandProcess: runtime not found for appId:" + str2);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) b17.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class);
                    if (q2Var != null) {
                        q2Var.l1(b3Var);
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "interruptBySessionIdInAppBrandProcess: finish appId:" + str2);
                        b17.l0();
                    }
                }
            }
        }
        return new android.os.Bundle();
    }
}
