package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes11.dex */
public final class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.model.l f97555d;

    public j(com.tencent.mm.plugin.emoji.model.l lVar) {
        this.f97555d = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        kotlinx.coroutines.z0.e(this.f97555d.f97575d, null, 1, null);
    }
}
