package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.d4 f72583f;

    public b4(com.tencent.mm.plugin.aa.ui.d4 d4Var, java.lang.String str, java.lang.String str2) {
        this.f72583f = d4Var;
        this.f72581d = str;
        this.f72582e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.d4 d4Var = this.f72583f;
        if (!d4Var.f72604a) {
            com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = d4Var.f72611h;
            launchAAUI.v7(d4Var.f72605b, d4Var.f72606c, d4Var.f72607d, d4Var.f72608e, d4Var.f72609f, launchAAUI.H, this.f72581d, this.f72582e);
            return;
        }
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI2 = d4Var.f72611h;
        android.content.Context context = d4Var.f72605b;
        java.lang.String str = d4Var.f72606c;
        int i17 = d4Var.f72607d;
        java.lang.String str2 = d4Var.f72608e;
        double d17 = d4Var.f72609f;
        java.util.ArrayList arrayList = d4Var.f72610g;
        java.lang.String str3 = this.f72581d;
        java.lang.String str4 = this.f72582e;
        int i18 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
        launchAAUI2.v7(context, str, i17, str2, d17, arrayList, str3, str4);
    }
}
