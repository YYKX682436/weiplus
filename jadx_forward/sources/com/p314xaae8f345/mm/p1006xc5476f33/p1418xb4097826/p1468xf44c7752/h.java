package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class h implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i f192902d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i iVar) {
        this.f192902d = iVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i0 i0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i iVar = this.f192902d;
        iVar.f192913j.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 abstractC15133xf6dcb656 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656) kz5.n0.a0(iVar.f192911h, i17);
        if (abstractC15133xf6dcb656 != null) {
            abstractC15133xf6dcb656.o0();
        }
        if (abstractC15133xf6dcb656 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(iVar.f192907d, "onPageSelected position:" + i17 + ", size:" + iVar.f192911h.size());
        }
        if (iVar.f192915l != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192883a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) kz5.n0.a0(iVar.f192909f, i17);
            int i18 = (j0Var == null || (i0Var = j0Var.f192919d) == null) ? 0 : i0Var.f192916a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192886d = b0Var.b(i18);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
            c6553x54ab9387.q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192884b);
            c6553x54ab9387.f139025e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192885c;
            c6553x54ab9387.f139026f = 2L;
            c6553x54ab9387.p(b0Var.a(i18));
            c6553x54ab9387.f139028h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192886d;
            c6553x54ab9387.s("");
            c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
            c6553x54ab9387.k();
            b0Var.h(c6553x54ab9387);
        }
        iVar.f192915l = i17;
    }
}
