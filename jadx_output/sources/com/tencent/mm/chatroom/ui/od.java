package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class od implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.pd f64416d;

    public od(com.tencent.mm.chatroom.ui.pd pdVar) {
        this.f64416d = pdVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.storage.z3 z3Var;
        java.lang.String str;
        com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI = this.f64416d.f64433e;
        com.tencent.mm.chatroom.ui.wd wdVar = selectServiceNotifySenderUI.f63992h;
        java.lang.String obj = selectServiceNotifySenderUI.f63989e.getText().toString();
        wdVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifyAdapter", "search:%s isLoading:%s", com.tencent.mm.sdk.platformtools.t8.G1(obj), java.lang.Boolean.valueOf(wdVar.f64631i));
        if (wdVar.f64631i) {
            return false;
        }
        wdVar.f64627e = obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifyAdapter", "[setMemberListBySearch]");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            wdVar.f64630h = wdVar.f64629g;
        } else {
            for (com.tencent.mm.chatroom.ui.xd xdVar : wdVar.f64629g) {
                if (xdVar != null && (z3Var = xdVar.f64672a) != null) {
                    if (z3Var.w0() != null && z3Var.w0().contains(obj)) {
                        arrayList.add(xdVar);
                    } else if (z3Var.f2() != null && z3Var.f2().contains(obj)) {
                        arrayList.add(xdVar);
                    } else if (z3Var.T0() != null && z3Var.T0().contains(obj)) {
                        arrayList.add(xdVar);
                    } else if (!z3Var.r2()) {
                        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                        if (z07 != null && (str = z07.field_conRemark) != null && str.contains(obj)) {
                            arrayList.add(xdVar);
                        }
                    }
                }
            }
            wdVar.f64630h = arrayList;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.chatroom.ui.td(wdVar, obj));
        return false;
    }
}
