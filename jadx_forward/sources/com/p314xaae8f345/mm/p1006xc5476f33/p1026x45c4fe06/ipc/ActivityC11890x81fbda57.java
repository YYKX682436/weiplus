package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI */
/* loaded from: classes8.dex */
public class ActivityC11890x81fbda57 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 {

    /* renamed from: q, reason: collision with root package name */
    public rh1.a f159902q;

    /* renamed from: w, reason: collision with root package name */
    public boolean f159908w;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f159903r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f159904s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f159905t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f159906u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f159907v = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f159909x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f159910y = false;

    /* renamed from: z, reason: collision with root package name */
    public android.webkit.ValueCallback f159911z = null;
    public android.webkit.ValueCallback A = null;
    public final android.webkit.ValueCallback B = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.a0(this);
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 C = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.c0(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rh1.a aVar = this.f159902q;
        if (aVar != null) {
            aVar.getClass();
            uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
            java.lang.String str = this.f159906u;
            java.lang.String str2 = this.f159904s;
            ((th0.u) rVar).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.i.a(this, str, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.F(this.f159903r, this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        rh1.a aVar = this.f159902q;
        if (aVar != null) {
            aVar.A();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        rh1.a aVar = this.f159902q;
        if (aVar != null) {
            aVar.z();
        }
    }
}
