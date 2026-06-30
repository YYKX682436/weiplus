package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f235841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yz5.p pVar) {
        super(2);
        this.f235841d = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.j32 j32Var = (r45.j32) obj2;
        yz5.p pVar = this.f235841d;
        if (!booleanValue || j32Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "request full list failed");
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "request full list success: count=" + j32Var.m75941xfb821914(0).size() + ", totalNotice=" + j32Var.m75939xb282bd08(2));
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, j32Var);
        }
        return jz5.f0.f384359a;
    }
}
