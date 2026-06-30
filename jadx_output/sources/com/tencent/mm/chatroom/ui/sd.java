package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class sd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.wd f64515d;

    public sd(com.tencent.mm.chatroom.ui.wd wdVar) {
        this.f64515d = wdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f64515d.f64631i = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.chatroom.ui.wd wdVar = this.f64515d;
        java.util.List list = wdVar.f64633n.f63997p;
        ((java.util.ArrayList) list).clear();
        android.database.Cursor L0 = ((com.tencent.mm.storage.z9) ((ro3.e) ((st0.f) i95.n0.c(st0.f.class))).wi()).L0(null);
        if (L0 != null) {
            try {
                try {
                    L0.moveToFirst();
                    while (!L0.isAfterLast()) {
                        com.tencent.mm.chatroom.ui.xd xdVar = new com.tencent.mm.chatroom.ui.xd(null);
                        xdVar.f64674c = L0.getString(0);
                        xdVar.f64673b = L0.getString(1);
                        xdVar.f64675d = L0.getInt(2);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(xdVar.f64674c)) {
                            if (xdVar.f64673b.endsWith("@app")) {
                                k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(xdVar.f64673b);
                                if (Bi != null) {
                                    xdVar.f64674c = Bi.field_nickname;
                                }
                            } else {
                                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                                java.lang.String str = xdVar.f64673b;
                                ((sg3.a) v0Var).getClass();
                                xdVar.f64674c = c01.a2.e(str);
                            }
                        }
                        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(xdVar.f64673b);
                        z3Var.M1(xdVar.f64674c);
                        xdVar.f64672a = z3Var;
                        ((java.util.ArrayList) list).add(xdVar);
                        L0.moveToNext();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectServiceNotifySenderUI", e17, "", new java.lang.Object[0]);
                }
            } finally {
                L0.close();
            }
        }
        if (list == null) {
            wdVar.getClass();
        } else {
            wdVar.f64630h.clear();
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i17 >= arrayList.size()) {
                    break;
                }
                com.tencent.mm.chatroom.ui.xd xdVar2 = (com.tencent.mm.chatroom.ui.xd) arrayList.get(i17);
                com.tencent.mm.storage.z3 z3Var2 = xdVar2.f64672a;
                com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI = wdVar.f64633n;
                selectServiceNotifySenderUI.getClass();
                if (!c01.z1.J(z3Var2.d1()) && ((!z3Var2.d1().equals(null) || selectServiceNotifySenderUI.f63994m) && !new java.util.HashSet().contains(z3Var2.d1()))) {
                    wdVar.f64630h.add(xdVar2);
                }
                i17++;
            }
            java.util.Collections.sort(wdVar.f64630h, new com.tencent.mm.chatroom.ui.vd(wdVar));
            wdVar.f64629g = wdVar.f64630h;
        }
        com.tencent.mm.chatroom.ui.wd wdVar2 = this.f64515d;
        java.util.List list2 = wdVar2.f64630h;
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            java.lang.String str2 = null;
            int i18 = 0;
            while (it.hasNext()) {
                com.tencent.mm.storage.z3 z3Var3 = ((com.tencent.mm.chatroom.ui.xd) it.next()).f64672a;
                if (z3Var3 != null) {
                    java.lang.String a17 = x51.k.a(z3Var3.f2());
                    java.lang.String substring = com.tencent.mm.sdk.platformtools.t8.K0(a17) ? "" : a17.startsWith(wdVar2.f64626d) ? "#" : a17.toUpperCase().substring(0, 1);
                    java.util.HashMap hashMap = wdVar2.f64632m;
                    if (i18 == 0) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    } else if (str2 != null && !substring.equals(str2)) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    }
                    str2 = substring;
                } else {
                    str2 = null;
                }
                i18++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifyAdapter", "[load data] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.chatroom.ui.rd(this));
    }
}
