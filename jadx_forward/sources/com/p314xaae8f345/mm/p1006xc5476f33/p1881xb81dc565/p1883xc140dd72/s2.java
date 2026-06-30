package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f231312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231313e;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, java.util.LinkedList linkedList) {
        this.f231313e = i4Var;
        this.f231312d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r2 r2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231313e;
        i4Var.Q = r2Var;
        int i17 = i4Var.f231178q;
        java.lang.String str = i4Var.f231156f.f231053d;
        int i18 = i4Var.f231190y1;
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231116a;
        r45.w70 w70Var = new r45.w70();
        w70Var.f470452d = this.f231312d;
        w70Var.f470453e = i17;
        w70Var.f470455g = i18;
        w70Var.f470456h = str;
        w70Var.f470457i = "";
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "steve: addmember ret:" + com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.Add(w70Var.mo14344x5f01b1f6(), w70Var.mo14344x5f01b1f6().length));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkNativeEngine", e17, "Invite exception", new java.lang.Object[0]);
        }
        i4Var.f231154e.b(18, i4Var.Q);
        i4Var.f231154e.b(19, i4Var.Q);
        i4Var.Z();
        i4Var.Z = null;
    }
}
