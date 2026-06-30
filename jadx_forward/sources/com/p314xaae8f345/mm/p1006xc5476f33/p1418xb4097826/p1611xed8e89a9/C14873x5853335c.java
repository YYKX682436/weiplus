package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileProductFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileProductFragment */
/* loaded from: classes2.dex */
public final class C14873x5853335c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f204827t;

    public C14873x5853335c() {
        super(110);
        this.f204827t = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.jd.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        android.content.Intent intent;
        super.mo7398x3e5a77bb(bundle);
        dy1.r ak6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderProfileProductPage);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        java.lang.String stringExtra = (mo7430x19263085 == null || (intent = mo7430x19263085.getIntent()) == null) ? null : intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cy1.a aVar = (cy1.a) ak6;
        aVar.fk(this, "finderuin", stringExtra);
        aVar.fk(this, "report_session_id", this.f204827t);
        aVar.Tj(this, 4, 12, false);
    }
}
