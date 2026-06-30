package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI f92888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f92889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f92890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI startBackupIngUI, float f17, qo1.f0 f0Var) {
        super(0);
        this.f92888d = startBackupIngUI;
        this.f92889e = f17;
        this.f92890f = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView backupTaskStatusView = this.f92888d.f92876e;
        if (backupTaskStatusView != null) {
            backupTaskStatusView.u(this.f92889e, this.f92890f);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("statueView");
        throw null;
    }
}
