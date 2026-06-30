package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class z implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f146385b;

    public z(int i17, int i18) {
        this.f146384a = i17;
        this.f146385b = i18;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        int i17 = this.f146385b;
        com.p314xaae8f345.mm.p971x6de15a2e.s[] sVarArr = com.p314xaae8f345.mm.app.i3.f134982a;
        java.util.Date date = new java.util.Date();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        date.setTime(java.lang.System.currentTimeMillis() - (this.f146384a * 86400000));
        com.p314xaae8f345.mm.app.i3.c(lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(date) + ".txt", 20001, i17, null, null, null);
    }
}
