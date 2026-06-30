package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class h implements com.tencent.mm.plugin.dbbackup.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f96858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f96859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96860c;

    public h(com.tencent.mm.plugin.dbbackup.b bVar, android.app.ProgressDialog progressDialog, long j17, android.content.Context context) {
        this.f96858a = progressDialog;
        this.f96859b = j17;
        this.f96860c = context;
    }

    @Override // com.tencent.mm.plugin.dbbackup.a
    public void onResult(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.dbbackup.g(this, i17));
    }
}
