package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class cn implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f280440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f280442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f280443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym f280444h;

    public cn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar, long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        this.f280444h = ymVar;
        this.f280440d = j17;
        this.f280441e = f9Var;
        this.f280442f = i17;
        this.f280443g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar = this.f280444h;
        ymVar.f281870h = true;
        ymVar.f281871i = false;
        ymVar.f281872m = 0;
        go.d.f355229a.b(false, this.f280440d);
        ymVar.p0(this.f280441e, this.f280442f, this.f280443g == 125);
        dialogInterface.dismiss();
    }
}
