package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes5.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.i f97038d;

    public g(com.tencent.mm.plugin.downloader.model.i iVar) {
        this.f97038d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e, this.f97038d.f97050d, com.tencent.mm.plugin.downloader.model.m.class, new com.tencent.mm.plugin.downloader.model.f(this));
        dialogInterface.dismiss();
    }
}
