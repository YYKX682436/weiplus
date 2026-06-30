package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.e f74690d;

    public d(com.tencent.mm.plugin.announcement.e eVar) {
        this.f74690d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f74690d.f74692b.U6();
    }
}
