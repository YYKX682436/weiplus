package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class xb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac f255963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 f255964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac acVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var) {
        super(1);
        this.f255963d = acVar;
        this.f255964e = w1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac acVar = this.f255963d;
        java.lang.String str = acVar.f255259d;
        boolean z18 = true;
        if (intValue <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = this.f255964e;
            java.lang.Object tag = w1Var != null ? w1Var.getTag(com.p314xaae8f345.mm.R.id.nwq) : null;
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            int intValue2 = num != null ? num.intValue() : 0;
            int size = acVar.f255263h.size();
            if (intValue2 >= 0 && intValue2 < acVar.f255263h.size()) {
                acVar.f255263h.remove(intValue2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkRefreshMultiCardViewAfterDelete: willDeleteMultiCardView, oldConvertDataSize=" + size + ", remove pos=" + intValue2);
                z17 = true;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(acVar.f255263h) && (acVar.f255263h.size() != 1 || !(acVar.f255263h.get(0) instanceof ij4.a))) {
                    if (z17) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = acVar.f255261f;
                        if (f2Var != null) {
                            f2Var.m8146xced61ae5();
                        }
                    }
                    return java.lang.Boolean.valueOf(z18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkRefreshMultiCardViewAfterDelete: finish");
                acVar.m158354x19263085().finish();
                z18 = false;
                return java.lang.Boolean.valueOf(z18);
            }
        }
        z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(acVar.f255263h)) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkRefreshMultiCardViewAfterDelete: finish");
        acVar.m158354x19263085().finish();
        z18 = false;
        return java.lang.Boolean.valueOf(z18);
    }
}
