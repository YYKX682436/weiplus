package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class s implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.t f262739d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.t tVar) {
        this.f262739d = tVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.t tVar = this.f262739d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = tVar.f262741b;
        if (i17 == activityC19168xd4c44a02.f262620i) {
            activityC19168xd4c44a02.setResult(i18, intent);
            tVar.f262741b.finish();
        }
    }
}
