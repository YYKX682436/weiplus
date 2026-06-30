package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView */
/* loaded from: classes7.dex */
public class C15847x71fbf6b5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 {

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f220405f2;

    /* renamed from: g2, reason: collision with root package name */
    public long f220406g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f220407h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u f220408i2;

    /* renamed from: j2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m1 f220409j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.Set f220410k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.Map f220411l2;

    /* renamed from: m2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f220412m2;

    /* renamed from: n2, reason: collision with root package name */
    public java.lang.String f220413n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f220414o2;

    /* renamed from: p2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e f220415p2;

    /* renamed from: q2, reason: collision with root package name */
    public u33.l f220416q2;

    public C15847x71fbf6b5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220410k2 = new java.util.HashSet();
        this.f220411l2 = new java.util.HashMap();
        this.f220415p2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e();
        l1(context);
    }

    public final void l1(android.content.Context context) {
        this.f220405f2 = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f220406g2 = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f220407h2 = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context);
        c1162x665295de.Q(0);
        mo7967x900dcbe1(c1162x665295de);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m1(1);
        this.f220409j2 = m1Var;
        m1Var.f220753d = this;
        m1Var.f220759m = 5;
        V0(m1Var);
        m1Var.f220753d.i(m1Var);
        m1Var.f220763q = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) m1Var.f220753d.mo7951xfd37656d();
        m1Var.f220756g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k1(m1Var, m1Var.f220753d.getContext());
        m1Var.f220757h = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l1(m1Var, m1Var.f220753d.getContext());
        m7965x440a0e9(15);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u(this, null);
        this.f220408i2 = uVar;
        mo7960x6cab2c8d(uVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public boolean r0(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m1 m1Var = this.f220409j2;
        int a17 = m1Var.a(m1Var.f220754e + i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m1Var.f220753d;
        if (c1163xf1deaba4 != null && m1Var.f220768v) {
            m1Var.f220757h.f93582a = a17;
            m1Var.f220769w = true;
            c1163xf1deaba4.mo7951xfd37656d().m8099x6305639d(m1Var.f220757h);
        }
        return super.r0(i17, i18);
    }

    /* renamed from: setChatRoomName */
    public void m64407xc6303700(java.lang.String str) {
        if (this.f220415p2 == null) {
            this.f220415p2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e();
        }
        this.f220415p2.f36863x28f3ecdb = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de c15798x5eeb90de = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de();
        c15798x5eeb90de.f36811xcacdcff2 = 1L;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88();
        c15744x2fe9df88.f36637xf02988d6 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;
        c15744x2fe9df88.f36622x3923b317 = str;
        linkedList.add(c15744x2fe9df88);
        c15798x5eeb90de.f36807x5b66a377.addAll(linkedList);
        this.f220415p2.f36862xe1b846fa = c15798x5eeb90de;
    }

    /* renamed from: setPremadeCardInfo */
    public void m64408xb9ff1174(java.lang.String str) {
        this.f220413n2 = str;
    }

    /* renamed from: setStateChangeListener */
    public void m64409x599de7b3(u33.l lVar) {
        this.f220416q2 = lVar;
    }

    public C15847x71fbf6b5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220410k2 = new java.util.HashSet();
        this.f220411l2 = new java.util.HashMap();
        this.f220415p2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e();
        l1(context);
    }
}
