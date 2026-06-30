package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes.dex */
public class w0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f226025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b f226026e;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b, int i17, int i18) {
        this.f226026e = activityC16239xc81f635b;
        this.f226025d = i18;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3345) {
            java.util.HashMap hashMap = m93.j.f406591r;
            int i19 = this.f226025d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i19));
            if (pVar != null) {
                pVar.t();
                hashMap.remove(java.lang.Integer.valueOf(i19));
            }
            this.f226026e.finish();
        }
    }
}
