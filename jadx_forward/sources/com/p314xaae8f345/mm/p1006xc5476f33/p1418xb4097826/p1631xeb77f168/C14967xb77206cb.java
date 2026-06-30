package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/LivePanelHalfScreenListener;", "Lcom/tencent/mm/plugin/finder/shopping/MiniProgramHalfScreenStatusChangeListener;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.LivePanelHalfScreenListener */
/* loaded from: classes3.dex */
public final class C14967xb77206cb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14969xb96ec3a2 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f207807h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f207808i;

    public C14967xb77206cb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        super(k0Var, true);
        this.f207807h = "LivePanelHalfScreenList";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207807h, "onHalfScreenClose: " + z17);
        this.f207808i = z17;
        if (z17) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).mj(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void f(boolean z17) {
        this.f207808i = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207807h, "onHalfScreenOpen: " + z17);
        if (z17) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14969xb96ec3a2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.i(info);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207807h, "onHeightChanged: " + info + " isAnim: " + this.f207808i);
        boolean z17 = this.f207808i;
        int i17 = info.f158926e;
        if (z17) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).nj(this, i17);
            return;
        }
        float f17 = info.f158925d / i17;
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null) {
            if2.z.f372686a.i(c14197x319b1b9e, new mf2.r(c14197x319b1b9e, this, f17));
        }
    }
}
