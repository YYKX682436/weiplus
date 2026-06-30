package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.r0 f97265e;

    public e(android.content.Context context, com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        this.f97264d = context;
        this.f97265e = r0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.downloader_app.model.o.b(this.f97264d, this.f97265e, false);
    }
}
