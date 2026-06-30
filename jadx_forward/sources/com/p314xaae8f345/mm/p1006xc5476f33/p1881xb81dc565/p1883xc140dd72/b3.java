package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class b3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i3 f231045a;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i3 i3Var) {
        this.f231045a = i3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "joinSync initEngine done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            if (i18 != -66) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.m(this.f231045a.f231144f, true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231045a.f231144f;
            i4Var.Y.c(2, i4Var.f231176p1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "joinSync initEngine fail errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i3 i3Var = this.f231045a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = i3Var.f231144f;
        java.lang.String str2 = i3Var.f231142d;
        java.lang.String str3 = i3Var.f231143e;
        i4Var2.f231176p1 = str3;
        i4Var2.f231187x1 = str2;
        i4Var2.D1 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e4.ILinkMemberRoleJoin;
        i4Var2.f231175p0 = false;
        i4Var2.f231156f.f231050a.clear();
        i4Var2.Q();
        i4Var2.w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u3 u3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u3(i4Var2, str3, str2);
        i4Var2.A = u3Var;
        i4Var2.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w3(i4Var2);
        i4Var2.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.z3(i4Var2);
        i4Var2.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a4(i4Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f0 f0Var = i4Var2.f231154e;
        f0Var.b(3, u3Var);
        f0Var.b(4, i4Var2.B);
        f0Var.b(22, i4Var2.C);
        f0Var.b(23, i4Var2.D);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "join sdkGroupId:%s", str2);
        if (gq4.v.Ni()) {
            i4Var2.G();
        }
        i4Var2.Z();
        int i27 = i4Var2.f231190y1;
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231116a;
        r45.z70 z70Var = new r45.z70();
        z70Var.f473292e = str2;
        z70Var.f473293f = i4Var2.f231178q;
        z70Var.f473296i = i27;
        z70Var.f473295h = true;
        z70Var.f473298n = "";
        z70Var.f473299o = str3;
        try {
            i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m119997xb04c9145(z70Var.mo14344x5f01b1f6(), z70Var.mo14344x5f01b1f6().length);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkNativeEngine", e17, "JoinRoom exception", new java.lang.Object[0]);
            i19 = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "joinRoom ret:" + i19 + ", groupId:" + str2);
        if (i19 == 0) {
            i4Var2.f231169m2 = true;
            i4Var2.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b4(i4Var2));
        }
        synchronized (this.f231045a.f231144f.Q1) {
            java.util.Iterator it = this.f231045a.f231144f.Q1.iterator();
            while (it.hasNext()) {
                r45.q07 q07Var = (r45.q07) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "joinSync deal with the cached invite notify");
                this.f231045a.f231144f.Z();
                byte[] bArr = q07Var.f465079i.f273689a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120001xd82634ef(bArr, bArr.length, this.f231045a.f231144f.f231190y1);
            }
            this.f231045a.f231144f.Q1.clear();
        }
    }
}
