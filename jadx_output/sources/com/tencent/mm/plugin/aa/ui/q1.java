package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.r1 f72776d;

    public q1(com.tencent.mm.plugin.aa.ui.r1 r1Var) {
        this.f72776d = r1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f72776d.f72783d.finish();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 2, 10);
    }
}
