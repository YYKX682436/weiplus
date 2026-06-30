package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class g3 implements vl5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954 f179572a;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954 c13317xbf909954) {
        this.f179572a = c13317xbf909954;
    }

    @Override // vl5.o
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954 c13317xbf909954 = this.f179572a;
        m22.i iVar = (m22.i) c13317xbf909954.f179362d.getItem(i17);
        c13317xbf909954.f179364f.mo54783xc39cb650(i17, i18);
        c13317xbf909954.f179362d.remove(iVar);
        c13317xbf909954.f179362d.insert(iVar, i18);
        c13317xbf909954.f179367i = -1;
    }
}
