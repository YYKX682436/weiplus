package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard */
/* loaded from: classes8.dex */
public class C15849x99cbe261 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 {

    /* renamed from: j2, reason: collision with root package name */
    public static int f220428j2;

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f220429f2;

    /* renamed from: g2, reason: collision with root package name */
    public long f220430g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f220431h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.z f220432i2;

    public C15849x99cbe261(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        l1(context);
    }

    public final void l1(android.content.Context context) {
        this.f220429f2 = context;
        this.f220430g2 = ((android.app.Activity) context).getIntent().getLongExtra("game_report_sourceid", 0L);
        long longExtra = ((android.app.Activity) this.f220429f2).getIntent().getLongExtra("game_report_ssid", 0L);
        this.f220431h2 = longExtra;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.p(0L, 1L, 0L, longExtra, this.f220430g2);
        f220428j2 = i65.a.b(context, 400);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context);
        c1162x665295de.Q(1);
        mo7967x900dcbe1(c1162x665295de);
        m7964x8d4ad49c(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.z(this);
        this.f220432i2 = zVar;
        mo7960x6cab2c8d(zVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomListCard", "onAttachedToWindow");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomListCard", "onDetachedFromWindow");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i18);
        int i19 = f220428j2;
        if (i19 <= size && i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Float.valueOf(i19).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setData */
    public void m64411x76491f2c(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d> list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.z zVar = this.f220432i2;
        if (zVar != null) {
            if (list == null) {
                zVar.getClass();
                return;
            }
            java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f220895d;
            linkedList.clear();
            linkedList.addAll(list);
            zVar.m8146xced61ae5();
        }
    }

    public C15849x99cbe261(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        l1(context);
    }
}
