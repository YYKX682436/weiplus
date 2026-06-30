package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI f92906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f92907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f92908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f92909g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI, qo1.j0 j0Var, com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var) {
        super(0);
        this.f92906d = startRestoringUI;
        this.f92907e = j0Var;
        this.f92908f = n0Var;
        this.f92909g = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI = this.f92906d;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView = startRestoringUI.f92882d;
        if (restoreTaskStatusView == null) {
            kotlin.jvm.internal.o.o("statueView");
            throw null;
        }
        com.tencent.wechat.aff.affroam.g gVar = startRestoringUI.f92884f;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mPkgInfo");
            throw null;
        }
        restoreTaskStatusView.v(gVar, this.f92907e, this.f92908f, this.f92909g);
        return jz5.f0.f302826a;
    }
}
