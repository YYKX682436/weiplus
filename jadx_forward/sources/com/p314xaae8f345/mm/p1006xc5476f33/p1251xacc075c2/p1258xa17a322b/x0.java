package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes.dex */
public final class x0 implements qi0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 f174459a;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var) {
        this.f174459a = p1Var;
    }

    @Override // qi0.h
    public java.lang.Object a(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174459a.f174206d, "hybrid push route=" + str2);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "roam_backup") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "openScan")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("CLICK_ENTER_SCAN", true);
            if (!iq.b.i(context, true, bundle) && !iq.b.v(context) && !iq.b.c(context, true) && !iq.b.o(context, true)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_scan_report_enter_scene", 18);
                intent.putExtra("BaseScanUI_select_scan_mode", 8);
                j45.l.j(context, "scanner", ".ui.BaseScanUI", intent, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
