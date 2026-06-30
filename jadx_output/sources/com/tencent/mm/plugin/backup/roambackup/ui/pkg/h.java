package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI f92903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f92904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f92905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI, float f17, qo1.f0 f0Var) {
        super(0);
        this.f92903d = startRestoringUI;
        this.f92904e = f17;
        this.f92905f = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView = this.f92903d.f92882d;
        if (restoreTaskStatusView != null) {
            restoreTaskStatusView.u(this.f92904e, this.f92905f);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("statueView");
        throw null;
    }
}
