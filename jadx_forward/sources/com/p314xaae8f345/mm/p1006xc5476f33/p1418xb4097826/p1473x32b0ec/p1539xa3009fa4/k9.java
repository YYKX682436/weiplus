package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class k9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 f198737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var) {
        super(2);
        this.f198737d = v9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.of1 aliasInfo = (r45.of1) obj;
        android.view.View itemView = (android.view.View) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aliasInfo, "aliasInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        if (aliasInfo.m75939xb282bd08(2) == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var = this.f198737d;
            if (v9Var.f199032u) {
                int[] iArr = v9Var.f199026o;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    java.lang.String str = "onItemLongClickCallback before change x:" + iArr[0] + ", original y:" + iArr[1];
                    java.lang.String str2 = v9Var.f199018d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
                    itemView.getLocationOnScreen(iArr);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onItemLongClickCallback after change x:" + iArr[0] + ", original y:" + iArr[1]);
                }
                int i17 = iArr[0];
                int i18 = iArr[1];
                if (v9Var.f199023i == null) {
                    v9Var.f199023i = new rl5.r(v9Var.m80379x76847179());
                }
                rl5.r rVar = v9Var.f199023i;
                if (rVar != null) {
                    rVar.a();
                }
                rl5.r rVar2 = v9Var.f199023i;
                if (rVar2 != null) {
                    rVar2.h(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s9(v9Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t9(v9Var, aliasInfo), i17, i18);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
