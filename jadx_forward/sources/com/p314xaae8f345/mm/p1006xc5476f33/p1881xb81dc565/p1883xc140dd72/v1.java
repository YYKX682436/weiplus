package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b80 f231368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w1 f231369e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w1 w1Var, r45.b80 b80Var) {
        this.f231369e = w1Var;
        this.f231368d = b80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w1 w1Var;
        r45.b80 b80Var = this.f231368d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "update members, imroomid:%d roomid:%d memberNum:%d seq:%d status:%d", java.lang.Long.valueOf(b80Var.f452155d), java.lang.Long.valueOf(b80Var.f452156e), java.lang.Integer.valueOf(b80Var.f452157f.size()), java.lang.Integer.valueOf(b80Var.f452158g), java.lang.Integer.valueOf(b80Var.f452159h));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = b80Var.f452157f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            w1Var = this.f231369e;
            if (!hasNext) {
                break;
            }
            r45.a80 a80Var = (r45.a80) it.next();
            w1Var.f231380a.f231156f.f(a80Var.f451346f, a80Var.f451345e, 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x c17 = w1Var.f231380a.f231156f.c(a80Var.f451345e);
            if (c17 == null) {
                linkedList.add(a80Var.f451345e);
            } else if (c17.f231386c < 2) {
                linkedList2.add(a80Var.f451345e);
            }
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_ilink_getsdkuserinfo_mode, 0);
        boolean z17 = Ni != 2 && (linkedList.size() > 0 || (Ni == 0 && linkedList2.size() > 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "needQueryOpenid is %b getSdkUserInfoMode is %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(Ni));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = w1Var.f231380a;
        i4Var.R1 = true;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.l(i4Var, b80Var, null);
            return;
        }
        linkedList.addAll(linkedList2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x xVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = w1Var.f231380a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.v vVar = i4Var2.f231162i;
        long j17 = i4Var2.f231166l1;
        java.lang.String str = i4Var2.f231176p1;
        vVar.getClass();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.o07();
        lVar.f152198b = new r45.p07();
        lVar.f152200d = 3602;
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipmtgetsdkuserinfo";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.o07 o07Var = (r45.o07) a17.f152243a.f152217a;
        o07Var.f463339d = linkedList;
        o07Var.f463340e = str;
        ((h80.i) xVar).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u1(this));
    }
}
