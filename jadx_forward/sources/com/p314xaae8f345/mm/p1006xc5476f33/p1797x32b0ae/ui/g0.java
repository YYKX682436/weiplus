package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes.dex */
public class g0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f225942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b f225943e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b, int i17) {
        this.f225943e = activityC16239xc81f635b;
        this.f225942d = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.HashMap hashMap = m93.j.f406595v;
        int i19 = this.f225942d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i19));
        if (pVar != null) {
            pVar.m(0, i18, intent);
            hashMap.remove(java.lang.Integer.valueOf(i19));
        }
        this.f225943e.finish();
    }
}
