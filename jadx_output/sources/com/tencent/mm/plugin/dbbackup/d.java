package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class d implements com.tencent.mm.plugin.dbbackup.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c01.wc f96834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f96835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96836c;

    public d(com.tencent.mm.plugin.dbbackup.b bVar, c01.wc wcVar, android.app.ProgressDialog progressDialog, android.content.Context context) {
        this.f96834a = wcVar;
        this.f96835b = progressDialog;
        this.f96836c = context;
    }

    @Override // com.tencent.mm.plugin.dbbackup.a
    public void onResult(int i17) {
        this.f96834a.b();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.dbbackup.c(this, i17));
    }
}
