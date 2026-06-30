package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.r0 f97261e;

    public c(android.content.Context context, com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        this.f97260d = context;
        this.f97261e = r0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.downloader_app.model.o.b(this.f97260d, this.f97261e, false);
    }
}
