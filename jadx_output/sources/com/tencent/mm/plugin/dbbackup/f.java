package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class f implements com.tencent.mm.plugin.dbbackup.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f96848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f96849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f96850c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96851d;

    public f(com.tencent.mm.plugin.dbbackup.b bVar, android.app.ProgressDialog progressDialog, boolean z17, long j17, android.content.Context context) {
        this.f96848a = progressDialog;
        this.f96849b = z17;
        this.f96850c = j17;
        this.f96851d = context;
    }

    @Override // com.tencent.mm.plugin.dbbackup.a
    public void onResult(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.dbbackup.e(this, i17));
    }
}
