package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class t5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5 f168645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5 u5Var) {
        super(0);
        this.f168645d = u5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5 u5Var = this.f168645d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = u5Var.f168671d;
        boolean z17 = true;
        if (interfaceC11702x4ae7c33 != null) {
            java.lang.String[] strArr = {"lazyCodeLoading", "lazyCodeLoading2"};
            int i17 = 0;
            while (true) {
                if (i17 >= 2) {
                    z17 = false;
                    break;
                }
                java.lang.String qe6 = interfaceC11702x4ae7c33.qe(strArr[i17]);
                if (!(qe6 == null || qe6.length() == 0)) {
                    break;
                }
                i17++;
            }
        }
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useLazyCodeLoadingMode return false, lib.version=[");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c332 = u5Var.f168671d;
            sb6.append(interfaceC11702x4ae7c332 != null ? interfaceC11702x4ae7c332.Y0() : null);
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", sb6.toString());
            return java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 y3Var = u5Var.f168672e;
        if (y3Var.d("common.app.js")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return true, by common.app.js");
            return java.lang.Boolean.TRUE;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e : y3Var.a()) {
            if (c11656xaf63146e.f33453xc73e777a) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(c11656xaf63146e.f33454x337a8b);
                java.lang.String name = c11656xaf63146e.f33454x337a8b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                sb7.append(r26.i0.n(name, "/", false) ? "" : "/");
                sb7.append("common.app.js");
                java.lang.String sb8 = sb7.toString();
                if (y3Var.d(sb8)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return true, by independent " + sb8);
                    return java.lang.Boolean.TRUE;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return false");
        return java.lang.Boolean.FALSE;
    }
}
