package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ot4 f262487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 f262488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f262489f;

    public o1(r45.ot4 ot4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 x1Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f262487d = ot4Var;
        this.f262488e = x1Var;
        this.f262489f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.LinkedList linkedList;
        r45.rl6 rl6Var = this.f262487d.f464041e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rl6Var != null && (linkedList = rl6Var.f466520d) != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.hl6) it.next()).f457808h);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            r45.yt5 yt5Var = (r45.yt5) it6.next();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f262489f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 x1Var = this.f262488e;
            if (x1Var == null || x1Var.b(yt5Var, menuItem)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(abstractActivityC21394xb3d2c0cf, yt5Var, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(abstractActivityC21394xb3d2c0cf, yt5Var, null);
                x1Var.a(yt5Var, menuItem);
            }
        }
        return false;
    }
}
