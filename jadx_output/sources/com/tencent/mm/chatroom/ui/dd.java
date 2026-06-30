package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class dd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.kd f64119d;

    public dd(com.tencent.mm.chatroom.ui.kd kdVar) {
        this.f64119d = kdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean equals;
        this.f64119d.f64290m = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.chatroom.ui.kd kdVar = this.f64119d;
        java.util.List Z6 = kdVar.f64292o.Z6();
        if (Z6 == null) {
            kdVar.getClass();
        } else {
            kdVar.f64289i.clear();
            for (int i17 = 0; i17 < Z6.size(); i17++) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) Z6.get(i17), true);
                com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = kdVar.f64292o;
                selectMemberUI.getClass();
                if (((selectMemberUI instanceof com.tencent.mm.chatroom.ui.SeeMemberRecordUI) || !c01.z1.J(n17.d1())) && ((!(equals = n17.d1().equals(kdVar.f64287g)) || selectMemberUI.f63983s) && !selectMemberUI.U6().contains(n17.d1()))) {
                    if (equals && selectMemberUI.f63983s) {
                        kdVar.f64289i.add(0, new com.tencent.mm.chatroom.ui.bd(selectMemberUI, 1, n17));
                    } else {
                        kdVar.f64289i.add(new com.tencent.mm.chatroom.ui.bd(selectMemberUI, 1, n17));
                    }
                }
            }
            java.util.Collections.sort(kdVar.f64289i, new com.tencent.mm.chatroom.ui.jd(kdVar));
            kdVar.f64288h = kdVar.f64289i;
        }
        com.tencent.mm.chatroom.ui.kd kdVar2 = this.f64119d;
        java.util.List list = kdVar2.f64289i;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            int i18 = 0;
            java.lang.String str = null;
            while (it.hasNext()) {
                com.tencent.mm.storage.z3 z3Var = ((com.tencent.mm.chatroom.ui.bd) it.next()).f64059a;
                if (z3Var != null) {
                    java.lang.String a17 = x51.k.a(kdVar2.a(z3Var));
                    java.lang.String substring = com.tencent.mm.sdk.platformtools.t8.K0(a17) ? "" : a17.startsWith(kdVar2.f64284d) ? "#" : a17.toUpperCase().substring(0, 1);
                    java.util.HashMap hashMap = kdVar2.f64291n;
                    if (i18 == 0) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    } else if (str != null && !substring.equals(str)) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    }
                    str = substring;
                } else {
                    str = null;
                }
                i18++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectMemberAdapter", "[load data] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.chatroom.ui.cd(this));
    }
}
