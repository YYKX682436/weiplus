package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class z implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f64852b;

    public z(int i17, int i18) {
        this.f64851a = i17;
        this.f64852b = i18;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        int i17 = this.f64852b;
        com.tencent.mm.network.s[] sVarArr = com.tencent.mm.app.i3.f53449a;
        java.util.Date date = new java.util.Date();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        date.setTime(java.lang.System.currentTimeMillis() - (this.f64851a * 86400000));
        com.tencent.mm.app.i3.c(lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(date) + ".txt", 20001, i17, null, null, null);
    }
}
