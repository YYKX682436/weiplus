package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes8.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y70 f231119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.h1 f231121f;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.h1 h1Var, r45.y70 y70Var, int i17) {
        this.f231121f = h1Var;
        this.f231119d = y70Var;
        this.f231120e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.y70 y70Var = this.f231119d;
        java.util.Iterator it = y70Var.f472369g.iterator();
        while (it.hasNext()) {
            r45.x70 x70Var = (r45.x70) it.next();
            r45.y07 y07Var = new r45.y07();
            y07Var.f472222d = x70Var.f471370e;
            y07Var.f472223e = x70Var.f471369d;
            y07Var.f472224f = x70Var.f471372g;
            linkedList.add(y07Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.h1 h1Var = this.f231121f;
        java.util.LinkedList k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.k(h1Var.f231130a, linkedList, 4);
        if (k17.size() == linkedList.size() && !k17.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.m(h1Var.f231130a, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u4 u4Var = h1Var.f231130a.Z;
            if (u4Var != null) {
                u4Var.a(this.f231120e, null);
                return;
            }
            return;
        }
        if (!k17.isEmpty()) {
            h1Var.f231130a.Y.f(k17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "invite success, roomid:%d, selfmemberid:%d, selfname:%s", java.lang.Long.valueOf(y70Var.f472366d), java.lang.Integer.valueOf(y70Var.f472368f), h1Var.f231130a.f231189y0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = h1Var.f231130a;
        i4Var.f231170n = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var = i4Var.f231156f;
        c0Var.f231051b = y70Var.f472366d;
        c0Var.f231055f = i4Var.f231189y0;
        java.lang.String str = y70Var.f472367e;
        i4Var.f231187x1 = str;
        c0Var.f231057h = str;
        i4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = h1Var.f231130a;
        i4Var2.f231171n2 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = i4Var2.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var2 = i4Var2.f231156f;
        cVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.k(cVar, c0Var2));
    }
}
