package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c80 f231366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w0 f231367e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w0 w0Var, r45.c80 c80Var) {
        this.f231367e = w0Var;
        this.f231366d = c80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w0 w0Var = this.f231367e;
        java.util.Map map = w0Var.f231379a.f231167l2;
        r45.c80 c80Var = this.f231366d;
        r45.q07 q07Var = (r45.q07) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Long.valueOf(c80Var.f452897d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = w0Var.f231379a;
        if (q07Var == null) {
            java.util.Map map2 = i4Var.f231167l2;
            if (map2 == null || ((java.util.concurrent.ConcurrentHashMap) map2).size() <= 0) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) i4Var.f231167l2).clear();
            return;
        }
        i4Var.Q();
        i4Var.f231176p1 = q07Var.f465074d;
        i4Var.f231187x1 = q07Var.f465076f;
        i4Var.C1 = q07Var.f465080m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "recv invite, roomid:%d callerid:%s, roomtype:%d, groupip:%s, sdkgroupid:%s", java.lang.Long.valueOf(c80Var.f452897d), c80Var.f452900g, java.lang.Integer.valueOf(c80Var.f452898e), i4Var.f231176p1, i4Var.f231187x1);
        java.util.Map map3 = i4Var.f231167l2;
        if (map3 != null && ((java.util.concurrent.ConcurrentHashMap) map3).size() > 0) {
            ((java.util.concurrent.ConcurrentHashMap) i4Var.f231167l2).clear();
        }
        i4Var.getClass();
        boolean Bi = com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi();
        iq.b.r();
        iq.b.r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "danial: isOnSystemCalling:%b, %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(Bi));
        i4Var.getClass();
        android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f("com.tencent.mm", null, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g4.class);
        boolean z17 = bundle != null ? bundle.getBoolean("is_in_voip") : false;
        boolean z18 = z17 || p21.i.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: isOnOtherCalling:%b,%b,%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(p21.i.a()));
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "other call is on, hangup!!!");
            i4Var.getClass();
            i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c1(i4Var, 3));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().O(i4Var.f231176p1, 2);
        i4Var.f231156f.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var = i4Var.f231156f;
        c0Var.f231051b = c80Var.f452897d;
        c0Var.f231057h = i4Var.f231187x1;
        c0Var.f231053d = i4Var.f231176p1;
        java.util.LinkedList linkedList = i4Var.C1;
        c0Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.y07 y07Var = (r45.y07) it.next();
            c0Var.f(y07Var.f472222d, y07Var.f472223e, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.q0(this);
        i4Var.K = q0Var;
        i4Var.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s0(this);
        i4Var.R = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u0(this);
        i4Var.f231154e.b(12, q0Var);
        i4Var.f231154e.b(13, i4Var.L);
        i4Var.f231154e.b(17, i4Var.R);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w();
        java.util.Iterator it6 = i4Var.C1.iterator();
        while (it6.hasNext()) {
            r45.y07 y07Var2 = (r45.y07) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w();
            java.lang.String str = y07Var2.f472223e;
            wVar2.f231374b = str;
            java.lang.String str2 = y07Var2.f472222d;
            wVar2.f231375c = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "a member: %s, sdkusername:%s", str2, str);
            if (c80Var.f452900g.equals(y07Var2.f472223e)) {
                wVar2.f231377e = 1;
                java.lang.String str3 = y07Var2.f472222d;
                i4Var.B1 = str3;
                i4Var.f231156f.f231055f = str3;
            } else {
                wVar2.f231377e = 2;
            }
            wVar2.f231376d = i4Var.B1;
            if (y07Var2.f472222d.equals(i4Var.f231189y0)) {
                wVar = wVar2;
            }
            arrayList.add(wVar2);
        }
        java.lang.String str4 = i4Var.B1;
        if (str4 != null) {
            wVar.f231376d = str4;
        }
        i4Var.f231156f.f231054e = arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.Ack();
    }
}
