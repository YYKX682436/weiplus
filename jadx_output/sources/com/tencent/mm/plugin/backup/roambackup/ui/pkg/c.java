package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI f92891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f92892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f92893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f92894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI startBackupIngUI, qo1.j0 j0Var, com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var) {
        super(0);
        this.f92891d = startBackupIngUI;
        this.f92892e = j0Var;
        this.f92893f = n0Var;
        this.f92894g = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI startBackupIngUI = this.f92891d;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView backupTaskStatusView = startBackupIngUI.f92876e;
        if (backupTaskStatusView == null) {
            kotlin.jvm.internal.o.o("statueView");
            throw null;
        }
        com.tencent.wechat.aff.affroam.g gVar = startBackupIngUI.f92878g;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mPkgInfo");
            throw null;
        }
        backupTaskStatusView.v(gVar, this.f92892e, this.f92893f, this.f92894g);
        return jz5.f0.f302826a;
    }
}
