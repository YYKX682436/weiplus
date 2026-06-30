package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.c f53640d;

    public b(com.tencent.mm.app.plugin.c cVar) {
        this.f53640d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f53640d.f53641d.a(false, null);
    }
}
