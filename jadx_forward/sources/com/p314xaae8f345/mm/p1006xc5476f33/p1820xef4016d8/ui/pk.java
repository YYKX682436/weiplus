package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class pk extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 f228855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qk f228857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qk qkVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var, android.content.Context context) {
        super(false);
        this.f228857f = qkVar;
        this.f228855d = o6Var;
        this.f228856e = context;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var;
        r45.xv3 xv3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var2 = this.f228855d;
        g0Var.d(11701, 14, 0, 0, 0, 2, java.lang.Integer.valueOf(o6Var2.f227054h));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qk qkVar = this.f228857f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar = qkVar.f228888a;
        if (okVar != null) {
            o45.eg.a(okVar.f228819d, 1);
            r45.wv3 wv3Var = qkVar.f228888a.f228821f;
            if (wv3Var != null && (xv3Var = wv3Var.f471034g) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472013g)) {
                gb3.m.a(66, qkVar.f228888a.f228821f.f471034g.f472013g);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar2 = qkVar.f228888a;
        if (okVar2 == null || !okVar2.f228818c) {
            o6Var = o6Var2;
        } else {
            o6Var = o6Var2;
            g0Var.d(13051, java.lang.Integer.valueOf(okVar2.f228819d), 2, "", "", "", o6Var2.f227053g, o6Var2.f227052f, "", "", java.lang.Integer.valueOf(qkVar.f228888a.f228820e));
        }
        if (o6Var.f227052f.equals("Native")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", "go native:" + o6Var.f227053g);
            if ("weixin://festival/gotoshake".equalsIgnoreCase(o6Var.f227053g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", " go new year shake");
            }
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f228856e, o6Var.f227053g, true);
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 2;
        objArr[1] = o6Var.f227053g;
        r45.wv3 wv3Var2 = qkVar.f228888a.f228821f;
        objArr[2] = wv3Var2 != null ? wv3Var2.f471031d : "";
        objArr[3] = gb3.m.f351555c;
        objArr[4] = 0;
        objArr[5] = gb3.m.f351553a;
        g0Var.d(16589, objArr);
    }
}
