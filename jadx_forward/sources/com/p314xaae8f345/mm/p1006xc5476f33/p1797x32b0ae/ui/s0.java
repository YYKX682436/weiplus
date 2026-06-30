package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes.dex */
public class s0 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b f226009b;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b activityC16239xc81f635b, int i17) {
        this.f226009b = activityC16239xc81f635b;
        this.f226008a = i17;
    }

    @Override // r35.n3
    public void a(int i17) {
        java.util.HashMap hashMap = m93.j.f406579f;
        int i18 = this.f226008a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i18));
        if (pVar != null) {
            pVar.d(i17);
            hashMap.remove(java.lang.Integer.valueOf(i18));
        }
        this.f226009b.finish();
    }
}
