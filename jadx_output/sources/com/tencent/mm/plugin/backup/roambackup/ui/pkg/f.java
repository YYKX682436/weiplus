package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class f implements fo1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f92899a;

    public f(com.tencent.wechat.aff.affroam.g gVar) {
        this.f92899a = gVar;
    }

    @Override // fo1.o
    public final void a(fo1.n it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "[checkPermissionAndStartTask] errorCode=" + it);
        if (com.tencent.mm.plugin.backup.roambackup.ui.pkg.e.f92898a[it.ordinal()] == 1) {
            com.tencent.mm.plugin.backup.roambackup.b bVar = com.tencent.mm.plugin.backup.roambackup.b.f92568a;
            com.tencent.wechat.aff.affroam.g gVar = this.f92899a;
            bVar.c(gVar.f215829d, com.tencent.mm.plugin.backup.roambackup.a.f92560d, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.q(gVar.f215829d);
        }
    }
}
