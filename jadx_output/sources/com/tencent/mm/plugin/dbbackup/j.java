package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class j implements com.tencent.mm.plugin.dbbackup.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f96863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f96864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96865c;

    public j(com.tencent.mm.plugin.dbbackup.b bVar, android.app.ProgressDialog progressDialog, long j17, android.content.Context context) {
        this.f96863a = progressDialog;
        this.f96864b = j17;
        this.f96865c = context;
    }

    @Override // com.tencent.mm.plugin.dbbackup.a
    public void onResult(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.dbbackup.i(this, i17));
    }
}
