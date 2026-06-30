package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes15.dex */
public final class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI f258487a;

    public h0(com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI) {
        this.f258487a = repairerVoipQoSUI;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(3, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 source, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        int m8183xf806b362 = source.m8183xf806b362();
        int m8183xf806b3622 = target.m8183xf806b362();
        int i17 = com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI.m;
        com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI = this.f258487a;
        java.util.Collections.swap(repairerVoipQoSUI.U6(), m8183xf806b362, m8183xf806b3622);
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) ((jz5.n) repairerVoipQoSUI.h).mo141623x754a37bb()).m8150x87567217(m8183xf806b362, m8183xf806b3622);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}
