package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3TopicUI;", "Lcom/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI */
/* loaded from: classes15.dex */
public final class ActivityC13368x4f5eb0ab extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 {
    public byte[] K;
    public java.lang.String L;
    public final java.lang.String I = "MicroMsg.EmojiStoreV3TopicUI";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f180011J = "";
    public int M = -1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    /* renamed from: Y6, reason: from getter */
    public int getM() {
        return this.M;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 Z6(int i17, j22.j jVar) {
        r45.zj0 zj0Var;
        java.lang.String str = this.I;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
        b17.f137604e = 4;
        b17.f137609j = this.M;
        b17.f137603d = j22.a.f378782a;
        b17.f137605f = i17;
        if (i17 == 1) {
            try {
                int firstVisiblePosition = this.f179181i.getFirstVisiblePosition();
                int lastVisiblePosition = this.f179181i.getLastVisiblePosition();
                if (lastVisiblePosition - firstVisiblePosition <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getEmoticonStoreActionStruct failed, start:" + firstVisiblePosition + ", end:" + lastVisiblePosition);
                    return b17;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (firstVisiblePosition < lastVisiblePosition) {
                    j12.i item = this.f179182m.getItem(firstVisiblePosition);
                    if (item != null && (zj0Var = item.f378700b) != null) {
                        linkedList.add(new j22.j(firstVisiblePosition + 1, zj0Var.f473663f, zj0Var, item.f378709k));
                    }
                    firstVisiblePosition++;
                }
                j22.j.f378790e.a(b17, linkedList);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
            }
        } else if ((i17 == 2 || i17 == 3 || i17 == 4) && jVar != null) {
            r45.zj0 zj0Var2 = jVar.f378793c;
            b17.u(zj0Var2 != null ? zj0Var2.f473661d : null);
            b17.p(java.lang.String.valueOf(jVar.f378791a));
            b17.q(jVar.f378792b);
            b17.r(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(zj0Var2 != null ? zj0Var2.D : null)));
            b17.t(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(zj0Var2 != null ? zj0Var2.D : null)));
            b17.s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(zj0Var2 != null ? zj0Var2.D : null));
            java.lang.String str2 = jVar.f378794d;
            b17.v(str2 != null ? str2 : "");
        }
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    /* renamed from: a7, reason: from getter */
    public byte[] getK() {
        return this.K;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int c7() {
        java.lang.String str = this.L;
        return str == null || str.length() == 0 ? 13 : 14;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int d7() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void h7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar, boolean z17, boolean z18) {
        super.h7(sVar, z17, z18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6(this.f180011J);
        super.mo43517x10010bd5();
        mo74407xb0dfae51(0, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public boolean j7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public j12.b l7() {
        return new i12.m(mo55332x76847179());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void m7(int i17, j22.j jVar) {
        Z6(i17, jVar).k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void n7(z12.t tVar) {
        if (tVar != null) {
            tVar.f550899m = this.L;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("topic_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f180011J = stringExtra;
        getIntent().getIntExtra("topic_id", -1);
        getIntent().getStringExtra("topic_ad_url");
        getIntent().getStringExtra("topic_icon_url");
        getIntent().getStringExtra("topic_desc");
        this.K = getIntent().getByteArrayExtra("emotion_list_buf");
        this.L = getIntent().getStringExtra("extra_ip_set_key");
        this.M = getIntent().getIntExtra("entrance_scene", 11);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12740, 3, "", "", 0, java.lang.Integer.valueOf(this.M), 11);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
