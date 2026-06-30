package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.f f93730d;

    public e(com.tencent.mm.plugin.base.stub.f fVar) {
        this.f93730d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        m33.b1 a17 = m33.a1.a();
        com.tencent.mm.plugin.base.stub.f fVar = this.f93730d;
        if (a17 != null) {
            ((com.tencent.mm.plugin.game.h0) a17).Bi(fVar.f93766c, c01.z1.b(), 2, fVar.f93765b);
        }
        fVar.f93767d.a(false);
    }
}
