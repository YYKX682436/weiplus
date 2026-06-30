package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.k f93758d;

    public i(com.tencent.mm.plugin.base.stub.k kVar) {
        this.f93758d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        m33.b1 a17 = m33.a1.a();
        com.tencent.mm.plugin.base.stub.k kVar = this.f93758d;
        if (a17 != null) {
            ((com.tencent.mm.plugin.game.h0) a17).Bi(kVar.f93766c, c01.z1.b(), 2, kVar.f93765b);
        }
        kVar.f93767d.a(false);
    }
}
