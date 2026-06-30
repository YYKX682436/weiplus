package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes.dex */
public class x0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b f226030b;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b, int i17) {
        this.f226030b = activityC16239xc81f635b;
        this.f226029a = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public void a(int i17, android.content.Intent intent) {
        java.util.HashMap hashMap = m93.j.f406593t;
        int i18 = this.f226029a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i18));
        if (pVar != null) {
            pVar.g(0, i17, intent);
            hashMap.remove(java.lang.Integer.valueOf(i18));
        }
        this.f226030b.finish();
    }
}
