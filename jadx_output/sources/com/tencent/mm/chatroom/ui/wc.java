package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class wc implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.xc f64625d;

    public wc(com.tencent.mm.chatroom.ui.xc xcVar) {
        this.f64625d = xcVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.storage.z3 z3Var;
        java.lang.String str;
        if (this.f64625d.f64671e.c7()) {
            com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = this.f64625d.f64671e;
            selectMemberUI.f63976i.w(selectMemberUI.f63972e.getText().toString());
            return false;
        }
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI2 = this.f64625d.f64671e;
        com.tencent.mm.chatroom.ui.kd kdVar = selectMemberUI2.f63977m;
        java.lang.String obj = selectMemberUI2.f63972e.getText().toString();
        kdVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectMemberAdapter", "search:%s isLoading:%s", com.tencent.mm.sdk.platformtools.t8.G1(obj), java.lang.Boolean.valueOf(kdVar.f64290m));
        if (kdVar.f64290m) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectMemberAdapter", "[setMemberListBySearch]");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            kdVar.f64289i = kdVar.f64288h;
        } else {
            for (com.tencent.mm.chatroom.ui.bd bdVar : kdVar.f64288h) {
                if (bdVar != null && (z3Var = bdVar.f64059a) != null) {
                    if (z3Var.w0() == null || !z3Var.w0().contains(obj)) {
                        java.lang.String d17 = z3Var.d1();
                        com.tencent.mm.storage.a3 a3Var = kdVar.f64285e;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.chatroom.ui.SeeRoomMemberUI.U6(a3Var, d17)) && com.tencent.mm.chatroom.ui.SeeRoomMemberUI.U6(a3Var, z3Var.d1()).contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.f2() != null && z3Var.f2().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.T0() != null && z3Var.T0().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.t0() != null && z3Var.t0().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (z3Var.d1() != null && z3Var.d1().contains(obj)) {
                            arrayList.add(bdVar);
                        } else if (!z3Var.r2()) {
                            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                            if (z07 != null && (str = z07.field_conRemark) != null && str.contains(obj)) {
                                arrayList.add(bdVar);
                            }
                        }
                    } else {
                        arrayList.add(bdVar);
                    }
                }
            }
            kdVar.f64289i = arrayList;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.chatroom.ui.ed(kdVar));
        return false;
    }
}
