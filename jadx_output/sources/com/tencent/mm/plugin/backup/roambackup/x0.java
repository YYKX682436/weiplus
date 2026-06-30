package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class x0 implements qi0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92926a;

    public x0(com.tencent.mm.plugin.backup.roambackup.p1 p1Var) {
        this.f92926a = p1Var;
    }

    @Override // qi0.h
    public java.lang.Object a(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i(this.f92926a.f92673d, "hybrid push route=" + str2);
        if (kotlin.jvm.internal.o.b(str, "roam_backup") && kotlin.jvm.internal.o.b(str2, "openScan")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("CLICK_ENTER_SCAN", true);
            if (!iq.b.i(context, true, bundle) && !iq.b.v(context) && !iq.b.c(context, true) && !iq.b.o(context, true)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_scan_report_enter_scene", 18);
                intent.putExtra("BaseScanUI_select_scan_mode", 8);
                j45.l.j(context, "scanner", ".ui.BaseScanUI", intent, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
